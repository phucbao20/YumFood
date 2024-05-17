
package UI;

import java.util.Scanner;


public class TestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();
        if (isNumeric(input)) {
            System.out.println("Chuỗi chỉ chứa ký tự số.");
        } else {
            System.out.println("Chi duoc nhap so!!");
        }
        scanner.close();
    }

    public static boolean isNumeric(String str) {
        // Kiểm tra xem chuỗi chỉ chứa ký tự số hay không
        return str.matches("\\d+");
    }
}
