import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = leitor.nextDouble();
        double imc;
        imc = peso / (altura * altura);
        System.out.println("O IMC é:" + imc);

       
    }
}