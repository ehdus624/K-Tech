<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
      padding: 0;
   }*/
   html, body {
   height:100%;
   width:100%;
   margin:0;
   padding:0;
}
#myChart {
   height:100%;
   width:100%;
   min-height:150px;
   
}
</style>
   <title>k-tech</title>
   <!-- CSS -->
   <link rel="stylesheet" href="css/bootstrap.css">
   <link rel="stylesheet" href="css/ktech.css">
   <link rel="stylesheet" href="css/select.css">
   
   <!-- ZingChart -->
   <script src= "https://cdn.zingchart.com/zingchart.min.js"></script>
   <script> zingchart.MODULESDIR ="https://cdn.zingchart.com/modules/"; ZC.LICENSE = ["569d52cefae586f634c54f86dc99e6a9","ee6b7db5b51705a13dc2339db3edaf6d"];</script>
   
   <!-- jQuery -->
   <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
   <script src="js/bootstrap.js"></script>
   
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
   <br><br><br><br>
   
   
   <strong><h1 align="center">경기 예측 결과 조회</h1></strong>
     <c:set var="index" value='0'/>
     <c:forEach var="dateList" items="${dateList2}">    
      <c:set var="index" value="${index + 1}" />
     
   <br><br>
      
      <table border="1" align="center" cellpadding="5" class="table table-bordered" style="width: 950px; height: 230px">         
         <tr>
            <td colspan="5" align="center" height = "30"><b>${dateList.gameDate}</b></td>
         </tr>
         <tr>
            <td align="center" width="35%">${dateList.team}</td>
            <td align="center" width="15%">${dateList.goalsFor}</td>
            <td align="center" width="15%">${dateList.goalsAgainst}</td>
            <td align="center" width="35%">${dateList.againstTeam}</td>
         </tr>
      <tr>
      <td colspan="4" height: "150px" ><div id="myChart_${index}"></div></td>
      </tr>
        </table>
      
        
             
        
       
          

 <script type="text/javascript">
       var myConfig_${index} = {
        type: "hbar",
        plot:{
          stacked:true
        },
        series: [
          {
            values:[${dateList.winProb}],
            stack:1
          },
          {
            values:[${dateList.drawProb}],
            stack:1
          },
          {
            values:[1- ${dateList.winProb} - ${dateList.drawProb}],
            stack:1
          }
        ]
      };
   
      zingchart.render({ 
         id : 'myChart_${index}', 
         data : myConfig_${index}, 
         height: "150px", 
         width: "900px"
      });
   </script>

</c:forEach>
  

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