package software.ulpgc.katas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class JsonSerializer {
    public String generate(List<Book> books, Metadata meta){
        JsonResult result = new JsonResult(meta, books);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(result);
    }
}
