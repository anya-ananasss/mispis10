public abstract class Employee {

	protected String name;
	protected String email;
	protected int counter;
	protected int ssNo;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public int getCounter() {
		return this.counter;
	}

	/**
	 * 
	 * @param counter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getSsNo() {
		return this.ssNo;
	}

}