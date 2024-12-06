import okhttp3.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;

public class Flightsearch {
    private static final String API_KEY =
            "wPHN17i5gTNgGoIdSnSPuZRntWQm1lMl";
    private static final String API_URL =
            "https://test.api.amadeus.com/v2/shopping/flight-offers";
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(API_URL).newBuilder();
        urlBuilder.addQueryParameter("originLocationCode", "JFK");
        urlBuilder.addQueryParameter("destinationLocationCode", "LAX");
        urlBuilder.addQueryParameter("departureDate", "2024-12-15");
        urlBuilder.addQueryParameter("adults", "1");

    }
