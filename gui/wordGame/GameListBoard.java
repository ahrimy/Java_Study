package gui_wordGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
class Rect {
	int x;
	int y;
	int width;
	int height;
	int num;
	Color color;
	int back;
}
public class GameListBoard extends JPanel implements ActionListener{
	public Vector<Word> word_list = new Vector<>();
	public String[] answer_list = new String[GameBoard.que_max];
	public JLabel lable_num = new JLabel();
	public ResultBoard result;
	int num = 0;
	JLabel lable_eng = new JLabel();
	JLabel lable_kor = new JLabel();
	Rect[][] list = new Rect[3][GameBoard.que_max];
	int scoreCnt = 0;
	GameListBoard(){
		setLayout(null);
		getWord();
		
		for(int i=0;i<GameBoard.que_max;i++){
			list[0][i] = new Rect();
			list[0][i].width = 50;
			list[0][i].height = 50 ;
			list[0][i].x = 10;
			list[0][i].y = 10+(i*50);
			list[1][i] = new Rect();
			list[1][i].width = 90;
			list[1][i].height = 50;
			list[1][i].x = 60;
			list[1][i].y = 10+(i*50);
			list[2][i] = new Rect();
			list[2][i].width = 90;
			list[2][i].height = 50;
			list[2][i].x = 150;
			list[2][i].y = 10+(i*50);
			answer_list[i] = new String("");
		}
		

	}
	void getWord(){
		Random ran = new Random();
		int index[] = new int[GameBoard.que_max];
		for (int i=0;i<GameBoard.que_max;i++){
			boolean check = false;
			int num = ran.nextInt(FileManager.instance.wordManager.size());
			for(int j=0;j<i;j++){
				if(index[j]==num){
					check=true;
				}
			}
			if(check){
				i--;
			}else{
				index[i] = num;
			}
		}
		for(int i=0;i<GameBoard.que_max;i++){
			Word temp = FileManager.instance.wordManager.get(index[i]);
			word_list.add(temp);
			System.out.println(temp.eng+" "+temp.kor);
		}
	}
	public void insertAnswer(int index,String answer){
		answer_list[index-1] = answer;
	}
	public void check(){
		for(int i=0;i<GameBoard.que_max;i++){
			if(word_list.get(i).kor.equals(answer_list[i])){
				scoreCnt++;
			}
		}
		showScore();
	}
	void showScore() {
		result = new ResultBoard(this);
		result.setSize(230, 530);
		result.setBackground(Color.GREEN);
		result.setLocation(10, 10);
		add(result);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try{
			Thread.sleep(10);
			repaint();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<GameBoard.que_max;j++){
				g.drawRect(list[i][j].x, list[i][j].y, list[i][j].width, list[i][j].height);
				if(i==0){
					g.drawString(String.valueOf(j+1), list[i][j].x+20, list[i][j].y+20);
				}
				if(i==1){
					g.drawString(word_list.get(j).eng, list[i][j].x+20, list[i][j].y+20);
				}
				if(i==2){
					g.drawString(answer_list[j], list[i][j].x+20, list[i][j].y+20);
				}
			}
		}

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
