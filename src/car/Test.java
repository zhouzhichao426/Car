package car;



public class Test {
	public static void show(Car[] car) {
		for (Car c : car) {
			System.out.println("����Ʒ����"+ c.getBrand());
			System.out.println("�����ͺ���"+ c.getType());
			System.out.println("���ƺ���"+ c.getCarID());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	public static void main(String[] args) {
		ICarDao icd = new CarDaoImpl();
		Car c1 = new Car("����", "x5", "��B888888");
		Car c2 = new Car("����", "x3", "��B543644");
		Car c3 = new Car("����", "���ͺ�", "��B768456");
		Car c4 = new Car("·��", "��ʤ", "��B897454");
		Car c5 = new Car("·��", "����", "��B897943");
		Car c6 = new Car("����", "�Ե�", "��B657658");
		Car c7 = new Car("����", "�Ե�", "��B843588");
		Car c8 = new Car("����", "x1", "��B796578");
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
		icd.del("��B543644");
		show(icd.queryAll());
		System.out.println("~~~~~queryByBrand~~~~~~~~~~");
		show(icd.queryByBrand("����"));
		System.out.println("~~~~~~queryByType~~~~~~~~~~~~~~~~~");
		show(icd.queryByType("�Ե�"));
		System.out.println("~~~~~queryByCarId~~~~~~~~~~~~~~~");
		Car car = icd.queryById("��B796578");
		if (null != car ) {
			System.out.println("����Ʒ����"+ car.getBrand());
			System.out.println("�����ͺ���"+ car.getType());
			System.out.println("���ƺ���"+ car.getCarID());
		}
	}
}
