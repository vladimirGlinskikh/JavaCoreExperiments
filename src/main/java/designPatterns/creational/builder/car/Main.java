package designPatterns.creational.builder.car;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
        System.out.println("---------------------------------------------");

        CarBuilder builder1 = new CarBuilder();
        director.constructCityCar(builder1);

        Car car1 = builder1.getResult();
        System.out.println("Car built:\n" + car1.getType());

        CarManualBuilder manualBuilder1 = new CarManualBuilder();
        director.constructCityCar(manualBuilder1);
        Manual carManual1 = manualBuilder1.getResult();
        System.out.println("\nCar manual built:\n" + carManual1.print());
    }
}
