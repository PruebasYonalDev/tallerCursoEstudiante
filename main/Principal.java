package main;

import modelo.Curso;
import modelo.Estudiante;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        Curso curso = new Curso();

        curso.curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
        //estu.estudiante(estu.getNombre(), estu.getApellido(),estu.getCodigo());

    }

}
