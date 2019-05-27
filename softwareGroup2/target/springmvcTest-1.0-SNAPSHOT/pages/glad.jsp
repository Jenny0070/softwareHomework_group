<%--
  Created by IntelliJ IDEA.
  User: Sunny
  Date: 2019/5/22
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="${ctx}/static/custom/css/reset.css"/>
    <link type="text/css" rel="stylesheet" href="${ctx}/static/custom/css/glbj.css"/>
    <title>商品编辑</title>
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
            <a href="#" class="index-top6">某某某</a><a href="" class="index-top4">,你好</a>
                <a href="#" class="index-top7">退出管理</a>
        </div>
    </div>
</div>
<div class="logo comWidth">
    <a href="index.jsp"><img src="${ctx}/static/custom/images/logo.png" /></a>
    <h1>添加</h1>
</div>
<div class="bj-content comWidth">
    <div class="gl fl">
        <div class="gl-top">
            <h2>基本信息</h2>
        </div>
        <div class="gl-main">
            <dl class="gl-main-name">
                <dt class="main-name">
                    店铺名称
                </dt>
                <dd class="main-list" style="padding-top: 24px;line-height:201px">店铺图片</dd>
<%--                <dd class="main-list">菜品管理</dd>--%>

                <dd class="main-list main-list-special">详情介绍</dd>
            </dl>
        </div>
    </div>
    <div class="sp fl">
        <div class="sp-top"></div>
        <div class="sp-main">
            <form action="${ctx}/admin/insertStore" method="post" name="">
                <dl class="jb-main">
                    <dt class="jb-name">
                        <input type="text" class="jb1" value="" name="storeName" />
                        <!-- <textarea type="text" class="jb1" value=""/></textarea> -->
                    </dt>
                    <dd class="jb-list jb2">
<%--                        <input type="image" name="storePic"/>--%>
                        <!-- <img src="img/TIM截图20190514161443.png" width="160px" height="106px" /> -->
                    </dd>
<%--                    <dd class="jb-list">--%>
<%--                        <a href="${ctx}/pages/cpad.jsp">增加菜品</a><!-- 这个链接跳转到菜品的管理页面 -->--%>
<%--                    </dd>--%>

                    <dd class="jb-list ">
                        <input type="textarea" class="jb-list-special" value="" name="storeDesc" />
                        <!-- <textarea type="text" class="jb-list-special" value="" style="padding-bottom: 62px;"/></textarea> -->
                    </dd>
                </dl>
                <div class="btns">

                    <!-- <button id ="newinfo" type="button" value="" style="width: 75px;height: 31px;">返回</button>
                    <button id ="again"  type="button" value="" style="width: 75px;height: 31px;">重置</button> -->
                    <button type="submit" value="" style="width: 75px;height: 31px;">确定</button>
                </div>
            </form>
        </div>
    </div>
</div>
<!-- <div class="btns comWidth">
    <button type="button" value="" style="width: 75px;height: 31px;">确定</button>
    <button type="button" value="" style="width: 75px;height: 31px;">重置</button>
    <button type="button" value="" style="width: 75px;height: 31px;">返回</button>
</div> -->

</body>
</html>
