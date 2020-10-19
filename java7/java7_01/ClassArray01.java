package java7_01;
class Client{
	String name;
	int score;
	void set_data(String n, int s ){
		this.name = n; this.score = s;
	}
	void print_data(){
		System.out.println(this.name+" : "+this.score);
	}
}
public class ClassArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client [] st = new Client[3];
		for(int i=0;i<st.length;i++){
			st[i] = new Client();
		}
		st[0].set_data("±èÃ¶¼ö", 100);
		st[1].set_data("ÀÌ¸¸¼ö", 20);
		st[2].set_data("¹Ú¿µÈñ", 70);
		
		for(int i=0;i<st.length;i++){
			st[i].print_data();
		}
	}

}
