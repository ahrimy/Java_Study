package gui00;
//gui 지원하는 클래스 awt(old), swing(new)==>J가 붙어있다

import javax.swing.JFrame;//frame 클래스

//consol==>콘솔==>글자만 출력
//gui==>윈도우 프로그래밍 ==>좌표, 이미지, 마우스, 키보드, 등등 거의 모든 자원을 활용한다.
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();//프레임 생성
		frame.setTitle("버튼");//제목설정
		frame.setSize(300,300);//크기 설정(x,y)
		frame.setLocation(100,200);//위치 설정(시작 위치 x,y)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 닫을 때 메모리 확실히 삭제
		frame.setVisible(true);//프레임 켜기
		
		
	}

}
