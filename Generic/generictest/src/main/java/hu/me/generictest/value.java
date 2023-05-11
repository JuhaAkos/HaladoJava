package hu.me.generictest;

public class value<T> {
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id.hashCode();
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
		value other = (value) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public value(T id) {
		super();
		this.id = id;
	}	
	
	
}
