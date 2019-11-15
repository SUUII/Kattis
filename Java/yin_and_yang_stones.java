
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RERE
 */
public class yin_and_yang_stones {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String q = a.nextLine();

        int w = 0;
        int b = 0;
        char[] ea = q.toCharArray();
        for (int i = 0; i < q.length(); i++) {
            if (ea[i]=='W') {
                w++;
            } else if (ea[i]=='B') {
                b++;
            }
        }
        if (w == b) {
            System.out.println("1");
        }else System.out.println("0");
    }
}
