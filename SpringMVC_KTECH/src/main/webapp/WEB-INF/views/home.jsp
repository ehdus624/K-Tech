<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width initial-scale=1">
	   <title>k-tech</title>
		<link rel="stylesheet" href="css/bootstrap.css">
		<link rel="stylesheet" href="css/ktech.css">
	
	
  <title>K LEAGUE</title>
	<style type="text/css">
		@import url("http://www.kleague.com/sites/all/themes/stig/css/style-lang-ko.css?otshv0");
		@import url("http://www.kleague.com/sites/all/themes/stig/css/style-responsive.css?otshv0");
		@import url("http://www.kleague.com/sites/all/themes/stig/css/inject_ko.css?otshv0");
		@import url("http://www.kleague.com/sites/default/files/css_injector/css_injector_3.css?otshv0");
	</style>
  
</head>

<body>
	<script src="js/dartboard.js"></script>

	<style type="text/css">
	.jumbotron {
		width:100%;
		position:relative;
		background-image: url('images/1.jpg');
		background-size: cover;
		text-shadow: black 0.2em 0.2em 02.em;
		color: white;
	}}
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
	<div class="container">
		<div class="jumbotron">
			<h2 class ="text-center">　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　
			　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　</h2>
			<p class="text-center">　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　
			　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　</p>
		</div>	
				<div class="row">
		<div class="col-md-4">
			<h4> K-TECH의  특징</h4>
			<p>K-TECH 사이트에선 K리그 관련 기본 정보조회 뿐만아니라 경기 분석과 예측조회가 가능합니다.</p>
			<p><a class="btn btn-default" data-target="#modal" data-toggle="modal">자세히 알아보기</a></p>
		</div>
		<div class="col-md-4">
			<h4>K리그 경기 분석 </h4>
			<p>K-TECH 사이트에선 지난 경기들을 다양한 방식으로 분석하고 유의미한 변수들을 분석합니다.</p>
			<p><a class="btn btn-default" data-target="#modal1" data-toggle="modal">자세히 알아보기</a></p>
		</div>
		<div class="col-md-4">
			<h4>K리그 경기 예측 </h4>
			<p>K-TECH 사이트에선 K리그 경기 결과 승/무/패를 예측 가능하고 사용자가 선택한 변수를 바탕으로 예측 가능합니다.</p>
			<p><a class="btn btn-default"  data-target="#modal2" data-toggle="modal">자세히 알아보기</a></p>
	</div>
	</div>

	<hr><hr>
	<div class="panel panel-primary">
		<div class="panel-heading" style="background-color: #020048">
			<h3 class="panel-title" style="background-color: #020048"><span class="glyphicon glyphicon-pencil"></span>
			&nbsp;&nbsp;▶ 최근 경기 영상</h3>
			</div>
			<div class="panel-body">
				<div class="media">
					<div class="media-left">
				     	<a href="http://www.kleague.com/ko/kleague_movie_type/2821">
					 <img class="media-object" src="images/11.jpg" alt="상주강원이미지"></a>
					</div>
						<div class="media-body">
							<h4 class="media-heading"><a href="http://www.kleague.com/ko/kleague_movie_type/2821">상주 VS 강원 경기 하이라이트</a>&nbsp;<span class="badge">New</span></h4>
					</div>
				</div>
				<hr>
				<div class="media">
				<div class="media-left">
					<a href="http://www.kleague.com/ko/kleague_movie_type/2819"><img class="media-object" src="images/22.jpg" alt="전북울산이미지"></a>
					</div>
						<div class="media-body">
							<h4 class="media-heading"><a href="http://www.kleague.com/ko/kleague_movie_type/2819">전북 VS 울산 경기 하이라이트</a>&nbsp;<span class="badge">New</span></h4>
					</div>
			</div>
			<hr>
			<div class="media">
				<div class="media-left">
					<a href="http://www.kleague.com/ko/kleague_movie_type/2818"><img class="media-object" src="images/33.jpg" alt="서울성남이미지"></a>
					</div>
						<div class="media-body">
							<h4 class="media-heading"><a href="http://www.kleague.com/ko/kleague_movie_type/2818">서울E VS 성남 경기 하이라이트</a>&nbsp;<span class="badge">New</span></h4>
					</div>
		</div>
	  </div>
	  </div>
	  	<hr><hr>
	  	<div class="row">
				<div class="embed-responsive embed-responsive-16by9">
					
					 <iframe class="embed-responsive-item" src="http://www.youtube.com/embed/ZZf8OOOtnUE"></iframe> 
					<br>
				</div>
				</div>
				<br><br>
			
     <!--##########################  클래식 ############################-->


	<div class=" row">

		<div class=" col-md-12 news_field">
			<h6>2017 K리그 클래식 선수 기록</h6>
			<span class="btn_read_more">
				<a href="http://www.kleague.com/ko/content/k리그-선수-기록?meet_seq=1">
											더보기
									</a>
			</span>
		</div>

		<!-- ==============================최다득점============================== -->
		<div class=" col-md-4">
			<div class="stat_card"> 
				<header> 
					<h4 class="stat_title">
													득점
											</h4> 
				</header> 
				<ul class="list"> 

										<li class="pos_number1">		
						<div class="stat_img"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/player/player_20140264.png" alt="조나탄"> 
						</div> 
						<div class="stat_info"> 
							<div class="pos"></div> 
							<a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K02&playercode=20140264" class="stat_name"> 조나탄 </a> 
							<div class="stat_record">
								<strong>  19 </strong>
																	득점
															</div> 
						</div> 
						
						<div class="club_info K02"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/symbol/symbol_m/K02.png" alt="클럽명"> 
							<span class="club_name"> 수원  </span> 
						</div> 
					</li>
					
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K09&playercode=20070100"> 데얀 </a> </div> 
						<div class="stat_list_record"> 16 </div> 
					</li> 
					<li class="static_row"> 
						<div class="pos">3.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K07&playercode=20110064">자일</a> </div> 
						<div class="stat_list_record"> 14 </div> 
					</li> 
				</ul> 
				
				<a class="btn_type-fullwidth bg_lg btn_more" href="http://www.kleague.com/ko/content/k리그-선수-기록?meet_seq=1">
											더보기
									</a>
			</div> <!-- END: /.stat_card -->
		</div> <!-- END: /.col-md-4 -->

		<!-- ==============================최다도움============================== -->
		<div class=" col-md-4">
			<div class="stat_card"> 
				<header> 
					<h4 class="stat_title">
													도움
											</h4> 
				</header> 
				<ul class="list"> 

										<li class="pos_number1">		
						<div class="stat_img"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/player/player_20110157.png" alt="윤일록"> 
						</div> 
						<div class="stat_info"> 
							<div class="pos"></div> 
							<a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K09&playercode=20110157" class="stat_name"> 윤일록 </a> 
							<div class="stat_record">
								<strong>  10 </strong>
																	도움
															</div> 
						</div> 
						
						<div class="club_info K09"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/symbol/symbol_m/K09.png" alt="클럽명"> 
							<span class="club_name"> 서울  </span> 
						</div> 
					</li>
		
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K07&playercode=20100041"> 김영욱 </a> </div> 
						<div class="stat_list_record"> 7 </div> 
					</li> 
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K02&playercode=20060013">염기훈</a> </div> 
						<div class="stat_list_record"> 7 </div> 
					</li>
				</ul> 
				
				<a class="btn_type-fullwidth bg_lg btn_more" href="http://www.kleague.com/ko/content/k리그-선수-기록?meet_seq=1">
											더보기
									</a>
			</div> <!-- END: /.stat_card -->
		</div> <!-- END: /.col-md-4 -->


		<!-- ==============================Clean sheet============================== -->
		<div class=" col-md-4">
			<div class="stat_card"> 
				<header> 
					<h4 class="stat_title">
													무실점 경기
											</h4> 
				</header> 
				<ul class="list"> 

										<li class="pos_number1">		
						<div class="stat_img"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/player/player_20040026.png" alt="신화용"> 
						</div> 
						<div class="stat_info"> 
							<div class="pos"></div> 
							<a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K02&playercode=20040026" class="stat_name"> 신화용 </a> 
							<div class="stat_record">
								<strong>  9 </strong>
																	무실점 경기
															</div> 
						</div> 
						
						<div class="club_info K02"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/symbol/symbol_m/K02.png" alt="클럽명"> 
							<span class="club_name"> 수원  </span> 
						</div> 
					</li>
	
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K05&playercode=20070051"> 홍정남 </a> </div> 
						<div class="stat_list_record"> 8 </div> 
					</li> 
					<li class="static_row"> 
						<div class="pos">3.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K01&playercode=20020076">김용대</a> </div> 
						<div class="stat_list_record"> 6 </div> 
					</li> 
				</ul> 
				
				<a class="btn_type-fullwidth bg_lg btn_more" href="http://www.kleague.com/ko/content/k리그-선수-기록?meet_seq=1">
											더보기
									</a>
			</div> <!-- END: /.stat_card -->
		</div> <!-- END: /.col-md-4 -->
	</div> <!-- END: /.row -->

