
import java.util.ArrayList;
import java.util.HashMap;
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
public class odd_man_out {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();

        for (int i = 1; i <= q; i++) {
            int w = a.nextInt();

            ArrayList<Integer> aa = new ArrayList<>();
            ArrayList<Integer> bb = new ArrayList<>();
            int total = 0;

            for (int j = 0; j < w; j++) {
                int e = a.nextInt();
                if (!aa.contains(e)) {
                    aa.add(e);
                    total+=e;
                }else{
                    total -=e;
                }
            }
//            for (int k = 0; k < w; k++) {
//                if (!bb.contains(aa.get(k))) {
//                    bb.add(aa.get(k));
//                    total += aa.get(k);
//                } else {
//                    total -= aa.get(k);
//                }
//            }
            System.out.println("case #" + i + ": " + total);
        }
    }
}
