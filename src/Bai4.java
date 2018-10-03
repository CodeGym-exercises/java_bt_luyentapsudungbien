import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int namsinh, tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao nam sinh ");
        namsinh = sc.nextInt();
        tuoi = 2018 - namsinh;
        System.out.println("Tuoi la: " + tuoi);
    }
}
