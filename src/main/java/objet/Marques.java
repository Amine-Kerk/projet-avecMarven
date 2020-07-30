package objet;

public class Marques {

	private int id;
	private long id;
	private String nom;


	public Marques(int id, String nom) {
	public Marques(String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public int getId() {
	public long getId() {
		return id;
	}
	public void setId(int id) {
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Marques [id=" + id + ", nom=" + nom + "]";
	}
	
}