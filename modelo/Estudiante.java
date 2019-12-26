package modelo;

import java.util.Scanner;

public class Estudiante  {

    private int codigo;
    private String nombre;
    private String apellido;

    Scanner read = new Scanner(System.in);
    String[][] estudiante = new String[6][4];
    String[] curso1 = new String[4];
    String[] curso2 = new String[4];
    String[] curso3 = new String[4];
    String[] curso4 = new String[4];
    String[] curso5 = new String[4];

    Curso cursos;

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }


    /**
     * metodo para crear un estudiante
     * @param nombre
     * @param apellido
     * @param codigo
     */
    public Estudiante(String nombre, String apellido, int codigo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;

        estudiante[0][0] = this.nombre;
        estudiante[0][1] = this.apellido;
        estudiante[0][2] = Integer.toString(this.codigo);

/*
        String resp;
        int cont = 0;
        do {
            System.out.println("********REGISTRAR CURSOS**********");
            cont++;
            if (cont == 1) {
                getCurso1();
                System.out.println("llevas registrados " + cont + " cursos");

            }
            if (cont == 2) {
                getCurso2();
                System.out.println("llevas registrados " + cont + " cursos");
            }
            if (cont == 3) {
                getCurso3();
                System.out.println("llevas asignados " + cont + " cursos");
            }
            if (cont == 4) {
                getCurso4();
                System.out.println("llevas asignados " + cont + " cursos");
            }
            if (cont == 5) {
                getCurso5();
                System.out.println("llevas asignados " + cont + " cursos");
            }
            if (cont >= 6){
                System.out.println("has llegado el limite de cursos...");
                break;
            }

            System.out.println("Desea registra otro curso? ");
            resp = read.next();
        } while (resp.equals("si"));

 */


        String resp;
        do {

            System.out.println("********AGREGAR CURSOS**********");
            System.out.println("buscar curso....");
            String b = read.next();
            buscarCurso(b);
            asignarCurso(buscarCurso(b));

            System.out.println("Desea agregar otro curso? ");
            resp = read.next();

        } while (resp.equals("si"));


        for (String e1[]: estudiante) {
                for (String e2 : e1) {
                    if (e2 != null) {
                        System.out.println(e2);
                    }
                }
            }
    }

    public Curso buscarCurso(String codigo) {


        /*
        for (int i = 0; i < curso1.length; i++) {

            if (curso1[i].equals(codigo)) {
                System.out.println(curso1[1]);
                cursos = new Curso(Integer.parseInt(curso1[0]), curso1[1], Integer.parseInt(curso1[2]), curso1[3]);
                break;
            }
            if (curso2[i].equals(codigo)) {
                System.out.println(curso2[1]);
                cursos = new Curso(Integer.parseInt(curso2[0]), curso2[1], Integer.parseInt(curso2[2]), curso2[3]);
                break;
            }
            if (curso3[i] == codigo) {
                System.out.println(curso3[1]);
                cursos = new Curso(Integer.parseInt(curso3[0]), curso3[1], Integer.parseInt(curso3[2]), curso3[3]);
                break;
            }
            if (curso4[i] == codigo) {
                System.out.println(curso4[1]);
                cursos = new Curso(Integer.parseInt(curso4[0]), curso4[1], Integer.parseInt(curso4[2]), curso4[3]);
                break;
            }
            if (curso5[i] == codigo) {
                System.out.println(curso5[1]);
                cursos = new Curso(Integer.parseInt(curso4[0]), curso4[1], Integer.parseInt(curso4[2]), curso4[3]);
                break;
            }
            else {
                System.out.println("el curso que estas buscando no existe.");
                break;
            }
        }

         */


            if (codigo.equals("1")) {
                getCurso1();
                cursos = new Curso(getCurso1().getCodigoCurso(), getCurso1().getNombreCurso(), getCurso1().getCreditos(), getCurso1().getDescripcion());
            }if (codigo.equals("2")) {
                getCurso2();
                cursos = new Curso(getCurso2().getCodigoCurso(), getCurso2().getNombreCurso(), getCurso2().getCreditos(), getCurso2().getDescripcion());
            }if (codigo.equals("3")) {
                getCurso3();
                cursos = new Curso(getCurso3().getCodigoCurso(), getCurso3().getNombreCurso(), getCurso3().getCreditos(), getCurso3().getDescripcion());
            }if (codigo.equals("4")) {
                getCurso4();
                cursos = new Curso(getCurso4().getCodigoCurso(), getCurso4().getNombreCurso(), getCurso4().getCreditos(), getCurso4().getDescripcion());
            }if (codigo.equals("5")) {
                getCurso5();
                cursos = new Curso(getCurso5().getCodigoCurso(), getCurso5().getNombreCurso(), getCurso5().getCreditos(), getCurso5().getDescripcion());
            }

            return cursos;
    }

    int cont = 0;
    public boolean asignarCurso(Curso curso) {

        /*
        if (curso != null) {

            String resp;
            int cont = 0;
            do {
                System.out.println("********AGREGAR CURSOS**********");
                cont++;
                if (cont == 1) {
                    System.out.println("buscar curso....");
                    String b = read.next();
                    buscarCurso(b);

                    curso1Estudiante[0] = Integer.toString(curso.getCodigoCurso());
                    curso1Estudiante[0] = curso.getNombreCurso();
                    curso1Estudiante[2] = Integer.toString(curso.getCreditos());
                    curso1Estudiante[0] = curso.getDescripcion();
                    asignarCurso(buscarCurso(b));
                    System.out.println("llevas asignados " + cont + " cursos");

                }
                if (cont == 2) {
                    curso2Estudiante[0] = Integer.toString(curso.getCodigoCurso());
                    curso2Estudiante[0] = curso.getNombreCurso();
                    curso2Estudiante[2] = Integer.toString(curso.getCreditos());
                    curso2Estudiante[0] = curso.getDescripcion();
                    System.out.println("llevas asignados " + cont + " cursos");
                }
                if (cont == 3) {
                    getCurso3();
                    System.out.println("llevas asignados " + cont + " cursos");
                }
                if (cont == 4) {
                    getCurso4();
                    System.out.println("llevas asignados " + cont + " cursos");
                }
                if (cont == 5) {
                    getCurso5();
                    System.out.println("llevas asignados " + cont + " cursos");
                }
                if (cont >= 6){
                    System.out.println("has llegado el limite de cursos para un estudiante...");
                }

                System.out.println("Desea agregar otro curso? ");
                resp = read.next();
            } while (resp.equals("si"));

            for (String e1 : estudiante) { System.out.println(e1); }
            for (String c1 : curso1Estudiante) { System.out.println(c1); }
            for (String c2 : curso2Estudiante) { System.out.println(c2); }
                return true;
        }

            return false;

         */


            cont++;
            if (cont == 1) {
                estudiante[1][0] = Integer.toString(curso.getCodigoCurso());
                estudiante[1][1] = curso.getNombreCurso();
                estudiante[1][2] = Integer.toString(curso.getCreditos());
                estudiante[1][3] = curso.getDescripcion();
                System.out.println("Se agrego " + cont + " curso");

            }if (cont == 2) {
                estudiante[2][0] = Integer.toString(curso.getCodigoCurso());
                estudiante[2][1] = curso.getNombreCurso();
                estudiante[2][2] = Integer.toString(curso.getCreditos());
                estudiante[2][3] = curso.getDescripcion();
                System.out.println("Se agrego " + cont + " curso");
            }if (cont == 3) {
                estudiante[3][0] = Integer.toString(curso.getCodigoCurso());
                estudiante[3][1] = curso.getNombreCurso();
                estudiante[3][2] = Integer.toString(curso.getCreditos());
                estudiante[3][3] = curso.getDescripcion();
                System.out.println("Se agrego " + cont + " curso");
            }if (cont == 4) {
                estudiante[4][0] = Integer.toString(curso.getCodigoCurso());
                estudiante[4][1] = curso.getNombreCurso();
                estudiante[4][2] = Integer.toString(curso.getCreditos());
                estudiante[4][3] = curso.getDescripcion();
                System.out.println("Se agrego " + cont + " curso");
            }if (cont == 5) {
                estudiante[5][0] = Integer.toString(curso.getCodigoCurso());
                estudiante[5][1] = curso.getNombreCurso();
                estudiante[5][2] = Integer.toString(curso.getCreditos());
                estudiante[5][3] = curso.getDescripcion();
                System.out.println("Se agrego " + cont + " curso");
            }if (cont >= 5) {
                System.out.println("excediste el numero de curso por estudiante");
            }


        return true;
    }

    public double cacularPromedio() {

        System.out.println("Ingrese la nota obtenida en el curso de " + cursos.getNombreCurso());
        double n = read.nextDouble();
        cursos.setNotas(n);
        return 1;
    }

    public Curso getCurso1() {

        /*
        System.out.println("************** REGISTAR CURSO ************");
        System.out.println("Ingrese el codigo del curso:");
        int codigoCurso = read.nextInt();
        System.out.println("ingrese el nombre del curso:");
        String nombreCurso = read.next();
        System.out.println("Ingrese en numero de creditos del curso:");
        int creditos = read.nextInt();
        System.out.println("ingrese la descripcion del curso:");
        String descripcion = read.next();

        cursos = new Curso(codigoCurso, nombreCurso, creditos, descripcion);

        curso1[0] = Integer.toString(cursos.getCodigoCurso());
        curso1[1] = cursos.getNombreCurso();
        curso1[2] = Integer.toString(cursos.getCreditos());
        curso1[3] = cursos.getDescripcion();
         */

        int cod = 1;
        String nom = "programacion";
        int cre = 2;
        String des = "POO";
        cursos = new Curso(cod, nom, cre, des);

        return cursos;
    }

    public Curso getCurso2() {

        /*
            System.out.println("************** REGISTAR CURSO ************");
            System.out.println("Ingrese el codigo del curso:");
            int codigoCurso = read.nextInt();
            System.out.println("ingrese el nombre del curso:");
            String nombreCurso = read.next();
            System.out.println("Ingrese en numero de creditos del curso:");
            int creditos = read.nextInt();
            System.out.println("ingrese la descripcion del curso:");
            String descripcion = read.next();

            cursos = new Curso(codigoCurso, nombreCurso, creditos, descripcion);

            curso2[0] = Integer.toString(cursos.getCodigoCurso());
            curso2[1] = cursos.getNombreCurso();
            curso2[2] = Integer.toString(cursos.getCreditos());
            curso2[3] = cursos.getDescripcion();

         */
        int cod = 2;
        String nom = "ciencias";
        int cre = 2;
        String des = "POO";
        cursos = new Curso(cod, nom, cre, des);



        return cursos;
    }

    public Curso getCurso3() {

        /*
        System.out.println("************** REGISTAR CURSO ************");
        System.out.println("Ingrese el codigo del curso:");
        int codigoCurso = read.nextInt();
        System.out.println("ingrese el nombre del curso:");
        String nombreCurso = read.next();
        System.out.println("Ingrese en numero de creditos del curso:");
        int creditos = read.nextInt();
        System.out.println("ingrese la descripcion del curso:");
        String descripcion = read.next();

        cursos = new Curso(codigoCurso, nombreCurso, creditos, descripcion);

        curso3[0] = Integer.toString(cursos.getCodigoCurso());
        curso3[2] = cursos.getNombreCurso();
        curso3[3] = Integer.toString(cursos.getCreditos());

         */
        int cod = 3;
        String nom = "matematicas";
        int cre = 2;
        String des = "POO";
        cursos = new Curso(cod, nom, cre, des);


        return cursos;
    }

    public Curso getCurso4() {

        /*
        System.out.println("************** REGISTAR CURSO ************");
        System.out.println("Ingrese el codigo del curso:");
        int codigoCurso = read.nextInt();
        System.out.println("ingrese el nombre del curso:");
        String nombreCurso = read.next();
        System.out.println("Ingrese en numero de creditos del curso:");
        int creditos = read.nextInt();
        System.out.println("ingrese la descripcion del curso:");
        String descripcion = read.next();

        cursos = new Curso(codigoCurso, nombreCurso, creditos, descripcion);

        curso4[0] = Integer.toString(cursos.getCodigoCurso());
        curso4[2] = cursos.getNombreCurso();
        curso4[3] = Integer.toString(cursos.getCreditos());

         */
        int cod = 4;
        String nom = "filosofia";
        int cre = 2;
        String des = "POO";
        cursos = new Curso(cod, nom, cre, des);


        return cursos;
    }

    public Curso getCurso5() {

        /*
        System.out.println("************** REGISTAR CURSO ************");
        System.out.println("Ingrese el codigo del curso:");
        int codigoCurso = read.nextInt();
        System.out.println("ingrese el nombre del curso:");
        String nombreCurso = read.next();
        System.out.println("Ingrese en numero de creditos del curso:");
        int creditos = read.nextInt();
        System.out.println("ingrese la descripcion del curso:");
        String descripcion = read.next();

        cursos = new Curso(codigoCurso, nombreCurso, creditos, descripcion);

        curso5[0] = Integer.toString(cursos.getCodigoCurso());
        curso5[2] = cursos.getNombreCurso();
        curso5[3] = Integer.toString(cursos.getCreditos());

         */
        int cod = 5;
        String nom = "español";
        int cre = 2;
        String des = "POO";
        cursos = new Curso(cod, nom, cre, des);


        return cursos;
    }


}
