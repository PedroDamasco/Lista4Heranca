package Exercicio 01;
import java.util.ArrayList;
import java.util.Scanner;

public class MainEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarioList = new ArrayList<>();
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\nMenu:");
            System.out.println(" -> Criar Funcionário Precione 1");
            System.out.println(" -> Exibir Funcionários Precione 2");
            System.out.println(" -> Sair Precione 3");

            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner
            switch (opcao) {
                case 1:
                    System.out.println("Número do Cartão: ");
                    int nmCartao = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Setor: ");
                    String setor = sc.nextLine();

                    System.out.println("Função: ");
                    String funcao = sc.nextLine();

                    System.out.println("1 - Horista\n2 - Mensalista");
                    int opc2 = sc.nextInt();

                    if (opc2 == 1) {
                        System.out.println("Quantidade de Horas: ");
                        int qtdeHoras = sc.nextInt();
                        System.out.println("Valor da Hora: ");
                        double valorHora = sc.nextDouble();
                        FuncionarioHorista f1 = new FuncionarioHorista(nmCartao, nome, setor, funcao, qtdeHoras, valorHora);
                        funcionarioList.add(f1);
                    } else if (opc2 == 2) {
                        System.out.println("Salário: ");
                        double salario = sc.nextDouble();
                        FuncionarioMensalista f2 = new FuncionarioMensalista(nmCartao, nome, setor, funcao, salario);
                        funcionarioList.add(f2);
                    }
                    break;
                case 2:
                    System.out.println("1 - Horista\n2 - Mensalista");
                    int opc3 = sc.nextInt();

                    if (opc3 == 1) {
                        System.out.println("\nHoristas:");
                        for (Funcionario funcionario : funcionarioList) {
                            if (funcionario instanceof FuncionarioHorista) {
                                FuncionarioHorista horista = (FuncionarioHorista) funcionario;
                                System.out.println(horista.imprimir());
                            }
                        }
                    } else if (opc3 == 2) {
                        System.out.println("\nMensalistas:");
                        for (Funcionario funcionario : funcionarioList) {
                            if (funcionario instanceof FuncionarioMensalista) {
                                FuncionarioMensalista mensalista = (FuncionarioMensalista) funcionario;
                                System.out.println(mensalista.imprimir());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adeus");
                    break;
                default:
                    System.out.println("Erro tente novamente.");
                    break;
            }
        }
        sc.close();
    }
}
