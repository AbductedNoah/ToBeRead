package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String first;
    private String last;
    private String firstLogin;
    private BookList bookList;
    private String email;
    private Date birthday;
    private Book favoriteBook;
}
