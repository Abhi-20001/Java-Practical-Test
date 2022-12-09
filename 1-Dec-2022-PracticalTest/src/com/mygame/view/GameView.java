package com.mygame.view;
import com.mygame.service.*;

public class GameView {
	
	GameService s = new GameService();
	int value[] = new int[10];
	
	
	public String[] displayCityNamesWithBlanks()
	{
		GameView v = new GameView();
		String[] c = s.getCityNamesService();
		
		
		for(int i = 0 ; i < c.length; i++)
		{
			int num = c[i].length();
			int val[] = v.generateRandom(num);
			int k = 0;
			
			char arr[]= c[i].toCharArray();
				
			for(int j=0; j < arr.length;j++)
			{
				for(int l = 0; l <= val.length; l++)
				{
					if( j == val[l])
					{
							arr[j] = ' ';
					}
				}
			}
			c[i] = String.valueOf(arr);
		}
		return c;
	}
	
	
	
	int[] generateRandom(int n)
	{
		int max = n;
		int min = 1;
		int i = 0;
		
		java.util.Random random = new java.util.Random();
		while(i != n/3 )
		{
			int value = (int) (random.nextInt(max - min) + min);
		}
		return value;
	}

}
