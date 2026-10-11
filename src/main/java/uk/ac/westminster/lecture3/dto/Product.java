package uk.ac.westminster.lecture3.dto;

public class Product {
    private Long id;
    private String name;
    private Double price;




    public Product(Double price, long id, String name) {
        this.price = price;
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
