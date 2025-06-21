Conversor de Moedas

Este projeto é um conversor de moedas simples, desenvolvido em Java, que permite aos usuários converter valores entre diferentes moedas e visualizar o histórico das conversões realizadas.

-Funcionalidades:

Conversão de Moedas: Converte valores entre as seguintes moedas:
Real Brasileiro (BRL) para Dólar Americano (USD)
Dólar Americano (USD) para Real Brasileiro (BRL)
Real Brasileiro (BRL) para Euro (EUR)
Euro (EUR) para Real Brasileiro (BRL)
Real Brasileiro (BRL) para Peso Argentino (ARS)
Peso Argentino (ARS) para Real Brasileiro (BRL)

-Taxas de Câmbio em Tempo Real:

Utiliza uma API externa (exchangerate-api.com) para obter as taxas de câmbio mais recentes.

-Histórico de Conversões:

Armazena e exibe todas as conversões realizadas durante a execução do programa, incluindo a data e hora da conversão.

-Interface de Usuário Simples:

Menu interativo via console para facilitar a navegação.

-Tecnologias Utilizadas:

Java: Linguagem de programação principal.
java.net.http (HttpClient): Para fazer requisições HTTP à API de taxas de câmbio.
Google Gson: Biblioteca para parsing de JSON, utilizada para processar as respostas da API.

-Como Compilar e Rodar:

Pré-requisitos:
Java Development Kit (JDK) 11 ou superior.
Biblioteca Gson (pode ser adicionada via Maven, Gradle ou baixando o JAR e adicionando ao classpath).

Configuração da API Key:

Este projeto utiliza a API Free da ExchangeRate-API. Para que o projeto funcione, você precisará de uma chave de API. A chave de API está atualmente incorporada no código.

Se esta chave de API atingir seu limite de requisições ou for invalidada, você precisará obter uma nova em exchangerate-api.com e substituir a string no código.

-Passos para Rodar

Clone o Repositório:
Bash
git clone https://github.com/seu-usuario/nome-do-seu-repositorio.git
cd nome-do-seu-repositorio

Adicione a Biblioteca Gson:
Se você estiver usando um ambiente de desenvolvimento como IntelliJ IDEA ou Eclipse, adicione o JAR do Gson ao seu projeto. Se estiver compilando via linha de comando, certifique-se de que o JAR do Gson esteja no seu classpath. Você pode baixar o JAR aqui: Gson Releases

Exemplo de compilação via linha de comando (assumindo que gson-2.10.1.jar está na pasta lib):

Bash
javac -cp lib/gson-2.10.1.jar src/*.java

Execute o Programa:

Bash
java -cp ".:lib/gson-2.10.1.jar" Principal

No Windows, use ; ao invés de : 

para o classpath
java -cp ".;lib/gson-2.10.1.jar" Principal

Ou, se você estiver usando um IDE, basta rodar a classe Principal.

-Estrutura do Projeto

Principal.java:
Contém a lógica principal do programa, o menu de interação com o usuário e o fluxo de chamadas para as outras classes.

Taxas.java: Responsável por obter as taxas de câmbio da API externa (exchangerate-api.com). Utiliza HttpClient para as requisições e Gson para parsear a resposta JSON.

Historico.java: Gerencia o registro e a exibição do histórico de conversões.

-Exemplo de Uso

Ao executar o programa, você verá o seguinte menu:

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

Escolha uma opção:

Você pode digitar o número da opção desejada para realizar uma conversão, exibir o histórico ou sair do programa.

Contribuindo

Contribuições são bem-vindas! Se você tiver alguma sugestão ou encontrar um bug, sinta-se à vontade para abrir uma issue ou enviar um pull request.

