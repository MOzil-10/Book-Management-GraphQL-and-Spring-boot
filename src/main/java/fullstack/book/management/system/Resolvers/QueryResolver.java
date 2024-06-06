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

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public Book getBookById(Long bookId) {
        return bookService.getBookById(bookId);
    }
}
