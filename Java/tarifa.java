
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
public class tarifa {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        int tot = 0;
        for (int i = 0; i < w; i++) {
        int e = a.nextInt();
        tot +=(q-e);
        }
        System.out.println((tot+q));
    }
}
