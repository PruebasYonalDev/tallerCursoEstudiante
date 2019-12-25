package modelo;

import java.util.Scanner;

public class Curso {

    private int codigoCurso;
    private String nombreCurso;
    private String descricion;
    private int creditos;
    private double notas;

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getDescricion() {
        return descricion;
    }

    public int getCreditos() {
        return creditos;
    }

    public double getNotas() {
        return notas;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    /**
     * Metodo de registrar un curso
     * @param cod
     * @param nom
     * @param cred
     */
    public void curso(int cod, String nom, int cred) {

        Scanner read = new Scanner(System.in);

        String[] curso = new String[4];

        System.out.println("************** REGISTAR CURSO ************");
        System.out.println("Ingrese el codigo del curso:");
        this.codigoCurso = read.nextInt();
        System.out.println("ingrese el nombre del curso:");
        this.nombreCurso = read.next();
        System.out.println("Ingrese en numero de creditos del curso:");
        this.creditos = read.nextInt();
        System.out.println("ingrese la descripcion del curso:");
        this.descricion = read.next();

        for (int i = 0; i < curso.length; i++) {

            curso[0] = Integer.toString(this.codigoCurso);
            curso[1] = this.nombreCurso;
            curso[2] = Integer.toString(this.creditos);
            curso[3] = this.descricion;

        }

        for (String cursos: curso ) {
            System.out.println(cursos);
        }

    }

}
