package org.openclassrooms.bibliotheque.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "T_BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_ID")
    private long id;

    @Column(name = "C_NAMEBOOK", length = 100, nullable = false)
    private String nameBook;

    @Column(name = "C_NAMEAUTHOR", length = 100, nullable = false)
    private String nameAuthor;

    @Column(name = "C_DESCRIPTION", length = 500, nullable = false)
    private String description;

    @Column(name = "C_RELEASEDATE", length = 50, nullable = false)
    private Date releaseDate;

    public Book() {
    }

    public Book(long id, String nameBook, String nameAuthor, String description, Date releaseDate) {
        this.id = id;
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
