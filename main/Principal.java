package main;

import modelo.Estudiante;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Estudiante estu1;
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = read.next();
        System.out.println("Ingrese el apellido del estudiante:");
        String apellido = read.next();
        System.out.println("Ingrese el codigo que desea asignar al estudiante ");
        int codigo = read.nextInt();

        estu1 = new Estudiante(nombre, apellido, codigo);
    }

}
