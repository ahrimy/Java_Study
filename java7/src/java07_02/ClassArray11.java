package java07_02;
class Student{
	String name;
	int score;
	void print(){
		System.out.println(name+" : "+score);
	}
}
public class ClassArray11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "3\n"; 
		data +="김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		System.out.println(data);
		String[] temp = data.split("\n");
		int num = Integer.parseInt(temp[0]);
		
		Student students[] = new Student[num];
		for(int i=0;i<num;i++){
			students[i] = new Student();
			String[] info = temp[i+1].split("/");
			students[i].name = info[0];
			students[i].score = Integer.parseInt(info[1]);
		}
		for(int i=0;i<num;i++){
			students[i].print();
		}
		System.out.println();
		int min =100;
		int minC = 0;
		for(int i=0;i<num;i++){
			if(students[i].score<min){
				min= students[i].score;
				minC = i;
			}
		}
		Student change[] = new Student[--num];
		for(int i=0;i<minC;i++){
			change[i] = students[i];
		}
		for(int i=minC;i<num;i++){
			change[i] = students[i+1];
		}
		students = change;
		for(int i=0;i<num;i++){
			students[i].print();
		}
		//Studentst[];
		//문제1)data에 있는 내용을 잘라서 st에 저장후 출력 
	
		//문제2)꼴등 삭제후 다시 data에 저장	
	}

}
