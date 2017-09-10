<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <meta name="viewport" content="width-device-width",initial-scale="1">
   <title>k-tech</title>
   <link rel="stylesheet" href="css/bootstrap.css">
   <link rel="stylesheet" href="css/ktech.css">
   <link rel="stylesheet" href="css/select.css">
      
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
   <br><br>
   <center><h1 style= color:#020048><b>예측 조회</b></h1></center>
   <div class="media">
            <div class="media-body">
               <center><img class="media-object" src="images/email.jpg" style="width: 1056px; height: 586px" alt="예측"></a></center>
               </div></div><br>
<center>
　　　　　
<!-- Indicates caution should be taken with this action -->
 <a href = "schedulelist"><button type="button" class="btn btn-warning" id="btn">승무패 예측하기</button></a>

　　
<!-- Indicates a dangerous or potentially negative action -->
<a href = "accuracy"><button type="button" class="btn btn-danger" id="btn" color="blue">역대 예측결과 조회</button></a>

<!-- Deemphasize a button by making it look like a link while maintaining button behavior -->
<button type="button" class="btn btn-link" ></button></center>
<br><br><br><br><br><br><br><br>

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