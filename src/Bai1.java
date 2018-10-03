import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ly, hoa, sinh;
        ly = sc.nextDouble();
        hoa = sc.nextDouble();
        sinh = sc.nextDouble();
        double trungbinh = (ly + hoa + sinh)/3;
        System.out.println("Diem trung binh " + trungbinh);
    }
}
