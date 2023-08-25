package com.mycompany.numeroprimo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura Monsalve
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        int inputNumber= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));
        boolean isNonPrimeNumber = false;
        for (int index = 2; index <= inputNumber / 2; ++index) {
            // evaluate mod to determine if the input is nonprime number
            if (inputNumber % index == 0) {
             isNonPrimeNumber = true;
                break;
            }
          }

        if (!isNonPrimeNumber)
          JOptionPane.showMessageDialog(null, "El número ingresado es primo.");
        else
          JOptionPane.showMessageDialog(null, "El número ingresado NO es primo.");

    }
}
