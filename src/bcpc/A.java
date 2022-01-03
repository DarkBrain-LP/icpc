/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcpc;

/**
 *
 * @author LENOVO
 */
public class A {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();sc.next();
        String miss = "";

        for(int i = 0; i < n; i++){
            String st = sc.nextLine().toLowerCase();
            for(char c = 'a'; c <= 'z'; c++){
                if(!st.contains(String.valueOf(c)))
                    miss += c;
            }
            if(miss == "")
                System.out.println("pangram");
            else
                System.out.println("missing " + miss);
            miss = "";
        }
    }
}
