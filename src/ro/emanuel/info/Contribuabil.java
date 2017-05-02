package ro.emanuel.info;

import java.util.HashMap;

public abstract class Contribuabil {
	private String nume;
	private String adresa;
	private String telefon;
	private HashMap<Impozabil, Double> datorii;

	public Contribuabil(String nume, String adresa, String telefon, HashMap<Impozabil, Double> datorii) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.telefon = telefon;
		this.datorii = datorii;
	}

	public abstract String getId();

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public HashMap<Impozabil, Double> getDatorii() {
		return datorii;
	}

	public void setDatorii(HashMap<Impozabil, Double> datorii) {
		this.datorii = datorii;
	}

}
