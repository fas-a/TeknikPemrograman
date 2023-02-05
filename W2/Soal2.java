import java.util.*;
public class Soal2 {
    public void scanf() {
    }
	public static void main(String[] args) {
		String data[] = new String[3], dataangka[] = new String[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            data[i] = sc.nextLine();
		    dataangka[i] = data[i].split(" ")[1];
            data[i] = data[i].split(" ")[0];
        }
		sc.close();	
		System.out.println("================================");
        for(int i = 0; i < 3; i++){
            int panjangkata = data[i].length();
            System.out.print(data[i]);
            for(int j = 0; j < (15-panjangkata); j++) System.out.print(" ");
            if(dataangka[i].length() < 3) for(int j = 0; j < (3-dataangka[i].length()); j++) System.out.print("0");
            System.out.println(dataangka[i]);
        }
        System.out.println("================================");
	}
}