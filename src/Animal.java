public class Animal {
	String family;
	String name;
	int age;
	boolean isMammal;

	Animal(String family, String name, int age, boolean isMammal) {
		this.family = family;
		this.name = name;
		this.age = age;
		this.isMammal = isMammal;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMammal(boolean mammal) {
		isMammal = mammal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public void showAnimal() {
		System.out.println(name);
		System.out.println(family);
		System.out.println(age);
		System.out.println(isMammal);
	}

	@Override
	public String toString() {
		return "Animal{" +
				"family='" + family + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				", isMammal=" + isMammal +
				'}';
	}
}
