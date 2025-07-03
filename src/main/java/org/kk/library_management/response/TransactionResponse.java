package org.kk.library_management.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kk.library_management.model.Book;
import org.kk.library_management.model.TransactionType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse extends Response{

    private String transactionType;
    private String bookName;

}
