public class Institute {

	private String name;
	private String address;
	private ResearchAssociate[] attribute;

	public ResearchAssociate[] getEmployees() {
		return this.attribute;
	}

	public void setEmployees(ResearchAssociate[] attribute) {
		this.attribute = attribute;
	}

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

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * 
	 * @param employee
	 */
	public void hire(ResearchAssociate employee) {
		// TODO - implement Institute.hire
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employee
	 */
	public void fire(ResearchAssociate employee) {
		// TODO - implement Institute.fire
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

}