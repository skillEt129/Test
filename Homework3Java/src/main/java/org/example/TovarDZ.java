package org.example;

public class TovarDZ {
    private Integer sort;
    private Integer cena;
    private String name;

    public TovarDZ() {
    }

    public TovarDZ(Integer sort, Integer cena, String name) {
        this.sort = sort;
        this.cena = cena;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getCena() {
        return cena;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSort() {
        return sort;
    }
}

