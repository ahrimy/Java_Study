package java4_09;
import java.util.Scanner;
public class StringEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요: ");
		String word = scan.nextLine();
		
		char[] arr = new char[text.length()];
		for(int i=0;i<text.length();i++){
			arr[i] = text.charAt(i);
		}
		
		int check =0;
		for(int i=0;i<text.length()-word.length()+1;i++){
			if(arr[i]==word.charAt(0)){
				int count = 0;
				for(int j=0;j<word.length();j++){
					if(arr[i+j]==word.charAt(j)){
						count++;
					}
				}
				if(count == word.length()){
					check =1;
					break;
				}
			}
		}
		
		if(check==1){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}

}
