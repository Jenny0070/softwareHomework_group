<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%--
  Created by IntelliJ IDEA.
  User: Sunny
  Date: 2019/5/22
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="${ctx}/static/custom/css/reset.css"/>
    <link type="text/css" rel="stylesheet" href="${ctx}/static/custom/css/gljm.css"/>
    <title>管理中心</title>
</head>
<body>
<div class="topBar">
    <div class="comWidth">
        <div class="leftArea">
            <a href="${ctx}/pages/logon.jsp" style="color:#f4d506;" class="index-top8"></a>
            <a href="${ctx}/pages/register.jsp" class="index-top8">欢迎来到东师美食 用户管理</a>
        </div>
        <div class="rightArea">
            <a href="${ctx}/pages/index.jsp" class="index-top5" style="color:#f4d506;">首页</a>
            <a href="$" class="index-top6">某某某</a><a href="" class="index-top4">,你好</a>
                <a href="$" class="index-top7">退出管理</a>
        </div>
    </div>
</div>
<div class="logo comWidth">
<%--    <a href="index.jsp"><img src="${ctx}/static/custom/images/logo.png" /></a>--%>
    <h1>管理中心</h1>
</div>
<div class="shoplist comWidth">
    <div class="gl fl">
        <div class="gl-top">
            <h2>导航菜单</h2>
        </div>
        <div class="gl-main">
            <dl class="gl-main-name">
                <dt class="main-name">
                    <a href="${ctx}/pages/gljm.jsp">店铺管理</a>
                </dt>
                <dd class="main-list"><a href="#">菜品管理</a></dd>
                <!-- <dd class="main-list"><a href="">发布商品</a></dd>
                <dd class="main-list"><a href="">订单管理</a></dd>
                <dd class="main-list" style="background-color: $EEEEEE;"><a href=""  style="color: $f4d506;">品类管理</a></dd> -->
            </dl>
            <!-- <dl class="gl-main-name">
                <dt class="main-name">
                    <a href="">物流管理</a>
                </dt>
                <dd class="main-list"><a href="">物流配置</a></dd>
                <dd class="main-list"><a href="">物流订单</a></dd>
            </dl> -->
            <dl class="gl-main-name">
                <dt class="main-name">
                    <a href="">信息管理</a>
                </dt>
                <!-- <dd class="main-list"><a href="">个人设置</a></dd> -->
                <dd class="main-list"><a href="">用户管理</a></dd>
            </dl>
            <dl class="gl-main-name">
                <dt class="main-name">
                    <a href="">评论管理</a>
                </dt>
                <!-- <dd class="main-list"><a href="">咨询答复</a></dd> -->
            </dl>
        </div>
    </div>
    <div class="sp fl">
        <div class="sp-top">
            <h2>管理大厅</h2>
        </div>
        <div class="sp-main">
            <div class="sp-main-top">
                <div class="title">
                    <h2 class="title-text"><span>店铺信息</span></h2>
                </div>
            </div>
            <div class="sp-main-btn">
                <button type="button" value=""><a href="${ctx}/pages/glad.jsp">添加</a></button>
            </div>
            <table class="list">
                <tr class="listh1">
                    <!-- <td class="lists">序号</td> -->
                    <td class="lists">店铺图片</td>
                    <td class="lists">店铺名称</td>
                    <!-- <td class="lists">商品价格</td> -->
                    <td class="lists">详情介绍</td>
                    <td class="lists">分数</td>
                    <td class="lists">店铺排名</td>

                    <td class="lists">编辑</td>
                    <td class="lists">删除</td>
                </tr>
<%--                此处注意"${storeList}"中间是否有多空格--%>
                <c:forEach items="${sessionScope.storeList}" var="list">
                    <tr class="listh2">

                        <td class="lists1 "><img src="${ctx}/static/custom/images/${list.storePic}" width="80px" height="76px"/></td>
                        <td class="lists2 "><a href="${ctx}/admin/queryOneStoreFoodList?storeId=${list.storeId}">${list.storeName}</a></td>
                        <td class="lists3 ">${list.storeDesc}</td>
                        <td class="lists4 ">${list.storeScore}</td>
                        <td class="lists5 ">${list.storeRanking}</td>
                        <td class="lists6 "><a href="${ctx}/admin/updateStoreInter?storeId=${list.storeId}"><img src="${ctx}/static/custom/images/update.jpg" width="26px" height="26px" /></a></td>
                        <td class="lists7 "><a href="${ctx}/admin/deleteStore?storeId=${list.storeId}"><img src="${ctx}/static/custom/images/delete.jpg" width="26px" height="26px"/></a></td>
                    </tr>
                </c:forEach>


<%--                <tr class="listh2">--%>

<%--                    <td class="lists1 "><img src="" width="80px" height="76px"/></td>--%>
<%--                    <td class="lists2 "><a href="">米线</a></td>--%>
<%--                    <td class="lists3 ">优秀</td>--%>
<%--                    <td class="lists4 ">4分</td>--%>
<%--                    <td class="lists5 ">第三名</td>--%>

<%--                    <td class="lists6 "><a href="glbj.jsp"><img src="${ctx}/static/custom/images/update.jpg" width="26px" height="26px" /></a></td>--%>
<%--                    <td class="lists7 "><a href=""><img src="${ctx}/static/custom/images/delete.jpg" width="26px" height="26px"/></a></td>--%>
<%--                </tr>--%>

            </table>
        </div>
    </div>
</div>
</body>
</html>

