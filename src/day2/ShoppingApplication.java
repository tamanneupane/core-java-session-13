package day2;

import java.util.Calendar;
import java.util.Date;

public class ShoppingApplication {

    public static void main(String[] args) {

        Menu womenFashion = new Menu();
        womenFashion.menuId = 1;
        womenFashion.menuName = "Women's Fashion";
        womenFashion.parentMenuId = 0;
        womenFashion.isLeaf = false;


        Menu womenClothing = new Menu();
        womenClothing.menuId = 3;
        womenClothing.menuName = "Clothing";
        womenClothing.parentMenuId = 1;
        womenClothing.isLeaf = false;
        womenClothing.slug = "womens-clothing";

        Menu topAndTShirt = new Menu();
        topAndTShirt.menuId = 4;
        topAndTShirt.menuName = "Tops & T-shirts";
        topAndTShirt.parentMenuId = 3;
        topAndTShirt.isLeaf = true;
        topAndTShirt.slug = "tops";

        Menu menFashion = new Menu();
        menFashion.menuId = 2;
        menFashion.menuName = "Men's Fashion";
        menFashion.parentMenuId = 0;
        menFashion.isLeaf = false;


        String menuName = menFashion.menuName;
        System.out.println(menuName);


        Product earPod = new Product(1L,"123443385_NP-1033542747", "Earpods Pro 2 TWS wireless Earbuds With Wireless Charging", 3500, 2550,10,"Detail of earpod", 1);
        earPod.setPrice(4500);
        earPod.setDiscountedPrice(3000);

        Product kurtha = new Product(2L, "119226220_NP-1032702337","Aamayra Fashion House Black Straight Kurti With Peach Pant And Shawl Set For Women", 6000, 1999, SizeAvailable.XL, 10, "Detail", 2);
    }
}
