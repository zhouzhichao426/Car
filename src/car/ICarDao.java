package car;

public interface ICarDao {
	boolean save(Car car);
	boolean del(String Id);
	Car queryById(String Id);
	Car[] queryByBrand(String brand);
	Car[] queryByType(String type);
	Car[] queryAll();
}
