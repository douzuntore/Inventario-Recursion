/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2tarea1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author samuelzun
 */
public class RecursionMenus {
    
    public static void numBinarioMenu() {
        int num;
        do {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número.", "", JOptionPane.PLAIN_MESSAGE));
                if (num >= 0) {break;} 
            } 
            catch (NumberFormatException e) {}
            catch (Exception e) {System.out.println(e);}
        } while (true);
        
        JOptionPane.showOptionDialog(
        null, 
        num+" en notación binaria es "+Recursion.numABinario(num)+".\n",
        "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
        null, 
        new String[]{"OK"}, 
        "OK"
        );
    }
    
    public static void MCDMenu() {
        int num1, num2;
        do {
            try {
                num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número.", "", JOptionPane.PLAIN_MESSAGE));
                if (num1 >= 0) {break;} 
            } 
            catch (NumberFormatException e) {}
            catch (Exception e) {System.out.println(e);}
        } while (true);
        do {
            try {
                num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número.", "", JOptionPane.PLAIN_MESSAGE));
                if (num1 >= 0) {break;} 
            } 
            catch (NumberFormatException e) {}
            catch (Exception e) {System.out.println(e);}
        } while (true);
        
        JOptionPane.showOptionDialog(
        null, 
        "El máximo común divisor de "+num1+" y "+num2+" es "+Recursion.MCD(num1, num2)+".\n",
        "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
        null, 
        new String[]{"OK"}, 
        "OK"
        );
    }
    
    public static void fibonacciMenu() {
        int num;
        do {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número.", "", JOptionPane.PLAIN_MESSAGE));
                if (num >= 0) {break;} 
            } 
            catch (NumberFormatException e) {}
            catch (Exception e) {System.out.println(e);}
        } while (true);
        
        String cuerpo = "";
        switch (
        JOptionPane.showOptionDialog(
                null, 
                ""
                        + "Deseas ver la el numero en esa posición de la serie Fibonacci, o la\n"
                        + "serie Fibonacci hasta ese número?",
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                null, 
                new String[]{"Serie","Posición"}, 
                "Serie"
        )    
        ) {
            case 0 -> {
                cuerpo = "Los primeros "+num+" números en la serie Fibonacci son:\n{";
                ArrayList<Integer> serie = Recursion.serieFibonacci(num);
                for (int i = 0; i < serie.size(); i++) {
                    if (i != serie.size()-1) {
                        cuerpo += serie.get(i)+", ";
                    } else {
                        cuerpo += serie.get(i)+"}\n";
                    }
                }
            }
            case 1 -> {
                cuerpo = "El numero en la posición "+num+" de la serie Fibonacci es "+Recursion.posEnSerieFibonacci(num)+".\n";
            }
        }
        
        JOptionPane.showOptionDialog(
        null, 
        cuerpo,
        "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
        null, 
        new String[]{"OK"}, 
        "OK"
        );
    }
    
    public static boolean busquedaBinariaMenu(int[] array) {
        String cuerpo = ""; 
        for (int i = 0; i < array.length; i++) {
            cuerpo += "["+array[i]+"]";
            if ((i+1)%5 == 0) {
                cuerpo += "\n";
            }
        }
        cuerpo += "Elige una opción.\n";
        switch (
        JOptionPane.showOptionDialog(
        null, 
        cuerpo,
        "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
        null, 
        new String[]{"Salir >>","Realizar búsqueda binaria","Generar nuevo array"}, 
        "OK"
        )
        ) {
            case 0 -> {
                return false;
            }
            case 1 -> {
                int num;
                do {
                    try {
                        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número", "", JOptionPane.PLAIN_MESSAGE));
                        if (num >= 0) {break;} 
                    } 
                    catch (NumberFormatException e) {}
                    catch (Exception e) {System.out.println(e);}
                } while (true);
                if (Recursion.binarySearch(num, array) == -1) {
                    cuerpo = "No se encontró el número.\n";
                } else {
                    cuerpo = "["+num+"] se encontró en la posición "+Recursion.binarySearch(num, array)+"!\n";
                }
                JOptionPane.showOptionDialog(
                null, 
                cuerpo,
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                null, 
                new String[]{"OK"}, 
                "OK"
                );
                return busquedaBinariaMenu(array);
            }
            case 2 -> {
                Random rng = new Random();
                for (int i = 0; i < array.length; i++) {
                    array[i] = rng.nextInt(100,1000);
                }
                Recursion.bubbleSort(array);
                return busquedaBinariaMenu(array);
            }
        }
        return true;
    }
    
}
