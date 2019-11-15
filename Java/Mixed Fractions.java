
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
public class testing2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        while (q != 0 && w != 0) {
            System.out.println(q/w + " "+q%w+ " / "+w);
            
            q = a.nextInt();
            w = a.nextInt();
        }

    }
}
