package controller;

import model.Shipment;
import model.ShipmentPosition;
import view.View;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Controller {

    private static final String filePath = "src/main/resources/";
    private static final String fileName = "shipments.bin";

    private static final View view = new View();
    private static Map<String, Shipment> shipments;

    public void run() {
        init();
        decide();
    }

    private void init() {
        loadData();
        setIds();
    }

    private void setIds() {
//        Shipment.startingIdCounter(10);
//        ShipmentPosition.startingIdCounter(10);
    }

    private void decide() {
        while (true) {
            view.displayMenu();
            String shId;
            String shPosId;
            Shipment sh;
            ShipmentPosition shPos;
            int decision = getDecision();
            switch (decision) {
                case 1:
                    view.printShipments(shipments);
                    break;
                case 2:
                    shId = getShipmentId();
                    sh = shipments.get(shId);
                    view.printShipment(sh);
                    break;
                case 3:
                    sh = view.creatingShipment();
                    shipments.put(sh.getId(), sh);
                    break;
                case 4:
                    shPos = view.creatingShipmentPosition();
                    shId = getShipmentId();
                    sh = shipments.get(shId);
                    sh.addShipmentPosition(shPos);
                    break;
                case 5:
                    shId = getShipmentId();
                    sh = shipments.get(shId);
                    view.updatingShipment(sh);
                    break;
                case 6:
                    shId = getShipmentId();
                    sh = shipments.get(shId);
                    shPosId = getShipmentPositionId();
                    shPos = sh.getShipmentPositions().get(shPosId);
                    view.updatingShipmentPosition(shPos);
                    break;
                case 7:
                    shId = getShipmentId();
                    shipments.remove(shId);
                    break;
                case 8:
                    shId = getShipmentId();
                    sh = shipments.get(shId);
                    shPosId = getShipmentPositionId();
                    sh.removeShipmentPosition(shPosId);
                    break;
                case 9:
                    saveData();
                    view.closeScanner();
                    System.exit(0);
                default:
                    System.out.println("Bad input, try again.");
                    break;
            }
            saveData();
        }
    }

    private String getShipmentPositionId() {
        return view.getShipmentPositionId();
    }

    private String getShipmentId() {
        return view.getShipmentId();
    }

    private int getDecision() {
        return view.getDecision();
    }


    private void saveData() {
        try {
            ObjectOutputStream ss = new ObjectOutputStream(new FileOutputStream(filePath + fileName));
            ss.writeObject(shipments);
        } catch (IOException e) {
            e.printStackTrace();
        }
        view.dataSaved();
    }

    private void loadData() {
        try {
            ObjectInputStream ss = new ObjectInputStream(new FileInputStream(filePath + fileName));
            shipments = (HashMap<String, Shipment>) ss.readObject();
        } catch (IOException | ClassNotFoundException e) {
            shipments = new HashMap<>();
        }
    }
}
