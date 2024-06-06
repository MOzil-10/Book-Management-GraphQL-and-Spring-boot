package fullstack.book.management.system.Resolvers;

import fullstack.book.management.system.Entity.Book;
import fullstack.book.management.system.BookDto.BookDto;
import fullstack.book.management.system.Service.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Resolver class for GraphQL mutations related to Book entity.
 */
@RequiredArgsConstructor
@Component
public class MutationResolver implements GraphQLMutationResolver {

    private final BookService bookService;

    /**
     * Adds a new book.
     *
     * @param bookDto data for the new book
     * @return the newly added Book object
     */
    public Book addNewBook(BookDto bookDto) {
        return bookService.addBook(bookDto);
    }

    /**
     * Edits an existing book.
     *
     * @param bookId  the ID of the book to edit
     * @param bookDto data for the edited book
     * @return the edited Book object
     */
    public Book editBook(Long bookId, BookDto bookDto) {
        return bookService.updateBook(bookDto, bookId);
    }

    /**
     * Deletes a book.
     *
     * @param bookId the ID of the book to delete
     * @return the deleted Book object
     */
    public Book deleteBook(Long bookId) {
        return bookService.deleteBook(bookId);
    }
}
