/*
* 引用路径
*/
var requirePath = {

    // Lib
    "jquery": "static/assets/lib/jquery/jquery-1.11.3.min",
    "toast": "static/assets/lib/toastr/toastr.min",
    "easyui-core": "static/assets/lib/easyui/jquery.easyui.min",
    "easyui": "static/assets/lib/easyui/locale/easyui-lang-zh_CN",
    "bootstrap": "static/assets/lib/bootstrap/bootstrap.min",
    "bootstrap-select": "static/assets/lib/bootstrap-select/bootstrap-select.min",
    "bootstrap-select-zh_CN": "static/assets/lib/bootstrap-select/i18n/defaults-zh_CN.min",
    "bootstrap-table": "static/assets/lib/bootstrap-table/bootstrap-table.min",
    "bootstrap-table-zh-CN": "static/assets/lib/bootstrap-table/locale/bootstrap-table-zh-CN.min",
    "bootstrap-datetimepicker": "static/assets/lib/bootstrap-datetimepicker/bootstrap-datetimepicker.min",
    "bootstrap-datetimepicker-zh-CN": "static/assets/lib/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN",
    "bootstrap-validator": "static/assets/lib/bootstrap-validator/bootstrapValidator.min",
    "lay-date": "static/assets/lib/laydate/laydate",
    "metisMenu": "static/assets/lib/metisMenu/jquery.metisMenu",
    "slimscroll": "static/assets/lib/slimscroll/jquery.slimscroll.min",
    "contabs": "static/assets/lib/contabs/contabs.min",
    'text': 'static/assets/lib/require/text',
    "css": 'static/assets/lib/require/css',

    "jplayer": "assets/components/jplayer/jquery.jplayer.min",

    "videojs": "assets/components/videojs/video.min",
    "videojs-ie8": "assets/components/videojs/ie8/videojs-ie8.min",

    "rating": "assets/components/rating/jquery.barrating",

    "umeditor": "assets/components/umeditor/lang/zh-cn/zh-cn",
    "umeditor-core": "assets/components/umeditor/umeditor",

    "ueditor": "assets/components/uedit/lang/zh-cn/zh-cn",
    "ueditor-core": "assets/components/uedit/ueditor.all",

    'ajax': 'static/assets/common/ajax_amd',
    'encrypt': 'static/assets/common/encrypt',
    "page-util": "static/assets/common/page-util",
    "util": "static/assets/common/util",
    "transfer": "static/assets/common/common-transfer",
    "form": "static/assets/lib/jquery-form/jquery.form",
    "dialog": "static/assets/components/dialog/dialog",
    "dialog-core": "static/assets/lib/dialog/dialog",
    'eventTarget': 'static/assets/common/eventTarget',
    'dialog-plus': 'static/assets/lib/dialog/dialog-plus',
    // "json": "../../js/lib/json2/1.0.0/json2",

    /* component */
    "loading": "static/assets/components/loading/loading",

    //"starScore": "assets/components/starScore/starScore",
    "raty": "static/assets/lib/raty/jquery.raty",
    "tab": "static/assets/lib/component/js/base/tab",
    "tree": "static/assets/lib/component/js/base/tree",
    "grid": "static/assets/lib/component/js/base/grid",
    "select": "static/assets/lib/component/js/base/select",
    "date": "static/assets/lib/component/js/base/datechooser",
    "textinput": "static/assets/lib/component/js/base/textinput",
    "pagination": "static/assets/lib/component/js/base/pagination",
    "swapgrid": "static/assets/lib/component/js/customization/swapgrid",
    "magictree": "static/assets/lib/component/js/customization/magictree",
    "paradeground": "static/assets/lib/component/js/customization/paradeground",
    /* handlebar */
    'hdb': 'static/assets/lib/handlebars/handlebars',
    'hdbr': 'static/assets/lib/handlebars/handlebars.runtime',
    /* component */
    /*zTree*/
    "ztree-core": "static/assets/lib/ztree-3.5.37/js/jquery.ztree.core",
    "ztree-exedit": "static/assets/lib/ztree-3.5.37/js/jquery.ztree.exedit",
    "ztree-exhide":"static/assets/lib/ztree-3.5.37/js/jquery.ztree.exhide",
    /*zTree*/
    /*easyui*/
    "tabs": "static/assets/lib/easyui/src/jquery.tabs",
    /*easyui*/
    /*echarts*/
    "echarts": "static/assets/lib/echarts/echarts.min",
    /*echarts*/
    /* highcharts */
    "highcharts": "static/assets/lib/highcharts/highcharts",
    "exporting": "static/assets/lib/highcharts/modules/exporting",
    /* highcharts */
    "ZeroClipboard": "static/assets/components/uedit/third-party/zeroclipboard/ZeroClipboard.min",
    "getToken": "static/js/userinfo/getToken",

    // 业务模块 开始
    "constants": "static/js/common/constants",
    "configDemo": "static/js/demo/configDemo",
    "queryDemo": "static/js/demo/queryDemo",
    "configDemoAdd": "js/demo/configDemoAdd",
    "uploadDemo": "js/demo/uploadDemo",
    "messagerDemo": "js/demo/messagerDemo",
    "otherDemo": "js/demo/otherDemo",
    "catalogTemplateInteractive": "js/manage/catalogTemplateInteractive",
    "kmAuditManageAdd": "js/manage/kmAuditManageAdd",
    "catalogTreeManage": "js/manage/catalogTreeManage",
    "templateManage": "js/manage/templateManage",
    "configAtomAdd": "js/manage/configAtomAdd",
    "recycledRestore": "js/manage/recycledRestore",
    "getApprovedLocus": "js/manage/getApprovedLocus",
    "knowledgePath": "js/manage/knowledgePath",
    "multiMediaInfoManage": "js/manage/multiMediaInfoManage",
    "multiMediaInteractive": "js/manage/multiMediaInteractive",
    "multiMediaConfigAdd": "js/manage/multiMediaConfigAdd",


    "docEditmultiMediaInfoManage": "js/manage/docEditmultiMediaInfoManage",
    "docEditmultiMediaInteractive": "js/manage/docEditmultiMediaInteractive",
    "docEditmultiMediaConfigAdd": "js/manage/docEditmultiMediaConfigAdd",
    "docEditmultiMediaCatalogManage": "js/manage/docEditmultiMediaCatalogManage",
    "interactive": "js/manage/interactive",

    "html5":"js/app/html5.min",
    "respond":"js/app/respond.min",
    "html5media":"js/app/html5media.min"
};

