
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
public class what_does_the_fox_say_fail {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int ggwp = a.nextInt();
        String fasdasda = a.nextLine();
        ArrayList<String> ha = new ArrayList<>();
        for (int i = 0; i < ggwp; i++) {
            String ewq = a.nextLine();
            String[] gggg = ewq.split(" ");
            for (String gggg1 : gggg) {
                ha.add(gggg1);
            }
            String qwe = a.nextLine();
            while (!qwe.equals("what does the fox say?")) {
                String[] eq = qwe.split(" ");
                while (ha.contains(eq[2])) {
                    ha.remove(eq[2]);
                }
                qwe = a.nextLine();
            }
            ha.forEach((ha1) -> {
                System.out.print(ha1 + " ");

            });
            System.out.println("");
        ha.clear();
        }
        
    }
}
