package fullstack.book.management.system.Resolvers;

import fullstack.book.management.system.Entity.Book;
import fullstack.book.management.system.BookDto.BookDto;
import fullstack.book.management.system.Service.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Resolver class for GraphQL mutations related to the Book entity.
 * This class handles adding, editing, and deleting books.
 */
@RequiredArgsConstructor
@Component
public class MutationResolver implements GraphQLMutationResolver {

    private final BookService bookService;

    /**
     * Adds a new book to the system.
     *
     * @param bookDto The data transfer object containing information about the book to be added.
     * @return The newly added Book object.
     */
    public Book addNewBook(BookDto bookDto) {
        return bookService.addBook(bookDto);
    }

    /**
     * Edits an existing book in the system.
     *
     * @param bookId The ID of the book to be edited.
     * @param bookDto The data transfer object containing updated information about the book.
     * @return The updated Book object.
     */
    public Book editBook(Long bookId, BookDto bookDto) {
        return bookService.updateBook(bookDto, bookId);
    }

    /**
     * Deletes a book from the system.
     *
     * @param bookId The ID of the book to be deleted.
     * @return The deleted Book object.
     */
    public Book deleteBook(Long bookId) {
        return bookService.deleteBook(bookId);
    }
}
