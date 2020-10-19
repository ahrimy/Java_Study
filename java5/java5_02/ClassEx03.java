package java5_02;
class Ex03{
	int[] arr = {87,100,11,72,92};
}
public class ClassEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 e = new Ex03();
		int total = 0;
		int fourC = 0;
		int fourT = 0;
		int evenC = 0;
		
		for(int i=0;i<e.arr.length;i++){
			total+=e.arr[i];
			if(e.arr[i]%4==0){
				fourC+=1;
				fourT+=e.arr[i];
			}
			if(e.arr[i]%2==0){
				evenC+=1;
			}
		}
		
		System.out.println("total: "+total);
		System.out.println("4의배수 합: "+fourT);
		System.out.println("4의배수 개수: "+fourC);
		System.out.println("짝수 개수: "+evenC);
		
	}

}
