
requirejs(["jquery","util","easyui"], function ($,Util) {

    var $search,$page,$word;

    var Inintional = function () {


        $page = $("<div></div>");
        $('#page_content').append($page);

        //初始化表单
        // addSearchForm();
        // addGridDom();

        initGrid();





        $("#btn_search").click(function () {
            // $.get("/query?name=王大雷&age=22",function (data) {
            //     alert(data);
            // });
            var param = {
                "name":"王大雷",
                "age":22
            };
            var r =JSON.stringify(param);
            Util.ajax.postJsonM("/select",r,function (result) {
                alert(result);
            })

        });
        
        $("#createWord").click(function (e) {
            var param = {
                "configId":"王大雷",
                "workTimeId":22,
                "beganDate" : "2019-11-14 11:17:35"
            };
            var r =JSON.stringify(param);
            Util.ajax.postJsonM("/insertTCentreWorkTimeStaff",r,function (result) {
                alert(result);
            })

        });

    };
    function addSearchForm() {
        $search = $([
            "<div class='panel-search'>",
            "<form class='form form-horizontal' id='myForm'>",

            // 测试渲染
            "<div class='row'>",
            "<label class='form-label col-2'>常用语：</label>",
            "<div class='formControls col-2'>",
            "<input type='text' class='easyui-textbox' name='word' id='WORD'style='width:100%;height:30px'>",
            "</div>",
            // "</div>",
            // "<div class='row cl'>",
            "<div class='formControls col-2' style='text-align: right;width: 65%'>",
            "<a href='javascript:void(0)' class='btn btn-green radius mt-l-20'><i class='iconfont iconfont-search2'></i>查询</a>",
            "<a href='javascript:void(0)' class='btn btn-default radius mt-l-20 '><i class='iconfont iconfont-zhongzuo'></i>重置</a>",
            "</div>",
            "</div>",

            "</form>",
            "</div>"
        ].join("")).appendTo($page);
    };
    function addGridDom() {
        $word = $([
            "<div class='cl'>",
            "<div class='panel-tool-box cl' >",
            "<div class='fl text-bold'>常用语列表</div>",
            "<div class='fr'>",
            "<a id='createWord'  href='javascript:void(0)'  class='btn btn-secondary radius mt-l-20'>" +
            "<i class='iconfont iconfont-add'></i>添加</a>",
            "<a id='updateWord'  href='javascript:void(0)'  class='btn btn-secondary radius mt-l-20'>" +
            "<i class='iconfont iconfont-edit'></i>修改</a>",
            "<a id='deleteWord'  href='javascript:void(0)'  class='btn btn-secondary radius mt-l-20'>" +
            "<i class='iconfont iconfont-del2'></i>删除</a>",
            "</div>",
            "</div>",
            "</div>",
            "<table id='word' class='easyui-datagrid'  style=' width:98%;height:245px;'>" +
            "</table>"
        ].join("")).appendTo($page);
    };

    function initGrid() {
        $("#beginDate").datebox({
            required:true
        });
        $("#endDate").datetimebox({

        });
        $("#word").datagrid({
            columns: [[
                {field: 'configId', title: '主键', width: '20%'},
                {field: 'workTimeId', title: '班务ID', width: '20%'},
                {field: 'staffName', title: '员工姓名', width: '20%'},
                {field: 'beganDate', title: '开始日期', width: '20%'},
                {field: 'endDate', title: '结束日期', width: '20%'}
            ]],
            fitColumns: true,
            width: '100%',
            height: 420,
            pagination: true,
            pageSize: 10,
            pageList: [10, 20, 50, 100],
            rownumbers: true,
            singleSelect: true,
            autoRowHeight: false,
            onSelect: function (index, row) {
                wordConfig = row;
                selectIndex = index;
            },
            loader: function (param, success) {

                var param = {
                    "state":"1"
                };
                var r =JSON.stringify(param);
                Util.ajax.postJsonM("/queryTCentreWorkTimeStaff",r,function (result) {
                    // var data = {
                    //             rows: result.DATA
                    //             // total: result.TOTAL
                    //         }
                            success(result);
                })

                // var start = (param.page - 1) * param.rows;
                // var pageNum = param.rows;
                // var comm_word = $("#myForm").find("input[name=word]").val();
                // var params = $.extend({
                //     "START": start,
                //     "PAGENUM": pageNum,
                //     "COMM_WORD": comm_word,
                //     "PRSN_ID":''
                // }, Util.PageUtil.getParams($("#myForm")));
                // Util.ajax.getJson(Util.constants.CONTEXT+"/kc/manage/language/msa/getlanguageinfoapi", params, function (result) {
                //     // console.log(result);
                //     var data = {
                //         rows: result.RSP.DATA,
                //         total: result.RSP.TOTAL
                //     }
                //     success(data);
                // });

            }
        });
        // $page.find("a.btn").linkbutton();
    };


    $(function () {
        Inintional();
    });
});