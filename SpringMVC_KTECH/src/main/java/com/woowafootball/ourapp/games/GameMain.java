package com.woowafootball.ourapp.games;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woowafootball.ourapp.games.model.GamesVO;
import com.woowafootball.ourapp.games.service.IGameService;

public class GameMain {
	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("spring/application-config.xml");
		IGameService gameService = context.getBean("gameService", IGameService.class);

		GamesVO gameHome = new GamesVO();
		GamesVO gameAway = new GamesVO();

		Document doc = null;

		for(int l = 2017; l <= 2017; l++) { // l = 년도
//			for(int k = 1; k <= 1; k++) { // 1: 클래식, 2: 챌린지
//				jump: for(int j = 157; j <= 162; j++) { // j = 경기번호(클래식)
			for(int k = 2; k <= 2; k++) { // 1: 클래식, 2: 챌린지
				jump: for(int j = 121; j <= 125; j++) { // j = 경기번호(챌린지)
					try {
						org.jsoup.Connection con = Jsoup.connect("http://info.kleague.com/new/app_new/DR_DlgGameSheet/SearchReportByHalf.asp?iptMeetYear=" + 
								l + "&iptMeetSeq=" + k + "&iptGameid=" + j + "&iptMeetName=%ED%98%84%EB%8C%80%EC%98%A4%EC%9D%BC%EB%B1%85%ED%81%AC%20K%EB%A6%AC%EA%B7%B8%202017").userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21 (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21").timeout(180000).ignoreHttpErrors(true).followRedirects(true);
						con.timeout(180000).ignoreHttpErrors(true).followRedirects(true);
						Response resp = con.execute();

						if (resp.statusCode() != 500){
							doc = con.get();
						} else {
							continue jump;
						}

					} catch (IOException e) {
						e.printStackTrace();

					}

					gameHome.setGameId(0 + "" + l + "" + k + "" + j);
					gameAway.setGameId(1 + "" + l + "" + k + "" + j);
					
					gameHome.setSeason(l);
					gameAway.setSeason(l);
					
					if(k == 1) {
						gameHome.setLeague("클래식");
						gameAway.setLeague("클래식");
					} else if(k == 2) {
						gameHome.setLeague("챌린지");
						gameAway.setLeague("챌린지");
					}

					Elements tables = doc.select(".liner2");
					Elements row = tables.get(0).select("tr"); // 1번째 테이블의 행들
					Elements tds = row.select("td"); // 1번째 테이블 행들의 값

					if (tds.size() > 6) {
						switch(tds.get(3).text()) {
						case "아산":
							gameHome.setTeam("아산무궁화프로축구단");
							break;
						case "포항":
							gameHome.setTeam("포항스틸러스");
							break;
						case "서울":
							gameHome.setTeam("FC서울");
							break;
						case "부산":
							gameHome.setTeam("부산아이파크");
							break;
						case "울산":
							gameHome.setTeam("울산현대축구단");
							break;
						case "인천":
							gameHome.setTeam("인천유나이티드");
							break;
						case "상주":
							gameHome.setTeam("상주상무프로축구단");
							break;
						case "제주":
							gameHome.setTeam("제주유나이티드");
							break;
						case "안산":
							if(l == 2017) {
								gameHome.setTeam("안산그리너스");
							} else {
								gameHome.setTeam("안산무궁화프로축구단");
							}
							break;
						case "대전":
							gameHome.setTeam("대전시티즌");
							break;
						case "부천":
							gameHome.setTeam("부천FC1995");
							break;
						case "대구":
							gameHome.setTeam("대구FC");
							break;
						case "강원":
							gameHome.setTeam("강원FC");
							break;
						case "전북":
							gameHome.setTeam("전북현대모터스");
							break;
						case "광주 FC":
							gameHome.setTeam("광주FC");
							break;
						case "전남":
							gameHome.setTeam("전남드래곤즈");
							break;
						case "수원":
							gameHome.setTeam("수원삼성블루윙즈");
							break;
						case "안양":
							gameHome.setTeam("FC안양");
							break;
						case "서울 이랜드":
							gameHome.setTeam("서울이랜드");
							break;
						case "경남":
							gameHome.setTeam("경남FC");
							break;
						case "수원FC":
							gameHome.setTeam("수원FC");
							break;
						case "성남":
							gameHome.setTeam("성남FC");
							break;
						case "충주":
							gameHome.setTeam("충주험멜축구단");
							break;
						case "고양":
							gameHome.setTeam("고양자이크로FC");
							break;
						default:
							continue jump;
						}

						switch(tds.get(7).text()) {
						case "아산":
							gameHome.setAgainstTeam("아산무궁화프로축구단");
							break;
						case "포항":
							gameHome.setAgainstTeam("포항스틸러스");
							break;
						case "서울":
							gameHome.setAgainstTeam("FC서울");
							break;
						case "부산":
							gameHome.setAgainstTeam("부산아이파크");
							break;
						case "울산":
							gameHome.setAgainstTeam("울산현대축구단");
							break;
						case "인천":
							gameHome.setAgainstTeam("인천유나이티드");
							break;
						case "상주":
							gameHome.setAgainstTeam("상주상무프로축구단");
							break;
						case "제주":
							gameHome.setAgainstTeam("제주유나이티드");
							break;
						case "안산":
							if(l == 2017) {
								gameHome.setAgainstTeam("안산그리너스");
							} else {
								gameHome.setAgainstTeam("안산무궁화프로축구단");
							}
							break;
						case "대전":
							gameHome.setAgainstTeam("대전시티즌");
							break;
						case "부천":
							gameHome.setAgainstTeam("부천FC1995");
							break;
						case "대구":
							gameHome.setAgainstTeam("대구FC");
							break;
						case "강원":
							gameHome.setAgainstTeam("강원FC");
							break;
						case "전북":
							gameHome.setAgainstTeam("전북현대모터스");
							break;
						case "광주 FC":
							gameHome.setAgainstTeam("광주FC");
							break;
						case "전남":
							gameHome.setAgainstTeam("전남드래곤즈");
							break;
						case "수원":
							gameHome.setAgainstTeam("수원삼성블루윙즈");
							break;
						case "안양":
							gameHome.setAgainstTeam("FC안양");
							break;
						case "서울 이랜드":
							gameHome.setAgainstTeam("서울이랜드");
							break;
						case "경남":
							gameHome.setAgainstTeam("경남FC");
							break;
						case "수원FC":
							gameHome.setAgainstTeam("수원FC");
							break;
						case "성남":
							gameHome.setAgainstTeam("성남FC");
							break;
						case "충주":
							gameHome.setAgainstTeam("충주험멜축구단");
							break;
						case "고양":
							gameHome.setAgainstTeam("고양자이크로FC");
							break;
						default:
							continue jump;
						}
						gameHome.setGameDate(row.get(2).select("td").get(1).text().substring(1, 11)); // 1번째 테이블 3행 2열
						gameHome.setGameTime(row.get(2).select("td").get(1).text().substring(13, 18)); // 1번째 테이블 3행 2열
						gameHome.setGoalsFor(Integer.parseInt(row.get(0).select("td").get(4).text()) + Integer.parseInt(row.get(1).select("td").get(4).text()));
						gameHome.setGoalsAgainst(Integer.parseInt(row.get(0).select("td").get(6).text()) + Integer.parseInt(row.get(1).select("td").get(6).text()));
						gameHome.setGoalDifference(gameHome.getGoalsFor() - gameHome.getGoalsAgainst());
						gameHome.setIsHome(0);
						if(gameHome.getGoalDifference() > 0) {
							gameHome.setGameResult(0);
							gameHome.setAgainstGameResult(2);
							gameHome.setPoints(3);
						} else if(gameHome.getGoalDifference() == 0) {
							gameHome.setGameResult(1);
							gameHome.setAgainstGameResult(1);
							gameHome.setPoints(1);
						} else if(gameHome.getGoalDifference() < 0) {
							gameHome.setGameResult(2);
							gameHome.setAgainstGameResult(0);
							gameHome.setPoints(0);
						}

						switch(tds.get(7).text()) {
						case "아산":
							gameAway.setTeam("아산무궁화프로축구단");
							break;
						case "포항":
							gameAway.setTeam("포항스틸러스");
							break;
						case "서울":
							gameAway.setTeam("FC서울");
							break;
						case "부산":
							gameAway.setTeam("부산아이파크");
							break;
						case "울산":
							gameAway.setTeam("울산현대축구단");
							break;
						case "인천":
							gameAway.setTeam("인천유나이티드");
							break;
						case "상주":
							gameAway.setTeam("상주상무프로축구단");
							break;
						case "제주":
							gameAway.setTeam("제주유나이티드");
							break;
						case "안산":
							if(l == 2017) {
								gameAway.setTeam("안산그리너스");
							} else {
								gameAway.setTeam("안산무궁화프로축구단");
							}
							break;
						case "대전":
							gameAway.setTeam("대전시티즌");
							break;
						case "부천":
							gameAway.setTeam("부천FC1995");
							break;
						case "대구":
							gameAway.setTeam("대구FC");
							break;
						case "강원":
							gameAway.setTeam("강원FC");
							break;
						case "전북":
							gameAway.setTeam("전북현대모터스");
							break;
						case "광주 FC":
							gameAway.setTeam("광주FC");
							break;
						case "전남":
							gameAway.setTeam("전남드래곤즈");
							break;
						case "수원":
							gameAway.setTeam("수원삼성블루윙즈");
							break;
						case "안양":
							gameAway.setTeam("FC안양");
							break;
						case "서울 이랜드":
							gameAway.setTeam("서울이랜드");
							break;
						case "경남":
							gameAway.setTeam("경남FC");
							break;
						case "수원FC":
							gameAway.setTeam("수원FC");
							break;
						case "성남":
							gameAway.setTeam("성남FC");
							break;
						case "충주":
							gameAway.setTeam("충주험멜축구단");
							break;
						case "고양":
							gameAway.setTeam("고양자이크로FC");
							break;
						default:
							continue jump;
						}
						gameAway.setAgainstTeam(tds.get(3).text());

						switch(tds.get(3).text()) {
						case "아산":
							gameAway.setAgainstTeam("아산무궁화프로축구단");
							break;
						case "포항":
							gameAway.setAgainstTeam("포항스틸러스");
							break;
						case "서울":
							gameAway.setAgainstTeam("FC서울");
							break;
						case "부산":
							gameAway.setAgainstTeam("부산아이파크");
							break;
						case "울산":
							gameAway.setAgainstTeam("울산현대축구단");
							break;
						case "인천":
							gameAway.setAgainstTeam("인천유나이티드");
							break;
						case "상주":
							gameAway.setAgainstTeam("상주상무프로축구단");
							break;
						case "제주":
							gameAway.setAgainstTeam("제주유나이티드");
							break;
						case "안산":
							if(l == 2017) {
								gameAway.setAgainstTeam("안산그리너스");
							} else {
								gameAway.setAgainstTeam("안산무궁화프로축구단");
							}
							break;
						case "대전":
							gameAway.setAgainstTeam("대전시티즌");
							break;
						case "부천":
							gameAway.setAgainstTeam("부천FC1995");
							break;
						case "대구":
							gameAway.setAgainstTeam("대구FC");
							break;
						case "강원":
							gameAway.setAgainstTeam("강원FC");
							break;
						case "전북":
							gameAway.setAgainstTeam("전북현대모터스");
							break;
						case "광주 FC":
							gameAway.setAgainstTeam("광주FC");
							break;
						case "전남":
							gameAway.setAgainstTeam("전남드래곤즈");
							break;
						case "수원":
							gameAway.setAgainstTeam("수원삼성블루윙즈");
							break;
						case "안양":
							gameAway.setAgainstTeam("FC안양");
							break;
						case "서울 이랜드":
							gameAway.setAgainstTeam("서울이랜드");
							break;
						case "경남":
							gameAway.setAgainstTeam("경남FC");
							break;
						case "수원FC":
							gameAway.setAgainstTeam("수원FC");
							break;
						case "성남":
							gameAway.setAgainstTeam("성남FC");
							break;
						case "충주":
							gameAway.setAgainstTeam("충주험멜축구단");
							break;
						case "고양":
							gameAway.setAgainstTeam("고양자이크로FC");
							break;
						default:
							continue jump;
						}
						gameAway.setGameDate(row.get(2).select("td").get(1).text().substring(1, 11));
						gameAway.setGameTime(row.get(2).select("td").get(1).text().substring(13, 18));
						gameAway.setGoalsFor(Integer.parseInt(row.get(0).select("td").get(6).text()) + Integer.parseInt(row.get(1).select("td").get(6).text()));
						gameAway.setGoalsAgainst(Integer.parseInt(row.get(0).select("td").get(4).text()) + Integer.parseInt(row.get(1).select("td").get(4).text()));
						gameAway.setGoalDifference(gameAway.getGoalsFor() - gameAway.getGoalsAgainst());
						gameAway.setIsHome(1);
						if(gameAway.getGoalDifference() > 0) {
							gameAway.setGameResult(0);
							gameAway.setAgainstGameResult(2);
							gameAway.setPoints(3);
						} else if(gameAway.getGoalDifference() == 0) {
							gameAway.setGameResult(1);
							gameAway.setAgainstGameResult(1);
							gameAway.setPoints(1);
						} else if(gameAway.getGoalDifference() < 0) {
							gameAway.setGameResult(2);
							gameAway.setAgainstGameResult(0);
							gameAway.setPoints(0);
						}
					}

					Elements row1 = tables.get(1).select("tr"); // 2번째 테이블
					Elements tds1 = row1.get(2).select("td"); // 2번째 테이블 3행
					if(tds1.get(3).text().equals("")) { // 2번째 테이블 3행 3열의 값이 없으면 다음 URL로 점프
						continue jump;
					}
					
					if (tds1.size() > 6) { // 선발선수, 유효슈팅 입력
						String home1st = row1.get(row1.size() - 1).select("td").get(4).text();
						String home2nd = row1.get(row1.size() - 1).select("td").get(9).text();
						String away1st = row1.get(row1.size() - 1).select("td").get(21).text();
						String away2nd = row1.get(row1.size() - 1).select("td").get(26).text();
						
						gameHome.setTargetShot(Integer.parseInt(home1st.substring(home1st.indexOf("(") + 1, home1st.indexOf(")"))) + 
								Integer.parseInt(home2nd.substring(home2nd.indexOf("(") + 1, home2nd.indexOf(")"))));
						gameHome.setPlayer1(row1.get(2).select("td").get(11).text()); // 2번째 테이블 3행 12열
						gameHome.setPlayer2(row1.get(3).select("td").get(11).text()); // 2번째 테이블 4행 12열
						gameHome.setPlayer3(row1.get(4).select("td").get(11).text());
						gameHome.setPlayer4(row1.get(5).select("td").get(11).text());
						gameHome.setPlayer5(row1.get(6).select("td").get(11).text());
						gameHome.setPlayer6(row1.get(7).select("td").get(11).text());
						gameHome.setPlayer7(row1.get(8).select("td").get(11).text());
						gameHome.setPlayer8(row1.get(9).select("td").get(11).text());
						gameHome.setPlayer9(row1.get(10).select("td").get(11).text());
						gameHome.setPlayer10(row1.get(11).select("td").get(11).text());
						gameHome.setPlayer11(row1.get(12).select("td").get(11).text());
						gameHome.setAgainstPlayer1(row1.get(2).select("td").get(16).text());
						gameHome.setAgainstPlayer2(row1.get(3).select("td").get(16).text());
						gameHome.setAgainstPlayer3(row1.get(4).select("td").get(16).text());
						gameHome.setAgainstPlayer4(row1.get(5).select("td").get(16).text());
						gameHome.setAgainstPlayer5(row1.get(6).select("td").get(16).text());
						gameHome.setAgainstPlayer6(row1.get(7).select("td").get(16).text());
						gameHome.setAgainstPlayer7(row1.get(8).select("td").get(16).text());
						gameHome.setAgainstPlayer8(row1.get(9).select("td").get(16).text());
						gameHome.setAgainstPlayer9(row1.get(10).select("td").get(16).text());
						gameHome.setAgainstPlayer10(row1.get(11).select("td").get(16).text());
						gameHome.setAgainstPlayer11(row1.get(12).select("td").get(16).text());
						gameAway.setTargetShot(Integer.parseInt(away1st.substring(away1st.indexOf("(") + 1, away1st.indexOf(")"))) + 
								Integer.parseInt(away2nd.substring(away2nd.indexOf("(") + 1, away2nd.indexOf(")"))));
						gameAway.setPlayer1(row1.get(2).select("td").get(16).text());
						gameAway.setPlayer2(row1.get(3).select("td").get(16).text());
						gameAway.setPlayer3(row1.get(4).select("td").get(16).text());
						gameAway.setPlayer4(row1.get(5).select("td").get(16).text());
						gameAway.setPlayer5(row1.get(6).select("td").get(16).text());
						gameAway.setPlayer6(row1.get(7).select("td").get(16).text());
						gameAway.setPlayer7(row1.get(8).select("td").get(16).text());
						gameAway.setPlayer8(row1.get(9).select("td").get(16).text());
						gameAway.setPlayer9(row1.get(10).select("td").get(16).text());
						gameAway.setPlayer10(row1.get(11).select("td").get(16).text());
						gameAway.setPlayer11(row1.get(12).select("td").get(16).text());
						gameAway.setAgainstPlayer1(row1.get(2).select("td").get(11).text());
						gameAway.setAgainstPlayer2(row1.get(3).select("td").get(11).text());
						gameAway.setAgainstPlayer3(row1.get(4).select("td").get(11).text());
						gameAway.setAgainstPlayer4(row1.get(5).select("td").get(11).text());
						gameAway.setAgainstPlayer5(row1.get(6).select("td").get(11).text());
						gameAway.setAgainstPlayer6(row1.get(7).select("td").get(11).text());
						gameAway.setAgainstPlayer7(row1.get(8).select("td").get(11).text());
						gameAway.setAgainstPlayer8(row1.get(9).select("td").get(11).text());
						gameAway.setAgainstPlayer9(row1.get(10).select("td").get(11).text());
						gameAway.setAgainstPlayer10(row1.get(11).select("td").get(11).text());
						gameAway.setAgainstPlayer11(row1.get(12).select("td").get(11).text());
					}

					int sumHome = 0;
					int sumAway = 0;
					int countHome = 0;
					int countAway = 0;
					int[] caHome = { gameService.getCA(gameHome.getPlayer1(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer2(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer3(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer4(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer5(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer6(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer7(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer8(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer9(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer10(), gameHome.getTeam())
							, gameService.getCA(gameHome.getPlayer11(), gameHome.getTeam())
					};
					int[] caAway = { gameService.getCA(gameAway.getPlayer1(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer2(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer3(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer4(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer5(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer6(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer7(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer8(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer9(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer10(), gameAway.getTeam())
							, gameService.getCA(gameAway.getPlayer11(), gameAway.getTeam())
					};

					for(int i = 0; i < 11; i++) {
						sumHome += caHome[i];
					}
					for(int i = 0; i < 11; i++) {
						if(caHome[i] != 0) {
							countHome++;
						}
					}
					for(int i = 0; i < 11; i++) {
						sumAway += caAway[i];
					}
					for(int i = 0; i < 11; i++) {
						if(caAway[i] != 0) {
							countAway++;
						}
					}

					if(countHome != 0) {
						gameHome.setTeamAbility(sumHome/countHome);
						gameAway.setAgainstTeamAbility(sumHome/countHome);
					} else {
						gameHome.setTeamAbility(0);
						gameAway.setAgainstTeamAbility(0);
					}

					if(countAway != 0) {
						gameHome.setAgainstTeamAbility(sumAway/countAway);
						gameAway.setTeamAbility(sumAway/countAway);
					} else {
						gameHome.setAgainstTeamAbility(0);
						gameAway.setTeamAbility(0);
					}

					/* 선수 데이터 없는 놈들 찾기
					if(caHome[0] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer1() + ":" + caHome[0]);
					}
					if(caHome[1] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer2() + ":" + caHome[1]);
					}
					if(caHome[2] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer3() + ":" + caHome[2]);
					}
					if(caHome[3] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer4() + ":" + caHome[3]);
					}
					if(caHome[4] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer5() + ":" + caHome[4]);
					}
					if(caHome[5] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer6() + ":" + caHome[5]);
					}
					if(caHome[6] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer7() + ":" + caHome[6]);
					}
					if(caHome[7] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer8() + ":" + caHome[7]);
					}
					if(caHome[8] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer9() + ":" + caHome[8]);
					}
					if(caHome[9] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer10() + ":" + caHome[9]);
					}
					if(caHome[10] == 0) {
						System.out.println(gameHome.getTeam() + ":" + gameHome.getPlayer11() + ":" + caHome[10]);
					}
					if(caAway[0] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer1() + ":" + caAway[0]);
					}
					if(caAway[1] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer2() + ":" + caAway[1]);
					}
					if(caAway[2] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer3() + ":" + caAway[2]);
					}
					if(caAway[3] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer4() + ":" + caAway[3]);
					}
					if(caAway[4] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer5() + ":" + caAway[4]);
					}
					if(caAway[5] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer6() + ":" + caAway[5]);
					}
					if(caAway[6] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer7() + ":" + caAway[6]);
					}
					if(caAway[7] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer8() + ":" + caAway[7]);
					}
					if(caAway[8] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer9() + ":" + caAway[8]);
					}
					if(caAway[9] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer10() + ":" + caAway[9]);
					}
					if(caAway[10] == 0) {
						System.out.println(gameAway.getTeam() + ":" + gameAway.getPlayer11() + ":" + caAway[10]);
					}
					*/

					gameHome.setRecentResultWin(gameService.getRecentResultWin(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstRecentResultWin(gameService.getRecentResultWin(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setRecentResultWin(gameService.getRecentResultWin(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstRecentResultWin(gameService.getRecentResultWin(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setRecentResultDraw(gameService.getRecentResultDraw(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstRecentResultDraw(gameService.getRecentResultDraw(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setRecentResultDraw(gameService.getRecentResultDraw(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstRecentResultDraw(gameService.getRecentResultDraw(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setRecentResultLose(gameService.getRecentResultLose(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstRecentResultLose(gameService.getRecentResultLose(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setRecentResultLose(gameService.getRecentResultLose(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstRecentResultLose(gameService.getRecentResultLose(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					
					gameHome.setCumGoalsFor(gameService.getCumGoalsFor(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstCumGoalsFor(gameService.getCumGoalsFor(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setCumGoalsFor(gameService.getCumGoalsFor(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstCumGoalsFor(gameService.getCumGoalsFor(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					
					gameHome.setCumGoalsAgainst(gameService.getCumGoalsAgainst(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstCumGoalsAgainst(gameService.getCumGoalsAgainst(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setCumGoalsAgainst(gameService.getCumGoalsAgainst(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstCumGoalsAgainst(gameService.getCumGoalsAgainst(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setCumGoalDifference(gameService.getCumGoalDiff(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstCumGoalDifference(gameService.getCumGoalDiff(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setCumGoalDifference(gameService.getCumGoalDiff(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstCumGoalDifference(gameService.getCumGoalDiff(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					
					gameHome.setWin(gameService.getWin(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstWin(gameService.getWin(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setWin(gameService.getWin(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstWin(gameService.getWin(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setDraw(gameService.getDraw(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstDraw(gameService.getDraw(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setDraw(gameService.getDraw(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstDraw(gameService.getDraw(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setLose(gameService.getLose(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstLose(gameService.getLose(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setLose(gameService.getLose(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstLose(gameService.getLose(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					
					gameHome.setCumPoints(gameService.getCumPoints(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstCumPoints(gameService.getCumPoints(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameHome.setCumPointsDifference(gameHome.getCumPoints() - gameHome.getAgainstCumPoints());
					gameAway.setCumPoints(gameService.getCumPoints(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstCumPoints(gameService.getCumPoints(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameAway.setCumPointsDifference(gameAway.getCumPoints() - gameAway.getAgainstCumPoints());
					
					gameHome.setPrevRank(gameService.getRank(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstPrevRank(gameService.getRank(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setPrevRank(gameService.getRank(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setAgainstPrevRank(gameService.getRank(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					
					gameHome.setPrevResult(gameService.getPrevResult(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameHome.setAgainstPrevResult(gameService.getPrevResult(gameAway.getSeason(), gameAway.getLeague(), gameAway.getTeam()));
					gameAway.setPrevResult(gameService.getPrevResult(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));
					gameAway.setAgainstPrevResult(gameService.getPrevResult(gameHome.getSeason(), gameHome.getLeague(), gameHome.getTeam()));

					try {
						gameService.insertGame(gameHome);
						gameService.insertGame(gameAway);
					} catch(Exception e) {
						e.printStackTrace();
					}
					if(k == 1) {
						System.out.println(l + "년 K-리그 클래식 제 " + j + "경기 데이터 입력완료");
					} else if(k == 2) {
						System.out.println(l + "년 K-리그 챌린지 제 " + j + "경기 데이터 입력완료");
					}
				}
			}
		}
		System.out.println("----------전체입력완료----------");
	}
}