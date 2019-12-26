<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<LINK href="css/sys.css" type=text/css rel=stylesheet>
</head>
<body>
	<form action="${pageContext.request.contextPath }/cust/deleteAllUser.do" method="post">
	<div align="center"><a href="${pageContext.request.contextPath }/cust/findept.do" style="position:relative;top:-3px">添加</a><input type="submit" value="删除"></div>
	<TABLE class=bgtable  cellSpacing=1 cellPadding=2 
	align=center border=1 width="600px" >
	       <tr>
	          <td>序号</td>
			  <td>选择</td>
	          <td>名字</td>
	          <td>电话</td>
	          <td>年龄</td>
	          <td>所在部门</td>
	          <td>操作</td>
	       </tr>
      	 </tr>
        
        <c:forEach items="${list}" var="list">
        	<tr>
	          <td>${list.cid }</td>
			  <td><input type="checkbox" value="${list.cid }" name="ids"></td>
	          <td>${list.cname }</td>
	          <td>${list.cphone }</td>
	          <td>${list.cage }</td>
	          <td>${list.dname }</td>
	          <td>
	          <a href="${pageContext.request.contextPath }/cust/deleteCustomer.do?id=${list.cid }">删除</a>
	          <a href="${pageContext.request.contextPath }/cust/findone.do?id=${list.cid }">修改</a>
	          </td>
         </tr>
        </c:forEach>
         
    </table>
	</form>
</body>
</html>