// window.addEventListener("mousewheel", function (e) {
//     if (e.deltaY === 1) {
//         e.preventDefault();
//     }
// });

// window._Config_ = {
//     date: new Date()
// };


/**
 * 避免data-main指定的js来自缓存
 */
var require = {
    baseUrl: "../../",
    paths: requirePath,
    waitSeconds: 0,
    map: {
        "*": {style: "assets/lib/require/css"}
    },
    shim: {
        bootstrap: {
            deps: ["jquery"],
            exports: "bootstrap"
        },
        "bootstrap-table": {
            deps: ["jquery"],
            exports: "bootstrap-table"
        },
        "bootstrap-table-zh-CN": {
            deps: ["jquery", "bootstrap-table"],
            exports: "bootstrap-table-zh-CN"
        },
        "bootstrap-select": {
            deps: ["jquery", "bootstrap"],
            exports: "bootstrap-select"
        },
        "bootstrap-select-zh_CN": {
            deps: ["jquery", "bootstrap-select"],
            exports: "bootstrap-select-zh_CN"
        },
        "bootstrap-datetimepicker": {
            deps: ["jquery"],
            exports: "bootstrap-datetimepicker"
        },
        "bootstrap-datetimepicker-zh-CN": {
            deps: ["jquery", "bootstrap-datetimepicker"],
            exports: "bootstrap-datetimepicker-zh-CN"
        },
        "bootstrap-validator": {
            deps: ["jquery", "bootstrap"],
            exports: "bootstrap-validator"
        },
        "lay-date": {
            deps: ["jquery"],
            exports: "lay-date"
        },
        "easyui-core": {
            deps: ["jquery"],
            exports: "easyui-core"
        },
        "easyui": {
            deps: ["easyui-core"],
            exports: "easyui"
        },
        "ztree-core": {
            deps: ["jquery"],
            exports: "ztree-core"
        },
        "ztree-exedit": {
            deps: ["ztree-core"],
            exports: "ztree"
        },
        "videojs": {
            deps: ["jquery"],
            exports: "videojs-ie8"
        },
        "rating": {
            deps: ["jquery"],
            exports: "rating"
        },
        "umeditor-core": {
            deps: [
                "assets/components/umeditor/third-party/jquery.min"
            ],
            exports: "umeditor-core"
        },

        "umeditor": {
            deps: [
                "assets/components/umeditor/third-party/jquery.min",
                "assets/components/umeditor/umeditor.config",
                "umeditor-core"

            ],
            exports: "umeditor"
        },

        "ueditor-core": {
            deps: [
                "jquery"
            ],
            exports: "ueditor-core"
        },

        "ueditor": {
            deps: [
                "jquery",
                "assets/components/uedit/ueditor.config",
                "ueditor-core"
            ],
            exports: "ueditor"
        },

        "hdb": {exports: ["Handlebars"]},
        "hdbHelper": {deps: ["hdb"]},
        "raty": {
            deps: [
                "jquery"
            ],
            exports: "raty"
        },
        "getToken": {
            deps: [
                "jquery", "js/userinfo/base64", "js/userinfo/analysisToken"
            ],
            exports: "raty"
        },
        "dialog-plus": {
            deps: ["jquery"],
            exports: "dialog-plus"
        }

    }
};