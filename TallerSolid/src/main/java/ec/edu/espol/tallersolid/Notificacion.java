/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallersolid;

/**
 *
 * @author aleja
 */
public class Notificacion {
    private int tipoNotificacion;
    public void notificar(Pago pago){
        if(tipoNotificacion==1){
            //enviarEmail();
        }
        else{
            //enviarSMS();
        }
    }
}

