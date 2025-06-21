import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Taxas {
    private static final Logger logger = Logger.getLogger(Taxas.class.getName());

    public double obterTaxaDeCambio(String moedaOrigem, String moedaDestino) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/9efa49a9f151df8c180c5356/latest/" + moedaOrigem;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

                String result = jsonObject.get("result").getAsString();
                String baseCode = jsonObject.get("base_code").getAsString();
                double taxaDeCambio = jsonObject.getAsJsonObject("conversion_rates").get(moedaDestino).getAsDouble();

                System.out.println("Resultado: " + result);
                System.out.println("Base: " + baseCode);
                System.out.println("Taxa de Câmbio de " + baseCode + " para " + moedaDestino + ": " + taxaDeCambio);

                return taxaDeCambio;
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Ocorreu um erro ao obter a taxa de câmbio", e);
        }
        return -1;
    }
}