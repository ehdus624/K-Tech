package com.woowafootball.ourapp.players;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.woowafootball.ourapp.players.model.PlayersVO;
import com.woowafootball.ourapp.players.service.IPlayerService;

public class PlayerMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("spring/application-config.xml");
		IPlayerService playerService = context.getBean("playerService", IPlayerService.class);


		PlayersVO player = new PlayersVO();

		File f = new File("C:\\Users\\COM\\Desktop\\FM 선수 데이터_170712\\K리그\\"); 
		ArrayList<File> subFiles= new ArrayList<File>();

		if(!f.exists()) 
		{ 
			System.out.println("디렉토리가 존재하지 않습니다"); 
			return; 
		} 

		findSubFiles(f, subFiles);

		for(File file : subFiles) {

			try {
				if(file.isFile()) {

					File fXmlFile = new File("C:\\Users\\COM\\Desktop\\FM 선수 데이터_170712\\K리그\\" 
							+ file.getParent().substring(file.getParent().lastIndexOf("\\") + 1,
									file.getParent().length()) + "\\" + file.getName());

					player.setTeam(fXmlFile.getParent().substring(fXmlFile.getParent().lastIndexOf("\\") + 1, fXmlFile.getParent().length()));

					DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
					Document doc = dBuilder.parse(fXmlFile);
					doc.getDocumentElement().normalize();

					//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
					NodeList general = doc.getElementsByTagName("General");
					NodeList gkAttr = doc.getElementsByTagName("GoalKeeperAttributes");
					NodeList techAttr = doc.getElementsByTagName("TechnicalAttributes");
					NodeList mentalAttr = doc.getElementsByTagName("MentalAttributes");
					NodeList physicAttr = doc.getElementsByTagName("PhysicalAttributes");
					NodeList hidAttr = doc.getElementsByTagName("HiddenAttributes");
					NodeList persAttr = doc.getElementsByTagName("PersonalityAttributes");
					NodeList positions = doc.getElementsByTagName("Positions");

					//System.out.println("-----------General------------");

					for (int temp = 0; temp < general.getLength(); temp++) {

						Node nNode = general.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;

							//System.out.println("Name: " + getTagValue("Name", eElement));
							//System.out.println("PlayerID: " + getTagValue("UID", eElement));
							//System.out.println("NationID: " + getTagValue("NationID", eElement));
							//System.out.println("Born: " + getTagValue("Born", eElement));
							//System.out.println("Age: " + getTagValue("Age", eElement));
							//System.out.println("WorldReputation: " + getTagValue("WorldReputation", eElement));
							//System.out.println("HomeReputation: " + getTagValue("HomeReputation", eElement));
							//System.out.println("CurrentReputation: " + getTagValue("CurrentReputation", eElement));
							//System.out.println("PA: " + getTagValue("PA", eElement));
							//System.out.println("CA: " + getTagValue("CA", eElement));
							//System.out.println("Price: " + getTagValue("Price", eElement));
							//System.out.println("Height: " + getTagValue("Height", eElement));
							//System.out.println("Weight: " + getTagValue("Weight", eElement));
							//System.out.println("PositionsString: " + getTagValue("PositionsString", eElement));

							player.setName(getTagValue("Name", eElement));
							player.setPlayerId(Integer.parseInt(getTagValue("UID", eElement)));
							player.setNationId(Integer.parseInt(getTagValue("NationID", eElement)));
							player.setBorn(getTagValue("Born", eElement));
							player.setAge(Integer.parseInt(getTagValue("Age", eElement)));
							player.setWorldReputation(Integer.parseInt(getTagValue("WorldReputation", eElement)));
							player.setHomeReputation(Integer.parseInt(getTagValue("HomeReputation", eElement)));
							player.setCurrentReputation(Integer.parseInt(getTagValue("CurrentReputation", eElement)));
							player.setPa(Integer.parseInt(getTagValue("PA", eElement)));
							player.setCa(Integer.parseInt(getTagValue("CA", eElement)));
							player.setPrice(Integer.parseInt(getTagValue("Price", eElement)));
							player.setHeight(Integer.parseInt(getTagValue("Height", eElement)));
							player.setWeight(Integer.parseInt(getTagValue("Weight", eElement)));
							player.setPositionString(getTagValue("PositionsString", eElement));
						}
					}
					//System.out.println("-----------GoalKeeperAttributes------------");
					for (int temp = 0; temp < gkAttr.getLength(); temp++) {

						Node nNode = gkAttr.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;

							//System.out.println("AerialAbility: " + getTagValue("AerialAbility", eElement));
							//System.out.println("CommandOfArea: " + getTagValue("CommandOfArea", eElement));
							//System.out.println("Communication: " + getTagValue("Communication", eElement));
							//System.out.println("Eccentricity: " + getTagValue("Eccentricity", eElement));
							//System.out.println("Handling: " + getTagValue("Handling", eElement));
							//System.out.println("Kicking: " + getTagValue("Kicking", eElement));
							//System.out.println("OneOnOnes: " + getTagValue("OneOnOnes", eElement));
							//System.out.println("Reflexes: " + getTagValue("Reflexes", eElement));
							//System.out.println("RushingOut: " + getTagValue("RushingOut", eElement));
							//System.out.println("TendencyToPunch: " + getTagValue("TendencyToPunch", eElement));
							//System.out.println("Throwing: " + getTagValue("Throwing", eElement));

							player.setAerialAbility(Integer.parseInt(getTagValue("AerialAbility", eElement)));
							player.setCommandOfArea(Integer.parseInt(getTagValue("CommandOfArea", eElement)));
							player.setCommunication(Integer.parseInt(getTagValue("Communication", eElement)));
							player.setEccentricity( Integer.parseInt(getTagValue("Eccentricity", eElement)));
							player.setHandling(Integer.parseInt(getTagValue("Handling", eElement)));
							player.setKicking( Integer.parseInt(getTagValue("Kicking", eElement)));
							player.setOneOnOnes(Integer.parseInt(getTagValue("OneOnOnes", eElement)));
							player.setReflexes(Integer.parseInt(getTagValue("Reflexes", eElement)));
							player.setRushingOut(Integer.parseInt(getTagValue("RushingOut", eElement)));
							player.setTendencyToPunch(Integer.parseInt(getTagValue("TendencyToPunch", eElement)));
							player.setThrowing(Integer.parseInt(getTagValue("Throwing", eElement)));

						}
					}
					//System.out.println("-----------TechnicalAttributes------------");
					for (int temp = 0; temp < techAttr.getLength(); temp++) {

						Node nNode = techAttr.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;

							//System.out.println("Corners: " + getTagValue("Corners", eElement));
							//System.out.println("Crossing: " + getTagValue("Crossing", eElement));
							//System.out.println("Dribbling: " + getTagValue("Dribbling", eElement));
							//System.out.println("Finishing: " + getTagValue("Finishing", eElement));
							//System.out.println("FirstTouch: " + getTagValue("FirstTouch", eElement));
							//System.out.println("Freekicks: " + getTagValue("Freekicks", eElement));
							//System.out.println("Heading: " + getTagValue("Heading", eElement));
							//System.out.println("LongShots: " + getTagValue("LongShots", eElement));
							//System.out.println("Longthrows: " + getTagValue("Longthrows", eElement));
							//System.out.println("Marking: " + getTagValue("Marking", eElement));
							//System.out.println("Passing: " + getTagValue("Passing", eElement));
							//System.out.println("PenaltyTaking: " + getTagValue("PenaltyTaking", eElement));
							//System.out.println("Tackling: " + getTagValue("Tackling", eElement));
							//System.out.println("Technique: " + getTagValue("Technique", eElement));

							player.setCorners(Integer.parseInt(getTagValue("Corners", eElement)));
							player.setCrossing(Integer.parseInt(getTagValue("Crossing", eElement)));
							player.setDribbling(Integer.parseInt(getTagValue("Dribbling", eElement)));
							player.setFinishing(Integer.parseInt(getTagValue("Finishing", eElement)));
							player.setFirstTouch(Integer.parseInt(getTagValue("FirstTouch", eElement)));
							player.setFreekicks(Integer.parseInt(getTagValue("Freekicks", eElement)));
							player.setHeading(Integer.parseInt(getTagValue("Heading", eElement)));
							player.setLongShots(Integer.parseInt(getTagValue("LongShots", eElement)));
							player.setLongthrows(Integer.parseInt(getTagValue("Longthrows", eElement)));
							player.setMarking(Integer.parseInt(getTagValue("Marking", eElement)));
							player.setPassing(Integer.parseInt(getTagValue("Passing", eElement)));
							player.setPenaltyTaking(Integer.parseInt(getTagValue("PenaltyTaking", eElement)));
							player.setTackling(Integer.parseInt(getTagValue("Tackling", eElement)));
							player.setTechnique(Integer.parseInt(getTagValue("Technique", eElement)));

						}
					}
					//System.out.println("-----------MentalAttributes------------");
					for (int temp = 0; temp < mentalAttr.getLength(); temp++) {

						Node nNode = mentalAttr.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;

							//System.out.println("Aggression: " + getTagValue("Aggression", eElement));
							//System.out.println("Anticipation: " + getTagValue("Anticipation", eElement));
							//System.out.println("Bravery: " + getTagValue("Bravery", eElement));
							//System.out.println("Composure: " + getTagValue("Composure", eElement));
							//System.out.println("Concentration: " + getTagValue("Concentration", eElement));
							//System.out.println("Vision: " + getTagValue("Vision", eElement));
							//System.out.println("Decisions: " + getTagValue("Decisions", eElement));
							//System.out.println("Determination: " + getTagValue("Determination", eElement));
							//System.out.println("Flair: " + getTagValue("Flair", eElement));
							//System.out.println("Leadership: " + getTagValue("Leadership", eElement));
							//System.out.println("OffTheBall: " + getTagValue("OffTheBall", eElement));
							//System.out.println("Positioning: " + getTagValue("Positioning", eElement));
							//System.out.println("Teamwork: " + getTagValue("Teamwork", eElement));
							//System.out.println("Workrate: " + getTagValue("Workrate", eElement));

							player.setAggression(Integer.parseInt(getTagValue("Aggression", eElement)));
							player.setAnticipation(Integer.parseInt(getTagValue("Anticipation", eElement)));
							player.setBravery(Integer.parseInt(getTagValue("Bravery", eElement)));
							player.setComposure(Integer.parseInt(getTagValue("Composure", eElement)));
							player.setConcentration(Integer.parseInt(getTagValue("Concentration", eElement)));
							player.setVision(Integer.parseInt(getTagValue("Vision", eElement)));
							player.setDecisions(Integer.parseInt(getTagValue("Decisions", eElement)));
							player.setDetermination(Integer.parseInt(getTagValue("Determination", eElement)));
							player.setFlair(Integer.parseInt(getTagValue("Flair", eElement)));
							player.setLeadership(Integer.parseInt(getTagValue("Leadership", eElement)));
							player.setOffTheBall(Integer.parseInt(getTagValue("OffTheBall", eElement)));
							player.setPositioning(Integer.parseInt(getTagValue("Positioning", eElement)));
							player.setTeamwork(Integer.parseInt(getTagValue("Teamwork", eElement)));
							player.setWorkrate(Integer.parseInt(getTagValue("Workrate", eElement)));

						}
					}
					//System.out.println("-----------PhysicalAttributes------------");
					for (int temp = 0; temp < physicAttr.getLength(); temp++) {

						Node nNode = physicAttr.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;

							//System.out.println("Acceleration: " + getTagValue("Acceleration", eElement));
							//System.out.println("Agility: " + getTagValue("Agility", eElement));
							//System.out.println("Balance: " + getTagValue("Balance", eElement));
							//System.out.println("Jumping: " + getTagValue("Jumping", eElement));
							//System.out.println("LeftFoot: " + getTagValue("LeftFoot", eElement));
							//System.out.println("NaturalFitness: " + getTagValue("NaturalFitness", eElement));
							//System.out.println("Pace: " + getTagValue("Pace", eElement));
							//System.out.println("RightFoot: " + getTagValue("RightFoot", eElement));
							//System.out.println("Stamina: " + getTagValue("Stamina", eElement));
							//System.out.println("Strength: " + getTagValue("Strength", eElement));

							player.setAcceleration(Integer.parseInt(getTagValue("Acceleration", eElement)));
							player.setAgility(Integer.parseInt(getTagValue("Agility", eElement)));
							player.setBalance(Integer.parseInt(getTagValue("Balance", eElement)));
							player.setJumping(Integer.parseInt(getTagValue("Jumping", eElement)));
							player.setLeftFoot(Integer.parseInt(getTagValue("LeftFoot", eElement)));
							player.setNaturalFitness(Integer.parseInt(getTagValue("NaturalFitness", eElement)));
							player.setPace(Integer.parseInt(getTagValue("Pace", eElement)));
							player.setRightFoot(Integer.parseInt(getTagValue("RightFoot", eElement)));
							player.setStamina(Integer.parseInt(getTagValue("Stamina", eElement)));
							player.setStrength(Integer.parseInt(getTagValue("Strength", eElement)));

						}
					}
					//System.out.println("-----------HiddenAttributes------------");
					for (int temp = 0; temp < hidAttr.getLength(); temp++) {

						Node nNode = hidAttr.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;

							//System.out.println("Consistency: " + getTagValue("Consistency", eElement));
							//System.out.println("Dirtiness: " + getTagValue("Dirtiness", eElement));
							//System.out.println("ImportantMatches: " + getTagValue("ImportantMatches", eElement));
							//System.out.println("InjuryProness: " + getTagValue("InjuryProness", eElement));
							//System.out.println("Versatility: " + getTagValue("Versatility", eElement));

							player.setConsistency(Integer.parseInt(getTagValue("Consistency", eElement)));
							player.setDirtiness(Integer.parseInt(getTagValue("Dirtiness", eElement)));
							player.setImportantMatches(Integer.parseInt(getTagValue("ImportantMatches", eElement)));
							player.setInjuryProness(Integer.parseInt(getTagValue("InjuryProness", eElement)));
							player.setVersatility(Integer.parseInt(getTagValue("Versatility", eElement)));

						}
					}
					//System.out.println("-----------PersonalityAttributes------------");
					for (int temp = 0; temp < persAttr.getLength(); temp++) {

						Node nNode = persAttr.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;

							//System.out.println("Adaptability: " + getTagValue("Adaptability", eElement));
							//System.out.println("Ambition: " + getTagValue("Ambition", eElement));
							//System.out.println("Loyalty: " + getTagValue("Loyalty", eElement));
							//System.out.println("Pressure: " + getTagValue("Pressure", eElement));
							//System.out.println("Professional: " + getTagValue("Professional", eElement));
							//System.out.println("Sportsmanship: " + getTagValue("Sportsmanship", eElement));
							//System.out.println("Temperament: " + getTagValue("Temperament", eElement));
							//System.out.println("Controversy: " + getTagValue("Controversy", eElement));

							player.setAdaptability(Integer.parseInt(getTagValue("Adaptability", eElement)));
							player.setAmbition(Integer.parseInt(getTagValue("Ambition", eElement)));
							player.setLoyalty(Integer.parseInt(getTagValue("Loyalty", eElement)));
							player.setPressure(Integer.parseInt(getTagValue("Pressure", eElement)));
							player.setProfessional(Integer.parseInt(getTagValue("Professional", eElement)));
							player.setSportsmanship(Integer.parseInt(getTagValue("Sportsmanship", eElement)));
							player.setTemperament(Integer.parseInt(getTagValue("Temperament", eElement)));
							player.setControversy(Integer.parseInt(getTagValue("Controversy", eElement)));

						}
					}
					//System.out.println("-----------Positions------------");
					for (int temp = 0; temp < positions.getLength(); temp++) {

						Node nNode = positions.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							Element eElement = (Element) nNode;

							//System.out.println("Defender: " + getTagValue("Defender", eElement));
							//System.out.println("WingBack: " + getTagValue("WingBack", eElement));
							//System.out.println("Midfielder: " + getTagValue("Midfielder", eElement));
							//System.out.println("AttackingMidfielder: " + getTagValue("AttackingMidfielder", eElement));
							//System.out.println("Right: " + getTagValue("Right", eElement));
							//System.out.println("Left" + getTagValue("Left", eElement));
							//System.out.println("Centre: " + getTagValue("Centre", eElement));
							//System.out.println("PositionsDescVal: " + getTagValue("PositionsDescVal", eElement));
							//System.out.println("Goalkeeper: " + getTagValue("Goalkeeper", eElement));
							//System.out.println("Sweeper: " + getTagValue("Sweeper", eElement));
							//System.out.println("Striker: " + getTagValue("Striker", eElement));
							//System.out.println("AttackingMidCentral: " + getTagValue("AttackingMidCentral", eElement));
							//System.out.println("AttackingMidLeft: " + getTagValue("AttackingMidLeft", eElement));
							//System.out.println("AttackingMidRight: " + getTagValue("AttackingMidRight", eElement));
							//System.out.println("DefenderCentral: " + getTagValue("DefenderCentral", eElement));
							//System.out.println("DefenderLeft: " + getTagValue("DefenderLeft", eElement));
							//System.out.println("DefenderRight: " + getTagValue("DefenderRight", eElement));
							//System.out.println("DefensiveMidfielder: " + getTagValue("DefensiveMidfielder", eElement));
							//System.out.println("MidfielderCentral: " + getTagValue("MidfielderCentral", eElement));
							//System.out.println("MidfielderLeft: " + getTagValue("MidfielderLeft", eElement));
							//System.out.println("MidfielderRight: " + getTagValue("MidfielderRight", eElement));
							//System.out.println("WingBackLeft: " + getTagValue("WingBackLeft", eElement));
							//System.out.println("WingBackRight: " + getTagValue("WingBackRight", eElement));

							player.setDefender(Integer.parseInt(getTagValue("Defender", eElement)));
							player.setWingBack(Integer.parseInt(getTagValue("WingBack", eElement)));
							player.setMidfielder(Integer.parseInt(getTagValue("Midfielder", eElement)));
							player.setAttackingMidfielder(Integer.parseInt(getTagValue("AttackingMidfielder", eElement)));
							player.setRight(Integer.parseInt(getTagValue("Right", eElement)));
							player.setLeft(Integer.parseInt(getTagValue("Left", eElement)));
							player.setCentre(Integer.parseInt(getTagValue("Centre", eElement)));
							player.setPositionsDescVal(Integer.parseInt(getTagValue("PositionsDescVal", eElement)));
							player.setGoalkeeper(Integer.parseInt(getTagValue("Goalkeeper", eElement)));
							player.setSweeper(Integer.parseInt( getTagValue("Sweeper", eElement)));
							player.setStriker(Integer.parseInt(getTagValue("Striker", eElement)));
							player.setAttackingMidCentral(Integer.parseInt(getTagValue("AttackingMidCentral", eElement)));
							player.setAttackingMidLeft(Integer.parseInt(getTagValue("AttackingMidLeft", eElement)));
							player.setAttackingMidRight(Integer.parseInt(getTagValue("AttackingMidRight", eElement)));
							player.setDefenderCentral(Integer.parseInt(getTagValue("DefenderCentral", eElement)));
							player.setDefenderLeft(Integer.parseInt(getTagValue("DefenderLeft", eElement)));
							player.setDefenderRight(Integer.parseInt(getTagValue("DefenderRight", eElement)));
							player.setDefensiveMidfielder(Integer.parseInt(getTagValue("DefensiveMidfielder", eElement)));
							player.setMidfielderCentral(Integer.parseInt(getTagValue("MidfielderCentral", eElement)));
							player.setMidfielderLeft(Integer.parseInt(getTagValue("MidfielderLeft", eElement)));
							player.setMidfielderRight(Integer.parseInt(getTagValue("MidfielderRight", eElement)));
							player.setWingBackLeft(Integer.parseInt(getTagValue("WingBackLeft", eElement)));
							player.setWingBackRight(Integer.parseInt(getTagValue("WingBackRight", eElement)));

						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}


			try {
				playerService.insertPlayer(player);
				System.out.println(player.getName() + " 선수 입력완료");
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Element element = (Element)eElement.getElementsByTagName(sTag).item(0);
		String value = element.getAttribute("Value");
		//System.out.println(value);
		Node node = (Node) nlList.item(0);
		//System.out.println(element.getAttribute("Value"));
		if(value != null && !value.equals("")) {
			return value;
		}
		if(node != null) { 
			return node.getNodeValue().trim().replace("\"", "");
		}
		return "error";
	}

	public static void findSubFiles(File parentFile, ArrayList<File> subFiles) {
		if(parentFile.isFile()) {
			subFiles.add(parentFile);
		} else if(parentFile.isDirectory()) {
//			subFiles.add(parentFile);
			File[] childFiles = parentFile.listFiles(); 
			for(File childFile : childFiles) {
				findSubFiles(childFile, subFiles);
			}
		}
	}
}
