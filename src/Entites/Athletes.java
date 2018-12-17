package Entites;

import java.util.ArrayList;

public class Athletes {
	String nom;
	String prenom;
	ArrayList<Disciplines> disciplines = new ArrayList<Disciplines>();
	ArrayList<Recompenses> recompenses = new ArrayList<Recompenses>();

	public Athletes(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;

	}

	@Override
	public String toString() {
		ArrayList<String> affiche = new ArrayList<String>();
		int index = 0;
		for (Recompenses re : recompenses) {
			affiche.add(re.getRecompense() + " " + disciplines.get(index).getDiscipline() + "\r\n");
			index++;
		}
		return "Personne nom=" + nom + ", prenom= " + prenom + ",\r\n" + affiche;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public ArrayList<Disciplines> getDisciplines() {
		return disciplines;
	}

	public ArrayList<Recompenses> getRecompenses() {
		return recompenses;
	}

	public void addRecompensesAndDisciplines(Recompenses recompense, Disciplines discipline) {
		this.recompenses.add(recompense);
		this.disciplines.add(discipline);
	}

}
