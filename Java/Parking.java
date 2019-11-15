
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 672017066
 */
public class testing4 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
       
        int limit = -9999999;
        int limit2 = 9999999;
        for (int i = 0; i < x; i++) {
             int y = a.nextInt();
            for (int j = 0; j < y; j++) {
                int z = a.nextInt();
                if (z > limit) {
                    limit = z;
                }
                if (z < limit2) {
                    limit2 = z;
                }
            }
            int haha = (limit - limit2) * 2;
            System.out.println(haha);
            limit = -99999999;
            limit2 = 99999999;
        }
    }
}
