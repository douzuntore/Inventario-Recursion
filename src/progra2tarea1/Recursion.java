/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2tarea1;

import java.util.ArrayList;
/**
 *
 * @author samuelzun
 */
public class Recursion {
    
    public static String numABinario(int num) {
        return numABinario(num, "");
    }
    
    private static String numABinario(int num, String str) {
        str = num%2 + str;
        if (num < 2) {
            return str;
        } else {
            return numABinario(num/2, str);
        }
    }
    
    public static ArrayList<Integer> serieFibonacci(int limite) {
        return serieFibonacci(limite, new ArrayList());
    }
    
    public static int posEnSerieFibonacci(int limite) {
        return serieFibonacci(limite, new ArrayList<Integer>()).get(limite-1);
    }
    
    private static ArrayList<Integer> serieFibonacci(int limite, ArrayList<Integer> serie) {
        if (serie.size() <= 1) {
            serie.add(1);
        } else {
            serie.add(serie.get(serie.size()-1) + serie.get(serie.size()-2));
        }
        if (limite == serie.size()) {
            return serie;
        } else {
            return serieFibonacci(limite, serie);
        }
    }
    
    public static int[] bubbleSort(int[] arr) {
        return bubbleSort(0, arr);
    }
    
    private static int[] bubbleSort(int limite, int[] arr) {
        for (int i = 1; i < arr.length-limite; i++) {
            if (arr[i] < arr[i-1]) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        if (limite == arr.length-2) {
            return arr;
        } else {
            limite++;
            return bubbleSort(limite, arr);
        }
    }
    
    public static int binarySearch(int target, int[] arr) {
        return binarySearch(target, bubbleSort(arr), 0, arr.length-1);
    }
    
    private static int binarySearch(int target, int[] arr, int inicio, int fin) {
        int i = (inicio+fin)/2;
        if (inicio <= fin) {
            if (arr[i] == target) {
                return i;
            } else if (arr[i] < target) {
                inicio = i+1;
            } else {
                fin = i-1;
            }
            return binarySearch(target, arr, inicio, fin);
        } else {
            return -1;
        }
    }
    
    public static int MCD(int num1, int num2) {
        return MCD(num1, num2, 1, 0);
    }
    
    private static int MCD(int num1, int num2, int factor, int mcd) {
        if (factor > Math.min(num1, num2)) {
            return mcd;
        } else {
            if (num2 % factor == 0 && num1 % factor == 0) {
                mcd = factor;
            }
            factor++;
            return MCD(num1, num2, factor, mcd);
        }
    }
}
