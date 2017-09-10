<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width",initial-scale="1">
	<title>K-TECH</title>
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/ktech.css">

<!--  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  <script type="text/javascript">
    google.charts.load("current", {packages:['corechart']});
    google.charts.setOnLoadCallback(drawChart);
    function drawChart() {
      var data = google.visualization.arrayToDataTable([
        ["Element", "Density", { role: "style" } ],
        ["CUM_GOAL_DIFFERENCE", 8.94, "#020048"],
        ["RESULT_WIN", 10.49, "lightblue"],
        ["PREV_RANK", 19.30, "blue"],
        ["WIN_RATE", 21.45, "color: #e5e4e2"]
      ]);

      var view = new google.visualization.DataView(data);
      view.setColumns([0, 1,
                       { calc: "stringify",
                         sourceColumn: 1,
                         type: "string",
                         role: "annotation" },
                       2]);

      var options = {
        title: "변수 중요도",
        width: 800,
        height: 700,
        bar: {groupWidth: "95%"},
        legend: { position: "none" },
      };
      var chart = new google.visualization.ColumnChart(document.getElementById("columnchart_values"));
      chart.draw(view, options);
  }

    </script>-->
    
<style>
#chartdiv {
	width	: 70%;
	height	: 500px;
}								
</style>

<!-- Resources -->
<script src="https://www.amcharts.com/lib/3/amcharts.js"></script>
<script src="https://www.amcharts.com/lib/3/serial.js"></script>
<script src="https://www.amcharts.com/lib/3/plugins/export/export.min.js"></script>
<link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
<script src="https://www.amcharts.com/lib/3/themes/light.js"></script>

<!-- Chart code -->
<script>
var chart = AmCharts.makeChart("chartdiv",
{
    "type": "serial",
    "theme": "light",
    "dataProvider": [{
        "name": "양동현",
        "points": 35654,
        "color": "red",
        "bullet": "https://www.amcharts.com/lib/images/faces/A04.png"
    }, {
        "name": "조나탄",
        "points": 65456,
        "color": "orange",
        "bullet": "https://www.amcharts.com/lib/images/faces/C02.png"
    }, {
        "name": "데얀",
        "points": 45724,
        "color": "green",
        "bullet": "https://www.amcharts.com/lib/images/faces/E01.png"
    }, {
    	 "name": "장혁진",
         "points": 35724,
         "color": "#21a7ef",
         "bullet": "https://www.amcharts.com/lib/images/faces/D02.png"
     }, {
    
    	"name": "윤일록",
        "points": 55754,
        "color": "blue",
        "bullet": "https://www.amcharts.com/lib/images/faces/C02.png"
    }, {
        "name": "김신욱",
        "points": 13654,
        "color": "purple",
        "bullet": "https://www.amcharts.com/lib/images/faces/D02.png"
    }],
    "valueAxes": [{
        "maximum": 80000,
        "minimum": 0,
        "axisAlpha": 0,
        "dashLength": 4,
        "position": "left"
    }],
    "startDuration": 1,
    "graphs": [{
        "balloonText": "<span style='font-size:13px;'>[[category]]: <b>[[value]]</b></span>",
        "bulletOffset": 10,
        "bulletSize": 52,
        "colorField": "color",
        "cornerRadiusTop": 8,
        "customBulletField": "bullet",
        "fillAlphas": 0.8,
        "lineAlpha": 0,
        "type": "column",
        "valueField": "points"
    }],
    "marginTop": 0,
    "marginRight": 0,
    "marginLeft": 0,
    "marginBottom": 0,
    "autoMargins": false,
    "categoryField": "name",
    "categoryAxis": {
        "axisAlpha": 0,
        "gridAlpha": 0,
        "inside": true,
        "tickLength": 0
    },
    "export": {
    	"enabled": true
     }
});
</script>
</head>
<body>

	<style type="text/css">
	.jumbotron {
		width:100%;
		position:relative;
		background-image: url('images/1.jpg');
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
		padding: 0;*/
	}
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
				<a class="navbar-brand" href="../ktech">K-TECH</a> 
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="../ktech/analysis">분석 소개 <span class="sr-only"></span></a></li>	
					<li><a href="../ktech/predict">예측 조회</a><li>
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
	<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						<span class="glyphicon glyphicon-tags"></span>
						&nbsp;&nbsp;Activity Diagram			
						</h3>
					</div>
					<div class="panel-body">　　　　　　　　　　　　　<h3>　　　　　　　　　　　　　　　　Activity Diagram </h3><br>
						<div class="media">
							 <div class="media-left"> 
								<a href="#">
									<img class="media-object" src="images/ac1.jpg" alt="분석 이미지">
									</a>
									</div>
								<div class="media-body">
									<h4 class="media-heading"> </h4></div>
						</div>
					</div>
						<div class="panel-body">
						<div class="media">
					 	<div class="media-right"> 
								<a href="#">
									<img class="media-object" src="images/ac3.jpg" alt="분석 이미지">
									</a>
									</div>
								<div class="media-body">
									<h4 class="media-heading"></h4></div>
									ʕ•ᴥ•ʔ♥ 
						</div>
					</div>
				</div>
			</div>
		</div>
			<br><br><br><br><br><br><br><br><br><br>
					<div class="container">
						<div class="row">
						<center><div class="col-xs-6"></center>
								<div class="panel panel-primary">
									<div class="panel-heading">
										<h3 class="panel-title">
									<span class="glyphicon glyphicon-tags"></span>
											&nbsp;&nbsp;분석방법	
										</h3>
					  </div>
				<table class="table">
					<thread>
						<tr>
							<th>프로그래밍언어</th>
							<th>사용도구</th>
							<th>Web 기술</th>
							<th>R을 이용한 데이터분석</th>
							</tr>
							</thread>
					<tbody>
							<tr>
								<td>Java, R, SQL<br>JavaScript, HTML</td>
								<td>Eclipse, SQL Developer<br> R-studio, Spring Tool Suit</td>
								<td>HTML5, CSS3<br>JSP, Spring Web MVC</td>
								<td>데이터 전처리, 연관분석<br> 주성분 분석, Boruta, xgboost</td>
							</tbody>
						</table>

					</div>
				</div>
			</div>
		</div>
	<br>
<br>
			<br><br><br><br><br><br><br>
		</div>
<!-- <center><div style="width: 800px; height: 800px;" data-wordart-src="//cdn.wordart.com/json/cqakwkroz6ic" data-wordart-show-attribution></div></center>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>-->
<center><div id="chartdiv"></div></center>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<br><br><br><br><br><br><br>
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
		<script src="js/bootstrap.js"></script>
</body>
</html>