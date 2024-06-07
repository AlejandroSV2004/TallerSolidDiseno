/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallersolid;

/**
 *
 * @author aleja
 */
//EN ESTA CLASE SE VIOLA EL PRINCIPIO DE LISKOV YA QUE EN EL METODO REALIZAR COBRO SI EL USUARIO NO ESTA LOGGEADO
//EL METODO NO HACE NADA, CONTRARIO A LO ESTABLECIDO EN LA CLASE PADRE.
public class PagoPayPal extends Pago{
    private boolean loggedIn; //conexión a cuenta PayPal

    @Override
    public void realizarCobro(double monto){
        if (!loggedIn){
            //METODO RESPECTIVO PARA HACER LOG IN, LUEGO DE ESO EL METODO SE HABILITA Y SE COMPORTA IGUAL QUE EL PADRE
        }
        //cargar el monto de compra al medio de pago
    }
}

