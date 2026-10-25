package software.ulpgc.katas;


import java.util.List;

public record JsonResult(Metadata summary, List<Book> data) {
}
