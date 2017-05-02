package ro.emanuel.info;

import java.util.HashMap;

public class PersoanaJuridica extends Contribuabil {

	private String cui;
	private String administrator;

	public PersoanaJuridica(String nume, String adresa, String telefon, HashMap<Impozabil, Double> datorii, String cui,
			String administrator) {
		super(nume, adresa, telefon, datorii);
		this.cui = cui;
		this.administrator = administrator;
	}

	@Override
	public String getId() {
		return this.cui;
	}

	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public String getAdministrator() {
		return administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

}
