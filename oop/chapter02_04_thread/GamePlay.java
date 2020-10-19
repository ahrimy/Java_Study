package chapter02_04_thread;
/*
 * 1) Thread Ŭ���� ���
 * 2) run �޼��带 �ۼ��Ѵ�.
 * 3) run �ݺ����� ���� ���۽�Ų��.
 */
class BGMPlay extends Thread {
	boolean play = true;

	@Override
	public void run() {

		while (play) {
			System.out.println("��� ������ ���ֵǴ���.....");
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
			System.out.println("�ų��� ������ �ϴ� ��.....");
			if (i == 8) {
				System.out.println("��... ������!!!");
				System.out.println("������ ���ż� ������ �����մϴ�. �̤�");

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
