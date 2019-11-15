
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
public class nasty_hacks {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        try {
            for (int i = 0; i < q; i++) {
                int w = a.nextInt();
                int hasil = a.nextInt() - a.nextInt();
                if (w < hasil) {
                    System.out.println("advertise");
                } else if (w > hasil) {
                    System.out.println("do not advertise");
                } else {
                    System.out.println("does not matter");
                }
            }
        } catch (Exception e) {
        }

    }

}
