package software.ulpgc.katas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.List;

public class Main {
    static void main(String[] args) throws Exception {
        FileInputStream inputFile = new FileInputStream(new File("libros.csv"));

        CsvReader reader = new CsvReader();
        List<Book> validBooks = reader.read(inputFile);
        Metadata meta = new Metadata(validBooks.size(), reader.getDiscarded());

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.generate(validBooks, meta);
        System.out.println(json);
        FileWriter writer = new FileWriter("output.json");
        writer.write(json);
        writer.close();

    }
}
