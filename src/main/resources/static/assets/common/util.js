/**
 * 全局公用模块
 */
define(['constants', 'page-util', 'ajax'], function (constants, PageUtil, ajax) {

    /**
     * 打印日志
     * @param msg
     */
    var logConsole = function (msg) {
        // IE console
        if (window.console && window.console.log) {
            var curr = new Date();
            var time = curr.getHours() + ":" + curr.getMinutes() + ":" + curr.getSeconds();
            window.console.log("[" + time + "]: " + msg);
        }
    };

    var tabAddHandler = function (tabId, tabName, tabUrl, localUrl) {
        var openType = typeof (top.tabAddHandler);
        if (openType !== "undefined" && openType === "function") {
            tabAddHandler = top.tabAddHandler(tabId, tabName, tabUrl);
            return;
        }
        tabAddHandler = window.open(localUrl);
    };

    return {
        log: logConsole,
        constants: constants,
        ajax: ajax,
        PageUtil: PageUtil,
        getValue: ajax.getValue,
        uuidFast: ajax.uuidFast,
        tabAddHandler: tabAddHandler
    }

});