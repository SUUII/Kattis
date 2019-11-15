
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rere
 */
public class death_knight_hero {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int total = 0;
        for (int i = 0; i < q; i++) {
            String w = a.next();
            if(!w.contains("CD")){
                total ++;
            }
        }
        System.out.println(total);
    }
 
}
