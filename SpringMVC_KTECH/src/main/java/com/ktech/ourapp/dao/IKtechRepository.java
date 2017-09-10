package com.ktech.ourapp.dao;

import java.util.List;

import com.ktech.ourapp.model.GamesVO;

public interface IKtechRepository {


	public List<GamesVO> getScheduleInfo();
	public GamesVO getTeamInfo(String gameId);

	List<GamesVO> getGamedateList(String league);
	GamesVO getGamedateInfo(String gameId);
	
	List<GamesVO> getScheduleList(String league);
	
	GamesVO getGameInfo(String gameId);
	List<GamesVO> getGamedateList();
	
}
