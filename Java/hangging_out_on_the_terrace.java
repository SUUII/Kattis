
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
public class hangging_out_on_the_terrace {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        int total = 0;
        int zonk = 0;
        for (int i = 0; i < w; i++) {
            String e = a.next();
            int r = a.nextInt();
            if(e.equals("enter")){
                if((total+r)>q){
                    zonk++;
                }else{
                    total +=r;
                }
            }else{
                total -=r;
            }
        }
        System.out.println(zonk);
    }
}
