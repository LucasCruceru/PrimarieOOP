package ro.emanuel.info;

public class Teren extends Proprietate {

	private boolean intravilan;

	public Teren(float suprafata, String adresa, Contribuabil proprietar, boolean intravilan) {
		super(suprafata, adresa, proprietar);
		this.intravilan = intravilan;
	}

	public boolean isIntravilan() {
		return intravilan;
	}

	public void setIntravilan(boolean intravilan) {
		this.intravilan = intravilan;
	}

	@Override
	public float getValoareImpozabila() {
		return getSuprafata() * 0.367f;
	}

}
