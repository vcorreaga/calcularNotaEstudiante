import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaExamenParcial = 0, notaTaller = 0, notaFinal = 0, notaMateria = 0;
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingres el documento del estudiante: ");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrolo de Software\n2 - Diseño Gráfico\n3 - Gastronomia");
        String programa = sc.nextLine();
        switch(programa){
            case "1":
                System.out.println("Programa de Desarrollo de Software");
                System.out.println("Selecciona la materia:\n1- Logico de programacion\n2 - Metodologia Agiles\n3- Introduccion de programación");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de logica de programacion");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de logica: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de metodologias agiles");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de metodologias: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de Introducción");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de metodologias: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");
                        }
                        break;
                }
                break;
            case "2":
                System.out.println("Programa de diseño gráfico");
                System.out.println("Selecciona la materia:\n1- Tipografia\n2 - Iconografia\n3- Semantica");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de Tipografia");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de Diseño Grafico: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de Iconografia");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de Diseño Grafico: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de Semantica");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de Diseño Grafico: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");
                        }
                        break;
                }
                break;
            case  "3":
                System.out.println("Programa de Gastronomia");
                System.out.println("Selecciona la materia:\n1- Costos\n2 - Panadería dulce\n3- Cocina Internacional");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de Costos");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de Diseño Grafico: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de Panadería dulce");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de Diseño Grafico: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de Cocina Internacional");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + "Tiene la siguente nota en la materia de Diseño Grafico: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedó la materia");    
                    }
                        break;
        }
    }
}
}