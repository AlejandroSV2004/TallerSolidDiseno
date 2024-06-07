/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallersolid;

/**
 *
 * @author aleja
 */
//notificacion deja de ser clase y se convierte en interfaz
public interface Notificacion {
/*
    En la clase Notificación, se identifica una violación al principio Open/Close.
    Si se agrega otro tipo de notificación, el método notificar debería modificarse
    nuevamente para añadir a las condiciones el nuevo tipo.
    Solución: Convertir a interfaz a la clase Notificación. Crear nuevas clases de
    cada tipo de notificación independientemente que implementen la interfaz Notificación.
    */
     public abstract void notificar(Pago pago);
}
