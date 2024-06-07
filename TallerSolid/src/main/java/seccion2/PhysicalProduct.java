/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion2;

/**
 *
 * @author CltControl
 */
public class PhysicalProduct extends Product{
    
    private double weight;
    
    public PhysicalProduct(String name, double price, double weight,double iva){
        super(name,price,"fisico",iva);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }  
    
}
