package org.kk.library_management.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kk.library_management.model.Author;
import org.kk.library_management.model.BookType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBookRequest {
    String bookId;
    String bookName;
    BookType bookType;
    String authorName;
    String authorEmail;
    String authorNumber;

    public static Author toAuthor(CreateBookRequest request){
        Author author = Author.builder().email(request.getAuthorEmail())
                .name(request.getAuthorName()).phoneNo(request.getAuthorNumber()).build();
        return author;
    }
}
