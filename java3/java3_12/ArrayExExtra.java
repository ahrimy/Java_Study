package java3_12;

public class ArrayExExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1[] = { 1, 2, 3, 2, 1 };
		int test2[] = { 1, 3, 4, 4, 2 };
		int test3[] = { 1, 1, 1, 2, 1 };

		int check[][] = new int[3][5];

		for (int j = 0; j < 5; j++) {
			check[0][test1[j]]++;
			check[1][test2[j]]++;
			check[2][test3[j]]++;
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				System.out.print(check[i][j]+" ");
			}
			System.out.println();
		}
		int count = 5;
		for (int j = 0; j < 5; j++) {
			if(check[0][j]==1){
				for(int i=0;i<count;i++){
					if(test1[i]==j){
						count--;
						int temp[] = new int[count];
						for(int k=0;k<i;k++){
							temp[k] = test1[k];
						}
						for(int k=i;k<count;k++){
							temp[k]=test1[k+1];
						}
						test1 = temp;
						break;
					}
				}
			}
		}

		for (int j = 0; j < count; j++) {
			System.out.print(test1[j] +" ");
		}System.out.println();
		
		count = 5;
		for (int j = 0; j < 5; j++) {
			if(check[1][j]==1){
				for(int i=0;i<count;i++){
					if(test2[i]==j){
						count--;
						int temp[] = new int[count];
						for(int k=0;k<i;k++){
							temp[k] = test2[k];
						}
						for(int k=i;k<count;k++){
							temp[k]=test2[k+1];
						}
						test2 = temp;
						break;
					}
				}
			}
		}

		for (int j = 0; j < count; j++) {
			System.out.print(test2[j] +" ");
		}System.out.println();
		count = 5;
		for (int j = 0; j < 5; j++) {
			if(check[2][j]==1){
				for(int i=0;i<count;i++){
					if(test3[i]==j){
						count--;
						int temp[] = new int[count];
						for(int k=0;k<i;k++){
							temp[k] = test3[k];
						}
						for(int k=i;k<count;k++){
							temp[k]=test3[k+1];
						}
						test3 = temp;
						break;
					}
				}
			}
		}
		
		for (int j = 0; j < count; j++) {
			System.out.print(test3[j] +" ");
		}System.out.println();
	}

}
