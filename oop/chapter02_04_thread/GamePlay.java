package chapter02_04_thread;
/*
 * 1) Thread 클래스 상속
 * 2) run 메서드를 작성한다.
 * 3) run 반복문을 만들어서 동작시킨다.
 */
class BGMPlay extends Thread {
	boolean play = true;

	@Override
	public void run() {

		while (play) {
			System.out.println("배경 음악이 연주되는중.....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BGMPlay bgmPlay = new BGMPlay();

		bgmPlay.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("신나게 게임을 하는 중.....");
			if (i == 8) {
				System.out.println("앗... 엄마다!!!");
				System.out.println("엄마가 오셔서 게임을 종료합니다. ㅜㅜ");

				bgmPlay.play = false;
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
