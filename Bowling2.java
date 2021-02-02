package com.one;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bowling2 {
	HashMap<String,Integer> players = new HashMap<String, Integer>();
	
	public void addPlayer(String name, int points) {
		players.put(name,points);
	}

	public void display() {
		System.out.println("HashMap contains: "+players);
	}
	
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
		/*
		 * System.out.println(temp); System.out.println(players.containsValue(temp));
		 */
		
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
