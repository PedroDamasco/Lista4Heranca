package Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        List<imovel> imoveis = new ArrayList<>();

        while (opcao != 3) {
            System.out.println("\nMenu:");
            System.out.println(" -> Inserir Imovel ->1");
            System.out.println(" -> Exibir Imoveis ->2");
            System.out.println(" -> Sair ->3");
            System.out.print("Digite Aqui: ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("O imovel é novo ou velho?");
                    System.out.println("-> Novo -> 1");
                    System.out.println("-> velho ->2");
                    System.out.print("Digite Aqui: ");
                    int resp ;
                    resp = teclado.nextInt();

                    switch (resp) {
                        case 1 -> {
                            imovelNovo novo = new imovelNovo();
                            System.out.println("Digite o código do seu imovel: ");
                            novo.setCodigo(teclado.nextInt());
                            System.out.println("Digite o endereço do seu imovel: ");
                            novo.setEndereco(teclado.next());
                            System.out.println("Digite o valor do seu imovel: ");
                            novo.setValor(teclado.nextDouble());
                            System.out.println("Digite o valor adicional do seu imovel: ");
                            novo.setValorAdicional(teclado.nextDouble());
                            novo.calcularvalorImovel();
                            imoveis.add(novo);
                        }
                        case 2 -> {
                            ImovelVelho velho = new ImovelVelho();
                            System.out.println("Digite o código do seu imovel: ");
                            velho.setCodigo(teclado.nextInt());
                            System.out.println("Digite o endereço do seu imovel: ");
                            velho.setEndereco(teclado.next());
                            System.out.println("Digite o valor do seu imovel: ");
                            velho.setValor(teclado.nextDouble());
                            System.out.println("Digite o valor de desconto do seu imovel: ");
                            velho.setValorDesconto(teclado.nextDouble());
                            velho.calcularvalorImovel();
                            imoveis.add(velho);
                        }
                        default ->
                            System.out.println("Opção invalida, tente Novo ou Velho. ");
                    }
                }

                case 2 -> {
                    for (imovel imovel : imoveis) {
                        if( imovel instanceof imovelNovo){
                            System.out.println("\n - Imovel Novo ");
                            imovelNovo Novo = (imovelNovo) imovel;
                            System.out.println(Novo.imprimir());
                        }
                        if( imovel instanceof ImovelVelho){
                            sSystem.out.println("\n - Imovel Velho ");
                            ImovelVelho Velho = (ImovelVelho) imovel;
                            System.out.println(Velho.imprimir());
                        }
                    }
                }

                case 3 ->
                    System.out.println("Adeus");

                default ->
                    System.out.println("Opção inválida,tente novamente");
            }
        }

        teclado.close();
    }
}
