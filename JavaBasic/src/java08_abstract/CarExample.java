package java08_abstract;

public class CarExample {
	public static void main(String[] args) {
		
		Car cars = new Car();
		
		System.out.println("ȸ�� : " + cars.company);
		System.out.println("���� : " + cars.color);
		System.out.println("�� : " + cars.model);
		System.out.println("�ְ� �ӵ� : " + cars.maxSpeed);
		
		cars.speed = 120;
		System.out.println("���� �ӵ� : " + cars.speed);
		
	}

}
