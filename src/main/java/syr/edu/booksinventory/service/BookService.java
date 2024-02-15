package syr.edu.booksinventory.service;

import syr.edu.booksinventory.model.Book;
import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public String buyBook(long id);
    public String sellBook(long id);
    public String addBook(String isbn, String title, String author, String yearPublished,
                          String edition, float price);
}
