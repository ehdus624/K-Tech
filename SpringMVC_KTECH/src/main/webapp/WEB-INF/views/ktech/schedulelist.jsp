<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width" initial-scale="1">
	   <title>k-tech</title>
<link rel="stylesheet" href="css/bootstrap.css">
		<link rel="stylesheet" href="css/ktech.css">
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"><</script>
		<script src="js/bootstrap.js"></script>
</head>
<body >
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
				<a class="navbar-brand" href="../ktech">K-TECH</a> 
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="analysis">분석 소개 <span class="sr-only"></span></a></li>	
						<li><a href="predict">예측 조회</a><li>
						<li class="dropdown">
							<a href="#" class ="dropdown-toggle" data-toggle="dropdown" role="button"
						 	aria-haspopup="true" aria-expanded="false">기본 정보<span class="caret"></span></a>
							<ul class="dropdown-menu">
							<li><a href="date/classic">경기 결과 조회(클래식)</a></li>
							<li><a href="date/challenge">경기 결과 조회(챌린지)</a></li>
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
	<br>
	
<center><p style="font-size:50px" class="text-primary"><strong>경기 일정 리스트</strong></p></center>
<center><p style="font-size:40px"> 클래식 </p></center>
  
     <table border="1" align=center cellpadding="5" class="table table-bordered" style="width: 500px; height: 230px">
       <c:forEach var="schedule1" items="${schedule1}">
     
      <tr>
       <td colspan="2" align=center><b>${schedule1.gameDate}</b></td>
       <td rowspan="2" align=center style="width: 150px">
       		<br><a href="getpred/${schedule1.gameId}"><font color="red">예측 Go! ▶</font></a></td>
       </tr>
       <tr>
         <td align=center style="width: 250px"> ${schedule1.team}</td>
         <td align=center style="width: 250px">${schedule1.againstTeam}</td>
         
      </tr>
   </c:forEach>
</table>

<center><p style="font-size:40px"> 챌린지 </p></center>

 <table border="1" align=center cellpadding="5" class="table table-bordered" style="width: 500px; height: 230px">
 <c:forEach var="schedule2" items="${schedule2}">
         <tr>
          <td colspan="2" align=center><b>${schedule2.gameDate}</b></td>
          <td rowspan="2" align=center style="width: 150px">
          		<br><a href="getpred/${schedule2.gameId}"><font color="red">예측 Go! ▶</font></a></td>
         </tr>
       <tr>
         <td align=center style="width: 250px"> ${schedule2.team}</td>
         <td align=center style="width: 250px">${schedule2.againstTeam}</td>
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