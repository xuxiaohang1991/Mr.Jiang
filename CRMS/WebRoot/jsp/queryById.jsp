<%@ page language="java" 
import="java.util.*" 
pageEncoding="gbk"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
 prefix="c" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>���ѧУ��Ϣ</title> 
  </head> 
  <body> 
     <form action="modify.action" method="post">
        <input name="did" value="${details.did }" type="hidden"/>
     <table align="center" border="1" bgcolor="lightgreen"> 
         <tr> 
           <th>��ѧ�Լ�����</th>
           <td><input name="dname" value="${details.dname }"/></td> 
         </tr> 
         <tr>
           <th>��ѧ�Լ�����</th>
           <td><input name="addr"value="${details.addr }"/></td> 
         </tr> 
         <tr>
           <th>ѧУ����</th>
           <td><input name="ddesc"value="${details.ddesc }"/></td> 
         </tr> 
         <tr>
           <th>
                            ��ѧ�Լ����ͱ��
           </th>
           <td>
              <select name="tid">
                 <c:forEach var="type" items="${types}"> 
                    <option value="${type.tid }">${type.tname }</option>
                 </c:forEach> 
              </select>
           </td> 
         </tr> <tr>
         <td><input type="submit" value="�޸�"/> </td>
         </tr> 
     </table>
     </form>
  </body>
</html>
