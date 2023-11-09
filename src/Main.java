import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ladoCuadrado, areaCuadrado, perimetroCuadrado, anchoRectangulo, largoRectangulo, perimetroRectangulo, areaRectangulo, ladoTriangulo, altoTriangulo, perimetroTriangulo, areaTriangulo, radioCirculo, perimetroCirculo, areaCirculo;
        char opcion;
        int opcionNumero;
        opcionNumero = 1;



        System.out.println("\nBienvenid@, vamos a calcular el area y el perímetro de un cuadrado, un rectángulo, un triángulo equilátero o un círculo. ¡Tú eliges!");

        while (opcionNumero != 0){
            System.out.println("Debes escribir el número de la opción que quieras elegir: ");
            System.out.println("O Salir del programa.");
            System.out.println("1 Calcular el perímetro y el área de un cuadrado.");
            System.out.println("2 Calcular el perímetro y el area de un rectangulo.");
            System.out.println("3 Calcular el perímetro y el area de un triangulo.");
            System.out.println("4 Calcular el perímetro y el area de un circulo.");

            opcion = sc.next().toLowerCase().charAt(0);
            opcionNumero = Character.getNumericValue(opcion);
            switch (opcionNumero){
                case 0:
                    System.out.println("Gracias :) que te vaya bien");
                    break;
                case 1:
                    System.out.println("Para calcular el perímetro y el area del cuadrado necesito la longitud de su LADO en centímetros, SOLO debes escribir el número ;");
                    //Recogida de datos
                    ladoCuadrado = sc.nextDouble();

                    //Calculos
                    perimetroCuadrado = 4* ladoCuadrado;
                    areaCuadrado = ladoCuadrado * ladoCuadrado;

                    String redondeoPerimetroCu = String.format("%1.2f", perimetroCuadrado);
                    String redondeoAreaCu = String.format("%1.2f", areaCuadrado);

                    System.out.println("¡Lo tengo! El perímetro de tu cuadrado es " + redondeoPerimetroCu + "cm y el area es " + redondeoAreaCu + "cm² \nContinuemos: ");
                    break;
                case 2:
                    System.out.println("Para calcular el perímetro y el area del rectangulo necesito su ANCHO y su LARGO en centímetros, SOLO debes escribir el numero ;)");
                    //Recogida de datos
                    System.out.println("Ancho del rectangulo: ");
                    anchoRectangulo = sc.nextDouble();
                    System.out.println("Largo del rectangulo: ");
                    largoRectangulo = sc.nextDouble();

                    //Calculos
                    perimetroRectangulo = (2*anchoRectangulo) + (2*largoRectangulo);
                    areaRectangulo = anchoRectangulo * largoRectangulo;

                    String redondeoPerimetroR = String.format("%1.2f", perimetroRectangulo);
                    String redondeoAreaR = String.format("%1.2f", areaRectangulo);

                    System.out.println("¡Lo tengo! El perímetro de tu rectangulo es " + redondeoPerimetroR + "cm y el area es " + redondeoAreaR + "cm² \nContinuemos: ");
                    break;
                case 3:
                    System.out.println("Para calcular el perímetro y el area del triangulo necesito su LADO y su ALTURA en centímetros, SOLO debes escribir el numero ;)");
                    //Recogida de datos
                    System.out.println("Lado del triangulo: ");
                    ladoTriangulo = sc.nextDouble();
                    System.out.println("Alto del triangulo: ");
                    altoTriangulo = sc.nextDouble();

                    //Calculos
                    perimetroTriangulo = 3*ladoTriangulo;
                    areaTriangulo = (ladoTriangulo*altoTriangulo)/2;

                    String redondeoPerimetroT = String.format("%1.2f", perimetroTriangulo);
                    String redondeoAreaT = String.format("%1.2f", areaTriangulo);

                    System.out.println("¡Lo tengo! El perímetro de tu triangulo es " + redondeoPerimetroT + "cm y el area es " + redondeoAreaT + "cm² \nContinuemos: ");
                    break;
                case 4:
                    System.out.println("Para calcular el perímetro y el area del circulo necesito su RADIO en centímetros, SOLO debes escribir el numero ;)");
                    radioCirculo = sc.nextDouble();

                    //Calculos
                    perimetroCirculo = 2 * Math.PI * radioCirculo;
                    areaCirculo = Math.PI * radioCirculo * radioCirculo;

                    String redondeoPerimetroCi = String.format("%1.2f", perimetroCirculo);
                    String redondeoAreaCi = String.format("%1.2f", areaCirculo);





                    System.out.println("¡Lo tengo! El perímetro de tu circulo es " + redondeoPerimetroCi + "cm y el area es " + redondeoAreaCi + "cm² \nContinuemos: ");
                    break;
                default:
                    System.out.println("No has introducido un valor valido :( vuelve ha probar");

        sc.close();
            }
        }
    }
}