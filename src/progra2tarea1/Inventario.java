/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2tarea1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author samuelzun
 */
public class Inventario {
    
    private final ArrayList<Vehiculo> contenido = new ArrayList<Vehiculo>();

    public ArrayList<Vehiculo> getCont() {
        return contenido;
    }
    
    public Inventario() {
    }
    
    public void añadirVehiculo() {
        this.contenido.add(new Vehiculo());
    }
    
    public void editarVehiculo() {
        buscarVehiculoInd().editarVehiculo();
    }
    
    public void removerVehiculo() {
        this.contenido.remove(buscarVehiculoInd());
    }
    
    private Vehiculo buscarVehiculoInd() {
        String[] opciones = new String[this.contenido.size()];
        for (int i = 0; i < this.contenido.size(); i++) {
            opciones[opciones.length-1-i] = this.contenido.get(i).getModelo()+", "+this.contenido.get(i).getYear();
        }
        
        return this.contenido.get(
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
        opciones, 
        null
        )
        );
    }
    
}
