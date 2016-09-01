/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicai;

/**
 *
 * @author gusta
 */
public class Producto {
    
    private String nombre;
    private int precio, cantidad,ventas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
    public void mostrarNombre(){
        System.out.println("El nombre del producto: "+nombre);
    }
    public void mostrarCantidad(){
        System.out.println("Del producto "+nombre+" hay:"+cantidad+" en inventario");
    }
    public void mostrarPrecio(){
        System.out.println("El precio es: "+precio);
    }
    
    public void mostrarVentas(){
        System.out.println("Las ventas son: "+ventas);
    }
}
