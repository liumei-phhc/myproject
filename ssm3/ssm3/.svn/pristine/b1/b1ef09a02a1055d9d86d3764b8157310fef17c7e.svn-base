<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<LINK href="css/sys.css" type=text/css rel=stylesheet>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath }/cust/addcustomer.do" > 
		<div align="center"> <input type="submit" value="提交" > </div>
		<TABLE class=bgtable cellSpacing=1 cellPadding=2 align=center border=1>
		
		<tr>
		   <td width="10%">名字：</td>
		   <td><input type="text" name="cname"></td>
		</tr>
		<tr>
		   <td>年龄：</td>
		   <td><input type="text" name="cage"></td>
		</tr>
		<tr>
		   <td>电话：</td>
		   <td><input type="text" name="cphone"></td>
		</tr>
		<tr>
		   <td>部门：</td>
		   	<td>
			   		<select name="did">
			   			<c:forEach items="${list }" var="list">
							<option value="${list.did }">${list.dname }</option>
						</c:forEach>
					</select>
		   	</td>
		</tr>
		</table>   
		
	</form>     
</body>
</html>