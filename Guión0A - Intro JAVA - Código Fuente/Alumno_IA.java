/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aalmgm.guion0introjava;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Alumno_IA extends Alumno {

    private float notaPracticas;
    private int grupoPracticas;

    public Alumno_IA() {
        super();
        notaPracticas = -1;
        grupoPracticas = -1;
    }

    public Alumno_IA(float notaPracticas, int grupoPracticas, String nombre, String dni, String correoElectronico) {
        super(nombre, dni, correoElectronico);
        this.notaPracticas = notaPracticas;
        this.grupoPracticas = grupoPracticas;
    }

    public int getGrupoPracticas() {
        return grupoPracticas;
    }

    public float getNotaPracticas() {
        return notaPracticas;
    }

    public void setGrupoPracticas(int grupoPracticas) {
        this.grupoPracticas = grupoPracticas;
    }

    public void setNotaPracticas(float notaPracticas) {
        this.notaPracticas = notaPracticas;
    }

    @Override
    public String toString() {
        return "Alumno_IA{" + super.toString() + "notaPracticas=" + notaPracticas + ", grupoPracticas=" + grupoPracticas + '}';
    }

    public void calcularNotaMedia() {
        float total = 0;
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce la nota de la practica " + i + ": ");
            total += cin.nextFloat();
        }
        System.out.println("La nota media del alumno con DNI " + this.getDni() + " es: " + total/4);
        notaPracticas = total/4;
    }

}
