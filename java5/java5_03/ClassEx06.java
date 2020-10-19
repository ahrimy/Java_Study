package java5_03;
import java.util.Random;

class Ex06{
	int[] answer = {1,3,4,2,5};
	int[] hgd = new int[5];
	
	int cnt = 0;
	int score = 0;
}
public class ClassEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Ex06 e = new Ex06();
		
		for(int i=0;i<e.hgd.length;i++){
			e.hgd[i] = ran.nextInt(5)+1;
			if(e.answer[i]==e.hgd[i]){
				System.out.print(" O");
				e.score+=20;
				e.cnt+=1;
			}else{
				System.out.print(" X");
			}
		}
		System.out.println();
		for(int i=0;i<e.hgd.length;i++){
			System.out.print(e.hgd[i]);
		}
		System.out.println();
		System.out.println("Score:"+e.score);
		
	}

}
