package modelo;

import java.util.Scanner;

public class Estudiante {

    private int codigo;
    private String nombre;
    private String apellido;

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }



    public void estudiante(String nombre, String apellido, int codigo) {

        Scanner read = new Scanner(System.in);

        String[] estudiante = new String[3];

        System.out.println("Ingrese el nombre del estudiante:");
        this.nombre = read.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        this.apellido = read.nextLine();
        System.out.println("Ingrese el codigo que desea asignar al estudiante " + this.nombre);
        this.codigo = read.nextInt();

        for (int i = 0; i < estudiante.length; i++) {
            estudiante[0] = this.nombre;
            estudiante[1] = this.apellido;
            estudiante[2] = Integer.toString(this.codigo);
        }

        for (String n:
             estudiante) {
            System.out.println(n);
        }

    }

}
