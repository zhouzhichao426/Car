package car;

public class CarDaoImpl implements ICarDao{
	Car[] cars;
	int index = 0;
	
	public CarDaoImpl() {
		cars = new Car[10];
	}

	public CarDaoImpl(int n) {
		cars = new Car[n];
	}

	@Override
	public boolean save(Car car) {
		if(index<cars.length){
			cars[index] = car;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public boolean del(String Id) {
		for(int i = 0; i<index;i++){
			if(cars[i].getCarID().equals(Id)){
				for(int j = i;j<index - 1;j++){
					cars[j]= cars[j+1];
				}
				index--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Car queryById(String Id) {
		
		for(int i = 0; i < index; i++){
			if(cars[i].getCarID().equals(Id)) {
				return cars[i];
			}
		}
		return null;
	}

	@Override
	public Car[] queryByBrand(String brand) {
		int count  = 0;
		for (int i = 0; i < index; i++) {
			if (cars[i].getBrand().equals(brand)) {
				count++;
			}
		}
		if (0 == count) {
			return null;
		}
		Car[] newCar = new Car[count];
		for (int i = 0; i < index; i++) {
			if (cars[i].getBrand().equals(brand)) {
				newCar[--count] = cars[i];
			}
		}
		return newCar;
	}

	@Override
	public Car[] queryByType(String type) {
		int count = 0;
		for (int i = 0; i < index; i++) {
			if (cars[i].getType().equals(type)) {
				count++;
			}
		}
		if (0 == count) {
			return null;
		}
		Car[] newCar = new Car[count];
		for (int i = 0; i < index; i++) {
			if (cars[i].getType().equals(type)) {
				newCar[--count] = cars[i];
			}
		}
		return newCar;
	}

	@Override
	public Car[] queryAll() {
		
		Car[] cs = new Car[index];
		System.arraycopy(cars, 0, cs, 0, index);
		return cs;
	}

}
