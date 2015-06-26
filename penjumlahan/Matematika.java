/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjumlahan;

/**
 *
 * @author debi
 */
public class Matematika {
int c=0; 
        void Pertambahan (int a,int b) {
            c=a+b;
            System.out.println("Pertambahan : "+a+" + "+b+" = "+c);
        }
        void Pengurangan (int a,int b) {
            c=a-b;
            System.out.println("Pengurangan : "+a+" - "+b+"  = "+c);
        }
        void Perkalian (int a,int b) {
            c=a*b;
            System.out.println("Perkalian   : "+a+" X "+b+" = "+c);
        }
        void Pembagian (int a,int b) {
            c=a/b;
            System.out.println("Pembagian   : "+a+" / "+b+"  = "+c);
        }    
}
