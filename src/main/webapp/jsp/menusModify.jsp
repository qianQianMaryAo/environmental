<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>订单管理页面 >> 订单添加页面</span>
    </div>
    <div class="menusModify">
        <form action="${pageContext.request.contextPath}/menus/menusModify" method="get">
            <input type="hidden" name="id" value="${id}">
            <c:forEach var="menus" items="${menusList}" varStatus="status">
                <input type="checkbox" name="menusId" value="${menus.id}" ${menus.flag?"checked":""}>${menus.menuCode}<br>
            </c:forEach>
            <input type="submit"/>
        </form>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>

