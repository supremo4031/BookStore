package com.arpan.bookstore.Models;

import java.io.Serializable;

public class Book implements Serializable {
    private String image;
    private String bookName;
    private String bookDescription;

    public Book() {
    }

    public Book(String image, String bookName, String bookDescription) {
        this.image = image;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
}
