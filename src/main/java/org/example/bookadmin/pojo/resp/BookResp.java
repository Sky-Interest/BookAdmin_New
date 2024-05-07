package org.example.bookadmin.pojo.resp;

import lombok.Data;
import org.example.bookadmin.pojo.Book;

@Data
public class BookResp extends Book {
    private String categoryName;


}
