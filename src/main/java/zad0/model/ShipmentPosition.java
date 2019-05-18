package zad0.model;


import java.io.Serializable;

public class ShipmentPosition implements Serializable {

    static int idCounter = 0;
    String id;
    String product;
    int quantity;

    public ShipmentPosition() {
        id = String.valueOf(++idCounter);
    }

    public ShipmentPosition(String product, int quantity) {
        this.id = String.valueOf(++idCounter);
        this.product = product;
        this.quantity = quantity;
    }

    public static void startingIdCounter(int id){
        idCounter = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        ShipmentPosition.idCounter = idCounter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ShipmentPosition(String id, String product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }
}
