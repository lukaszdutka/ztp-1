package view;

import lombok.NoArgsConstructor;
import model.Shipment;
import model.ShipmentPosition;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

@NoArgsConstructor
public class View {

    private static final String SHIPMENT_FORMAT = "|%5s|%30s|%30s|%20s|\n";
    private static final String SHIPMENT_POSITION_FORMAT = "|   |%5s|%40s|%33s|   |\n";
    private static final String LINE = "|----------------------------------------------------------------------------------------|\n";
    private static final String POSITION_LINE = "|   |--------------------------------------------------------------------------------|   |\n";
    private static final String SPACE = "|%88s|\n";

    private final Scanner s = new Scanner(System.in);

    public void printShipments(Map<String, Shipment> shipmentList) {
        System.out.println("\nRAPORT\n");
        for (Shipment sh : shipmentList.values()) {
            printShipment(sh);
        }
    }

    public void printShipment(Shipment sh) {
        printLine();
        printShipmentHeader();
        printLine();

        printShipmentDetails(sh);
        printSpace();

        printShipmentPositionLine();
        printShipmentPositionHeader();
        printShipmentPositionLine();

        for (ShipmentPosition shPos : sh.getShipmentPositions().values()) {
            printShipmentPosition(shPos);
            printShipmentPositionLine();
        }
        printSpace();
        printSpace();
        printLine();
        System.out.println();
    }

    private void printShipmentPositionLine() {
        System.out.print(POSITION_LINE);
    }


    private void printShipmentPosition(ShipmentPosition shPos) {
        System.out.printf(SHIPMENT_POSITION_FORMAT, shPos.getId(), shPos.getProduct(), shPos.getQuantity());
    }

    private void printShipmentPositionHeader() {
        System.out.printf(SHIPMENT_POSITION_FORMAT, "Id", "Product", "Quantity");
    }

    private void printLine() {
        System.out.print(LINE);
    }

    private void printShipmentHeader() {
        System.out.printf(SHIPMENT_FORMAT, "Id", "Company", "Address", "Creation Date");
    }

    private void printShipmentDetails(Shipment sh) {
        System.out.printf(SHIPMENT_FORMAT, sh.getId(), sh.getCompany(), sh.getAddress(), sh.getCreationDate());
    }

    private void printSpace() {
        System.out.printf(SPACE, "");
    }

    public void displayMenu() {
        System.out.println("What do you want to do?");
        int i = 0;
        System.out.println(++i + ". Display all shipments");
        System.out.println(++i + ". Display shipment");
        System.out.println(++i + ". Create shipment");
        System.out.println(++i + ". Create shipment position");
        System.out.println(++i + ". Update shipment");
        System.out.println(++i + ". Update shipment position");
        System.out.println(++i + ". Delete shipment");
        System.out.println(++i + ". Delete shipment position");
        System.out.println(++i + ". Exit");

    }

    public Shipment creatingShipment() {
        Shipment sh = new Shipment();

        System.out.println("Write address for shipment:");
        sh.setAddress(s.nextLine());
        System.out.println("Write company for shipment:");
        sh.setCompany(s.nextLine());

        System.out.println(sh.getAddress());
        System.out.println(sh.getCompany());
        sh.setCreationDate(LocalDate.now());

        return sh;
    }

    public ShipmentPosition creatingShipmentPosition() {
        ShipmentPosition shPos = new ShipmentPosition();

        System.out.println("Write product for shipment position:");
        shPos.setProduct(s.nextLine());
        System.out.println("Write quantity:");
        shPos.setQuantity(Integer.parseInt(s.nextLine()));

        return shPos;
    }

    public void updatingShipment(Shipment shipment) {
        System.out.println("Want to change company name? enter empty if not. [" + shipment.getCompany() + "]");
        String company = s.nextLine();
        if (!company.isEmpty()) {
            shipment.setCompany(company);
        }

        System.out.println("Want to change address? enter empty if not. [" + shipment.getAddress() + "]");
        String address = s.nextLine();
        if (!address.isEmpty()) {
            shipment.setAddress(address);
        }
    }

    public void updatingShipmentPosition(ShipmentPosition shipmentPosition) {
        System.out.println("Want to change product name? enter empty if not. [" + shipmentPosition.getProduct() + "]");
        String product = s.nextLine();
        if (!product.isEmpty()) {
            shipmentPosition.setProduct(product);
        }

        System.out.println("Want to change quantity? enter empty if not. [" + shipmentPosition.getQuantity() + "]");
        String quantity = s.nextLine();
        if (!quantity.isEmpty()) {
            shipmentPosition.setQuantity(Integer.parseInt(quantity));
        }
    }

    public String getShipmentId() {
        System.out.println("Put shipment id: ");
        return s.nextLine();
    }

    public String getShipmentPositionId() {
        System.out.println("Put shipment position id: ");
        return s.nextLine();
    }

    public void dataSaved() {
        System.out.println("Data saved.");
    }

    public int getDecision() {
        try {
            return Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e){
            return -1;
        }
    }

    public void closeScanner() {
        s.close();
    }
}
