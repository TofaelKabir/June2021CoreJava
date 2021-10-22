package lec15_java_oop_abstraction_05;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("\n---------------------------------------------");
		Toyota toyota = new Toyota(); // the Toyota class is instantiated here
		toyota.toyotaInfo();
		toyota.flyingFeature();
		toyota.autopilot();
		toyota.battery();
		toyota.price();
		toyota.ferrariInfo();
		toyota.solarInfo();
		toyota.speed();
		toyota.mercedezInfo();
		toyota.space();
		toyota.canFloat();
		toyota.lightWeight();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.honk();
		//toyota.gear(); // not possible because this is a static method
		// Static method don't need an object to call, A class/Interface directly can
		// call a static method
		//Toyota.gear(); //because gear is the static method of Car interface
		toyota.rent();
		toyota.carryingpassenger();
		toyota.carryingGoods();
		Toyota.luxury(); // Because Toyota extends Flying car, and flying car extends electric car
		Toyota.toyota();

		System.out.println("\n---------------------------------------------");
		// Cannot instantiate the type Car
		// an interface can't be instantiated, it needs the help of a concrete class
		Car car = new Toyota();
		car.start();
		car.stop();
		car.brake();
		car.honk();
		// car.gear(); // not possible because this is a static method
		// This static method of interface Car can only be accessed as Car.gear
		// Static method don't need an object to call, A class/Interface directly can
		// call a static method
		Car.gear(); // here Car is an interface
		car.rent();
		car.carryingpassenger();
		car.carryingGoods();
		System.out.println("Car first build in: "+Car.year);

		System.out.println("\n---------------------------------------------");
		Taxi taxi = new Toyota(); // an interface can't be instantiated, it needs the help of a concrete class
		taxi.rent();
		taxi.carryingpassenger();

		System.out.println("\n---------------------------------------------");
		FlyingCar flyingCar = new Toyota(); // an abstract class can't be instantiated, it needs the help of a concrete
											// class
		flyingCar.flyingFeature();
		flyingCar.autopilot();
		flyingCar.price();
		flyingCar.battery();
		flyingCar.ferrariInfo();
		flyingCar.speed();
		flyingCar.solarInfo();
		flyingCar.space();
		flyingCar.canFloat();
		FlyingCar.luxury(); // NEED TO EXPLAIN

		System.out.println("\n---------------------------------------------");
		ElectricCar electricCar = new Toyota();
		electricCar.price();
		electricCar.battery();
		electricCar.ferrariInfo();
		electricCar.speed();
		electricCar.solarInfo();
		electricCar.mercedezInfo();
		ElectricCar.luxury(); // NEED TO EXPLAIN

		System.out.println("\n---------------------------------------------");
		Ferrari ferrari = new Ferrari();
		ferrari.ferrariInfo();
		ferrari.speed();
		ferrari.solarInfo();
		ferrari.speed();
		ferrari.mercedezInfo();

		// it is possible to call all the regular class, interface and abstract class
		// I didn't initialize them all
		// i just initialize 2 regular class, 2 abstract class, 2 interface
		// You must finish the HW related to abstract class.

	}

}
