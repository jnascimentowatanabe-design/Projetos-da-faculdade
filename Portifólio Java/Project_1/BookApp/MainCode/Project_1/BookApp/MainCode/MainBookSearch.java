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
import Project_1.BookApp.Record.BookSearchResponse;
import Project_1.BookApp.Record.BookStatusRecord;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainBookSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the book you wanna read: ");
        var search = scanner.nextLine();

        var searchEncoded = URLEncoder.encode(search, StandardCharsets.UTF_8);

        var adress = "https://openlibrary.org/search.json?title=" + searchEncoded + "&fields=title,author_name,first_publish_year";

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(adress))
                    .header("User-Agent", "BookApp/1.0 (julionwatanabe@hotmail.com)")
                    .GET()
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();

            //-------------------------[AI - Assisted]--------------------------------

            BookSearchResponse result = gson.fromJson(json, BookSearchResponse.class);

            if (result.docs().isEmpty()) {
                System.out.println("NO BOOK WAS FOUND.");
            } else {
                BookStatusRecord myBook = result.docs().get(0);
                System.out.println(myBook);

                BookStatus myBook1 = new BookStatus(myBook);
                System.out.println(myBook1);
            }

            //----------------------------------------------------------------------------


        } catch (IllegalArgumentException | com.google.gson.JsonSyntaxException e) {
            System.out.println("Error, Inquiry regarding our services ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finished program");
        }
    }
}