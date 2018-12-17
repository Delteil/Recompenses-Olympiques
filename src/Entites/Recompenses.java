package Entites;

public enum Recompenses {
	MEDAILLE_OR("Medaille d'or"),
	MEDAILLE_ARGENT("Medaille d'argent"),
	MEDAILLE_BRONZE("Medaille de bronze"),
	PAS_MEDAILLE("pas de medaille");
	String recompense;

	private Recompenses(String recompense) {
		this.recompense = recompense;
	}

	public String getRecompense() {
		return recompense;
	}

	public void setRecompense(String recompense) {
		this.recompense = recompense;
	}
}
