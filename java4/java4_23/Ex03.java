package java4_23;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		int[][] map = new int[5][5];
		boolean[][] check = new boolean[5][5];
		
		int x = 0;
		int y = 0;
		int num = 1;
		int dir = 1;		// 1(오른쪽) 2(하) 3(왼쪽) 4(상)
		
		map[y][x] = num;
		check[y][x] = true;
		
		for(int i=0;i<24;i++){
			int yy=y;
			int xx=x;
			
			if(dir==1){
				xx+=1;
			}else if(dir==2){
				yy+=1;
			}else if(dir==3){
				xx-=1;
			}else if(dir==4){
				yy-=1;
			}
			if(size<=xx||xx<0||size<=yy||yy<0||check[yy][xx]==true){
				dir+=1;
				yy=y;
				xx=x;
				
				if(dir==5){
					dir=1;
				}
				if(dir==1){
					xx+=1;
				}else if(dir==2){
					yy+=1;
				}else if(dir==3){
					xx-=1;
				}else if(dir==4){
					yy-=1;
				}
			}
			num = num+1;
			y=yy;
			x=xx;
			
			map[y][x] = num;
			check[y][x] = true;
			
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(check[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();


	}

}
