package fullstack.book.management.system.Resolvers;

import fullstack.book.management.system.Entity.Book;
import fullstack.book.management.system.BookDto.BookDto;
import fullstack.book.management.system.Service.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MutationResolver implements GraphQLMutationResolver {
    private final BookService bookService;

    public Book addNewBook(BookDto bookInput) {
        return bookService.addBook(bookInput);
    }

    public Book editBook(Long bookId, BookDto bookInput) {
        return bookService.updateBook(bookInput, bookId);
    }

    public Book deleteBook(Long bookId) {
        return bookService.deleteBook(bookId);
    }
}
