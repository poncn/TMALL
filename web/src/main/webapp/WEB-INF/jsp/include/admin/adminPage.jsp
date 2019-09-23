<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
<script>
$(function(){
	$("ul.pagination li.disabled a").click(function(){
		return false;
	});
});

</script>

<nav>
  <ul class="pagination">
    <li <c:if test="${pageBean.pageNumber==1}">class="disabled"</c:if>>
      <a  href="${pageContext.request.contextPath}/admin/1" aria-label="Previous" >
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>

    <li <c:if test="${pageBean.pageNumber==1}">class="disabled"</c:if>>
      <a  href="${pageContext.request.contextPath}/admin/${pageBean.pageNumber-1}" aria-label="Previous" >
        <span aria-hidden="true">&lsaquo;</span>
      </a>
    </li>

    <c:forEach begin="1" end="${pageBean.pageTotal}" step="1" var="n">
		    <li <c:if test="${pageBean.pageNumber==n}">class="disabled"</c:if>>
		    	<a href="${pageContext.request.contextPath}/admin/${n}" class="current">${n}</a>
		    </li>
    </c:forEach>

    <li <c:if test="${pageBean.pageNumber==pageBean.pageTotal}">class="disabled"</c:if>>
      <a href="${pageContext.request.contextPath}/admin/${pageBean.pageNumber+1}" aria-label="Next">
        <span aria-hidden="true">&rsaquo;</span>
      </a>
    </li>

    <li <c:if test="${pageBean.pageNumber==pageBean.pageTotal}">class="disabled"</c:if>>
      <a href="${pageContext.request.contextPath}/admin/${pageBean.pageTotal}" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
