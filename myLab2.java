
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayoka
 */
public class myLab2 {
    public static void main(String [] args){
        
        char [] Alpha= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        System.out.println("Please enter the ciphertext to decode");
        Scanner Reader = new Scanner(System.in);
        
        String inp= Reader.next().toUpperCase();
        char [] c= new char[inp.length()];
        for(int i=0; i< inp.length(); i++){
            c[i]=inp.charAt(i);
        }  
        
        int num=1;
        
        while (num != 26){
        int fin=0;
        char [] k= new char[inp.length()];
        
        
        for(int j= 0; j< c.length; j++){
            for(int mm= 0; mm< Alpha.length; mm++){
                if(c[j] == Alpha[mm]){
                    
                    fin= (mm-num+26)%26;
                        
                }
                k[j]= Alpha[fin];
            }
        }
        System.out.print(num+ ". ");
        System.out.print(k);
        System.out.println();
        num ++;
        }
    }
}
