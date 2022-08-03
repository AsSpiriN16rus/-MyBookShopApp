package com.example.MyBookShopApp.data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Book2AuthorId implements Serializable {


    @Column(insertable = false, updatable = false)
    private Integer authorId;

    @Column(insertable = false, updatable = false)
    private Integer bookId;


    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book2AuthorId that = (Book2AuthorId) o;
        return Objects.equals(authorId, that.authorId) && Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, bookId);
    }
}
