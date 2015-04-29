/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Owner
 */
public class Factors {
    
    public void ft(long n) {
        long factor = n;
        //long factorNum = 1;
        while (factor!=0){
            if (n%factor ==0){
                System.out.println(factor);
            }
            factor--;
        }
    }
    
    public static void main(String[] args){
        Factors main = new Factors();
        main.ft(600851475143L);
    }
    
}
