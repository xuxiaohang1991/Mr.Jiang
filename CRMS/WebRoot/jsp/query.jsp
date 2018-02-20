<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>query</title>
  </head>
  
  <body>
  <table align="center" border="1" bgcolor="green">
  <CAPTION><a href="queryType.action">添加化学试剂信息</a></CAPTION>
  <tr>
  <th>化学试剂类型</th>
  <th>化学试剂说明</th>
  <th>化学试剂名称</th>
  <th>化学试剂产地</th>
  <th>化学试剂描述</th>
  </tr>
  <c:forEach var="tdvo" items="${tdvos}">
 <tr>
 <td>${tdvo.tname}</td>
 <td>${tdvo.tdesc}</td>
 <td>${tdvo.dname}</td>
 <td>${tdvo.addr}</td>
 <td>${tdvo.ddesc}</td>
 <td>
	           <a href="remove.action?id=${tdvo.tid }"
	           onclick="return confirm('您确定删除吗?')">删除</a>
	           <a href="queryById.action?id=${tdvo.tid }">待修改</a>
</td>
 </tr>
 </c:forEach>
  </table>
 
 
  </body>
</html>
