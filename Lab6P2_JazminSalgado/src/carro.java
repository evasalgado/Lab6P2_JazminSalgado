
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

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
    private Date año;
    private ArrayList<parte_instalada> partesinstaladas = new ArrayList<>();
    private String tipo;

    public carro() {
    }

    public carro(String pais,String marca, String modelo, Color color, int precio,Date año, String tipo) {
        this.setPais(pais);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.año=año;
        this.tipo=tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if (pais=="Japon"||pais=="Italia"||
                pais=="USA"||pais=="Alemania"
                ||pais=="Francia"||pais=="UK"||
                pais=="Sweden") {
            this.pais = pais;
        }
    }

    public ArrayList<parte_instalada> getPartesinstaladas() {
        return partesinstaladas;
    }

    public void setPartesinstaladas(ArrayList<parte_instalada> partesinstaladas) {
        this.partesinstaladas = partesinstaladas;
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

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }
    
    public void setMejoras(ArrayList<parte_instalada> partesinstaladas) {
        this.partesinstaladas=partesinstaladas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    @Override
    public String toString() {
        return  "\npais=" + pais + "\nmarca=" + marca + "\nmodelo=" + modelo + "\ncolor=" + color + "\nprecio=" + precio+"\n tipo"+tipo + "\npartes instaladas=" + partesinstaladas ;
    }

   
    
    
}
