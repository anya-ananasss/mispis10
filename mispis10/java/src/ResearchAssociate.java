public class ResearchAssociate extends Employee {

	protected String fieldOfStudy;
	protected Project[] attribute;

	public Project[] getProjects() {
		return this.attribute;
	}

	public void setProjects(Project[] attribute) {
		this.attribute = attribute;
	}

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	/**
	 * 
	 * @param fieldOfStudy
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	/**
	 * 
	 * @param project
	 */
	public void startProject(int project) {
		// TODO - implement ResearchAssociate.startProject
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param project
	 */
	public void finishProject(int project) {
		// TODO - implement ResearchAssociate.finishProject
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param fieldOfStudy
	 */
	public ResearchAssociate(int ssNo, String name, String fieldOfStudy) {
		this.ssNo = ssNo;
		this.name = name;
		this.fieldOfStudy = fieldOfStudy;
	}

}