import java.util.Scanner;
public class Facroeial {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero a sacar factorial");
        int numero = teclado.nextInt();
        if(numero<0){
            System.out.println("El numero seleccionado es negativo, por lo tanto infactorizable");
        }else{
            int resultado = factorial(numero);
            System.out.println("El resultado de la factorizacion del numero seleccionado" + resultado);
        }
        teclado.close();
    }
}
