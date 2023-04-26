package day2;

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

    }
}
