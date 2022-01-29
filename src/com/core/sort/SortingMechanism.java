package com.core.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingMechanism {

	public static void main(String[] args) {

		List<Emp> list = Arrays.asList(new Emp(1, "a"), new Emp(3, "c"), new Emp(2, "b"));
		Collections.sort(list, new Sortbyroll());

		System.out.println("\nSorted by emp id");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

	}

}

class Sortbyroll implements Comparator<Emp> {

	@Override
	public int compare(Emp arg0, Emp arg1) {
		// TODO Auto-generated method stub
		return arg1.getId() - arg0.getId();
	}
}

class Emp {
	private int id;
	private String name;

	public Emp() {

	}

	public Emp(int id, String name) {
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

		if (obj instanceof Emp)
			return true;

		Emp e = (Emp) obj;
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

}
