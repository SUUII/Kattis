
import java.util.ArrayList;
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
public class ACM_Contest_scoring {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        ArrayList<String> salah = new ArrayList<>();
        int total = 0;
        int benar = 0;
        while (q != -1) {
            String w = a.next();
            String e = a.next();
            if (e.equals("right")) {
                benar++;
                total += q;
                while (salah.contains(w)) {
                    salah.remove(w);
                    total +=20;
                }
            }else{
               salah.add(w);
            }
            q = a.nextInt();
        }
        System.out.println(benar+" "+total);
    }
}
