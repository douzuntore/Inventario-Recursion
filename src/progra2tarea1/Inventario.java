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
        buscarVehiculoInd(""
                + "Selecciona el vehículo que quieras editar."
                + "").editarVehiculo();
    }
    
    public void removerVehiculo() {
        this.contenido.remove(buscarVehiculoInd(""
                + "Selecciona el vehículo que quieras remover."
                + ""));
    }
    
    public void listarVehiculos() {
        String cuerpo = "";
        for (int i = 0; i < this.contenido.size(); i++) {
            cuerpo += this.contenido.get(i).toString();
            if ((i+1) % 3 == 0 || i == this.contenido.size()-1) {
                JOptionPane.showOptionDialog(
                null, 
                cuerpo,
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                null, 
                new String[]{"OK"}, 
                "OK"
                );
                cuerpo = "";
            }
        }
    }
    
    private Vehiculo buscarVehiculoInd(String cuerpo) {
        String[] opciones = new String[this.contenido.size()];
        for (int i = 0; i < this.contenido.size(); i++) {
            opciones[opciones.length-1-i] = this.contenido.get(i).getModelo()+", "+this.contenido.get(i).getYear();
        }
        
        return this.contenido.get(
        JOptionPane.showOptionDialog(
        null, 
        cuerpo, 
        "Menu del Inventario", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
        null, 
        opciones, 
        null
        )
        );
    }
    
}
