/**
 * 前台界面的常量定义
 */
define(function () {
    var defaultDNS;
    var location;
    if (window.parent) {
        location = window.parent.location;
    } else {
        location = window.location;
    }
    defaultDNS = location.protocol + "//" + location.host;
    //defaultDNS = "http://10.125.128.6:39399";
    //defaultDNS = "http://10.238.1.247";
    //defaultDNS = "http://192.168.16.133:8081";



    return {
        CONTEXT: defaultDNS,
        DEFAULTCHNL: "CHNL00000001",//默认渠道
        NGKM_TEMPLET_CHNL: "NGKM.TEMPLET.CHNL",
        NGKM_ATOM_PARAM_TYPE: "NGKM.ATOM.PARAM.TYPE",//知识原子数据类型数据字典
        NGKM_ATOM_PARAM_PRICEORTIMETYPE_WKUNIT: "NGKM.ATOM.PARAM.PRICEORTIMETYPE.WKUNIT",//知识原子数据字典：价格/时间类型单位
        NGKM_ATOM_PARAM_RAMTYPE_WKUNIT: "NGKM.ATOM.PARAM.RAMTYPE.WKUNIT",//知识原子数据字典：内存类型单位
        NGKM_ATOM_PARAM_TIMES_WKUNIT: "NGKM.ATOM.PARAM.TIMES.WKUNIT",//知识原子数据字典：时间类型单位
        NGKM_INDEX_EXTEND_FIELD_STORE: "NGKM.INDEX.EXTEND.FIELD.STORE",//知识索引模板配置字段名称
        NGKM_KNWLG_INDEX_FIELD_TYPE: "NGKM.KNWLG.INDEX.FIELD.TYPE",// 知识索引模板配置字段类型编码


        NGKM_ATOM_DATA_TYPE_CHAR: "1",//字符串
        NGKM_ATOM_DATA_TYPE_RADIO: "2",//单选
        NGKM_ATOM_DATA_TYPE_CHECK: "3",//多选
        NGKM_ATOM_DATA_TYPE_RICH: "4",//富文本
        NGKM_ATOM_DATA_TYPE_TIME: "5",//时间
        NGKM_ATOM_DATA_TYPE_DATE: "6",//日期
        NGKM_ATOM_DATA_TYPE_DATETIME: "7",//日期时间
        NGKM_ATOM_DATA_TYPE_KNLWG: "8",//关联知识
        NGKM_ATOM_DATA_TYPE_MEMORY: "9",//内存
        NGKM_ATOM_DATA_TYPE_FILE: "10",//附件
        NGKM_ATOM_DATA_TYPE_DATAUNIT: "11",//数据单元
        NGKM_ATOM_DATA_TYPE_PRICE: "12",//价格/时间类型
        NGKM_ATOM_DATA_TYPE_PIC: "13",//图片
        NGKM_ATOM_DATA_TYPE_LLT: "14",//经纬度
        NGKM_ATOM_DATA_TYPE_KNLWG_LIST: "15",//关系系列
        NGKM_ATOM_DATA_TYPE_REGN: "16",//地区
        NGKM_ATOM_DATA_TYPE_MEDIA: "17",//多媒体素材
        NGKM_ATOM_DATA_TYPE_COUNTRY: "99",//全国

        //知识审核通过状态
        NGKM_KNOWLEDGE_PASSSTATE : "审核通过",
        //知识操作状态码

        //操作类型类型代码
        NGKM_KNOWLEDGE_OPERTYPE: {
            INSERT : "1",//新增
            UPDATE : "2",//发起更新
            DELETE : "3",//删除
            REVERT : "4",//撤回
            REJECT : "5",//驳回
            PASS : "6"//审核通过
        },

        //TEMPLET_DETAIL_IP: "http://192.168.16.2:9005",
        TEMPLET_DETAIL_IP: defaultDNS,
        TEMPLET_CATALOG_IP: defaultDNS,
        MULTIMEDIA_IP: defaultDNS,
        DISTRICT_IP: defaultDNS,
        //KNOWLEDGE_CATALOG_IP: "http://192.168.16.3:9010",
        KNOWLEDGE_CATALOG_IP: defaultDNS,
        SEARCH_APP_IP: defaultDNS,
        //SEARCH_APP_IP: "http://192.168.16.133:8081",
        KNOWLEDGE_FAVORITE_IP: defaultDNS,
        CUSTOMIZATION_IP: defaultDNS,
        DETAIL_IP: defaultDNS,
        WORD_IP: defaultDNS,
        ATOM: defaultDNS,
        TMPLT: defaultDNS,
        AUDIO_SEARCH_IP: defaultDNS,
        SHORT_NOTE_SEND_IP: defaultDNS,
        WORK_FLOW_IP: defaultDNS,
        COMMON_DATA_IP: defaultDNS,
        DOCEDIT_MANAGE_IP: defaultDNS,

        TEMPLET_DETAIL_DNS: "/kc/tmplt/tmpltsvc/msa",
        TEMPLET_CATALOG_DNS: "/kc/tmplt/catalogsvc/msa",
        MULTIMEDIA_DNS: "/kc/doc/multimediasvc/msa",
        DISTRICT_DNS: "/kc/manage/distsvc/msa",
        KNOWLEDGE_CATALOG_DNS: "/kc/doc/catalogsvc/msa",
        SEARCH_APP_DNS: "/kc/search/appsvc/msa",
        KNOWLEDGE_FAVORITE_DNS: "/kc/doc/favorite/msa",
        CUSTOMIZATION_DNS: "/kc/manage/cust/msa",
        DETAIL_DNS: "/kc/doc/detailsvc/msa",
        WORD_DNS: "/kc/manage/wordsvc/msa",
        AUDIO_SEARCH_DNS: "/kc/ai/appsvc/msa/speechrecognition",
        SHORT_NOTE_SEND_DNS: "/kc/message/center/msa/sendmessage",
        WORK_FLOW_DNS: "/kc/work/flow/msa/start",
        COMMON_DATA_DNS: "/kc/common/staticdata/msa/staticdatabytypeid?typeId=",
        LINK_PREFIX: location.host,

        STATUS: {
            "-1": "删除",
            "0": "隐藏",
            "1": "待审核",
            "2": "审核驳回",
            "3": "审核通过"
        },

        PERSONAL_CONFIG: {
            "1": {
                "id": "latestPublish",
                "name": "最新发布",
                "render": "initLatestPublish"
            },
            "2": {
                "id": "latestUpdate",
                "name": "最近更新",
                "render": "initLatestUpdate"
            },
            "3": {
                "id": "currentHot",
                "name": "今日热门",
                "render": "initCurrentHot"
            },
            "4": {
                "id": "sevenHot",
                "name": "七日热门",
                "render": "initSevenHot"
            },
            "5": {
                "id": "thirtyHot",
                "name": "三十日热门",
                "render": "initThirtyHot"
            },
            "6": {
                "id": "currentCE",
                "name": "全国最新",
                "render": "initCurrentCE"
            }
        },
        MEDIA_ATTACH_TYPE: {
            1: ["png", "jpg"],
            2: ["mp3"],
            3: ["mp4"]
        },
        MEDIA_TYPE: {
            1: "图片",
            2: "音频",
            3: "视频"
        },
        MEDIA_STATUS: {
            "0": "审核驳回",
            "1": "已审核",
            "2": "提交未审核",
            "3": "已发布",
            "4": "撤销"
        },
        SUBMIT_TYPE: {
            CREATE: "1",
            UPDATE: "2",
            DELETE: "3"
        },
        FLOW_STATUS: {
            "1": "新建",
            "2": "修改",
            "3": "删除"
        },
        KNWLG_TYPE: {
            STRUCTKNWLG: "0",
            QAKNWLG: "1",
            MULKNWLG: "2"
        },
        KNWLG_REGN_TYPE: {
            COUNTRY: "1",
            PROVENCE: "2",
            REGION: "3"
        },
        //地区类型
        AREA_TYPE: {
            COUNTRY: "1",       //全国
            PROVINCE: "2",      //省分
            BASE : "3",         //基地
            CITY : "4"          //地市
        },

        MEDIA_SCOPE: {
            1: "NGKM.MULTIMEDIA.REGION.NATIONAL",
            2: "NGKM.MULTIMEDIA.REGION.PROVINCE",
            3: "NGKM.MULTIMEDIA.REGION.BASE"
        },

        //工作流下发任务类型
        WORK_FLOW_TYPE_CD:{
            CHNLEDIT: "9",
            REGNEDIT: "11"
        }
    }
});