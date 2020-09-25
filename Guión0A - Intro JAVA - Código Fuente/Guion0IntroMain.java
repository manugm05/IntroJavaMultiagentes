/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aalmgm.guion0introjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Guion0IntroMain {

    public static Alumno creaAlumno() {
        String dni_nuevo, nombre_nuevo, correo_nuevo;
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno: ");
        nombre_nuevo = cin.nextLine();
        System.out.println("Introduce el DNI del alumno: ");
        dni_nuevo = cin.nextLine();
        System.out.println("Introduce el correo electronico del alumno: ");
        correo_nuevo = cin.nextLine();
        Alumno nuevo = new Alumno(nombre_nuevo, dni_nuevo, correo_nuevo);
        return nuevo;
    }

    public static void main(String[] args) {
        Alumno nuevo = creaAlumno();
        System.out.println(nuevo);
        Alumno_IA test = new Alumno_IA(0, 1, "Alejando Arroyo", "12345678X", "cincodotcerosonseiscreditos@gmail.com");
        test.calcularNotaMedia();
        System.out.println(test);

        ArrayList<Alumno_IA> alumnos = new ArrayList();
        try {
            BufferedReader leer = new BufferedReader(new FileReader("datos.txt"));
            String linea = leer.readLine();

            while (linea != null) {
                String[] parametros = linea.split(",");
                alumnos.add(new Alumno_IA(0, 0, parametros[0], parametros[1], parametros[2]));
                linea = leer.readLine();
            }
            String paresout = new String();
            for (int i = 0; i < alumnos.size(); i++) {
                Alumno actual = alumnos.get(i);
                System.out.println(actual);
                String numeros = actual.getDni().substring(1, actual.getDni().length());
                int to_int = Integer.parseInt(numeros);
                if (to_int % 2 == 0) {
                    System.out.println("DNI PAR " + to_int);
                    paresout += actual.toString() + "\n";
                }
            }
            System.out.println(paresout);
            FileWriter ficherito = new FileWriter("pares.txt");

            BufferedWriter escribidor = new BufferedWriter(ficherito);

            escribidor.write(paresout);

            escribidor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("IOException producida");
        }
    }
}
