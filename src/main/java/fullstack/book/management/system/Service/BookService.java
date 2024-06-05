package fullstack.book.management.system.Service;

import fullstack.book.management.system.Entity.Book;
import fullstack.book.management.system.BookDto.BookDto;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    Book addBook(BookDto bookInput);
    Book getBookById(Long id);
    Book updateBook(BookDto bookInput, Long id);
    Book deleteBook(Long id);
}