<!--##########################  챌린지 ############################-->


	<div class=" row">

		<div class=" col-md-12 news_field">
			<h6>2017 K리그 챌린지 선수 기록</h6>
			<span class="btn_read_more">
				<a href="http://www.kleague.com/ko/content/k리그-선수-기록?meet_seq=2">
											더보기
									</a>
			</span>
		</div>

		<!-- ==============================최다득점============================== -->
		<div class=" col-md-4">
			<div class="stat_card"> 
				<header> 
					<h4 class="stat_title">
													득점
											</h4> 
				</header> 
				<ul class="list"> 

										<li class="pos_number1">		
						<div class="stat_img"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/player/player_20170095.png" alt="말컹"> 
						</div> 
						<div class="stat_info"> 
							<div class="pos"></div> 
							<a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K20&playercode=20170095" class="stat_name"> 말컹 </a> 
							<div class="stat_record">
								<strong>  11 </strong>
																	득점
															</div> 
						</div> 
						
						<div class="club_info K20"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/symbol/symbol_m/K20.png" alt="클럽명"> 
							<span class="club_name"> 경남  </span> 
						</div> 
					</li>
					
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K10&playercode=20160261"> 크리스찬 </a> </div> 
						<div class="stat_list_record"> 9 </div> 
					</li> 
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K32&playercode=20170204">라울</a> </div> 
						<div class="stat_list_record"> 9 </div> 
					</li> 
				</ul> 
				
				<a class="btn_type-fullwidth bg_lg btn_more" href="http://www.kleague.com/ko/content/k리그-선수-기록?meet_seq=2">
											더보기
									</a>
			</div> <!-- END: /.stat_card -->
		</div> <!-- END: /.col-md-4 -->

		<!-- ==============================최다도움============================== -->
		<div class=" col-md-4">
			<div class="stat_card"> 
				<header> 
					<h4 class="stat_title">
													도움
											</h4> 
				</header> 
				<ul class="list"> 

										<li class="pos_number1">
						<div class="stat_img"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/player/player_20110167.png" alt="장혁진"> 
						</div> 
						<div class="stat_info"> 
							<div class="pos"></div> 
							<a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K32&playercode=20110167" class="stat_name"> 장혁진 </a> 
							<div class="stat_record">
								<strong>  9 </strong>
																	도움
															</div> 
						</div> 
						
						<div class="club_info K32"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/symbol/symbol_m/K32.png" alt="클럽명"> 
							<span class="club_name"> 안산  </span> 
						</div> 
					</li>
		
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K26&playercode=20080057"> 문기한 </a> </div> 
						<div class="stat_list_record"> 7 </div> 
					</li> 
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K20&playercode=20160125">정원진</a> </div> 
						<div class="stat_list_record"> 7 </div> 
					</li>
				</ul> 
				
				<a class="btn_type-fullwidth bg_lg btn_more" href="http://www.kleague.com/ko/content/k리그-선수-기록?meet_seq=2">
											더보기
									</a>
			</div> <!-- END: /.stat_card -->
		</div> <!-- END: /.col-md-4 -->


		<!-- ==============================무실점============================== -->
		<div class=" col-md-4">
			<div class="stat_card"> 
				<header> 
					<h4 class="stat_title">
													무실점 경기
											</h4> 
				</header> 
				<ul class="list"> 

										<li class="pos_number1">		
						<div class="stat_img"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/player/player_20160156.png" alt="김동준"> 
						</div> 
						<div class="stat_info"> 
							<div class="pos"></div> 
							<a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K08&playercode=20160156" class="stat_name"> 김동준 </a> 
							<div class="stat_record">
								<strong>  9 </strong>
																	무실점 경기
															</div> 
						</div> 
						
						<div class="club_info K08"> 
							<img src="http://www.kleague.com/sites/all/themes/stig/images/symbol/symbol_m/K08.png" alt="클럽명"> 
							<span class="club_name"> 성남  </span> 
						</div> 
					</li>
	
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K20&playercode=20100011"> 이범수 </a> </div> 
						<div class="stat_list_record"> 7 </div> 
					</li> 
					<li class="static_row"> 
						<div class="pos">2.</div> 
						<div class="stat_list_name"> <a href="http://www.kleague.com/ko/content/clubplayerview?teamcode=K29&playercode=20140083">이상욱</a> </div> 
						<div class="stat_list_record"> 7 </div> 
					</li> 
				</ul> 
				
				<a class="btn_type-fullwidth bg_lg btn_more" href="http://www.kleague.com/ko/content/k리그-선수-기록?meet_seq=2">
											더보기
									</a>
			</div> <!-- END: /.stat_card -->
		</div> <!-- END: /.col-md-4 -->
	



	</div> <!-- END: /.row -->


 <!-- END: /.block -->


    	</div>
   <hr>
   <hr>
	<div class="roulPan"></div>     
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
	<div class="row">
		<div class="modal" id="modal" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						K-TECH의 특징
						<button class="close" data-dismiss="modal">&times;</button>
					</div>
					<div class="modal-body" style="text-align: center;">
					 K-TECH의 특징은 K리그의 정보조회 뿐만 아니라 <br>
					 지난 경기 분석, 앞으로 진행될 경기의 결과 승/무/패 예측 조회를 제공합니다.<br><br>
					 <img src="images/an1.jpg" id="imagepreview" style="width: 350x; height: 256px;">
				</div>
			</div>
		</div>
	</div>
			<div class="modal" id="modal1" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						K리그 경기 분석
						<button class="close" data-dismiss="modal">&times;</button>
					</div>
						<div class="modal-body" style="text-align: center;">
						 K-TECH는 K리그 경기를 다양한 방면에서 분석합니다.<br>
						 경기 내적,외적 요인들과 선수와 팀 능력치 등의 변수들을 이용해<br>
						 유의미한 변수와 분석결과를 제공합니다.<br><br>
					   <img src="images/an2.jpg" id="imagepreview" style="width: 350x; height: 256px;">
					 </div>
			 </div>
		 </div>
	</div>
	<div class="modal" id="modal2" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						K리그 경기 예측
						<button class="close" data-dismiss="modal">&times;</button>
					</div>
						<div class="modal-body" style="text-align: center;">
						 K-TECH는 K리그 경기 예측결과를 제공합니다.<br>
						 경기 분석을 통해 추출한 유의미한 변수와 알고리즘을 이용하여<br>
						 K리그 경기 승/무/패 결과를 예측합니다.<br><br>
					   <img src="images/an3.jpg" id="imagepreview" style="width: 350x; height: 256px;">
					 </div>
			 </div>
		 </div>
	</div>

	</div>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"><</script>
	<script src="js/bootstrap.js"></script>
</body>
</html>