
import java.awt.Color;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evaja
 */
public class carro {
    private String pais;
    private String marca;
    private String modelo;
    private Color color;
    private int precio;
    private ArrayList<parte_instalada> partesinstaladas = new ArrayList<>();

    public carro() {
    }

    public carro(String pais,String marca, String modelo, Color color, int precio) {
        this.pais=pais;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<parte_instalada> getMejoras() {
        return partesinstaladas;
    }

    public void setMejoras(ArrayList<parte_instalada> partesinstaladas) {
        this.partesinstaladas=partesinstaladas;
    }

    @Override
    public String toString() {
        return  "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", mejoras=" + partesinstaladas ;
    }
    
    
}
