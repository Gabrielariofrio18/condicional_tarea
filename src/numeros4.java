import java.util.Scanner;

public class numeros4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese tres numeros");
        int num_1 = teclado.nextInt();
        int num_2 = teclado.nextInt();
        int num_3 = teclado.nextInt();
        if (num_1*num_1 + (num_2*num_2) == num_3*num_3){
            System.out.println("Esas medidas pueden ser los lados de un triangulo rectangulo");
        }else
            System.out.println("No medidas no pueden ser lados de un triangulo rectangulo");
    }
}