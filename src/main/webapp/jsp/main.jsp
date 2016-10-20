<%--
  Created by IntelliJ IDEA.
  User: sunrx
  Date: 2016/10/19
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="utf-8"/>
<title>墨澜驿站</title>
<meta name="keyword" content="墨澜, 驿站, inkbillows, inkbillow, ink, billows"/>
<link rel="stylesheet" type="text/css" href="/css/main.css"/>
</head>
<body>
<div class="main">
    <header class="divider">
        <div class="header limit">
            <a class="title" href="/">墨澜驿站</a>

            <input class="keyword" type="text"/>
        </div>
    </header>

    <nav class="nav divider">
        <div class="limit">
            <a href="/">首页</a><a href="/">小说</a><a href="/">小说</a><a href="/">小说</a><a href="/">小说</a><a href="/">小说</a>
        </div>
    </nav>

    <div class="content">

        <div class="summary divider"></div>

        <% for (int i = 0; i < 5; i++) { %>
        <div class="hot divider">
            <a href="/">
                <p class="title">国内文学</p>
            </a>
            <% for (int j = 0; j < 5; j++) { %>
            <div class="book">
                <a href="/">
                    <p class="title">
                        平凡的世界
                    </p>
                    <p class="author">
                        路遥
                    </p>
                    <p class="bottom">
                        中国第三届茅盾文学奖
                    </p>
                </a>
            </div>
            <% } %>
        </div>
        <% } %>
    </div>

    <footer class="footer">
        <div class="copy-right">
            <p>
                <span>Copyright &copy; 2002-2016 www.inkbillows.com All Right Reserved</span>版权所有 北京墨澜信息科技有限公司
            </p>
            <p>上海玄霆娱乐信息科技有限公司 增值电信业务经营许可证沪B2-20080046 沪网文[2012]0068-008 新出网证（沪）字010 沪ICP备08017520号-1</p>
            <p>请所有作者发布作品时务必遵守国家互联网信息管理办法规定，我们拒绝任何色情小说，一经发现，即作删除！客服电话：010-59357051</p>
            <p>本站所收录作品、社区话题、书库评论及本站所做之广告均属个人行为，与本站立场无关</p>
        </div>
    </footer>
</div>
</body>
</html>