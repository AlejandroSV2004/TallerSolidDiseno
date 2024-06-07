/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion2;

import java.util.List;

/**
 *
 * @author vecto
 */
public class Notificacion {
    private List<Product> lProductos;
    
    public Notificacion(List<Product> lProductos){
        this.lProductos = lProductos;
    }
    
    public void sendReceipt(){
        System.out.println("Sending receipt by email...");
        //
    }
}
