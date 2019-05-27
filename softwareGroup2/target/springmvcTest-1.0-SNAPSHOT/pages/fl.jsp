<%--
  Created by IntelliJ IDEA.
  User: Sunny
  Date: 2019/5/22
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <meta charset="utf-8">
    <link type="text/css" rel="stylesheet" href="${ctx}/static/custom/css/reset.css"/>
    <link type="text/css" rel="stylesheet" href="${ctx}/static/custom/css/fl.css"/>
    <title>管理分类</title>
</head>
<body>
<div class="topBar">
    <div class="comWidth">
        <div class="leftArea">
            <a href="logon.jsp" style="color:#f4d506;" class="index-top8">欢迎你</a>
            <a href="register.jsp" class="index-top8">某某某</a>
        </div>
        <div class="rightArea">
            <a href="index.jsp" class="index-top5" style="color:#f4d506;">首页</a>
            <a href="#" class="index-top6">菜品管理</a>
            <a href="#" class="index-top7">退出管理</a>
        </div>
    </div>
</div>
<div class="logoBar">
    <div class="comWidth">
        <div class="logo fl">
<%--            <a href="index.jsp"><img src="${ctx}/static/custom/images/logo.png" alt="" width="180px" height="80px"></a>--%>
        </div>
        <div class="search-box fl">
            <input type="text" class="search-text fl" placeholder="麻辣香锅"/>
            <a href=""><input type="button" value="搜 索" class="search-btn fr"/></a>
        </div>

    </div>
</div>
<div class="comWidth1">
    <div class="fl-content comWidth">

        <a href="${ctx}/admin/insertFoodInter?storeId=${sessionScope.storeId}"><button class="fl-btn1">添加菜品</button></a>
    </div>
    <div class="flspmain comWidth">
        <c:forEach items="${foodList}" var="list">
            <div class="flsp fl">

                <img src="${ctx}/static/custom/images/${list.foodPic}" width="228px" height="220px"/>
                <div class="spby">
                    <p>${list.foodName}</p>
                </div>
                <div class="bja">
                    <a href="${ctx}/admin/updateFoodInter?foodId=${list.foodId}&storeId=${sessionScope.storeId}"><img src="${ctx}/static/custom/images/update.jpg" width="26px" height="26px"/></a>
                    <a href="${ctx}/admin/deleteFood?foodId=${list.foodId}"><img src="${ctx}/static/custom/images/delete.jpg" width="26px" height="26px" onclick="del()"/></a>


                </div>

            </div>
        </c:forEach>
<%--        <div class="flsp fl">--%>
<%--            <img src="${ctx}/static/custom/images/x2.jpg" width="228px" height="220px"/>--%>
<%--            <!-- <p class="spjs"><a href="">2018夏下衣失踪chic打底衫印花上衣宽松BF风中长款短袖 t恤 女装ins</a></p>--%>
<%--            <span class="spjg1">&yen;&nbsp;59.8</span><del class="spjg2">&yen;100.0</del> -->--%>
<%--            <div class="spby">--%>
<%--                <p>土豆</p>--%>
<%--            </div>--%>
<%--            <div class="bja">--%>
<%--                <a href="cpbj.jsp"><img src="${ctx}/static/custom/images/update.jpg" width="26px" height="26px" /></a>--%>
<%--                <a href="$"><img src="${ctx}/static/custom/images/delete.jpg" width="26px" height="26px" onclick="del()"/></a>--%>


<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="flsp fl">--%>
<%--            <img src="${ctx}/static/custom/images/x3.jpg" width="228px" height="220px"/>--%>
<%--            <!-- <p class="spjs"><a href="">2018夏下衣失踪chic打底衫印花上衣宽松BF风中长款短袖 t恤 女装ins</a></p>--%>
<%--            <span class="spjg1">&yen;&nbsp;59.8</span><del class="spjg2">&yen;100.0</del> -->--%>
<%--            <div class="spby">--%>
<%--                <p>白菜</p>--%>
<%--            </div>--%>
<%--            <div class="bja">--%>
<%--                <a href="cpbj.jsp"><img src="${ctx}/static/custom/images/update.jpg" width="26px" height="26px" /></a>--%>
<%--                <a href="#"><img src="#{ctx}/static/custom/images/delete.jpg" width="26px" height="26px" onclick="del()"/></a>--%>


<%--            </div>--%>
<%--        </div>--%>

    </div>
</div>
<button class="fl-btn2 ">1</button>
<button class="fl-btn2 ">2</button>
<button class="fl-btn2 ">3</button>
<button class="fl-btn2 ">4</button>
<button class="fl-btn2 ">5</button>

</body>

<%--<script type="text/javascript">--%>
<%--    function del(){--%>
<%--        //通过class获取元素--%>

<%--        paras = document.getElementsByClassName('flsp fl');--%>

<%--        for(i=0;i<paras.length;i++){--%>

<%--            //删除元素 元素.parentNode.removeChild(元素);--%>

<%--            if (paras[i] != null)--%>

<%--                paras[i].parentNode.removeChild( paras[i]);--%>

<%--        }--%>



<%--//清空一个元素，即删除一个元素的所有子元素--%>

<%--// function removeAllChild()  { --%>

<%--//     var div = document.getElementById("div1"); --%>

<%--//     while(div.hasChildNodes()) //当div下还存在子节点时 循环继续 --%>

<%--//     { --%>

<%--//         div.removeChild(div.firstChild); --%>

<%--//     } --%>

<%--// }--%>

<%--    }--%>
<%--// </script>--%>

</html>
