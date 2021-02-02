package com.one;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bowling {
	//Creating a HashMap object to save players details
	HashMap<String,Integer> players = new HashMap<String, Integer>();
	
	//Method to store player name and score with String and Integer
	public void addPlayer(String name, int points) {
		players.put(name,points);
	}

	//Displaying players name and scores
	public void display() {
		System.out.println("HashMap contains: "+players);
	}
	
	//Method to identify winner of the game
	public String getWinner() {
		
		Set<String> s = players.keySet();
//		System.out.println(s);
		
		Collection<Integer> c = players.values();
//		System.out.println(c);
		
		int q;
		int temp = 0;
		
		Iterator it = c.iterator();
		for(int i=0; i<3; i++) {
			q = (int) it.next();
			if(q>=temp) {
				temp=q;
			}
		}
		
		if(players.containsValue(temp)) {
			for(Map.Entry<String,Integer> e:players.entrySet()) {
				String key=(String) e.getKey();
				int obj = (int) e.getValue();
				if(obj==temp) {
					System.out.println(key);
				}
			}
		}
		return null;
	}
}
