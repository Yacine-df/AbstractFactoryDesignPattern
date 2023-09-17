import factoryObject.Cars.ICar;
import factoryObject.factories.ICarFactory;
import factoryObject.factories.audiFactory;

public class app {

	public static void main(String[] args) {
		
		ICarFactory audiFactory = new audiFactory();
		
		clientSide client = new clientSide(audiFactory);
		
		client.drive();

	}

}
