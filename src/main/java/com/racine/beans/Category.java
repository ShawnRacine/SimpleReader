package com.racine.beans;

import java.util.List;

/**
 * Created by Shawn Racine on 2016/12/19.
 */
public class Category {
    private int id;
    private String category;
    private List<Book> books;

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
