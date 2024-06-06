package fullstack.book.management.system.Resolvers;

import fullstack.book.management.system.Entity.Book;
import fullstack.book.management.system.Service.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class QueryResolver implements GraphQLQueryResolver {
    private final BookService bookService;

    /**
     * Retrieve all books.
     *
     * @return List of books
     */
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    /**
     * Retrieve a book by its ID.
     *
     * @param bookId ID of the book
     * @return Book instance
     */
    public Book getBookById(Long bookId) {
        return bookService.getBookById(bookId);
    }
}
