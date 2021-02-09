'use-strict'

var gulp = require('gulp'),
    sass = require('gulp-sass'),
    del = require('del'),
    browserSync = require('browser-sync').create(),
    imagemin = require('gulp-imagemin'),
    uglify = require('gulp-uglify'),
    usemin = require('gulp-usemin'),
    rev = require('gulp-rev'),
    cleanCss = require('gulp-clean-css'),
    flatmap = require('gulp-flatmap'),
    htmlmin = require('gulp-htmlmin');

function sassCompile() {
    return gulp.src('./css/*.scss')
    .pipe(sass().on('error', sass.logError))
    .pipe(gulp.dest('./css'))
    .pipe(browserSync.stream());
}

gulp.task('browserSync', function() {
    browserSync.init({
        watch:true,
        server: { baseDir: "./"}
    });
    gulp.watch('./css/*.scss', sassCompile)
});

function clean() {
    return del(['dist']);
}

function copyfonts() {
    return gulp.src('./node_modules/font-awesome/fonts/**/*.{ttf,woff,eof,svg}*')
    .pipe(gulp.dest('./dist/fonts'));
}

function minifyimg() {
    return gulp.src('img/*.{png,jpg,gif}')
    .pipe(imagemin({ optimization:3, progressive: true, interlaced: true}))
    .pipe(gulp.dest('dist/img'));
}

function useMin() {
    return gulp.src('./*.html')
    .pipe(flatmap(function(stream, file) {
        return stream
        .pipe(usemin({
            css: [rev()],
            html: [function() { return htmlmin({ collapseWhitespace: true})}],
            js: [uglify(), rev()],
            inlinejs: [uglify()],
            inlinecss: [cleanCss(), 'concat']
        }))
    }))
    .pipe(gulp.dest('dist/'));
}

exports.clean = clean;
exports.copyfonts = copyfonts;
exports.minifyimg = minifyimg;

gulp.task('default',  gulp.series('browserSync'));
gulp.task('build', gulp.series(clean, gulp.parallel(copyfonts, minifyimg, useMin)));

