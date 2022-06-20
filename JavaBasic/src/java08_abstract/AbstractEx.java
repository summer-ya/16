package java08_abstract;

public class AbstractEx {

	//super(����) class ����_��� : �߻� Ŭ����
	abstract class Employee {
		String name;
		String dept;


		public Employee() {

		}
		public Employee(String name, String dept) {
			this.name = name;
			this.dept = dept;
		}


		// �޿��� ����Ѵ�.( �߻� Ŭ����)
		public abstract double payCheck();

		public void printEmployee() {
			System.out.printf("name : %s%n", name);
			System.out.printf("dept : %s%n", dept);
		}
	}

}
