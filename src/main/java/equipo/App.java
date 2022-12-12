package equipo;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;


import com.google.gson.Gson;


public class App {

    public static Gson gson = new Gson();
    private static Map<String, Administrador> adm = new HashMap<>();

    public static void main(String[] args) {
      

        port(80);
        options("/*", (request, response) -> {
               
                return "OK";
            });
            
      

    }
}
