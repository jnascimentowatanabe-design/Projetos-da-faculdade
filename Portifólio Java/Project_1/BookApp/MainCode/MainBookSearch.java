package Project_1.BookApp.MainCode;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.io.IOException;

public class MainBookSearch {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o filme que queres assistir: ");
        var busca = leitura.nextLine();

        var endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=7c008b09";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(response.body());
    }
}