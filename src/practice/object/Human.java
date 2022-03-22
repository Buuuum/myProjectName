package practice.object;

import java.util.Objects;

public class Human {

	public String name = "홍길동";
	public int age = 20;
	public double height = 160.1;

	public Human() {
	}

	public Human(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, height, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return age == other.age && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + "]";

	}

}
