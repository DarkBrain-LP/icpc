/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc.acpc.lebanesecpc;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO
 */
public class arabic {
    
    public static void main(String[] args){
        int n = 0;
        int ewp = 0; // englishWordPosition
        boolean hasEnglishWord = false;
        String word ;
        String ret = "";
        
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        
        for(int u = 0; u < k; u++){
            n = sc.nextInt();sc.nextLine();
            word = sc.nextLine();
            ret = "";
            ewp = 0;

            String[] split = word.split("\\s");
            //System.out.println("split = " + split.length);
            for(int i = 0; i < split.length; i++){
                //    System.out.println("i = " + i);
                    if(Pattern.compile("[a-z]").matcher(split[i]).find()){
                        hasEnglishWord = true;
                        System.out.println("has found an ew at position i = " + i + " in " + word);
                        break;
                    }
                    ewp ++;
            }

            if(hasEnglishWord == false){
                System.out.println("no ew word = " +  word);
                System.out.println(word);
            }
            else{
                System.out.println("has found ew");
                try{
                    for(int i = ewp + 1; i < split.length; i ++)
                        ret += split[i] + " ";
                    ret += split[ewp] + " ";
                    for(int i = 0; i < ewp; i++)
                        ret += split[i] + " ";
                } catch(ArrayIndexOutOfBoundsException e){
                    e.printStackTrace(); 
                }
                System.out.println(ret);
            }
        }
    }
    
}
