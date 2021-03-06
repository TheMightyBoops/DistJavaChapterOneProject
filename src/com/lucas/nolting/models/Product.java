package com.lucas.nolting.models;

import java.io.Serializable;

import static com.lucas.nolting.models.Product.Image.GRANITE;
import static com.lucas.nolting.models.Product.Image.OLD_GRAY;
import static com.lucas.nolting.models.Product.Image.SLATE;

public class Product implements Serializable {
    private String
            id,
            name,
            description;

    private double price;
    private Image productImage;

    public Product() {

    }

    public Product(String selectedName) {
        switch (selectedName) {
            case "Old Gray":
                setName("Old Gray");
                setImage(OLD_GRAY);
                setDescription("This classic is the most basic " +
                        "standard rock we do at " +
                        "Rocks and Rocks alone");
                setPrice(4.99);
                setId("0");
            break;

            case "Classic Granite":
                setName("Classic Granite");
                setImage(GRANITE);
                setDescription("Add a little style " +
                        "and flair to your rock, " +
                        "you only live once.");
                setPrice(6.00);
                setId("1");
            break;

            case "Dark Slate":
                setName("Dark Slate");
                setImage(SLATE);
                setDescription("Dark Slate Like a chalkboard, " +
                        "but you buy it from us");
                setPrice(5.00);
                setId("2");
            break;
        }

    }

    public Product(String id, String name, String description,
            double price, Image image) {
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
        setImage(image);
    }
    // Accessors and mutators
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return productImage.getHtmlLink();
    }

    public void setImage(Image image) {
        this.productImage = image;
    }

    public Product createAProduct(String productName) {

        return null;
    }

    public enum Image {
        // Add link to new product images here
        OLD_GRAY("productAssets/oldgray.jpg"),
        GRANITE("productAssets/granite.jpg"),
        SLATE("productAssets/slate.jpg");

        private String htmlLink;
        Image(String htmlLink) {
            setHtmlLink(htmlLink);
        }

        public String getHtmlLink() {
            return htmlLink;
        }

        private void setHtmlLink(String htmlLink) {
            this.htmlLink = htmlLink;
        }
    }
}

