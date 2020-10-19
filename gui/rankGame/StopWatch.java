package gui_rankGame;

class StopWatch extends Thread {
	public String timeText;
	long time = 0l;
	long preTime = 0l;
	boolean play = true;
	boolean reset = false;
	String data = "0:0:00";

	// Thread Ŭ�����ȿ� �ִ� �޼���
	public void run() {
		// ����ð� �ʷκ�ȯ�� ��
		preTime = System.currentTimeMillis();
		while (play) {
			try {
				sleep(10);

				time = System.currentTimeMillis() - preTime;
				int m = (int) (time / 1000.0 / 60.0);
				int s = (int) (time % (1000.0 * 60) / 1000.0);
				int ms = (int) (time % 1000 / 10.0);
				System.out.println(m + " : " + s + " : " + ms);
				data = m + ":" + s + ":" + ms;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(reset){
			data = "0:0:00";
		}
	}
}
