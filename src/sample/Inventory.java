package sample;

import java.util.List;
import java.util.Vector;

public class Inventory {
    //private fields
    private static List<Part> ObservablePartList = new Vector<>(); //FIXME - I named these two lists differently. UML diagram says they should both be "ObservableList" but I wasn't sure how to make this work.
    private static List<Product> ObservableProductList = new Vector<>();

    //public methods
    //FIXME - need to supply arguments
    public static void addPart(Part newPart) {

    }
    public static void addProduct(Product newProduct) {

    }
    public static Part lookupPart(int partId) {

    }
    public static Product lookupProduct(int productId) {

    }
    public static <Part> List<Part> lookupPart(String partName) {
        //return new list ObservableList
    }
    public static <Product> List<Product> lookupProduct(String productName) {
        //return new list ObservableList
    }
    public static void updatePart(int index, Part selectedPart) {

    }
    public static void updateProduct(int index, Product newProduct) {

    }
    public static boolean deletePart(Part selectedPart) {

    }
    public static boolean deleteProduct(Product selectedProduct) {

    }
    public static <Part> List<Part> getAllParts() {

    }
    public static <Product> List<Product> getAllProducts() {

    }


}
