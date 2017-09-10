package com.woowafootball.ourapp.players.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woowafootball.ourapp.players.dao.IPlayerRepository;
import com.woowafootball.ourapp.players.model.PlayersVO;

@Service
public class PlayerService implements IPlayerService {
	
	@Autowired
	IPlayerRepository playerRepository;

	@Override
	public void insertPlayer(PlayersVO player) {
		playerRepository.insertPlayer(player);
	}

}
