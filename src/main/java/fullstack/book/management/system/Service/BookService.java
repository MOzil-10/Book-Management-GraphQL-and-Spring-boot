package fullstack.book.management.system.Service;

import fullstack.book.management.system.Entity.Book;
import fullstack.book.management.system.BookDto.BookDto;

import java.util.List;

/**
 * Service interface for managing books.
 */
public interface BookService {

    /**
     * Retrieves all books.
     *
     * @return a list of all books
     */
    List<Book> getAllBooks();

    /**
     * Adds a new book.
     *
     * @param bookInput the data for the new book
     * @return the newly added Book object
     */
    Book addBook(BookDto bookInput);

    /**
     * Retrieves a book by its ID.
     *
     * @param id the ID of the book to retrieve
     * @return the Book object corresponding to the ID
     */
    Book getBookById(Long id);

    /**
     * Updates an existing book.
     *
     * @param bookInput the updated data for the book
     * @param id        the ID of the book to update
     * @return the updated Book object
     */
    Book updateBook(BookDto bookInput, Long id);

    /**
     * Deletes a book by its ID.
     *
     * @param id the ID of the book to delete
     * @return the deleted Book object
     */
    Book deleteBook(Long id);
}
