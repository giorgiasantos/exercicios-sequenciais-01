package ExercicioImc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmoImc {
    public static void main(String[] args){
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite a sua altura em metros: ");
        double altura = entradaUsuario.nextDouble();
        System.out.println("Digite o seu peso em quilos: ");
        double peso = entradaUsuario.nextDouble();

        double imc = peso / (altura*altura);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.0");
        System.out.println("O seu IMC é " + decimalFormat.format(imc));

    }
}
