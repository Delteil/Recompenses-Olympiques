package Entites;

public enum Disciplines {

	SAUT_HAUTEUR("saut en hauteur"), COURSE_100M("course de 100mtr"), SAUT_PERCHE("saut à la perche");

	String discipline;

	private Disciplines(String discipline) {
		this.discipline = discipline;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

}
