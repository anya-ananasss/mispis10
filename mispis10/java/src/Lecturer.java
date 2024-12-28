public class Lecturer extends ResearchAssociate {
	private Course[] atribute;


	public Course[] getCourses() {
		return this.atribute;
	}

	/**
	 * 
	 * @param atribute
	 */
	public void setCourses(Course[] atribute) {
		this.atribute = atribute;
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		// TODO - implement Lecturer.addCourse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param course
	 */
	public void removeCourse(Course course) {
		// TODO - implement Lecturer.removeCourse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param fieldOfStudy
	 */
	public Lecturer(int ssNo, String name, String fieldOfStudy) {
		super(ssNo, name, fieldOfStudy);
		// TODO - implement Lecturer.Lecturer
		throw new UnsupportedOperationException();
	}

}