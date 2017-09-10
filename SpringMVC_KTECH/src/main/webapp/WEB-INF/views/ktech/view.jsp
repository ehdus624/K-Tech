<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	<br><br><br><br>
	

<h1 align="center"><b>경기 결과 상세 조회</b></h1>
<br><br>

<table border="1" align=center cellpadding="5" class="table table-bordered" style="width: 1200px; height: 230px">
<tr align=center>
<td rowspan="11"><img class="media-object" src="images/${gamedate.team}.jpg" alt="${gamedate.team}"></td>
<td width="200"><b>일자</b></td>
<td width="500" colspan="2" >${gamedate.gameDate}</td>
<td rowspan="11"><img class="media-object" src="images/${gamedate.againstTeam}.jpg" alt="${gamedate.againstTeam}"></td>
</tr>
<tr align=center>
<td width="100"><b>팀</b></td>
<td width="200">${gamedate.team}</td>
<td width="200">${gamedate.againstTeam}</td>
</tr>
<tr align=center>
<td><b>스코어</b></td>
<td>${gamedate.goalsFor}</td>
<td>${gamedate.goalsAgainst}</td>
</tr>
<tr align=center>
<td><b>승</b></td>
<td>${gamedate.win}</td>
<td>${gamedate.againstWin}</td>
</tr>
<tr align=center>
<td><b>무</b></td>
<td>${gamedate.draw}</td>
<td>${gamedate.againstDraw}</td>
</tr>
<tr align=center>
<td><b>패</b></td>
<td>${gamedate.lose}</td>
<td>${gamedate.againstLose}</td>
</tr>
<tr align=center>
<td><b>팀능력치</b></td>
<td>${gamedate.teamAbility}</td>
<td>${gamedate.againstTeamAbility}</td>
</tr>
<tr align=center>
<td><b>포지션</b></td>
<td colspan="2">선발선수 명단</td>
</tr>
<tr align=center>
<td><b>GK</b></td>
<td>${gamedate.player1}</td>
<td>${gamedate.againstPlayer1}</td>
</tr>
<tr align=center>
<td><b>DF</b></td>
<td>${gamedate.player2}</td>
<td>${gamedate.againstPlayer2}</td>
</tr>
<tr align=center>
<td><b>DF</b></td>
<td>${gamedate.player3}</td>
<td>${gamedate.againstPlayer3}</td>
</tr>
<tr align=center>
<td rowspan="8"><p style="font-size:180px">${gamedate.goalsFor}</p></td>
<td><b>DF</b></td>
<td>${gamedate.player4}</td>
<td>${gamedate.againstPlayer4}</td>
<td rowspan="8"><p style="font-size:180px">${gamedate.goalsAgainst}</p></td>
</tr>
<tr align=center>
<td><b>DF</b></td>
<td>${gamedate.player5}</td>
<td>${gamedate.againstPlayer5}</td>
</tr>
<tr align=center>
<td><b>MF</b></td>
<td>${gamedate.player6}</td>
<td>${gamedate.againstPlayer6}</td>
</tr>
<tr align=center>
<td><b>MF</b></td>
<td>${gamedate.player7}</td>
<td>${gamedate.againstPlayer7}</td>
</tr>
<tr align=center>
<td><b>MF</b></td>
<td>${gamedate.player8}</td>
<td>${gamedate.againstPlayer8}</td>
</tr>
<tr align=center>
<td><b>MF</b></td>
<td>${gamedate.player9}</td>
<td>${gamedate.againstPlayer9}</td>
</tr>
<tr align=center>
<td><b>FW</b></td>
<td>${gamedate.player10}</td>
<td>${gamedate.againstPlayer10}</td>
</tr>
<tr align=center>
<td><b>FW</b></td>
<td>${gamedate.player11}</td>
<td>${gamedate.againstPlayer11}</td>
</tr>
</table>
<br><br><br><br><br><br><br><br><br><br><br><br><br>

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