
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
public class paul_eigon {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        int e = a.nextInt();
        int total = (w+e)/q;
        if(total %2==0){
            System.out.println("paul");
        }else{
            System.out.println("opponent");
        }
    }
}
