package com.example.MyBookShopApp.data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book2author")
public class Book2Author
{
    @EmbeddedId
    private Book2AuthorId id;
    @Column(insertable = false, updatable = false)
    private Integer authorId;
    @Column(insertable = false, updatable = false)
    private Integer bookId;
    @Column(insertable = false, updatable = false)
    private Integer sortIndex;

    public Book2AuthorId getId() {
        return id;
    }

    public void setId(Book2AuthorId id) {
        this.id = id;
    }

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

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
