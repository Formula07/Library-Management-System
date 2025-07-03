package org.kk.library_management.service;

import org.kk.library_management.exceptions.BookAlreadyPresent;
import org.kk.library_management.model.Author;
import org.kk.library_management.model.Book;
import org.kk.library_management.repository.AuthorDao;
import org.kk.library_management.repository.BookDao;
import org.kk.library_management.request.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    @Autowired
    AuthorDao authorDao;

    public Book createBookInDatabase(CreateBookRequest createBookRequest){
        String bookId = createBookRequest.getBookId();
        String bookName = createBookRequest.getBookName();
        String bookType = createBookRequest.getBookType().toString();
        String authorEmail = createBookRequest.getAuthorEmail();

        Book bookResult=null;

        try{
            int status = bookDao.findBookById(bookId);
            if(status>0){
                throw new BookAlreadyPresent("Book is already present in the database");
            }

            int result = bookDao.createBookInDatabase(bookId, bookName, bookType, authorEmail);
            if(result<=0){
                return null;
            }
            boolean isAurhorExist = false;

            try{
                Author authorExist = authorDao.findAuthorById(authorEmail);
                isAurhorExist=true;
            }
            catch(Exception e){
                isAurhorExist=false;
            }

            if(isAurhorExist==true){
                return bookResult;
            }
        }
        catch(Exception exception){
            throw new RuntimeException();
        }
        return bookResult;
    }
}
