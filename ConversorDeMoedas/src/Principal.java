import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Taxas taxas = new Taxas();
        Historico historico = new Historico();
        int opcao;

        do {
            System.out.println("""
                                --------------------------------------------------------------------------
                                                         
                                                          Digite a opção desejada:
                                                          
                                1 - Real  BRL              para             Dólar USD")
                                2 - Dólar USD              para             Real  BRL")
                                3 - Real  BRL              para             Euro  EUR")
                                4 - Euro  EUR              para             Real  BRL")
                                5 - Real  BRL              para             Peso  Argentino ARS")
                                6 - Peso  Argentino ARS    para             Real  BRL")
                                7 - Exibir Histórico de Conversões
                                8 - Sair
                                --------------------------------------------------------------------------
                                Escolha uma opção:""");
            opcao = scanner.nextInt();
            double valor;
            double resultado;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor em Reais: ");
                    valor = scanner.nextDouble();
                    resultado = valor * taxas.obterTaxaDeCambio("BRL", "USD");
                    System.out.printf("Valor em Dólares: %.2f\n", resultado);
                    historico.adicionarConversao("BRL", "USD", valor, resultado);
                    break;
                case 2:
                    System.out.print("Digite o valor em Dólares: ");
                    valor = scanner.nextDouble();
                    resultado = valor * taxas.obterTaxaDeCambio("USD", "BRL");
                    System.out.printf("Valor em Reais: %.2f\n", resultado);
                    historico.adicionarConversao("USD", "BRL", valor, resultado);
                    break;
                case 3:
                    System.out.print("Digite o valor em Reais: ");
                    valor = scanner.nextDouble();
                    resultado = valor * taxas.obterTaxaDeCambio("BRL", "EUR");
                    System.out.printf("Valor em Euros: %.2f\n", resultado);
                    historico.adicionarConversao("BRL", "EUR", valor, resultado);
                    break;
                case 4:
                    System.out.print("Digite o valor em Euros: ");
                    valor = scanner.nextDouble();
                    resultado = valor * taxas.obterTaxaDeCambio("EUR", "BRL");
                    System.out.printf("Valor em Reais: %.2f\n", resultado);
                    historico.adicionarConversao("EUR", "BRL", valor, resultado);
                    break;
                case 5:
                    System.out.print("Digite o valor em Reais: ");
                    valor = scanner.nextDouble();
                    resultado = valor * taxas.obterTaxaDeCambio("BRL", "ARS");
                    System.out.printf("Valor em Pesos Argentinos: %.2f\n", resultado);
                    historico.adicionarConversao("BRL", "ARS", valor, resultado);
                    break;
                case 6:
                    System.out.print("Digite o valor em Pesos Argentinos: ");
                    valor = scanner.nextDouble();
                    resultado = valor * taxas.obterTaxaDeCambio("ARS", "BRL");
                    System.out.printf("Valor em Reais: %.2f\n", resultado);
                    historico.adicionarConversao("ARS", "BRL", valor, resultado);
                    break;
                case 7:
                    historico.exibirHistorico();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 8);

        scanner.close();
    }
}