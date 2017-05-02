package ro.emanuel.info;

public abstract class Proprietate implements Impozabil {

	private float suprafata;
	private String adresa;
	private Contribuabil proprietar;

	public Proprietate(float suprafata, String adresa, Contribuabil proprietar) {
		this.suprafata = suprafata;
		this.adresa = adresa;
		this.proprietar = proprietar;
	}

	public abstract float getValoareImpozabila();

	public Contribuabil getContribuabil() {
		return proprietar;
	}

	public String getAdresaContribuabil() {
		return proprietar.getAdresa();
	}

	public float getSuprafata() {
		return suprafata;
	}

	public void setSuprafata(float suprafata) {
		this.suprafata = suprafata;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Contribuabil getProprietar() {
		return proprietar;
	}

	public void setProprietar(Contribuabil proprietar) {
		this.proprietar = proprietar;
	}

}
