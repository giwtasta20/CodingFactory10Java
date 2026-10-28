package gr.aueb.cf.ch17.lifo_parking;

public class Main {

    public static void main(String[] args) {
        LifoParking lifoParking = new LifoParking();

        lifoParking.addCar("ΙΑΕ 2323");
        lifoParking.addCar("ΖΑΟ 1391");
        lifoParking.addCar("ΧD 3444");

        String car = lifoParking.removeCar();
//        System.out.println(car);

        car = lifoParking.removeCar();
//        System.out.println(car);

        lifoParking.traverse();
    }
}


//package gr.aueb.cf.ch17.lifo_parking;
//
//public class Main {
//
//    public static void main(String[] args) {
//        LifoParking lifoParking = new LifoParking();
//
//        lifoParking.addCar("AA1234");
//        lifoParking.addCar("BB5678");
//        lifoParking.addCar("XD 3444");
//
//        System.out.println("Current lifoParking: ");
//        lifoParking.traverse();
//
//        System.out.println("Removing cars...");
//        lifoParking.removeCar();
//        lifoParking.removeCar();
//
//        System.out.println("Current lifoParking: ");
//        lifoParking.traverse();
//    }
//}
