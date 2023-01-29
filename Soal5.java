import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        String plat1, plat2, plat3, plat4, plat;
        long platcombine;

        Scanner sc = new Scanner(System.in);
        plat1 = sc.next();
        plat2 = sc.next();
        plat3 = sc.next();
        plat4 = sc.next();
        sc.close();
        plat = plat1 + plat2 + plat3 + plat4;
        platcombine = Long.parseLong(plat);
        platcombine = (platcombine - 999999);
        platcombine = platcombine % 5;
        if(platcombine == 0)System.out.println("berhenti");
        else System.out.println("jalan");
    }
}
