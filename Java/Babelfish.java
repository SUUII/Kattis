
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 672017066
 */
public class NewClass1 {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
         Map<String,String> tes = new HashMap<>();
         String line;
         while(!(line = a.nextLine()).isEmpty()){
             String[] bebek = line.split(" ");
             tes.put(bebek[1], bebek[0]);
         }
          while (a.hasNextLine()) {
            String p = a.nextLine();
           String hasil = tes.get(p);
              if (hasil == null) {
                  System.out.println("eh");
              }else{
                  System.out.println(hasil);
              }
        }
         
         
         
         
         
         
         
         
    }
 
}
