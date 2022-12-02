package com.mygame.view;
import com.mygame.service.*;

public class GameView {
	
	GameService s = new GameService();
	
	
	public String[] displayCityNamesWithBlanks()
	{
		GameView v = new GameView();
		String[] c = s.getCityNamesService();
		
		
		for(int i = 0 ; i < c.length; i++)
		{
			int num = c[i].length();
			int k = 0;
			// int randomArray[]= null;
			
			while(k != 3)
			{
				int val = v.generateRandom(num);
				
				char arr[]= c[i].toCharArray();

				for(int j=0; j < arr.length;j++)
				{
					if( i == val)
					{
						arr[i] = ' ';
					}		
				}
				c[i] = String.valueOf(arr);
				k++;
			}
		}
		return c;
	}
	
	
	
	int generateRandom(int n)
	{
		int max = n;
		int min = 1;
		
		java.util.Random random = new java.util.Random();
		
		int value = random.nextInt(max - min) + min;
		return value;
	}

}
