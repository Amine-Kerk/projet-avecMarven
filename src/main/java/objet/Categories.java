package objet;
public class Categories {


	private int id;
	private long id;
	private String nom;

	public Categories(int id, String nom) {
	public Categories(String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public int getid() {
	public long getid() {
		return id;
	}
	public void setid(int id) {
	public void setid(long id) {
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
		return "Categories [id=" + id + ", nom=" + nom + "]";
	}
}