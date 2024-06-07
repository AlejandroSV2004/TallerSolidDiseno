/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallersolid;

import java.util.List;

/**
 *
 * @author aleja
 */
public class Compra {
    private Pago pago;
    private PagoPayPal pagoPayPal;
    private List articulos;
    

    public Compra(Pago pago){
        //inicializaciones
    }

// se elimina el método Compra que recibe un pago paypal
//    public Compra(PagoPayPal pagoPayPal){
//        //inicializaciones
//    }

    /*
    En la clase compra se identifica una violación al principio Dependency Inversion.
    En el método Compra se está llamando como atributo a una clase que nace de otra clase general,
    Pago es la clase que se divide en otros tipos de pagos como lo es PagoPaypal. 
    Solución: El atributo debe llamar a la interfaz Pago para que de ahí se
    llamen a los métodos necesarios a través de las instancias de cada subClase. 
*/
 
    public void agregarArticulo(Articulo articulo){
        //agregar un articulo a la compra
    }

    public void removerArticulo(Articulo articulo){
        //remover un articulo a la compra
    }
}


