package Project_1.BookApp.MainCode;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.io.IOException;

public class MainBookSearch {
    static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the book you wanna read: ");
        var search = scanner.nextLine();

        var endereco = "https://openlibrary.org/search.json?q=" + search;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}