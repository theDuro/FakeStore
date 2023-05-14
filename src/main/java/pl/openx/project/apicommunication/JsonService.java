package pl.openx.project.apicommunication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import pl.openx.project.json.BigDecimalAdapter;
import pl.openx.project.json.LocalDateAdapter;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Scanner;

public abstract class JsonService{
    protected static Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateAdapter())
            .registerTypeAdapter(BigDecimal.class, new BigDecimalAdapter())
            .create();

    protected static String getJsonFromUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        Scanner scanner = new Scanner(url.openStream());
        return scanner.nextLine();
    }
}
