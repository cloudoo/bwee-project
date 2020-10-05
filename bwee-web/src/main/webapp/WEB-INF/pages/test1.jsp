<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

</head>
<body>
<input id="ok" type="button" value="tree">
<br>
<hr>
<div id="div_menu"></div>
</body>

<script src="<c:url value='/assets/plugins/jQuery/jquery.min.js'/>"></script>


<script>
    var childlist = {
        "data" : [ {
            "name" : "安全",
            "childMenus" : [ {
                "name" : "QAR",
                "pass" : "t1pass",
                "childMenus" : [
                    {
                        "name" : "ENG文件",
                        "childMenus":[]
                    },
                    {
                        "name" : "阶段平均耗油",
                        "childMenus":[]
                    }
                ]

            }, {
                "name" : "不安全事件",
                "pass" : "t2pass",
                "childMenus" : []

            } ]

        }, {
            "name" : "经营",
            "pass" : "t4",
            "childMenus" : [
                {
                    "name" : "客运指标",
                    "childMenus":[]
                },
                {
                    "name" : "客票指标",
                    "childMenus":[]
                }
            ]

        } ]
    }
    function showall(childMenus, parent){
        for ( var child in childMenus) {
            //如果有子节点，则遍历该子节点
            if (childMenus[child].childMenus.length > 0) {
                //创建一个子节点a
                var la = $("<a></a>");
                //创建一个子节点li
                var li = $("<li></li>");
                $(la).append(childMenus[child].name);
                //将li的文本设置好，并马上添加一个空白的ul子节点，并且将这个li添加到父亲节点中
                $(li).append(la).append("<ul></ul>").appendTo(parent);

                //将空白的ul作为下一个递归遍历的父亲节点传入

//递归

                showall(childMenus[child].childMenus, $(li).children().eq(1));
            }
            //如果该节点没有子节点，则直接将该节点li以及文本创建好直接添加到父亲节点中
            else {
                var la = $("<a></a>");
                var li = $("<li></li>");
                $(la).append(childMenus[child].name);
                $(li).append(la).appendTo(parent);
            }
        }
    }

    $(document).ready(function() {
        $("#ok").click(function() {
            var showlist = $("<ul></ul>");
            showall(childlist.data, showlist);
            $("#div_menu").append(showlist);
        });

    });
</script>

</html>