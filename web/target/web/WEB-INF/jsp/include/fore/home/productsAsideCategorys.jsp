
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script>
$(function(){
	$("div.productsAsideCategorys div.row a").each(function(){
		var v = Math.round(Math.random() *6);
		if(v == 1)
			$(this).css("color","#87CEFA");
	});
});

</script>
<c:forEach items="${cs}" var="c">
	<div cid="${c.id}" class="productsAsideCategorys">
        <div class="row show1" style="display: flex;flex-flow: row wrap;">
            <c:forEach items="${c.products}" var="p">
                <c:if test="${!empty p.subTitle}">
                    <c:forEach items="${fn:split(p.subTitle, ' ')}" var="title" varStatus="st">
                        <a href="${pageContext.request.contextPath}/product/foreproduct?pid=${p.id}" style="width: 100px;height: 50px;">
                            ${title}
						</a>
                    </c:forEach>
                </c:if>
            </c:forEach>
            <div class="seperator"></div>
        </div>
    </div>
</c:forEach>
	
