package day2;

import java.util.List;

public class Product {

    /*
        Product Id (long)
        SKU (String)
        Name of product (String)
        Price of Product (double)
        Discounted Price (double)
        Images (List)
        Size Available - [M,L,XL,XXL] => String
        Number of stock Available - 2 (long)
        Product Detail - String
        Vendor Id (long)
        Rating (Rating)
     */

    long productId;
    String sku;
    String productName;
    double price;
    double discountedPrice;
    List images;
    SizeAvailable sizeAvailable;
    long numberOfStock;
    String productDetail;
    long vendorId;
    Rating rating;
    /*
        Behaviour
        -> Like
        -> Share
        -> Buy
        -> Add to cart

     */
}
