/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author qoang
 */
public class testTryCatch {

    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < 10; i++) {
            try {
                s = (s + 1) / (i - 3);
            } catch (Exception e) {
                s = 0; // rollback giá tr? khi l?i
            }
        }
        System.out.println(s);
    }
}
