package score;

public class ScoreTest {

	public static void main(String[] args) {
		
		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(new ScoreVO("È«±æµ¿", 100, 100, 99));
		scoreList.addScore(new ScoreVO("ÀÓ²©Á¤", 88, 75, 91));
		scoreList.addScore(new ScoreVO("Àå±æ»ê", 65, 74, 69));
		scoreList.addScore(new ScoreVO("ÀÏÁö¸Å", 85, 78, 91));
		scoreList.addScore(new ScoreVO("ÀÌ¸ù·æ", 89, 58, 73));
		
		System.out.println(scoreList);
		
	}
	
}
