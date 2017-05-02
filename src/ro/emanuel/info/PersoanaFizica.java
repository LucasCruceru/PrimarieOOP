package ro.emanuel.info;

import java.util.HashMap;

public class PersoanaFizica extends Contribuabil {

	private String cnp;
	private char sex;

	public PersoanaFizica(String nume, String adresa, String telefon, HashMap<Impozabil, Double> datorii, String cnp,
			char sex) {
		super(nume, adresa, telefon, datorii);
		this.cnp = cnp;
		this.sex = sex;
	}

	@Override
	public String getId() {
		return this.cnp;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
