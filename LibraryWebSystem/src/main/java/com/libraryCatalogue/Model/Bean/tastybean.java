package com.libraryCatalogue.Model.Bean;

public class tastybean {
	private int id;
	private String taste;

	private boolean eat;

	public tastybean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public tastybean(int id, String taste) {
		super();
		this.id = id;
		this.taste = taste;
		this.eat = false;
	}

	@Override
	public String toString() {
		return "tastybean [id=" + id + ", taste=" + taste + ", eat=" + eat + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tastybean other = (tastybean) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public boolean isEat() {
		return eat;
	}

	public void setEat(boolean eat) {
		this.eat = eat;
	}

}
