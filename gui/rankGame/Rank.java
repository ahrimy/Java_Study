package gui_rankGame;

public class Rank {
	static Rank intstance = new Rank();

	String name;
	String time;
	final int SIZE = 3;
	String[][] rank;
	
	private Rank() {
		
		rank = new String[SIZE][SIZE];
		rank[0][0] = "aaa";		rank[0][1] = "0:30:50";
		rank[1][0] = "bbb";		rank[1][1] = "0:40:50";
		rank[2][0] = "ccc";		rank[2][1] = "0:50:50";
	}
	
	public void setInfo(int log, String time) {
		name = FileManager.instance.userManager.get(log).getName();
		this.time = time;
		System.out.println("Name = " + name);
		System.out.println("time = " + time);
		if(rank[2][1].compareTo(time) > 0) {
			rank[2][0] = name;
			rank[2][1] = time;
		}
		sortRank();
	}
	
	public void sortRank() {
		for(int i=0; i<SIZE; i++) {
			for(int j=i; j<SIZE; j++) {
				if(rank[i][1].compareTo(rank[j][1]) > 0) {
					String tempId = rank[i][0];
					String tempTime = rank[i][1];
					
					rank[i][0] = rank[j][0];
					rank[i][1] = rank[j][1];
					
					rank[j][0] = tempId;
					rank[j][1] = tempTime;
				}
			}
		}
		
		for(int i=0; i<SIZE; i++) {
			System.out.println(rank[i][0] + " : " + rank[i][1]);
		}
	}
	
	
}
