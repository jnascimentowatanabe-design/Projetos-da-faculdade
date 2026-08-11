import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        // ----Asking for input brazilian CEP -----

            //PRINT INFORMATION EXPOSED
        System.out.println("Welcome to Brazilian localization search!" +
                "\n Please, inform your CEP for find the place:  ");

            //OBJECT
        Scanner scanner = new Scanner(System.in);


            //LOGIC PROCESS
        var cep = scanner.nextLine();
        if(!ApiProcess.verificationCep(cep)) {
            return;
        }
        var url = "https://viacep.com.br/ws/" + cep + "/json/";



            //GSON
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

                //TRY-CATCH
        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            ApiProcess adress = gson.fromJson(json, ApiProcess.class);
            System.out.println(adress);

        } catch (IllegalArgumentException e){
            System.out.println("An Error: " + e.getMessage());
        }
    }
}
