package fullstack.book.management.system.BookDto;

import lombok.Data;

/**
 * Data Transfer Object (DTO) class representing a Book.
 */
@Data
public class BookDto {
    String title;
    String author;
    String description;
}
