import factoryObject.Cars.ICar;
import factoryObject.factories.ICarFactory;

public class clientSide {
	
	private ICar car;
	
	public clientSide(ICarFactory factory) {
		
		this.car = factory.createCar();
		
	}
	
	public void drive() {
		
		car.drive();
		
	}

}
