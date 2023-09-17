package factoryObject.factories;
import factoryObject.Cars.ICar;
import factoryObject.Cars.skodaCar;



public class skodaFactory implements ICarFactory{

	@Override
	public ICar createCar() {
		
		return new skodaCar();

	}
	
	
}
