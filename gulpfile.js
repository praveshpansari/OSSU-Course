'use-strict'

var gulp = require('gulp'),
    sass = require('gulp-sass'),
    browserSync = require('browser-sync').create();

function sassCompile() {
    return gulp.src('./css/*.scss')
    .pipe(sass().on('error', sass.logError))
    .pipe(gulp.dest('./css'))
    .pipe(browserSync.stream());
};

exports.sassCompile = sassCompile


// gulp.task('browser-sync', function() {
//     var files = [
//         './*.html',
//         './css/*.css',
//         './img/*.{png,jpg,gif}',
//         './js/*.js'
//     ];

//     browserSync.init(files, {
//         server: { baseDir: "./"}
//     });
// });

gulp.task('browserSync', function() {
    browserSync.init({
        watch:true,
        server: { baseDir: "./"}
    });
    gulp.watch('./css/*.scss', sassCompile)
});


gulp.task('default',  gulp.series('browserSync'));

