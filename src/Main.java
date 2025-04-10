import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingres el documento del estudiante: ");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrolo de Software\n2 - Diseño Gráfico\n3 - Gastronomia");
        String programa = sc.nextLine();
        switch(programa){
            case "1":
                System.out.println("Programa de Desarrollo de Software");
                System.out.println("Selecciona la materia:\n1- Logico de programacion\n2 - Meodologia Agiles\n3- Introduccion de programación");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de logica de programacion");
                        break;
                    case "2":
                        System.out.println("Nota de metodologias agiles");
                        break;
                    case "3":
                        System.out.println("Nota de Introducció");
                        break;
                }
                break;
            case "2":
                System.out.println("Programa de diseño gráfico");
                break;
            case  "3":
                System.out.println("Programa de Gastronomia");
                break;
        }
    }
}