package java1_12;
import java.util.Scanner;
public class IfEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		int transMoney = 0;
		System.out.print("Account number:");
		int transAcc = scan.nextInt();
		if(transAcc==yourAcc){
			System.out.print("Transfer amount:");
			transMoney = scan.nextInt();
			if(transMoney>myMoney){
				System.out.println("Error:Balace is not enough");
			}else{
				System.out.println("Success");
				myMoney = myMoney-transMoney;
				yourMoney = yourMoney+transMoney;
				System.out.println("myMoney = " + myMoney + "¿ø");
				System.out.println("yourMoney = " + yourMoney + "¿ø");
			}

		}else{
			System.out.println("Error:Account number is not valid");
		}

	}

}
