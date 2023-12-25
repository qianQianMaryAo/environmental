<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>菜单管理页面 >> 用户列表信息查看页面</span>
    </div>
    <div class="providerView">
        <p><strong>用户编号：</strong><span>${role.roleCode }</span></p>
        <p><strong>用户名称：</strong><span>${role.roleName }</span></p>
        <p><strong>创建人：</strong><span>${role.createdByName }</span></p>
        <p><strong>创建时间：</strong><span>${role.creationDateStr }</span></p>

        <div class="providerAddBtn">
            <input type="button" value="返回" onclick="location.href=('${pageContext.request.contextPath }/menus/query') " >
        </div>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
