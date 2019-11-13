$(Document).ready(function () {
    $("#mycarousel").carousel({
        interval: 2000
    });
    $("#carouselBtn").click(function () {
        if ($("#carouselBtn").children("span").hasClass("fa-pause")) {
            $("#mycarousel").carousel('pause');
            $("#carouselBtn").children("span").removeClass("fa-pause");
            $("#carouselBtn").children("span").addClass("fa-play");
        } else {
            $("#mycarousel").carousel('cycle');
            $("#carouselBtn").children("span").removeClass("fa-play");
            $("#carouselBtn").children("span").addClass("fa-pause");
        }
    });

    $("#reserveBtn").click(function () {
        $("#reserveModal").modal('toggle');
    });

    $("#loginBtn").click(function () {
        $("#loginModal").modal('toggle');
    })

});