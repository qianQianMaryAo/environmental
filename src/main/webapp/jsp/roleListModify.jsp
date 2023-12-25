<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>c菜单管理页面 >> 用户角色修改页面</span>
    </div>
    <div class="providerAdd">
        <form id="userForm" name="userForm" method="post" action="${pageContext.request.contextPath }/menus/modifyRoleList">
            <div>${errorMsg}</div>
            <input type="hidden" name="id" value="${role.id }"/>
            <div>
                <label for="roleCode">用户编码：</label>
                <input type="text" name="roleCode" id="roleCode" value="${role.roleCode }">
                <font color="red"></font>
            </div>

            <div>
                <label for="roleName">用户名称：</label>
                <input type="text"  id="roleName" name="roleName" value="${role.roleName }">
                <font color="red"></font>
            </div>
            <div>
                <label for="createdBy">创建人：</label>
                <input type="text"  id="createdBy" name="createdBy" value="${role.createdByName }" readonly>
                <font color="red"></font>
            </div>

            <div>
                <label for="creationDate">创建日期：</label>
                <input type="text" name="creationDate" id="creationDate" value="${role.creationDateStr }" readonly>
            </div>
                <input type="submit" value="保存" />
        </form>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/usermodify.js"></script>
