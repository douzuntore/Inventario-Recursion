/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progra2tarea1;

import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author samuelzun
 */
public class Progra2Tarea1 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rng = new Random();
    private static final Inventario inv = new Inventario();
    
    public static void main(String[] args) {
        
        while (menu()) {}
        
    }
    
    private static boolean menu() {
        switch (
        JOptionPane.showOptionDialog(
                null, 
                ""
                        + "Bienvenido al programa!\n"
                        + "|\n"
                        + "Haz click en <<Entrar al Inventario>> para acceder un CRUD de vehiculos.\n"
                        + "Haz click en <<Entrar a la Recursividad>> para acceder a distintas funciones hechas con recursion.\n\n", 
                "Menu principal", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                null, 
                new String[]{"Salir >>","Entrar al Inventario","Entrar a la Recursividad"}, 
                null
        )
        ) {

            case -1, 0 -> {
                System.out.println("Fin del programa");
                return false;
            }
            case 1 -> {
                while (inventarioMenu()) {}
            }
            case 2 -> {
                while (recursionMenu()) {}
            }
        }
        return true;
    }
    
    private static boolean inventarioMenu() {
        switch (
        JOptionPane.showOptionDialog(
                null, 
                ""
                        + "Bienvenido al Inventario!\n"
                        + "|\n"
                        + "Sientete en la libertad de poder editar tu inventario de vehiculos a tu gusto.\n"
                        + "No te preocupes! Al salir de este menú tu inventario quedará guardado.\n\n", 
                "Menu del Inventario", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                null, 
                new String[]{"Salir >>","Listar vehículos","Eliminar vehículo","Editar vehículo","Añadir vehículo"}, 
                null
        )
        ) {

            case -1, 0 -> {
                System.out.println("Fin del programa");
                return false;
            }
            case 1 -> {
                if (!inv.getCont().isEmpty()) {
                    inv.listarVehiculos();
                }
            }
            case 2 -> {
                if (!inv.getCont().isEmpty()) {
                    inv.removerVehiculo();
                }
            }
            case 3 -> {
                if (!inv.getCont().isEmpty()) {
                    inv.editarVehiculo();
                }
            }
            case 4 -> {
                inv.añadirVehiculo();
            }
        }
        return true;
    }
    
    private static boolean recursionMenu() {
        switch (
        JOptionPane.showOptionDialog(
                null, 
                ""
                        + "Bienvenido a la Recursion!\n"
                        + "|\n"
                        + "Dispones de ciertas funciones hechas con recursividad.\n"
                        + "Hay opciones de disponen de sub-menus, Diviertete!\n\n", 
                "Menu principal", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                null, 
                new String[]{"Salir >>","Busqueda Binaria","Fibonacci","MCD","Decimal a Binario"}, 
                "Entrar al Inventario"
        )
        ) {

            case 0 -> {
                return false;
            }
            case 1 -> {
                int[] array = new int[25];
                for (int i = 0; i < array.length; i++) {
                    array[i] = rng.nextInt(100,1000);
                }
                Recursion.bubbleSort(array);
                while (RecursionMenus.busquedaBinariaMenu(array)) {}
            }
            case 2 -> {
                RecursionMenus.fibonacciMenu();
            }
            case 3 -> {
                RecursionMenus.MCDMenu();
            }
            case 4 -> {
                RecursionMenus.numBinarioMenu();
            }
        }
        return true;
    }
    
}
