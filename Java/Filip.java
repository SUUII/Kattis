
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
public class Filip {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        int e = Integer.parseInt(new StringBuilder(Integer.toString(q)).reverse().toString());
        int r = Integer.parseInt(new StringBuilder(Integer.toString(w)).reverse().toString());
        System.out.println(Math.max(e, r));
    }
}
