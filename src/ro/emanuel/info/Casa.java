package ro.emanuel.info;

public class Casa extends Proprietate {

	private double suprafataTeren;
	private int nrCamere;

	public Casa(float suprafata, String adresa, Contribuabil proprietar, double suprafataTeren, int nrCamere) {
		super(suprafata, adresa, proprietar);
		this.suprafataTeren = suprafataTeren;
		this.nrCamere = nrCamere;
	}

	@Override
	public float getValoareImpozabila() {
		return (float) (getSuprafata() * 0.67 + suprafataTeren * 0.15);
	}

	public double getSuprafataTeren() {
		return suprafataTeren;
	}

	public void setSuprafataTeren(double suprafataTeren) {
		this.suprafataTeren = suprafataTeren;
	}

	public int getNrCamere() {
		return nrCamere;
	}

	public void setNrCamere(int nrCamere) {
		this.nrCamere = nrCamere;
	}

}
