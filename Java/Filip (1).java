
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
    

        System.out.println(Math.max(Integer.parseInt(new StringBuilder(Integer.toString(a.nextInt())).reverse().toString()), Integer.parseInt(new StringBuilder(Integer.toString(a.nextInt())).reverse().toString())));
    }
}
