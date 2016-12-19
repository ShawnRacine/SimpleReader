package com.racine.service;

import com.racine.beans.Book;
import com.racine.beans.Category;
import com.racine.mapper.BookMapper;
import com.racine.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Shawn Racine on 2016/12/19.
 */
@Service
public class BookService {
    @Autowired
    private BookMapper mapper;

    public List<Book> getBooks(){
        return mapper.getBooks();
    }
}
