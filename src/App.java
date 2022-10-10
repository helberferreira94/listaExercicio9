import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça a temperatura em graus Fahrenheit, 
        //transforme e mostre a temperatura em graus Celsius.
        //C = 5 * ((F-32) / 9).         
        double temperaturaF;
        double temperaturaC;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        temperaturaF = teclado.nextDouble();
        teclado.close();
        // segundo passo: converter para celsius
        temperaturaC = 5 * (temperaturaF - 32) / 9;
        System.out.print("A temperatura em Celsius é:" + temperaturaC);


    }
}
