import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doF;
        double doC;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Độ F sang độ C");
            System.out.println("2. Độ C sang độ F");
            System.out.println("0. Exit");
            System.out.println("mời nhập lựa chọn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F: ");
                    doF = input.nextDouble();
                    System.out.println("Độ F sang độ C là: " + fahrenheitToCelsius(doF));
                    break;
                }
                case 2:{
                    System.out.println("Nhập độ C: ");
                    doC = input.nextDouble();
                    System.out.println("Độ C sang độ F là: " + celsiusToFahrenheit(doC));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
