package com.lucas.nolting.models;

public class Product {
    private String
            id,
            name,
            description;

    private double price;
    private Image productImage;

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

