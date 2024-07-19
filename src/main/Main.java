package main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean exibir = true;

        String login = "ITALO10";
        String senha = "ADMIN";


        System.out.println("Login");
        String n = input.next();
        System.out.println("Senha");
        String s = input.next();

        n = n.toUpperCase();
        s = s.toUpperCase();



        while (exibir) {
            if (n.equals(login) && s.equals(senha)) {
                System.out.println("Login validado com sucesso!!");


                StringBuilder add = new StringBuilder();
                add.append("01 - adicionar itens: \n");
                add.append("02 - Tabuada: \n");
                add.append("03 - Numero de repetição: \n");
                add.append("04 - Inpar ou Par: \n");
                add.append("05 - Vai ser multado ou não: \n");
                add.append("06 - Pode beber bebidas alcoolicas: ");
                System.out.println(add);

                int pe = input.nextInt();
                switch (pe) {
                    case 1:
                        System.out.println("Aqui você pode adicionar qualquer coisa.");
                        int itens = 5;
                        String[] addlist = new String[itens];
                        for (int i = 0; i < itens; i++) {
                            System.out.println("Digite a suas entradas " + (i + 1));
                            addlist[i] = input.next();
                        }
                        for (int i = 0; i < itens; i++) {
                            System.out.println(addlist[i]);
                        }

                        break;
                    case 2:
                        System.out.println("Tabuador aqui");
                        System.out.println("Digite a tabuada que voce deseja do 1 ate o 10");
                        int tabu = input.nextInt();
                        switch (tabu) {
                            case 1:
                                int tabuada = 1;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "1 + " + i + " = " + (i + tabuada));
                                }
                                break;
                            case 2:
                                int tabuada2 = 2;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "2 + " + i + " = " + (i + tabuada2));
                                }
                                break;
                            case 3:
                                int tabuada3 = 3;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "3 + " + i + " = " + (i + tabuada3));
                                }
                                break;
                            case 4:
                                int tabuada4 = 4;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "4 + " + i + " = " + (i + tabuada4));
                                }
                                break;
                            case 5:
                                int tabuada5 = 5;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "5 + " + i + " = " + (i + tabuada5));
                                }
                                break;
                            case 6:
                                int tabuada6 = 6;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "6 + " + i + " = " + (i + tabuada6));
                                }
                                break;
                            case 7:
                                int tabuada7 = 7;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "7 + " + i + " = " + (i + tabuada7));
                                }
                                break;
                            case 8:
                                int tabuada8 = 8;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "8 + " + i + " = " + (i + tabuada8));
                                }
                                break;
                            case 9:
                                int tabuada9 = 9;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "9 + " + i + " = " + (i + tabuada9));
                                }
                                break;
                            case 10:
                                int tabuada10 = 10;
                                for (int i = 1; i <= 10 ; i++) {
                                    System.out.println( "10 + " + i + " = " + (i + tabuada10));
                                }
                                break;
                            default:
                                System.out.println("Opção indisponievel");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Digite um numero de repetição");
                        System.out.println("EX: ele vai contar do numero que você escolheu ate o numero final, que você vai escolher tambem, EX: 1 ate o 10");
                        System.out.println("Digite o primeiro numero: ");
                        double num1 = input.nextInt();
                        System.out.println("Digite o segundo numero: ");
                        System.out.println("Esse numero vai ser onde vai parar o sistema no laço de repetição");
                        double num2 = input.nextInt();

                        for (num1 = num1; num1 <= num2; num1++) {
                            System.out.println(num1);
                        }

                        break;
                    case 4:
                        System.out.println("Aqui vamos ver se seu numero e impar ou par");
                        int inorpar = input.nextInt();
                        if (inorpar % 2 == 0) {
                            System.out.println("É Par");
                        } else {
                            System.out.println("É Inpar");
                        }
                        break;
                    case 5:
                        System.out.println("O Limite de velocidade é de 120km na rodoviaria!");
                        System.out.println("Digite a velocidade que você deseja, é descubra se vai ser multado ou não: ");
                        int velo = input.nextInt();
                        if (velo <= 120) {
                            System.out.println("Pode seguir sem sua multinha, pode prosseguir com seu caminho." );
                        } else {
                            System.out.println("Você foi mmultado, valor da multa é de R$680 Reais" );
                        }
                        System.out.println("Use cinto de segurança, é fique atento no volante");

                        break;
                    case 6:
                        System.out.println("Você so pode comprar bebidas acoolicas a cima de 18 anos, quantos anos você tem ? e descubra se pode beber ou não");
                        int age1 = input.nextInt();
                        if (age1 >= 18) {
                            System.out.println("Você pode beber, seu alcoolatra mirin.");
                        } else {
                            System.out.println("Você não pode beber ainda seu sem vergonha, vai beber mijo sem se");
                        }
                        break;
                }
            } else {
                System.out.println("Login negado.");
                exibir = false;

            }
            break;
        }
    }
}
