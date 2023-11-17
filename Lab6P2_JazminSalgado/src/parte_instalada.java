/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evaja
 */
public class parte_instalada {
    private String marca;
    private String clasificacion;
    private double precio;

    public parte_instalada() {
    }

    public parte_instalada(String marca, String clasificacion, double precio) {
        this.marca = marca;
        this.clasificacion = clasificacion;
        this.precio = precio;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "marca=" + marca + ", clasificacion=" + clasificacion + ", precio=" + precio + '}';
    }
    
    
}
