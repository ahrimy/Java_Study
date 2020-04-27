package java4_22;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameData = "";
		nameData += "100001/이만수";
		nameData += "\n";
		nameData += "100002/이영희";
		nameData += "\n";
		nameData += "100003/유재석";
		nameData += "\n";
		nameData += "100004/박명수";
		nameData += "\n";
		nameData += "100005/최여정";
		nameData += "\n";
		nameData += "100006/박병욱";

		String moneyData = "";
		moneyData += "100001/600";
		moneyData += "\n";
		moneyData += "100003/7000";
		moneyData += "\n";
		moneyData += "100001/100";
		moneyData += "\n";
		moneyData += "100002/400";
		moneyData += "\n";
		moneyData += "100001/600";
		moneyData += "\n";
		moneyData += "100004/900";
		moneyData += "\n";
		moneyData += "100001/130";
		moneyData += "\n";
		moneyData += "100003/200";
		moneyData += "\n";
		moneyData += "100002/700";
		moneyData += "\n";
		moneyData += "100002/900";
		moneyData += "\n";
		moneyData += "100004/800";

		String temp[] = moneyData.split("\n");
		String data[][] = new String[temp.length][3];
		for (int i = 0; i < temp.length; i++) {
			String[] info = temp[i].split("/");
			data[i][0] = info[0];
			data[i][2] = info[1];
		}
		temp = nameData.split("\n");
		for (int i = 0; i < temp.length; i++) {
			String[] info = temp[i].split("/");
			for (int j = 0; j < data.length; j++) {
				if (info[0].equals(data[j][0])) {
					data[j][1] = info[1];
				}
			}
		}
		String userData = "";
		for(int i=0;i<data.length;i++){
			userData+=data[i][0];
			userData+="/";
			userData+=data[i][1];
			userData+="/";
			userData+=data[i][2];
			userData+="\n";
		}
		System.out.println(userData);

	}

}
