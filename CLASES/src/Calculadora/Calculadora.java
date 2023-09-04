/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author yofer
 */

public class Calculadora {
    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog("Selecciona una operación:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            if (opcion == null) {
                break; // El usuario cerró la ventana de diálogo
            }
            
            int choice = Integer.parseInt(opcion);
            
            if (choice < 1 || choice > 5) {
                JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, selecciona una opción válida.");
                continue;
            }
            
            double resultado = 0;
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));
            
            switch (choice) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                        continue;
                    }
                    resultado = num1 / num2;
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    System.exit(0);
            }
            
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }
}
