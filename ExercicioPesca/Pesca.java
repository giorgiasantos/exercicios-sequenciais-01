package ExercicioPesca;

import java.util.Scanner;

public class Pesca {
    public static void main(String[] args){
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite a quantidade de peixe em quilos: ");
        double pesoDePeixes = entradaUsuario.nextDouble();

        if (pesoDePeixes > 50){
            double excedente = pesoDePeixes - 50;
            double multa = excedente * 4;
            System.out.println("Você vai pagar R$" + multa + " de multa.");
        } else {
            System.out.println("Você não pagará multa.");
        }

    }
}
