<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<nav class="top">
    <a href="${pageContext.request.contextPath}/index">
		<span style="color:#C40000;margin:0px" class=" glyphicon glyphicon-home redColor"></span>
		天猫首页
	</a>

	<span>喵，欢迎来天猫</span>

	<c:if test="${!empty user}">
		<a href="${pageContext.request.contextPath}/top/loginPage">${user.name}</a>
		<a href="${pageContext.request.contextPath}/top/forelogout">退出</a>
	</c:if>

	<c:if test="${empty user}">
		<a href="${pageContext.request.contextPath}/top/loginPage">请登录</a>
		<a href="${pageContext.request.contextPath}/top/registerPage">免费注册</a>
	</c:if>

	<span class="pull-right">
			<a href="${pageContext.request.contextPath}/bought/forebought">我的订单</a>
			<a href="${pageContext.request.contextPath}/cart/forecart">
			<span style="color:#C40000;margin:0px" class=" glyphicon glyphicon-shopping-cart redColor"></span>
			购物车<strong>${cartTotalItemNumber}</strong>件</a>
	</span>
</nav>



