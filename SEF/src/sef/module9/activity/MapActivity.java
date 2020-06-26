package sef.module9.activity;
//Needs to be completed

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sef.module9.sample.MapSample;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map map = new HashMap();
			map.put("1", new Date());
			map.put("2", "Elina");
			map.put("3", "Corgi");
			
			new MapActivity().print(map);

			
			//2 - Call print method to print the map passed as its parameter.
		
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
			Set keySet = map.keySet();
			
			//You can use an iterator to access keys
			System.out.println("*************************************");
			System.out.println("Key\tValue");
			Iterator it=keySet.iterator();
			while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+"\t"+map.get(key));
			}
			
			System.out.println("*************************************");
			
	}
	}

