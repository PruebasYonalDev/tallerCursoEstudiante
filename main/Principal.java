package main;

import modelo.Estudiante;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();

        estu.estudiante(estu.getNombre(), estu.getApellido(),estu.getCodigo());

    }

}
