package edu.tomer;

/**
 * Created by hackeru on 13/02/2017.
 */
public class Book {
    //properties:
    private String title;
    private String author;
    private float price;

    //Constructors:
    public Book() {
        this.title = IO.getString("Enter title:");
        this.author = IO.getString("Enter author:");
        this.price = IO.getFloat("Enter price:");
    }

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Methods:
    public void print() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %3.2f\n",
                title, author, priceAfterVAT()
        );
    }

    public float priceAfterVAT() {
        return price * 1.17f;
    }

    //getters and setters:
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPriceBeforeVAT() {
        return price;
    }

    public void setPriceBeforeVAT(float price) {
        this.price = price;
    }
}
