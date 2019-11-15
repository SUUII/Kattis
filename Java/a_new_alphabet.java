
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
public class a_new_alphabet {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
    String qwe = a.nextLine();
    char[] hehe = qwe.toCharArray();
        for (int i = 0; i < hehe.length; i++) {
            if (hehe[i]=='a'||hehe[i]=='A') {
                System.out.print("@");
            } else if (hehe[i]=='b'||hehe[i]=='B') {
                System.out.print("8");
            } else if (hehe[i]=='c'||hehe[i]=='C') {
                System.out.print("(");
            } else if (hehe[i]=='d'||hehe[i]=='D') {
                System.out.print("|)");
            } else if (hehe[i]=='e'||hehe[i]=='E') {
                System.out.print("3");
            } else if (hehe[i]=='f'||hehe[i]=='F') {
                System.out.print("#");
            } else if (hehe[i]=='g'||hehe[i]=='G') {
                System.out.print("6");
            } else if (hehe[i]=='h'||hehe[i]=='H') {
                System.out.print("[-]");
            } else if (hehe[i]=='i'||hehe[i]=='I') {
                System.out.print("|");
            } else if (hehe[i]=='j'||hehe[i]=='J') {
                System.out.print("_|");
            } else if (hehe[i]=='k'||hehe[i]=='K') {
                System.out.print("|<");
            } else if (hehe[i]=='l'||hehe[i]=='L') {
                System.out.print("1");
            } else if (hehe[i]=='m'||hehe[i]=='M') {
                System.out.print("[]\\/[]");
            } else if (hehe[i]=='n'||hehe[i]=='N') {
                System.out.print("[]\\[]");
            } else if (hehe[i]=='o'||hehe[i]=='O') {
                System.out.print("0");
            } else if (hehe[i]=='p'||hehe[i]=='P') {
                System.out.print("|D");
            } else if (hehe[i]=='q'||hehe[i]=='Q') {
                System.out.print("(,)");
            } else if (hehe[i]=='r'||hehe[i]=='R') {
                System.out.print("|Z");
            } else if (hehe[i]=='s'||hehe[i]=='S') {
                System.out.print("$");
            } else if (hehe[i]=='t'||hehe[i]=='T') {
                System.out.print("']['");
            } else if (hehe[i]=='u'||hehe[i]=='U') {
                System.out.print("|_|");
            } else if (hehe[i]=='v'||hehe[i]=='V') {
                System.out.print("\\/");
            } else if (hehe[i]=='w'||hehe[i]=='W') {
                System.out.print("\\/\\/");
            } else if (hehe[i]=='x'||hehe[i]=='X') {
                System.out.print("}{");
            } else if (hehe[i]=='y'||hehe[i]=='Y') {
                System.out.print("`/");
            } else if (hehe[i]=='z'||hehe[i]=='Z') {
                System.out.print("2");
            }else{
                System.out.print(hehe[i]);
            }
        }
            }
}
