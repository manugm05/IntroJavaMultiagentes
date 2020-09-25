/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aalmgm.guion0introjava;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Alumno {

    private String nombre;
    private String dni;
    private String correoElectronico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Alumno() {
        nombre = "AlumnoGenerico";
        dni = "00000000X";
        correoElectronico = "alumnogenerico@correoinexistente.com";
    }

    public Alumno(String nombre, String dni, String correoElectronico) {
        this.nombre = nombre;
        this.dni = dni;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", correoElectronico=" + correoElectronico + '}';
    }

}
