package org.kk.library_management.service;

import org.kk.library_management.model.Book;
import org.kk.library_management.model.Transaction;
import org.kk.library_management.repository.BookDao;
import org.kk.library_management.repository.TransactionDao;
import org.kk.library_management.request.BookTransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    TransactionDao transactionDao;

    @Autowired
    BookDao bookdao;
    public Transaction createTransaction(BookTransactionRequest request){
        int row = transactionDao.issueBookToStudent(request);
        if(row<=0){
            return null;
        }

        Book book = bookdao.findBookById(request.getBookId());
        Transaction transaction = new Transaction();
        transaction.setBook(book);
        return transaction;
    }
}
