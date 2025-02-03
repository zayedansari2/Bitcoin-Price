import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BTCPrice {

    private static String coinURL = "https://api.coindesk.com/v1/bpi/currentprice.json";

    public static void GetPrice() throws Exception {
        String rate = "";
        String time = "";

        try {
            URL url = new URL(coinURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            // Parse the JSON response
            JSONParser jsonParser = new JSONParser();
            JSONObject myObject = (JSONObject) jsonParser.parse(br);

            // Navigate the JSON object to get the rate
            JSONObject bpi = (JSONObject) myObject.get("bpi");
            JSONObject usd = (JSONObject) bpi.get("USD");
            rate = (String) usd.get("rate");

            // Get the time
            JSONObject timeObject = (JSONObject) myObject.get("time");
            time = (String) timeObject.get("updated");

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex; // Rethrow the exception if necessary
        }

        System.out.println("Time Updated: " + time);
        System.out.println("Current Bitcoin Price: $" + rate);
        System.out.println("DISCLAIMER: This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org");
    }

    public static void main(String[] args) {
        try {
            GetPrice();
        } catch (Exception e) {
            System.out.println("Error retrieving Bitcoin price: " + e.getMessage());
        }
    }
}
