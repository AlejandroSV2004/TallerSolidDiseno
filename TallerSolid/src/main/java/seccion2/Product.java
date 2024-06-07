/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion2;

/**
 *
 * @author CltControl
 */
public abstract class Product {
    private String name;
    private double price;
    private String type;
    private double iva;
    public Product(String name, double price, String type, double iva) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.iva=iva;
    }
    public double calcularIva(){
        return price*iva;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }     
    public double getIva() {
        return iva;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", type=" + type + ", iva=" + iva + '}';
    }
 
}
