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
        String str;
        switch (
        JOptionPane.showOptionDialog(
                null, 
                "Elige el atributo que deseas editar",
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                null, 
                new String[]{"Precio","Año","Color","Marca","Modelo","Matrícula"}, 
                "Entrar al Inventario"
        )
        ) 
        {
            case 5 -> {
                do {
                    str = JOptionPane.showInputDialog(null, "Ingrese la matrícula del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
                    if (str == null) {} else if (str.trim().isEmpty()) {} else {
                        this.matricula = str;
                        break;
                    }
                } while (true);
            }
            case 4 -> {
                do {
                    str = JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
                    if (str == null) {} else if (str.trim().isEmpty()) {} else {
                        this.modelo = str;
                        break;
                    }
                } while (true);
            }
            case 3 -> {
                do {
                    str = JOptionPane.showInputDialog(null, "Ingrese la marca del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
                    if (str == null) {} else if (str.trim().isEmpty()) {} else {
                        this.marca = str;
                        break;
                    }
                } while (true);
            }
            case 2 -> {
                do {
                    str = JOptionPane.showInputDialog(null, "Ingrese el color del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
                    if (str == null) {} else if (str.trim().isEmpty()) {} else {
                        this.color = str;
                        break;
                    }
                } while (true);
            }
            case 1 -> {
                do {
                    try {
                        str = JOptionPane.showInputDialog(null, "Ingrese el año del vehículo.", "", JOptionPane.PLAIN_MESSAGE);
                        this.year = Integer.parseInt(str);
                        if (this.year >= 1000 && this.year <= 9999) {break;} 
                    } 
                    catch (NumberFormatException e) {}
                    catch (Exception e) {System.out.println(e);}
                } while (true);
            }
            case 0 -> {
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
        }
    }

    @Override
    public String toString() {
        String str = ""
                + "|-=-=-=-= "+this.modelo+", "+this.year+" =-=-=-=-|\n"
                + "| Matricula: "+this.matricula+"\n"
                + "| Modelo: "+this.modelo+"\n"
                + "| Marca: "+this.marca+"\n"
                + "| Color: "+this.color+"\n"
                + "| Año: "+this.year+"\n"
                + "| Precio: "+this.precio+" $\n"
                + "^\n";
        return str;
    }
    
}
