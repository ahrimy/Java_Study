package chapter01_04;

import java.util.HashMap;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hmap = new HashMap<>();
		
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		System.out.println(hmap.size()+" : "+hmap);
		System.out.println("/------------------------------");
		
		System.out.println(hmap.get("melon"));
		
		hmap.put("apple", 1234);
		System.out.println(hmap.size()+" : "+hmap);
		
		System.out.println(hmap.keySet());
		
		int sum = 0;
		for(String key : hmap.keySet()){
			System.out.println(hmap.get(key));
			sum+=hmap.get(key);
		}
		System.out.println("금액합계 : "+sum);
		
		hmap.remove("apple");
		System.out.println(hmap.size()+ " : "+hmap);
		
		hmap.clear();
		System.out.println(hmap.size()+ " : "+hmap);
		
	}

}
