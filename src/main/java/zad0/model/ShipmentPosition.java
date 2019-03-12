package zad0.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
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
}
