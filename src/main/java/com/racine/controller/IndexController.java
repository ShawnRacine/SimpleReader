package com.racine.controller;

import com.racine.beans.Book;
import com.racine.beans.Category;
import com.racine.service.BookService;
import com.racine.service.CategoryService;
import com.racine.service.NavigatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunrx on 2016/9/26.
 */
@Controller
public class IndexController {

    @Autowired
    private NavigatorService navigatorService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("nav", navigatorService.getNavigator());
        List<Category> categories = categoryService.getCategory();
        List<Book> allBooks = bookService.getBooks();
        for (int i = 0; i < categories.size(); i++) {
            Category category = categories.get(i);
            List<Book> books = new ArrayList<Book>();
            for (int j = 0; j < allBooks.size(); j++) {
                Book book = allBooks.get(j);
                if (book.getCategoryId() == category.getId()) {
                    books.add(book);
                }
            }
            category.setBooks(books);
        }
        modelMap.put("cat", categories);

        return "main";
    }

//    @RequestMapping("/right")
//    public String Right(@RequestParam(value = "name", required = false) String name) {
//        return "right-sidebar";
//    }
}
