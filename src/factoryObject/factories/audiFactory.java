package factoryObject.factories;

import factoryObject.Cars.ICar;
import factoryObject.Cars.audiCar;

public class audiFactory implements ICarFactory{

	@Override
	public ICar createCar() {
		
		
		return new audiCar();

		
	}

	
}
