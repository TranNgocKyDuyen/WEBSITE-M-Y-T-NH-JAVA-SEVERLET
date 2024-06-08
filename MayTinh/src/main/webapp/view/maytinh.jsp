 <%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Thông tin về máy tinh</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%@ page import = "Model.MayTinh" %>
	<%@ page import = "DAO.MayTinhs" %>
    <%  
	    String id=request.getParameter("currBookID"); 
    	System.out.print(id);
		MayTinh maytinh = MayTinhs.getMayTinh(id);
    %>
	<form action="Maytinh" method="post">
		<div class="container" style="width: 50%; justify-content: center;">
			<div >
				<label class="form-label">Mã máy</label> 
				<input type="text" class="form-control" placeholder="Nhập mã máy tính" name ="id" value="<%= maytinh.getId()%>"/>
			</div>
			<div >
				<label class="form-label">Hình ảnh</label> 
				<input type="text" class="form-control" placeholder="Nguồn của ảnh" name ="image" value="<%= maytinh.getIma()%>"/>
			</div>
			<div >
				<label class="form-label">Tên máy</label> 
				<input type="text" class="form-control" placeholder="Nhập tên máy tính" name ="name" value="<%= maytinh.getName()%>"/>
			</div>
			<div >
				<label class="form-label">Giá bán</label> 
				<input type="text" class="form-control" placeholder="Nhập giá bán" name ="price"  value="<%= maytinh.getPrice()%>"/>
			</div>
			<div >
				<label class="form-label">Mô tả</label> 
				<input type="text" class="form-control" placeholder="Nhập mô tả" name ="mota"  value="<%= maytinh.getMota()%>"/>
			</div>
			<div style="float: right;">
				<button type="submit" class="btn btn-primary" name="button" value="save">Lưu</button>
				<button type="submit" class="btn btn-primary" name="button" value="closebook">Đóng</button>
			</div>
		</div>
	</form>



</body>
</html>