
requirejs(["jquery","util","ajax"], function ($,Util,AJAX) {

    var Inintional = function () {

        $("#btn_search").click(function () {

            // $.get("/query?name=王大雷&age=22",function (data) {
            //     alert(data);
            // });


            var param = {
                "name":"王大雷",
                "age":22
            };

            // AJAX.postJsonM("/select",param).done(function (data) {
            //     alert(data);
            // }).fail(function (err) {
            //     alert("错误");
            // });

            var r =JSON.stringify(param);

            Util.ajax.postJsonM("/select",r,function (result) {

                alert(result);
            })




        });

    }


    $(function () {
        Inintional();
    });
});