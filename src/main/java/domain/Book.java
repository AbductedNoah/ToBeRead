package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private String title;
    private String author;
    private String rating;
    private String genre;
    private String wordCount;
    private String amazonLink;
    private String isbn;
}
