package java4_09;
import java.util.Scanner;
public class StringEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 :");
		String word = scan.nextLine();
		
		char[] arr = new char[text.length()];
		for(int i=0;i<text.length();i++){
			arr[i] = text.charAt(i);
		}
		
		int check =0;
		int start = 0;
		int end = 0;
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
					start = i;
					end = i+word.length();
					break;
				}
			}
		}
		
		if(check==1){

			System.out.print("바꿀 단어입력 : ");
			String newWord = scan.nextLine();
			text = text.substring(0, start)+newWord+text.substring(end);
			System.out.println(text);
			
		}else{
			System.out.println("존재하지 않는 단어");
		}
	}

}
