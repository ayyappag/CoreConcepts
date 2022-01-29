package com.core.sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortingMech2 {

	public static void main(String[] args) {

		Emp2[] emp = new Emp2[3];
		emp[0] = new Emp2(1, "Ame");
		emp[1] = new Emp2(3, "Amit");
		emp[2] = new Emp2(2, "John");

		Arrays.sort(emp);

		System.out.println("\nSorted by emp id");

		System.out.println("sorting : " + Arrays.toString(emp));

		System.out.println("sorting by name");

		Arrays.sort(emp, Emp2.NameComparator);

		System.out.println("sorting : " + Arrays.toString(emp));

	}

}

class Emp2 implements Comparable<Emp2> {
	private int id;
	private String name;

	public Emp2() {

	}

	public Emp2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (obj == null || getClass() != obj.getClass())
			return false;
		if (obj == this)
			return true;

		if (obj instanceof Emp2)
			return true;

		Emp2 e = (Emp2) obj;
		return (this.getId() == e.getId());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + "== " + this.name;
	}

	@Override
	public int compareTo(Emp2 o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}

	public static Comparator<Emp2> NameComparator = new Comparator<Emp2>() {

		@Override
		public int compare(Emp2 o1, Emp2 o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}

	};
}
