<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>query</title>
  </head>
  
  <body>
  <table align="center" border="1" bgcolor="green">
  <CAPTION><a href="queryType.action">��ӻ�ѧ�Լ���Ϣ</a></CAPTION>
  <tr>
  <th>��ѧ�Լ�����</th>
  <th>��ѧ�Լ�˵��</th>
  <th>��ѧ�Լ�����</th>
  <th>��ѧ�Լ�����</th>
  <th>��ѧ�Լ�����</th>
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
	           onclick="return confirm('��ȷ��ɾ����?')">ɾ��</a>
	           <a href="queryById.action?id=${tdvo.tid }">���޸�</a>
</td>
 </tr>
 </c:forEach>
  </table>
 
 
  </body>
</html>
