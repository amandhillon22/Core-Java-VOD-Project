
import com.vmm.JHTTPServer;
import java.io.IOException;
import java.util.Properties;


public class MyServer extends JHTTPServer
{

    public MyServer(int portno) throws Exception
    {
        super(portno); 
    }

    @Override
    public Response serve(String uri, String method, Properties header, Properties parms, Properties files) 
    {
       if(uri.equals("/"))
       {
           String ans= "welcome to my server";
           Response res= new Response(HTTP_OK, "text/plain", ans);
           return res;
       }
       
       else if(uri.equals("/one"))
       {
            String ans= "Random no is"+ Math.random();
           Response res= new Response(HTTP_OK, "text/plain", ans);
           return res;
       }
       else
       {
            String ans= "invalid URL";
           Response res= new Response(HTTP_OK, "text/plain", ans);
           return res;
       }
    
    }
    }
