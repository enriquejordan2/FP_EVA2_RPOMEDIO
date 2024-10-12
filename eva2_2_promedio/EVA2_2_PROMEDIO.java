/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa, sumaCali;
        Scanner captu = new Scanner(System.in);

        sumaCali = 0;
        for(int i = 1; i <= 10; i++){
            
            System.out.println("Estudiante # " + i);
            System.out.println("Cual es tu califacion");
            califa = captu.nextInt();
            captu.nextLine();
            sumaCali = sumaCali + califa;
        }
        //Calcular promedio
        //Divusiones en Java --> 
        double promedio = sumaCali / 10.0;
        System.out.println("Promedio = "+ promedio);
    }
    
}
