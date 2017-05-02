package ro.emanuel.info;

public class Apartament extends Proprietate {

	private int nrCamere;
	private int etaj;

	public Apartament(float suprafata, String adresa, Contribuabil proprietar, int nrCamere, int etaj) {
		super(suprafata, adresa, proprietar);
		this.nrCamere = nrCamere;
		this.etaj = etaj;
	}

	public float getValoareImpozabila() {
		return nrCamere * getSuprafata() / 124;
	}

	public int getNrCamere() {
		return nrCamere;
	}

	public void setNrCamere(int nrCamere) {
		this.nrCamere = nrCamere;
	}

	public int getEtaj() {
		return etaj;
	}

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

}
