package org.example;

public class Book {
    private String name_book;
    private String name_autor;
    private Integer cena;
    private Integer year;
    private Integer kolvo;

    public Book(String name_book, String name_autor, Integer cena, Integer year, Integer kolvo) {
        this.name_book = name_book;
        this.name_autor = name_autor;
        this.cena = cena;
        this.year = year;
        this.kolvo = kolvo;
    }

    public Book() {
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getName_autor() {
        return name_autor;
    }

    public void setName_autor(String name_autor) {
        this.name_autor = name_autor;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getKolvo() {
        return kolvo;
    }

    public void setKolvo(Integer kolvo) {
        this.kolvo = kolvo;
    }
}
