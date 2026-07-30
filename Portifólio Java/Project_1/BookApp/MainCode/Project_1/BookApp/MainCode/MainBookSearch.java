package Project_1.BookApp.MainCode;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.io.IOException;

import Project_1.BookApp.ModelsOfBook.BookStatus;
import Project_1.BookApp.Record.BookStatusRecord;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainBookSearch {
    static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the book you wanna read: ");
        var search = scanner.nextLine();

        var searchEncoded = URLEncoder.encode(search, StandardCharsets.UTF_8);

        var endereco = "https://openlibrary-org.translate.goog/search.json?q=" + searchEncoded;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        BookStatusRecord myBook = gson.fromJson(json, BookStatusRecord.class);
        System.out.println(myBook);

        BookStatus myBook1 = new BookStatus(myBook);
        System.out.println(myBook1);
    }
}