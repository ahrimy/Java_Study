package java6_07;

import java.util.Random;

class ScoreMng{
	Random ran = new Random();
	
	int answer[] = {1,3,4,2,5};
	int myAnswer[] = new int[5];
	int score = 0;
	
	void makeAnswer(){
		for(int i=0;i<myAnswer.length;i++){
			myAnswer[i] = ran.nextInt(4)+1;
		}
	}
	void showAnswer(){
		for(int i=0;i<answer.length;i++){
			System.out.print(" "+answer[i]);
		}
		System.out.println();
		for(int i=0;i<myAnswer.length;i++){
			System.out.print(" "+myAnswer[i]);
		}
		System.out.println();
	}
	void checkAnswer(){
		score = 0;
		for(int i=0;i<answer.length;i++){
			if(answer[i]==myAnswer[i]){
			System.out.print(" O");
			score+=20;
			}else{
				System.out.print(" X");
			}
		}
		System.out.println();
		System.out.println(score);
	}
	void run(){
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
}
public class MethodEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreMng sm = new ScoreMng();
		sm.run();

	}

}
