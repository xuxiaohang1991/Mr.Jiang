<%@ page language="java" 
import="java.util.*" 
pageEncoding="gbk"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
 prefix="c" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>添加学校信息</title> 
  </head> 
  <body> 
     <form action="modify.action" method="post">
        <input name="did" value="${details.did }" type="hidden"/>
     <table align="center" border="1" bgcolor="lightgreen"> 
         <tr> 
           <th>化学试剂名称</th>
           <td><input name="dname" value="${details.dname }"/></td> 
         </tr> 
         <tr>
           <th>化学试剂产地</th>
           <td><input name="addr"value="${details.addr }"/></td> 
         </tr> 
         <tr>
           <th>学校描述</th>
           <td><input name="ddesc"value="${details.ddesc }"/></td> 
         </tr> 
         <tr>
           <th>
                            化学试剂类型编号
           </th>
           <td>
              <select name="tid">
                 <c:forEach var="type" items="${types}"> 
                    <option value="${type.tid }">${type.tname }</option>
                 </c:forEach> 
              </select>
           </td> 
         </tr> <tr>
         <td><input type="submit" value="修改"/> </td>
         </tr> 
     </table>
     </form>
  </body>
</html>
