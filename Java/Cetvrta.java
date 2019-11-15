
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
public class kattis {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        int e = a.nextInt();
        int r = a.nextInt();
        int t = a.nextInt();
        int y = a.nextInt();
        int z = 0;
        int x = 0;
        if(q==e){
            z = t;
        }else if(q==t){
            z = e;
        }else{
            z = q;
        }
        if(w==r){
            x = y;
        }else if(w==y){
            x = r;
        }else{
            x = w;
        }
        System.out.println(z+" "+x);
    }
}
