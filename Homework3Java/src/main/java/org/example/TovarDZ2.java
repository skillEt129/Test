package org.example;

public class TovarDZ2 {
    private String name;
    private String country;
    private Integer ves;
    private Integer cena;
    private String sort;

    public TovarDZ2() {
    }

    public TovarDZ2(String name, String country, Integer ves, Integer cena, String sort) {
        this.name = name;
        this.country = country;
        this.ves = ves;
        this.cena = cena;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getVes() {
        return ves;
    }

    public Integer getCena() {
        return cena;
    }

    public String getSort() {
        return sort;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setVes(Integer ves) {
        this.ves = ves;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
