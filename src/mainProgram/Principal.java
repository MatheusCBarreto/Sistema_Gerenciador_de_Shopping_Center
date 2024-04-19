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

            switch (response) {
                case 1:

                    System.out.println("Qual o nome da sua loja? ");
                    String nomeLoja = input.next();

                    System.out.println("Quantos funcionários tem a sua loja? ");
                    int qtdFuncionariosLoja = input.nextInt();

                    System.out.println("Qual o salario base do seu funcionário? ");
                    int salarioBase = input.nextInt();

                    System.out.print("----------------------------------------------------");

                    System.out.print("Qual o endereço da sua loja? \n");
                    System.out.println("Nome da rua: ");
                    String enderecoNomeRua = input.nextLine();

                    System.out.print("Qual a cidade da sua loja? \n");
                    String enderecoCidade = input.nextLine();

                    System.out.print("Qual o Estado da sua loja? Ex.:[SP, RJ, ...] \n");
                    String enderecoEstado = input.next();

                    System.out.print("Qual o país da sua loja? \n");
                    String enderecoPais = input.nextLine();

                    System.out.print("Qual o CEP da sua loja? Ex.: 00000-000 \n");
                    String enderecoCep = input.next();

                    System.out.print("Qual o número da sua loja? \n");
                    String enderecoNumeroLoja = input.next();

                    System.out.print("Algum complemento? \n");
                    String enderecoComplemento = input.nextLine();

                    System.out.print("----------------------------------------------------");

                    System.out.println("Qual a data de fundação da sua loja? ");
                    System.out.println("Dia? \n");
                    int dataFundacaoDia = input.nextInt();

                    System.out.println("Número referente ao mês? Ex.: [1, 2, 3, 4, ...] \n");
                    int dataFundacaoMes = input.nextInt();

                    System.out.println("Ano? ");
                    int dataFundacaoAno = input.nextInt();

                    try {
                        Loja loja = new Loja(nomeLoja, qtdFuncionariosLoja, salarioBase,
                                new Endereco(enderecoNomeRua, enderecoCidade, enderecoEstado, enderecoPais, enderecoCep,
                                        enderecoNumeroLoja, enderecoComplemento),
                                new Data(dataFundacaoDia, dataFundacaoMes, dataFundacaoAno));

                        System.out.print("********** LOJA CRIADA COM SUCESSO! ************");

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

                    System.out.print("E a data de validade? \n");
                    System.out.println("Dia: ");
                    int diaValidadeProduto = input.nextInt();

                    System.out.println("Mês: ");
                    int mesValidadeProduto = input.nextInt();

                    System.out.println("Ano: ");
                    int anoValidadeProduto = input.nextInt();

                    try {
                        Produto produto = new Produto(nomeProduto, precoProduto,
                                new Data(diaValidadeProduto, mesValidadeProduto, anoValidadeProduto));

                        System.out.print("********** LOJA CRIADA COM SUCESSO! ***********");

                    } catch (Exception error) {
                        System.out.println(error + ": " + "Não foi possível cadastrar o produto. Tente novamente!");
                    }

                case 3:
                    response = 3;
                    break;
                default:
                    System.out.print("Opção inválida!");
                    break;
            }

        }

        input.close();
    }
}
