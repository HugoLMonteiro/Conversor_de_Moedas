import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Historico {
    private final List<String> conversoes;

    public Historico() {
        this.conversoes = new ArrayList<>();
    }

    public void adicionarConversao(String moedaOrigem, String moedaDestino, double valorOrigem, double valorDestino) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHora = agora.format(formatter);

        String registro = String.format("%s: R$ %.2f -> %.2f %s (%s para %s)",
                dataHora, valorOrigem, valorDestino, moedaDestino, moedaOrigem, moedaDestino);
        conversoes.add(registro);
    }

    public void exibirHistorico() {
        System.out.println("Histórico de Conversões:");
        if (conversoes.isEmpty()) {
            System.out.println("Nenhuma conversão realizada.");
        } else {
            for (String conversao : conversoes) {
                System.out.println(conversao);
            }
        }
    }
}