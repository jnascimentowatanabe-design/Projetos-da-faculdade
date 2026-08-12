import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.List;




public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        // ----Asking for input brazilian CEP -----

            //PRINT INFORMATION EXPOSED
        System.out.println("*************Welcome to Brazilian localization search!**************");

            //OBJECT
        Scanner scanner = new Scanner(System.in);

            //LOGIC PROCESS
        var search = "";
        List<ApiProcess> adresses = new ArrayList<>();

        var cep = "";

                //GSON
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

                //TRY-CATCH
        while(!cep.equalsIgnoreCase("exit")) {
            System.out.println("Type a brazil localization number (Cep), or type exit to finish the execution: ");
            cep = scanner.nextLine();

            if (cep.equalsIgnoreCase("exit")){
                break;
            }

            if(!ApiProcess.verificationCep(cep)) {
                continue;
            }

            var url = "https://viacep.com.br/ws/" + cep + "/json/";

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

                adresses.add(adress);


            } catch (IllegalArgumentException e) {
                System.out.println("An Error: " + e.getMessage());
            }
        }
                //CREATING A FILE AND WRITING IN THERE
        File file = new File("historyOfLocations.json");
        FileWriter writer = new FileWriter(file);

        writer.write(gson.toJson(adresses));
        writer.close();

        System.out.println("Thank you for using the program ;)");
    }
}
