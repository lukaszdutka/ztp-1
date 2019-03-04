package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class Shipment implements Serializable {

    static int idCounter = 0;
    String id;
    String address;
    String company;
    LocalDate creationDate;
    Map<String, ShipmentPosition> shipmentPositions;

    public Shipment() {
        id = String.valueOf(++idCounter);
        shipmentPositions = new HashMap<>();
    }

    public Shipment(String address, String company, LocalDate creationDate, Map<String, ShipmentPosition> shipmentPositions) {
        this.id = String.valueOf(++idCounter);
        this.address = address;
        this.company = company;
        this.creationDate = creationDate;
        this.shipmentPositions = shipmentPositions;
    }

    public void addShipmentPosition(ShipmentPosition shipmentPosition) {
        shipmentPositions.put(shipmentPosition.getId(), shipmentPosition);
    }

    public void removeShipmentPosition(String id) {
        shipmentPositions.remove(id);
    }

    public static void startingIdCounter(int id){
        idCounter = id;
    }
}
