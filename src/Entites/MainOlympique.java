package Entites;

public class MainOlympique {

	public static void main(String[] args) {
		Athletes athlete1 = new Athletes("Bond", "James");
		athlete1.addRecompensesAndDisciplines(Recompenses.MEDAILLE_ARGENT, Disciplines.COURSE_100M);
		athlete1.addRecompensesAndDisciplines(Recompenses.MEDAILLE_OR, Disciplines.COURSE_100M);
		athlete1.addRecompensesAndDisciplines(Recompenses.MEDAILLE_OR, Disciplines.SAUT_HAUTEUR);
		System.out.println(athlete1);
		Athletes athlete2 = new Athletes("Marley", "Bob");
		athlete2.addRecompensesAndDisciplines(Recompenses.MEDAILLE_BRONZE, Disciplines.SAUT_PERCHE);
		athlete2.addRecompensesAndDisciplines(Recompenses.MEDAILLE_OR, Disciplines.COURSE_100M);
		athlete2.addRecompensesAndDisciplines(Recompenses.MEDAILLE_ARGENT, Disciplines.SAUT_HAUTEUR);
		athlete2.addRecompensesAndDisciplines(Recompenses.PAS_MEDAILLE, Disciplines.SAUT_HAUTEUR);
		System.out.println(athlete2);
	}

}
