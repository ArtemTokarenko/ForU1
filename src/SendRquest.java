import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Ультрамар on 12.11.2016.
 */
public class SendRquest {

    public static InputStreamReader sendRequest1(String Town) throws Exception {
        String ELEVATION_API_URL = "https://maps.googleapis.com/maps/api/geocode/json?sensor=false&address=";
        String urlParameters = "locations=6.9366681,79.9393521&sensor=true";

        URL obj = new URL(ELEVATION_API_URL +Town+ "?" + urlParameters);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        //Geting responce
        InputStreamReader responce = new InputStreamReader(connection.getInputStream());
        return(responce);

    }
}
