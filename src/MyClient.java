
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import javax.swing.JOptionPane;


public class MyClient 
{
    public static String fetchIndex()
    {
        try
        {
        String url="http://localhost:9000/";
        HttpResponse<String> response= Unirest.get(url).asString();
        String ans = response.getBody();
        return ans;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            return ex.toString();

        }
    }
        
}
