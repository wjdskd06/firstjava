package Yedam;

public class Student {
	static final String nation = "�ѱ�";
	static final double pi = 3.14;
	private String name;
	private String major;
	private int age;
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Student() {

	}
	
	Student(String name, String major, int age) {
		this.name = name;
		this.major = major;
		this.age = age;

	}

	public void study() {
		System.out.println(name + "�� �����մϴ�.");
	}

	public void introduce() {
		System.out.println("������" + major + "�̰� ���̴�" + age + "�Դϴ�.");
	}

	public void showheight() {
		System.out.println("Ű��" + height + "�Դϴ�.");
	}

}
