<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width", initial-scale="1">
	<title>k-tech</title>
	<link rel="stylesheet" href="../css/bootstrap.css">
	<link rel="stylesheet" href="../css/ktech.css">
	<link rel="stylesheet" href="../css/select.css">
    <script src="//cdn.wordart.com/wordart.min.js" async defer></script>
    
<style>
img {
    opacity: 0.5;
    filter: alpha(opacity=50); 
}
</style>

</head>
<body>
	<style type="text/css">
	.jumbotron {
		width:100%;
		position:relative;
		background-image: url('../images/1.png');
		background-size: cover;
		text-shadow: black 0.2em 0.2em 02.em;
		color: white;
	}
	/*.featured {
	background: url('/images/camp.jpg') no-repeat center 0;
	background-size:cover
	background-color: #394A5F;
	color: #ffffff;
	padding: 240px 0 40px;
	margin-bottom: 24px;
	}
	.featured .hero-unit {
		background-color: transparent;
		padding: 0;
	}*/
</style>
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
					<li class="active"><a href="../../ktech/analysis">분석 소개 <span class="sr-only"></span></a></li>	
					<li><a href="../../ktech/predict">예측 조회</a><li>
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
</head>
<body>
<center>
<table>
<tr>
<td>
<img class="media-object" src="../images/${game.team}.jpg" alt="${game.team}" width="500px" height="500px">
<br>
</td>
<td>
<center><h2><p class="text-primary"><strong>승무패에 영향을 주는 주요 변수들 </strong></p></h2></center>
<br>
<center><div style="width: 500px; height: 500px;" data-wordart-src="//cdn.wordart.com/json/cqakwkroz6ic" data-wordart-show-attribution></div></center>

   <center><h2><p class="text-primary"><strong>예측시 사용할 변수 고르기</strong></p></h2></center>
   <br>
   <form action='<c:url value = "../postpred/${game.gameId}"/>' method="post">
		<table align="center" height="250" cellpadding="50">
         <tr>
 			<td>
 			<div class="checks etrans">
 			 <input type="checkbox" id="preds1" name="preds" value="CUM_POINTS_DIFFERENCE" class="selectVar"> 
  			<label for="preds1"><big>누적 승점 차(CUM_POINTS_DIFFERENCE)</big></label></div>
 			</td>
 			</tr>
 			<tr>
 				<td>
 				<div class="checks etrans">
 				 <input type="checkbox" id="preds2" name="preds" value="WIN_RATE" class="selectVar"> 
            	<label for="preds2"><big>승률(WIN_RATE)</big></label></div>
				</td>
 			</tr>
 			<tr>
 				<td>
 				<div class="checks etrans">
 			 	<input type="checkbox" id="preds3" name="preds" value="CUM_GOAL_DIFFERENCE" class="selectVar"> 
            	<label for="preds3"><big>누적 골 차(CUM_GOAL_DIFFERENCE)</big></label></div>
				</td>
 			</tr>
 			<tr>
 				<td>
 				<div class="checks etrans">
 			 	<input type="checkbox" id="preds4" name="preds" value="ABILITY_DIFFERENCE_3" class="selectVar"> 
            	<label for="preds4"><big>최근 3경기 팀 능력치 차이(ABILITY_DIFFERENCE_3)</big></label></div>
				</td>
 			</tr>
 			<tr>
 				<td>
 				<div class="checks etrans">
 			 	<input type="checkbox" id="preds5" name="preds" value="TARGET_SHOT_3" class="selectVar"> 
            	<label for="preds5"><big>최근 3경기 평균 유효슈팅(TARGET_SHOT_3)</big></label></div>
				</td>
 			</tr>
 			<tr>
 				<td>
 				<div class="checks etrans">
 			 	<input type="checkbox" id="preds6" name="preds" value="PREV_RESULT" class="selectVar"> 
            	<label for="preds6"><big>직전 경기 결과(PREV_RESULT)</big></label></div>
				</td>
 			</tr>
 			<tr>
 				<td>
            		<center><a><button type="submit" id="btn" >예측 시작!</button></a></center>
            	<!-- <input type="reset" value="다시 선택" class="btn" id="btn"> -->
            	</td>
 			</tr>
		</table>
   </form>
   </td>
   <td>
   <img class="media-object" src="../images/${game.againstTeam}.jpg" alt="${game.againstTeam}" width="500px" height="500px">
   </td>
   </tr>
   </table>
   <br><br>
</center>
   <footer style="background-color: #020048; color: #ffffff">
	<div class="container">
	<br>
	<div class="row">
		<div class="col-sm-2" style="text-align: center;"><h5>Copyright &copy; 2017</h5><h5>하성윤,황도연,이옥주,김은혜,조진송</h5></div>
		<div class="col-sm-4"><h4>K-TECH</h4><p> 빅데이터 분석 개발자 양성과정 -KOSA</p></div>
				
		
 <div class="col-sm-2"><h4 style="text-align: center; "><span class="glyphicon glyphicon-ok"></span>&nbsp; by 황하이조김</h4></div>
	</div>
	 </div>
	   </footer>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="../js/bootstrap.js"></script>
</body>
</html>