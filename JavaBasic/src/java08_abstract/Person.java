package java08_abstract;

public class Person {

	// �ʵ� �ۼ�
	protected String name;  //����ʵ�
	protected String company;

	public Person() {           //�����ڷ� �Է�
		System.out.println("�Ͼƾƾƾƾ�");
	}

	public Person(String name, String company) {
		this.name = name;
		this.company = company;
	}



	public void introduce() {
		System.out.println("�� �̸���  : " + this.name + "�Դϴ�.");
		System.out.println("ȸ�� �̸��� : " + this.company + "�Դϴ�.");

	}

}
