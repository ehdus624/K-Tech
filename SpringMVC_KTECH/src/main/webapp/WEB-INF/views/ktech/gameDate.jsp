<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width" initial-scale="1">
	   <title>k-tech</title>
		<link rel="stylesheet" href="../css/bootstrap.css">
		<link rel="stylesheet" href="../css/ktech.css">
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"><</script>
		<script src="../js/bootstrap.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navboar-toggle collapsed" data-toggle="collapse"
					data-target="libs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					
				 </button>
				<a class="navbar-brand" href="../../ktech">K-TECH</a> 
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="../analysis">분석 소개 <span class="sr-only"></span></a></li>	
						<li><a href="../predict">예측 조회</a><li>
						<li class="dropdown">
							<a href="#" class ="dropdown-toggle" data-toggle="dropdown" role="button"
						 	aria-haspopup="true" aria-expanded="false">기본 정보<span class="caret"></span></a>
							<ul class="dropdown-menu">
							<li><a href="../date/classic">경기 결과 조회(클래식)</a></li>
							<li><a href="../date/challenge">경기 결과 조회(챌린지)</a></li>
						</ul>
					</li>
					
				  </ul>
				 <form class="navbar-form navbar-left">
				  <div class="form-group">
				 	 	<input type="text" class="form-control" placeholder="내용을 입력하세요.">
				  		</div>
				  	<button type="submit" class ="btn btn-default">검색</button>
				  </form>
			</div>
		</div>
	</nav>
	<br><br><br><br>
	
	<strong><h1 align="center">경기 결과</h1></strong>
	<br><br>
      <table border="1" align=center cellpadding="5" class="table table-bordered" style="width: 700px; height: 230px">
      <c:forEach var="date" items="${dateList}">
         <tr>
            <td colspan="5" align="center" height = "30"><b>${date.gameDate}</b></td>
         </tr>
      <tr>

         <td align="center">${date.team}</td>
         <td align="center">${date.goalsFor}</td>
         <td align="center">${date.goalsAgainst}</td>
         <td align="center">${date.againstTeam}</td>
         <td align="center"><a href="<c:url value='/${date.gameId}'/>"><font color="red">경기 내용 ▶</font></a></td>
       </tr>
   	   </c:forEach>
		</table>
		<br><br><br><br>
		
		
		<footer style="background-color: #020048; color: #ffffff">
	 <div class="container">
		<br>
			<div class="row">
			<div class="col-sm-2" style="text-align: center;"><h5>Copyright &copy; 2017</h5><h5>하성윤,황도연,이옥주<br>김은혜,조진송</h5></div>
			<div class="col-sm-4"><h4>K-TECH</h4><p> 빅데이터 분석 개발자 양성과정 -KOSA</p></div>
				
		
 <div class="col-sm-2"><h4 style="text-align: center; "><span class="glyphicon glyphicon-ok"></span>&nbsp; by 황하이조김</h4></div>
	</div>
	 </div>
	   </footer>
	 
</body>
</html>