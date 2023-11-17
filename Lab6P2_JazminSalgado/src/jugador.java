
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evaja
 */
public class jugador {
    private String nombre;
    private String correo;
    private String pais;
    private Date nacimiento;
    private int saldo;
    

    public jugador() {
    }

    public jugador(String nombre, String correo, String pais, Date nacimiento,int saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
        this.nacimiento = nacimiento;
        this.saldo=saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        Date limite=new Date("2011/12/31");
        try {
            if (nacimiento.after(limite)) {
                this.nacimiento = nacimiento;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Usuario debe ser mayor a 12 años");
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre ;
    }
    
    
}
