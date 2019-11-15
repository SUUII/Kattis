
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
public class autori {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String[] hehe = a.nextLine().split("-");
        for (String hehe1 : hehe) {
            char[] haha = hehe1.toCharArray();
            System.out.print(haha[0]);
        }
    }
}
