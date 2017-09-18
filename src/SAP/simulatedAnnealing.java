/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAP;

import java.util.Scanner;

/**
 *
 * @author fznrm
 */
public class simulatedAnnealing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        randomisasi rand = new randomisasi();
        iterasi iter = new iterasi();
        System.out.print("Masukkan batas minimal angka : ");
        double mini = scan.nextDouble() * -1;
        System.out.print("Masukkan batas maksimal angka : ");
        double maxi = scan.nextDouble();
        
        System.out.println("");
    }
}
