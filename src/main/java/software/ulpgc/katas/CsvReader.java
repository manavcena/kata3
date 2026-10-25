package software.ulpgc.katas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private int discarded = 0;

    public List<Book> read(InputStream stream) throws Exception{
        List<Book> books = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        reader.readLine();

        String line;
        while ((line = reader.readLine()) != null){
            String[] parts = line.split(",", -1);

            if (parts.length == 3 && !parts[0].isEmpty() && !parts[1].isEmpty() && !parts[2].isEmpty()){
                books.add(new Book(parts[0], parts[1], Integer.parseInt(parts[2])));
            }else{
                discarded++;
            }
        }
        reader.close();
        return books;
    }

    public int getDiscarded() {
        return discarded;
    }

}
