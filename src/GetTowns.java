import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ультрамар on 12.11.2016.
 */
public class GetTowns {

    public static ArrayList< String> read(String URL) throws IOException {

        File f=new File(URL);
        BufferedReader fin=new BufferedReader(new FileReader(f));
        String line;
        ArrayList<String> listOfTowns = new ArrayList<String>();
        while((line=fin.readLine())!=null)listOfTowns.add(line);
        return listOfTowns;
    }
}
