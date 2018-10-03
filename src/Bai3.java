import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        double bankinh, dientich, chuvi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh ");
        bankinh = sc.nextDouble();
        dientich = Math.pow(bankinh,2)*3.14;
        chuvi = bankinh * 2*3.14;
        System.out.println("Dien tich la: " + dientich);
        System.out.println("Chu vi la: " + chuvi);
    }
}
