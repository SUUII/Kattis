
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
public class quick_brown_fox {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        a.nextLine();
        for (int i = 0; i < q; i++) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            String w = a.nextLine().toLowerCase();
            for (char c : w.toCharArray()) {
                    alphabet = alphabet.replace(c, ' ');
            }
            alphabet = alphabet.replaceAll(" ", "");
            if(alphabet.isEmpty()){
                System.out.println("pangram");
            }else{
                System.out.println("missing "+alphabet);
            }
        }
    }
}
