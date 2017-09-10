package com.ktech.ourapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ktech.ourapp.model.FmeasureVO;
import com.ktech.ourapp.model.GamesVO;
import com.ktech.ourapp.model.KtechVO;
import com.ktech.ourapp.model.PredictVO;

public interface IKtechService {

	public ArrayList<PredictVO> getPredictList(List<String> preds, String gameId);
	public List<GamesVO> getScheduleInfo(); 
	public GamesVO getTeamInfo(String gameId);

	List<GamesVO> getGamedateList(String league);
	GamesVO getGamedateInfo(String gameId);
	List<GamesVO> getScheduleList(String league);
	GamesVO getGameInfo(String gameId);
	List<GamesVO> getGamedateList();
}
