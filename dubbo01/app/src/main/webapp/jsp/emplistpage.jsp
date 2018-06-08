<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>员工</h1>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<input class="btn btn-default btn-success" type="button" data-toggle="modal" data-target="#myModal" id="addemp" value="新增">
				<input class="btn btn-default btn-danger" type="button" value="删除">
			</div>
		</div>
<!-- 显示表单 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-striped">
					<tr>
						<th>#id</th>
						<th>姓名</th>
						<th>性别</th>
						<th>邮箱</th>
						<th>部门</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${pi.list }" var="p">
						<tr>
							<td>#${p.id }</td>
							<td>${p.name }</td>
							<td>${p.gender }</td>
							<td>${p.email }</td>
							<td>${p.dName }</td>
							<td>
								<button class="btn btn-default btn-success btn-sm">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;修改
								</button>
								<button class="btn btn-default btn-danger btn-sm" onclick="delbyid(${p.id})">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>&nbsp;删除
								</button>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<!-- 分页 -->
		<div class="row">
			<div class="col-md-12">
				<nav aria-label="Page navigation">
				<ul class="pagination">
					
					<li><a href="#" onclick="page(1)">首页</a></li>
					
					<li><a href="#" onclick="page(${pi.pageNum-1})" <c:if test="${pi.pageNum==1 }">class="btn disabled"</c:if> aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
					</a></li>
					<c:forEach items="${pi.navigatepageNums }" var="cc">
					<li><a href="#" onclick="page(${cc})" >${cc }</a></li>
					</c:forEach>
					<li><a href="#" aria-label="Next" onclick="page(${pi.pageNum+1})" <c:if test="${pi.pageNum==pi.pages }">class="btn disabled"</c:if>> <span
							aria-hidden="true">&raquo;</span>
					</a></li>
					<li><a href="#" onclick="page(${pi.pages})">末页</a></li>
				</ul>
				</nav>
			</div>
		</div>

		