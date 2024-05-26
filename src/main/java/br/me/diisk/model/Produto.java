package br.me.diisk.model;

import java.math.BigDecimal;

import com.opencsv.bean.CsvBindByName;

public class Produto {

    @CsvBindByName(column = "ProductId", required = true)
    private Integer id;
    @CsvBindByName(column = "ProductName", required = true)
    private String name;
    @CsvBindByName(column = "Description", required = true)
    private String description;
    @CsvBindByName(column = "Price", required = true)
    private BigDecimal price;
    @CsvBindByName(column = "Category", required = true)
    private String category;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", name=" + name + ", descriptin=" + description + ", price=" + price
                + ", category=" + category + "]";
    }

    public void update(String name, String description, String category) {
        this.category = category;
        this.name = name;
        this.description = description;
    }
}
