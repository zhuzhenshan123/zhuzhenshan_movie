<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resource/css/index3.css" >
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js" ></script>
<script type="text/javascript" >

	function fenye(pageNum){
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	//排序
	function morder(orderName){
		var orderMethod="${movieVO.orderMethod}";
		orderMethod=orderMethod=='desc'?'asc':'desc';
		location.href="/selects?orderName="+orderName+"&orderMethod="+orderMethod;
	}
	//全选 反选
	function choose(own){
		$("[name=che]").each(function(){
			$(this).attr("checked",own.checked);
		})
	}
	//批量删除
	function deleteAll(){
		//var ids="";
		/* $("[name=che]:checked").each(function(){
			ids=","+$(this).val();
		}) */
		var ids=$("[name=che]:checked").map(function(){
			return this.value;
		}).get().join();
		
		//ids=ids.substring(1);
		//alert(ids);
		$.post("deleteAll",{ids:ids},function(falg){
			if(falg){
				alert("批量删除成功");
				location.href="/selects";
			}else{
				alert("批量删除失败");
			}
			
		},"json")
		
	}
	
</script>
</head>
<body>
<form action="/selects" method="post" >
	<input type="hidden" name="pageNum" >
	电影名称:<input type="text" name="name" value="${movieVO.name }" >&nbsp;上映时间:<input type="text" name="t1" value="${movieVO.t1 }" >--<input type="text" name="t2" value="${movieVO.t2 }" ><br>
	导演： <input type="text" name="actor" value="${movieVO.actor }"> &nbsp;价格<input type="text" name="p1" value="${movieVO.p1 }">--<input type="text" name="p2" value="${movieVO.p2 }"><br>
	年代： <input type="text" name="years" value="${movieVO.years }">&nbsp;电影时长<input type="text" name="l1" value="${movieVO.l1 }">--<input type="text" name="l2" value="${movieVO.l2 }"><br>
	<button type="submit" class="btn btn-info" >查询</button>
	
</form>	
<table>
	<tr>
		<td><input type="checkbox" onclick="choose(this)" ></td>
		<td>编号</td>
		<td>电影名称</td>
		<td>导演</td>
		<td><a href="javascript:morder('price')" >票价</a></td>
		<td>上映时间</td>
		<td><a href="javascript:morder('longtime')" >电影时长</a></td>
		<td>类型</td>
		<td><a href="javascript:morder('years')" >年代</a></td>
		<td>区域</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${page.list }" var="m" varStatus="count" >
		<tr>
			<td><input type="checkbox" name="che" value="${m.id }" ></td>
			<td>${count.count+page.startRow-1 }</td>
			<td>${m.name }</td>
			<td>${m.actor }</td>
			<td>${m.price }</td>
			<td>${m.uptime }</td>
			<td>${m.longtime }</td>
			<td>${m.type }</td>
			<td>${m.years }</td>
			<td>${m.area }</td>
			<td>${m.status }</td>
			<td>详情</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="11" >
			<button onclick="fenye(1)" >首页</button>
			<button onclick="fenye(${page.prePage==0?1:page.prePage})" >上一页</button>
			<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})" >下一页</button>
			<button onclick="fenye(${page.pages})" >尾页</button>
			&nbsp;&nbsp;&nbsp;&nbsp;
			当前${page.pageNum }/${page.pages }页,共${page.total }条
		</td>
		<td><button onclick="deleteAll()" >批量删除</button></td>
	</tr>
</table>	

</body>
</html>