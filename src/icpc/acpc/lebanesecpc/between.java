/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc.acpc.lebanesecpc;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class between {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> mtn1 = new ArrayList<>();
        ArrayList<Integer> mtn2 = new ArrayList<>();
        ArrayList<Integer> mini = new ArrayList<>();
        int n = 0;
        int t = sc.nextInt();sc.nextLine();
        
        for(int i = 0; i < t; i++){
            String get1 = sc.nextLine(); sc.nextLine();
            String get2 = sc.nextLine(); //sc.nextLine();
            String[] uno = get1.split("\\s");
            String[] duo = get2.split("\\s");
            for(String elt : uno)  {System.out.println("elt1 = " + elt);} //mtn1.add(Integer.valueOf(elt));
            for(String elt : duo)  {System.out.println("elt2 = " + elt);} //mtn2.add(Integer.valueOf(elt));
            
            Collections.sort(mtn1); Collections.sort(mtn2);
            
            ArrayList<ArrayList<Integer>> both = new ArrayList();
            both.add(mtn1); both.add(mtn2);
            boolean lower = (mtn1.size() < mtn2.size()) ;
            both.add((mtn1.size() < mtn2.size())?mtn1:mtn2) ;
            both.add((mtn2.size() >= mtn1.size())?mtn2:mtn1) ;
            
            for(int j = 0 ; i < 1; j++){
                for(int k = 0; k < both.get(i).size(); k++){
                    mini.add(abs(both.get(i).get(k) - both.get(i+1).get(k)));
                }
            }
            
            System.out.println(Collections.min(mini));
        }
        /*
        int t = 0;
        t = sc.nextInt(); sc.nextLine();
        
        for(int i = 0; i < t; i++){
            String word1 = sc.nextLine(); //sc.nextLine();
            String word2 = sc.nextLine();
            
            String[] spt1 = word1.split("\\s");
            String[] spt2 = word2.split("\\s");
            
            try{
                for(String st : spt1)
                    System.out.println("st = " + (Integer.valueOf(st) + 100));
            } catch(NumberFormatException e){
                
            }
        }
        */
    }
}
