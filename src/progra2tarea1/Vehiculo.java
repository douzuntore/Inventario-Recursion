/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2tarea1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author samuelzun
 */
public class Vehiculo {
    
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int year;
    private double precio;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Vehiculo() {
        String str;
        do {
            str = JOptionPane.showInputDialog(null, "Ingrese la matrícula del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
            if (str == null) {} else if (str.trim().isEmpty()) {} else {
                this.matricula = str;
                break;
            }
        } while (true);
        do {
            str = JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
            if (str == null) {} else if (str.trim().isEmpty()) {} else {
                this.modelo = str;
                break;
            }
        } while (true);
        
        do {
            str = JOptionPane.showInputDialog(null, "Ingrese la marca del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
            if (str == null) {} else if (str.trim().isEmpty()) {} else {
                this.marca = str;
                break;
            }
        } while (true);
        
        do {
            str = JOptionPane.showInputDialog(null, "Ingrese el color del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
            if (str == null) {} else if (str.trim().isEmpty()) {} else {
                this.color = str;
                break;
            }
        } while (true);
        
        do {
            try {
                str = JOptionPane.showInputDialog(null, "Ingrese el año del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
                this.year = Integer.parseInt(str);
                if (this.year >= 1000 && this.year <= 9999) {break;} 
            } 
            catch (NumberFormatException e) {}
            catch (Exception e) {System.out.println(e);}
        } while (true);
        
        do {
            try {
                str = JOptionPane.showInputDialog(null, "Ingrese el precio del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
                this.precio = Double.parseDouble(str);
                if (this.precio > 0) {break;} 
            } 
            catch (NumberFormatException e) {}
            catch (Exception e) {System.out.println(e);}
        } while (true);
    }
    
    public void editarVehiculo() {
        String str; Scanner sc = new Scanner(System.in);
        
        boolean continuar = true; do {

            System.out.printf(""
                    + "Escribir nombre del atributo a editar.%n"
                    + "- Matricula%n"
                    + "- Marca%n"
                    + "- Modelo%n"
                    + "- Color%n"
                    + "- Año%n"
                    + "- Precio%n"
                    + ">> ");
            str = sc.nextLine();
            switch (str.toLowerCase()) {
                case "año", "ano" -> {
                    do {
                        System.out.printf("Ingrese el nuevo año del vehículo.%n>> ");
                        try {
                            str = sc.nextLine();
                            this.year = Integer.parseInt(str);
                            if (this.year >= 1000 && this.year <= 9999) {break;} 
                        } 
                        catch (NumberFormatException e) {}
                        catch (Exception e) {System.out.println(e);}
                    } while (true);
                }
                case "precio" -> {
                    do {
                        System.out.printf("Ingrese el nuevo precio del vehículo.%n>> ");
                        try {
                            str = sc.nextLine();
                            this.precio = Double.parseDouble(str);
                            if (this.precio > 0) {break;} 
                        } 
                        catch (NumberFormatException e) {}
                        catch (Exception e) {System.out.println(e);}
                    } while (true);
                }
            }
        } while (continuar);
    }
    
    
    
}
