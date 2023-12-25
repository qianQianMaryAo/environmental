<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>用户管理页面 >> 用户添加页面</span>
    </div>
    <div class="providerAdd">
        <form id="userForm" name="userForm" method="post" action="${pageContext.request.contextPath }/menus/add">
            <div>${errorMsg}</div>
            <!--div的class 为error是验证错误，ok是验证成功-->
            <div>
                <label for="roleCode">角色编码：</label>
                <input type="text" name="roleCode" id="roleCode" value="${roleCode}">
                <!-- 放置提示信息 -->
                <font color="red"></font>
            </div>
            <div>
                <label for="roleName">角色名称：</label>
                <input type="text" name="roleName" id="roleName" value="${roleName}">
                <font color="red"></font>
            </div>

            <input type="submit"/>
        </form>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
