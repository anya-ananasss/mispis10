public class Faculty {

	private String name;
	private Institute institutes;
	private Institute[] attribute;

	public Institute[] getInstitutes() {
		return this.attribute;
	}

	public void setInstitutes(Institute[] attribute) {
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

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		// TODO - implement Faculty.addInstitute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param institute
	 */
	public void removeInstitute(Institute institute) {
		// TODO - implement Faculty.removeInstitute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public Faculty(String name) {
		this.name = name;
	}

}