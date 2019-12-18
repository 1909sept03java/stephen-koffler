
public class Person {
	int id;
	String fname;
	
	
	public Person(int id, String fname) {
		super();
		this.id = id;
		this.fname = fname;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
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
		Person other = (Person) obj;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (id != other.id)
			return false;
		return true;
	}




	public static void main(String[] args) {
		
		Person sk = new Person(1, "Stephen");
		Person sgk = new Person(1, "Stephen");
		Person SK = sk;
		
		System.out.println(sk==sgk);
		System.out.println(sk==SK);
		System.out.println(sk.equals(sgk));
		System.out.println(SK.equals(sgk));
		System.out.println(SK==sgk);
		
		

	}

}
