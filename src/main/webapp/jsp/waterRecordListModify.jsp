<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/jsp/common/head.jsp" %>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>水质数据管理页面 >> 修改页面</span>
    </div>
    <div class="providerAdd">
        <form id="userForm" name="userForm" method="post" action="${pageContext.request.contextPath }/water/modify">
            <div>${errorMsg}</div>
            <!--div的class 为error是验证错误，ok是验证成功-->
            <label for="COD">化学需氧量（COD）：</label>
            <input type="text" name="COD" id="COD" value="${water.COD}">
            <!-- 放置提示信息 -->
            <font color="red"></font>
    </div>
    <div>
        <label for="TN">总氮（TN）：</label>
        <input type="text" name="TN" id="TN" value="${water.TN}">
        <font color="red"></font>
    </div>
    <div>
        <label for="NH3-N">氨氮（NH3-N）：</label>
        <input type="text" name="NH3-N" id="NH3-N" value="${water.NH3-N}">
        <font color="red"></font>
    </div>
    <div>
        <label for="TP">总磷（TP）：</label>
        <input type="text" name="TP" id="TP" value="${water.TP}">
        <font color="red"></font>
    </div>
    <div>
        <label for="testTime">测样时间：</label>
        <input type="text" name="testTime" id="testTime" value="${water.testTime}" onclick="WdatePicker()">
        <font color="red"></font>
    </div>
    <div>
        <label for="uploadTime">上传时间：</label>
        <input type="text" name="uploadTime" id="uploadTime" value="${water.uploadTimeDTO}" onclick="WdatePicker()" readonly>
        <font color="red"></font>
    </div>
    <div>
        <label for="uploadBy">上传人：</label>
        <input type="text" name="uploadBy" id="uploadBy" value="${water.uploadBy}" readonly>
        <font color="red"></font>
    </div>
    <div>
        <label for="roleId">上传人角色：</label>
        <input type="text" name="roleId" id="roleId" value="${water.roleId}">
        <font color="red"></font>
    </div>
    <input type="submit" value="保存"/>
    </form>
</div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>

