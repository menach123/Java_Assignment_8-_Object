package default_;

public class MyObject {
	
	private long id;
	
	public MyObject(long x) {
		id = x;
	}
	
	@Override
	public boolean equals(Object o ) {
		
		if (o instanceof MyObject) {
			return (((MyObject) o).id == this.id);
		}
		return false;
	}

}
