package car;



public class Test {
	public static void show(Car[] car) {
		for (Car c : car) {
			System.out.println("车的品牌是"+ c.getBrand());
			System.out.println("车的型号是"+ c.getType());
			System.out.println("车牌号是"+ c.getCarID());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	public static void main(String[] args) {
		ICarDao icd = new CarDaoImpl();
		Car c1 = new Car("宝马", "x5", "辽B888888");
		Car c2 = new Car("宝马", "x3", "辽B543644");
		Car c3 = new Car("奔驰", "迈巴赫", "辽B768456");
		Car c4 = new Car("路虎", "揽胜", "辽B897454");
		Car c5 = new Car("路虎", "发现", "辽B897943");
		Car c6 = new Car("丰田", "霸道", "辽B657658");
		Car c7 = new Car("丰田", "霸道", "辽B843588");
		Car c8 = new Car("宝马", "x1", "辽B796578");
		icd.save(c1);
		icd.save(c2);
		icd.save(c3);
		icd.save(c4);
		icd.save(c5);
		icd.save(c6);
		icd.save(c7);
		icd.save(c8);
		show(icd.queryAll());
		System.out.println("~~~~~~~del~~~~~~~~~~~~~");
		icd.del("辽B543644");
		show(icd.queryAll());
		System.out.println("~~~~~queryByBrand~~~~~~~~~~");
		show(icd.queryByBrand("丰田"));
		System.out.println("~~~~~~queryByType~~~~~~~~~~~~~~~~~");
		show(icd.queryByType("霸道"));
		System.out.println("~~~~~queryByCarId~~~~~~~~~~~~~~~");
		Car car = icd.queryById("辽B796578");
		if (null != car ) {
			System.out.println("车的品牌是"+ car.getBrand());
			System.out.println("车的型号是"+ car.getType());
			System.out.println("车牌号是"+ car.getCarID());
		}
	}
}
