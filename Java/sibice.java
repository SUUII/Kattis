
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
public class sibice {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
int q = a.nextInt();
int w = a.nextInt();
int e = a.nextInt();

int samping = (int) Math.sqrt((w*w)+(e*e));
        for (int i = 0; i < q; i++) {
           int f = a.nextInt();
            if (f<=samping || f<=w || f<=e) {
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }

    }
}
