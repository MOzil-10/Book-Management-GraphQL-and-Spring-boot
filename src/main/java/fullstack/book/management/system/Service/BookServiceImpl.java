package fullstack.book.management.system.Service;

import fullstack.book.management.system.Entity.Book;
import fullstack.book.management.system.BookDto.BookDto;
import fullstack.book.management.system.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book addBook(BookDto bookDto) {
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setDescription(bookDto.getDescription());

        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book with ID : " + id + " does not exist"));
    }

    @Override
    public Book updateBook(BookDto bookDto, Long id) {
        Book existingBook = getBookById(id);
        existingBook.setTitle(bookDto.getTitle());
        existingBook.setAuthor(bookDto.getAuthor());
        existingBook.setDescription(bookDto.getDescription());

        return bookRepository.save(existingBook);
    }

    @Override
    public Book deleteBook(Long id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
        return book;
    }
}
