<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/jsp/common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>菜单管理页面</span>
    </div>
    <div class="search">
        <form method="get" action="${pageContext.request.contextPath }/menus/query">
            <span>角色名称：</span>
            <input name="roleName" class="input-text"	type="text" value="${roleName}">

            <span>创建人角色：</span>
            <select name="creationBy">
                <c:if test="${userList!=null}">
                    <option value="">请选择</option>
                    <c:forEach var="user" items="${userList}">
                        <option <c:if test="${user.userName==creationBy}">
                        selected="selected"
                    </c:if>
                        value="${user.userName}">${user.userName}</option>
                    </c:forEach>
                </c:if>
            </select>

            <input	value="查 询" type="submit">
            <a href="${pageContext.request.contextPath}/jsp/roleListAdd.jsp" >添加角色</a>
        </form>
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">角色编码</th>
                    <th width="10%">角色名称</th>
                    <th width="10%">创建时间</th>
                    <th width="10%">创建人</th>
                    <th width="60%">操作</th>
                </tr>
                <c:forEach var="role" items="${roleList }" varStatus="status">
                    <tr>
                        <td>
                            <span>${role.roleCode }</span>
                        </td>
                        <td>
                            <span>${role.roleName}</span>
                        </td>
                        <td>
                            <span>${role.creationDate }</span>
                        </td>
                        <td>
                            <span>${role.creationBy}</span>
                        </td>
                        <td>
                            <span><a href="${pageContext.request.contextPath}/menus/modify?id=${role.id}"><img src="${pageContext.request.contextPath }/images/xiugai.png" alt="修改" title="修改"/>修改菜单</a></span>
                            <span><a href="${pageContext.request.contextPath}/menus/modifyRole?id=${role.id}"><img src="${pageContext.request.contextPath }/images/xiugai.png" alt="修改" title="修改"/>修改角色</a></span>
                            <span><a  href="${pageContext.request.contextPath}/menus/delete?id=${role.id}"><img src="${pageContext.request.contextPath }/images/schu.png" alt="删除" title="删除"/>删除</a></span>
                            <span><a  href="${pageContext.request.contextPath}/menus/view?id=${role.id}"><img src="${pageContext.request.contextPath }/images/read.png" alt="查看" title="查看"/>查看</a></span>
                        </td>
                    </tr>
                </c:forEach>
            </table>

    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>

