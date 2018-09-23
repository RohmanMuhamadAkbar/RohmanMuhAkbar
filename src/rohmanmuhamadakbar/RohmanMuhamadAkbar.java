/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rohmanmuhamadakbar;

import java.util.Scanner;

/**
 *
 * @author Diva
 */
public class RohmanMuhamadAkbar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n=5,x=5,umur;
        String nama="Rohman Muhammad Akbar";
        char Gender= 'L';
        Scanner input= new Scanner(System.in);

       
        System.out.print("masukan usia = ");
        umur = input.nextByte();
   
          boolean cantik = false;
         if(umur>23 && cantik==true){
           System.out.println("mau banget");
       }
         else if(umur>23 ){
           System.out.println("pikir dulu");
       }
       else {
           System.out.println("saya tidak mau");
       }
        
    
    
    }
    
}
