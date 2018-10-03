import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double doC, doF;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do C ");
        doC = sc.nextDouble();
        doF = doC/5*9+32;
        System.out.println("Do F la: " + doF);

    }
}
