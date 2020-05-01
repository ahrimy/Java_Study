package java07_02;
class Test{
	int num;
	int size;
	char[] data;
}

public class ClassArray12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);	

		String[] temp = data.split("\n");
		int num = Integer.parseInt(temp[0]);
		Test[] t = new Test[num];
	
		for(int i=0;i<num;i++){
			t[i] = new Test();
			String[] info = temp[i+1].split("/");
			t[i].num = Integer.parseInt(info[0]);
			t[i].size = Integer.parseInt(info[1]);
			t[i].data = new char[t[i].size];
			for(int j=0;j<t[i].size;j++){
				t[i].data[j] = info[j+2].charAt(0);
			}
		}
		for(int i=0;i<num;i++){
			System.out.print("["+t[i].num+"]");
			for(int j=0;j<t[i].size;j++){
				System.out.print(t[i].data[j] + " ");
			}
			System.out.println();
		}


	}

}
