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

import java.util.Scanner;
import java.math.BigInteger;
class Main { // standard Java class name in UVa OJ
public static void main(String[] args) {
BigInteger fac = BigInteger.ONE;
for (int i = 2; i <= 25; i++)
fac = fac.multiply(BigInteger.valueOf(i)); // it is in the library!
System.out.println(fac);
} }

