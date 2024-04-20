package mainProgram;

import entities.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int response = 0;
        while (response != 3) {

            System.out.println("Olá, bem-vindo ao Shopping!");
            System.out.println("Escolha umas das opções a seguir: ");
            System.out.println("[1] Criar uma loja\n[2] Criar um produto\n[3] sair");
            response = input.nextInt();
            input.nextLine();
            switch (response) {
                case 1:

                    System.out.print("Qual o nome da sua loja? ");
                    String nomeLoja = input.nextLine();

                    System.out.print("Quantos funcionários tem a sua loja? ");
                    int qtdFuncionariosLoja = input.nextInt();
                    input.nextLine();
                    System.out.print("Qual o salario base do seu funcionário? ");
                    int salarioBase = input.nextInt();
                    input.nextLine();
                    System.out.println("----------------------------------------------------");

                    System.out.println("Qual o endereço da sua loja?");
                    System.out.println("Nome da rua: ");
                    String enderecoNomeRua = input.nextLine();

                    System.out.print("Qual a cidade da sua loja? ");
                    String enderecoCidade = input.nextLine();

                    System.out.print("Qual o Estado da sua loja? Ex.:[SP, RJ, ...] ");
                    String enderecoEstado = input.next();

                    System.out.print("Qual o país da sua loja? ");
                    String enderecoPais = input.next();

                    System.out.print("Qual o CEP da sua loja? Ex.: 00000-000 ");
                    String enderecoCep = input.next();

                    System.out.print("Qual o número da sua loja?: ");
                    String enderecoNumeroLoja = input.next();
                    input.nextLine();
                    System.out.print("Algum complemento: ");
                    String enderecoComplemento = input.nextLine();

                    System.out.println("----------------------------------------------------");

                    System.out.println("Qual a data de fundação da sua loja? ");
                    System.out.print("Dia? \n");
                    int dataFundacaoDia = input.nextInt();
                    input.nextLine();
                    System.out.print("Número referente ao mês? Ex.: [1, 2, 3, 4, ...] \n");
                    int dataFundacaoMes = input.nextInt();
                    input.nextLine();
                    System.out.print("Ano? ");
                    int dataFundacaoAno = input.nextInt();
                    input.nextLine();
                    try {
                        Loja loja = new Loja(nomeLoja, qtdFuncionariosLoja, salarioBase,
                                new Endereco(enderecoNomeRua, enderecoCidade, enderecoEstado, enderecoPais, enderecoCep,
                                        enderecoNumeroLoja, enderecoComplemento),
                                new Data(dataFundacaoDia, dataFundacaoMes, dataFundacaoAno));

                        System.out.print("********** LOJA CRIADA COM SUCESSO! ************ \n");
                        System.out.print("Informações da sua loja: \n");
                        System.out.print(loja + "\n\n");

                    } catch (Exception error) {
                        System.out.println(error + ": " + "Não foi possível cadastrar a loja. Tente novamente!");
                    }
                    break;

                case 2:

                    System.out.println("--------- Cadastro de produto-------------");
                    System.out.println("Nome do produto: ");
                    String nomeProduto = input.next();

                    System.out.println("Qual o preço do produto? ");
                    int precoProduto = input.nextInt();
                    input.nextLine();
                    System.out.print("E a data de validade? \n");
                    System.out.println("Dia: ");
                    int diaValidadeProduto = input.nextInt();
                    input.nextLine();

                    System.out.println("Mês: ");
                    int mesValidadeProduto = input.nextInt();
                    input.nextLine();
                    System.out.println("Ano: ");
                    int anoValidadeProduto = input.nextInt();
                    input.nextLine();
                    try {
                        Produto produto = new Produto(nomeProduto, precoProduto,
                                new Data(diaValidadeProduto, mesValidadeProduto, anoValidadeProduto));

                        System.out.print("********** PRODUTO CRIADO COM SUCESSO ******** \n\n");

                        boolean vencido = produto.estaVencido(new Data(diaValidadeProduto, mesValidadeProduto, anoValidadeProduto));
                        if(vencido) {
                            System.out.print("PRODUTO VENCIDO \n\n");
                        } else {
                            System.out.print("PRODUTO NÃO VENCIDO \n\n");
                        }

                    } catch (Exception error) {
                        System.out.println(error + ": " + "Não foi possível cadastrar o produto. Tente novamente!");
                    }
                    break;
                case 3:
                    response = 3;
                    System.out.print("Saindo...");
                    System.out.print("Até mais! :)");
                    break;
                default:
                    System.out.print("Opção inválida!");
                    break;
            }

        }

        input.close();
    }
}
