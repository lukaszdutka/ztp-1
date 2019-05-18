package zad0.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Shipment implements Serializable {

    public Shipment(String id, String address, String company, LocalDate creationDate, Map<String, ShipmentPosition> shipmentPositions) {
        this.id = id;
        this.address = address;
        this.company = company;
        this.creationDate = creationDate;
        this.shipmentPositions = shipmentPositions;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Shipment.idCounter = idCounter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Map<String, ShipmentPosition> getShipmentPositions() {
        return shipmentPositions;
    }

    public void setShipmentPositions(Map<String, ShipmentPosition> shipmentPositions) {
        this.shipmentPositions = shipmentPositions;
    }

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
