package com.mygame.service;

import com.mygame.dao.GameDAO;

public class GameService {
	public String[] getCityNamesService()
	{
		GameDAO g = new GameDAO();
		String s[] = g.getCityNames();
		
		return s;
	}

	public String[] GameService() {
		// TODO Auto-generated method stub
		return null;
	}
}
