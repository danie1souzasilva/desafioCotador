import java.util.Scanner;

public class DesafioContadorDio {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o valor 1");
        int valor1 = entrada.nextInt();

        System.out.println("digite o valor 2");
        int valor2 = entrada.nextInt();
        int contarAte = valor1 - valor2;
        System.out.println("agora vamos contar até " + contarAte);
        

        for(int comecar = 1;comecar < contarAte ; comecar++){
            System.out.println("É " + comecar++);
        }
    }
}
