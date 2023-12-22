package org.example;


import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        boolean rodando = true;
        do {
            DecimalFormat df = new DecimalFormat("0.00");
            Scanner sc = new Scanner(System.in);
            int converterDe, converterPara;

            double valor;

            System.out.println("Bem Vindo");
            System.out.println("Converter de  ");
            System.out.println("1:USD (Dólar)\t 2:EUR (Euro)\t 3:BRL (Real)\t");
            converterDe = sc.nextInt();
            while (converterDe < 1 || converterDe > 3) {
                System.out.println("Selecione um número válido (1-3)");
                System.out.println("1:USD (Dólar)\t 2:EUR (Euro)\t 3:BRL (Real)");
                converterDe = sc.nextInt();
            }
            System.out.println("Converter para  ");
            System.out.println("1:USD (Dólar)\t 2:EUR (Euro)\t 3:BRL (Real)");
            converterPara = sc.nextInt();
            while (converterPara < 1 || converterPara > 3) {
                System.out.println("Selecione um número válido (1-3)");
                System.out.println("1:USD (Dólar)\t 2:EUR (Euro)\t 3:BRL (Real)");
                converterPara = sc.nextInt();
            }
            System.out.println("Valor para conversão");
            valor = sc.nextDouble();


            if (converterDe == 1 && converterPara == 1 || converterDe == 2 && converterPara == 2 || converterDe == 3 && converterPara == 3) {
                System.out.println("Resultado = " + valor);
            } else if (converterDe == 1 && converterPara == 2) {
                System.out.println("Resultado = " + valor * 0.9099);
            } else if (converterDe == 1 && converterPara == 3) {
                System.out.println("Resultado = " + valor * 4.8749);
            } else if (converterDe == 2 && converterPara == 1) {
                System.out.println("Resultado = " + valor * 1.0989);
            } else if (converterDe == 2 && converterPara == 3) {
                System.out.println("Resultado = " + valor * 5.357);
            } else if (converterDe == 3 && converterPara == 1) {
                System.out.println("Resultado = " + valor * 0.2051);
            } else if (converterDe == 3 && converterPara == 2) {
                System.out.println("Resultado = " + valor * 0.1866);
            }
            System.out.println("Gostaria de fazer mais algma conversão ?");
            System.out.println("1: Sim\t Qualquer outra tecla:Não");

            if(sc.nextInt() != 1 ){
                rodando =false;
            }
        } while(rodando);
    }


}


