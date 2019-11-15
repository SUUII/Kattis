
import java.util.ArrayList;
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
public class no_duplicates {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<String> ha = new ArrayList<>();
        String hehe = a.nextLine();
        int tes = 0;
        String[] gg = hehe.split(" ");
        for (String gg1 : gg) {
            if (ha.contains(gg1)) {
                tes = 1;
            } else {
                ha.add(gg1);

            }
        }
        if (tes == 1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

}
