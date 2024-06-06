package fullstack.book.management.system.Service;

import fullstack.book.management.system.Entity.Book;
import fullstack.book.management.system.BookDto.BookDto;
import fullstack.book.management.system.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the BookService interface.
 */
@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    /**
     * Retrieves all books from the repository.
     *
     * @return a list of all books
     */
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * Adds a new book to the repository.
     *
     * @param bookDto the data for the new book
     * @return the newly added Book object
     */
    @Override
    public Book addBook(BookDto bookDto) {
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setDescription(bookDto.getDescription());

        return bookRepository.save(book);
    }

    /**
     * Retrieves a book by its ID from the repository.
     *
     * @param id the ID of the book to retrieve
     * @return the Book object corresponding to the ID
     * @throws RuntimeException if the book with the specified ID does not exist
     */
    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book with ID : " + id + " does not exist"));
    }

    /**
     * Updates an existing book in the repository.
     *
     * @param bookDto the updated data for the book
     * @param id      the ID of the book to update
     * @return the updated Book object
     * @throws RuntimeException if the book with the specified ID does not exist
     */
    @Override
    public Book updateBook(BookDto bookDto, Long id) {
        Book existingBook = getBookById(id);
        existingBook.setTitle(bookDto.getTitle());
        existingBook.setAuthor(bookDto.getAuthor());
        existingBook.setDescription(bookDto.getDescription());

        return bookRepository.save(existingBook);
    }

    /**
     * Deletes a book by its ID from the repository.
     *
     * @param id the ID of the book to delete
     * @return the deleted Book object
     * @throws RuntimeException if the book with the specified ID does not exist
     */
    @Override
    public Book deleteBook(Long id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
        return book;
    }
}
