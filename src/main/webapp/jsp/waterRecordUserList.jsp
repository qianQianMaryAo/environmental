<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>水质数据管理页面</span>
    </div>
    <div class="search">
        <form method="get" action="${pageContext.request.contextPath }/water/query">
            <span>上传人：</span>
            <input name="uploadBy" class="input-text"	type="text" value="${uploadBy}">

            <span>用户角色：</span>
            <select name="userRole">
                <c:if test="${roleList != null }">
                    <option value="0">--请选择--</option>
                    <c:forEach var="role" items="${roleList}">
                        <option <c:if test="${role.id == userRole}">selected="selected"</c:if> value="${role.id}">${role.roleName}</option>
                    </c:forEach>
                </c:if>
            </select>

            <input	value="查 询" type="submit">
            <a href="${pageContext.request.contextPath}/jsp/waterRecordListAdd.jsp" >添加角色</a>
        </form>
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="10%">化学需氧量（COD）</th>
                <th width="10%">总氮（TN）</th>
                <th width="10%">氨氮（NH3-N）</th>
                <th width="10%">总磷（TP）</th>
                <th width="10%">测样时间</th>
                <th width="10%">上传时间</th>
                <th width="10%">上传人</th>
                <th width="10%">上传人角色</th>
            </tr>
            <c:forEach var="water" items="${waterRecord}" varStatus="status">
                <tr>
                    <td>
                        <span>${water.COD}</span>
                    </td>
                    <td>
                        <span>${water.TN}</span>
                    </td>
                    <td>
                        <span>${water.NH3N}</span>
                    </td>
                    <td>
                        <span>${water.TP}</span>
                    </td>
                    <td>
                        <span>${water.testTime}</span>
                    </td>
                    <td>
                        <span>${water.uploadTime}</span>
                    </td>
                    <td>
                        <span>${water.uploadBy}</span>
                    </td>
                    <td>
                        <span>${water.roleId}</span>
                    </td>
                    <td>
                        <span><a href="${pageContext.request.contextPath}/water/modify?id=${water.id}"><img src="${pageContext.request.contextPath }/images/xiugai.png" alt="修改" title="修改"/>修改</a></span>
                        <span><a  href="${pageContext.request.contextPath}/water/delete?id=${water.id}"><img src="${pageContext.request.contextPath }/images/schu.png" alt="删除" title="删除"/>删除</a></span>
                        <span><a  href="${pageContext.request.contextPath}/water/view?id=${water.id}"><img src="${pageContext.request.contextPath }/images/read.png" alt="查看" title="查看"/>查看</a></span>
                    </td>
                </tr>
            </c:forEach>
        </table>

    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>