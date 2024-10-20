package edu.sdccd.cisc191.c.server;

import edu.sdccd.cisc191.c.common.Book;
import java.util.List;

public interface BookRepository {
    void saveBook(Book book);
    Book findBookByTitle(String title);
    List<Book> findAllBooks();
}
