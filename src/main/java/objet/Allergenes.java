package objet;

public class Allergenes {


	private int id;
	private long id;
	private String Nom;

	
	public Allergenes(int id, String nom) {

	public Allergenes(String nom) {
		super();
		this.id = id;
		Nom = nom;
	}

	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getid() {
	public long getid() {
		return id;
	}
	public void setid(int id) {
	public void setid(long id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Allergenes [Nom=" + Nom + "]";
	}

}