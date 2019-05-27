<%--
  Created by IntelliJ IDEA.
  User: Sunny
  Date: 2019/5/22
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="${ctx}/static/custom/css/reset.css"/>
    <link type="text/css" rel="stylesheet" href="${ctx}/static/custom/css/glbj.css"/>

    <title>菜品添加</title>

</head>
<body>
<div class="topBar">
    <div class="comWidth">
        <div class="leftArea">
            <a href="logon.jsp" style="color:#f4d506;" class="index-top8"></a>
            <a href="register.jsp" class="index-top8">欢迎来到东师美食 用户管理</a>
        </div>
        <div class="rightArea">
            <a href="index.jsp" class="index-top5" style="color:#f4d506;">首页</a>
            <a href="#" class="index-top6">某某某</a><a href="" class="index-top4">,你好</a>
                <a href="#" class="index-top7">退出管理</a>
        </div>
    </div>
</div>
<div class="logo comWidth">
<%--    <a href="index.jsp"><img src="${ctx}/static/custom/images/logo.png" /></a>--%>
    <h1>添加菜品</h1>
</div>
<div class="bj-content comWidth">
    <div class="gl fl">
        <div class="gl-top">
            <h2>基本信息</h2>
        </div>
        <div class="gl-main">
            <dl class="gl-main-name">
                <dt class="main-name">
                    名称
                </dt>
                <dd class="main-list" style="padding-top: 24px;line-height:200px">菜品图片</dd>

            </dl>
        </div>
    </div>

    <div class="sp fl">
        <div class="sp-top"></div>
        <div class="sp-main" style="height: 420px">
            <form action="/admin/insertFood?storeId=${sessionScope.storeId}" enctype="multipart/form-data" method="post" >
                <dl class="jb-main" >
                    <dt class="jb-name">
                        <input type="text" class="jb1" value="" name="foodName" /><!-- 名称 -->
                        <!-- <textarea type="text" class="jb1" value=""/></textarea> -->
                    </dt>
                        <dd class="jb-list jb2">

                            <input type="file" id="file" name="file"/><!-- 上传图片功能 -->
<%--                            <input type="submit" name="submitPicture" id="upload" value="submit"/>--%>
                        </dd>
                </dl>
                <div class="btns">
                    <button type="submit" id="submit" style="width: 75px;height: 31px;">确定</button>
                </div>
            </form>
<%--            <script src=${ctx}/static/plugins/layui/lay/jquery.js"></script>--%>
<%--            <script type="application/javascript">--%>
<%--                $("#upload").on('click', upfile);--%>
<%--                function upfile() {--%>

<%--                    var formData = new FormData();--%>

<%--                    formData.append("file", document.getElementById('file').files[0]);--%>
<%--                    // console.log(document.getElementById('file1').files[0]);--%>

<%--                    // formData.append("接收字段2", document.getElementById('file2').files[0]);--%>
<%--                    // console.log(document.getElementById('file2').files[0]);--%>

<%--                    $.ajax({--%>

<%--                        url: 'http://localhost/transfer/upload',--%>
<%--                        type: 'POST',--%>
<%--                        data: formData, // 上传formdata封装的数据包--%>
<%--                        dataType: 'String',--%>
<%--                        cache: false, // 不缓存--%>
<%--                        processData: false, // jQuery不要去处理发送的数据--%>
<%--                        contentType: false, // jQuery不要去设置Content-Type请求头--%>
<%--                        success: function(data) { // 成功回调--%>
<%--                            console.log(data);--%>

<%--                        }--%>

<%--                    });--%>

<%--                }--%>
<%--            </script>--%>

<%--            <script type="application/javascript">--%>
<%--                $(function(){--%>
<%--                    $("#upload").click(function () {--%>
<%--                        var formData = new FormData();--%>
<%--                        formData.append("")--%>
<%--                        $.ajax({--%>
<%--                            type: 'post',--%>
<%--                            url: "http://localhost/transfer/upload",--%>
<%--                            data: formData,--%>
<%--                            cache: false,--%>
<%--                            processData: false,--%>
<%--                            contentType: false,--%>

<%--                        }).success(function (data) {--%>
<%--                            alert(data);--%>
<%--                        }).error(function () {--%>
<%--                            alert("上传失败");--%>
<%--                        });--%>
<%--                    });--%>

<%--                });--%>
<%--            </script>--%>


        </div>
    </div>
</div>
<%--<script>--%>
<%--    $(document).ready(function() {--%>
<%--        $("#submitPicture").click(function () {--%>

<%--            $("#draw").attr("action", "${ctx}/transfer/upload");--%>
<%--            $("form").submit();--%>
<%--        });--%>
<%--        $("#submit").click(function () {--%>

<%--            $("#draw").attr("action", "${ctx}/admin/insertFood");--%>
<%--            $("form").submit();--%>
<%--        });--%>
<%--    });--%>
<%--</script>--%>
<!-- <div class="btns comWidth">
    
    <button id ="newinfo" type="button" value="" style="top: -40px;width: 75px;height: 31px;">确定</button>
    <button id ="again" type="button" value="" style="top: -40px;width: 75px;height: 31px;">重置</button>
    <button type="button" value="" style="top: -40px;width: 75px;height: 31px;">返回</button>
</div> -->
<div class="footer comWidth" style="top: 844px;">

    <div class="footer-main3">
        <a href="" class="footer-main2">关于我们</a>
        <a href="" class="footer-main2">合作伙伴</a>
        <a href="" class="footer-main2">营销中心</a>
        <a href="" class="footer-main2">廉政举报</a>
        <a href="" class="footer-main2">联系客服</a>
        <a href="" class="footer-main2">开放平台</a>
        <a href="" class="footer-main2">诚征英才</a>
        <a href="" class="footer-main2">联系我们</a>
        <a href="" class="footer-main2">网站地图</a>
        <a href="" class="footer-main2">法律声明及隐私权政策</a>
<%--        <p class="footer-main4">&copy;" 2018 nenu.com 版权所有 网络文化经营许可证<p><br />--%>
<%--        <p class="footer-main5">浙网文[2016]0132-032号 | 增值电信业务经营许可证：浙B2-20080224-1 | 信息网络传播视听节目许可证：1109364号</p>--%>
    </div>
</div>
</body>
</html>
