package ro.emanuel.info;

public class Auto implements Impozabil {

	private int capacitateMotor;
	private String marca;
	private String model;
	private Contribuabil proprietar;

	public Auto(int capacitateMotor, String marca, String model, Contribuabil proprietar) {
		super();
		this.capacitateMotor = capacitateMotor;
		this.marca = marca;
		this.model = model;
		this.proprietar = proprietar;
	}

	public int getCapacitateMotor() {
		return capacitateMotor;
	}

	public void setCapacitateMotor(int capacitateMotor) {
		this.capacitateMotor = capacitateMotor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Contribuabil getProprietar() {
		return proprietar;
	}

	public void setProprietar(Contribuabil proprietar) {
		this.proprietar = proprietar;
	}

	@Override
	public Contribuabil getContribuabil() {
		return this.proprietar;
	}

	@Override
	public String getAdresaContribuabil() {
		return this.proprietar.getAdresa();
	}

	public float getValoareImpozabila() {
		return capacitateMotor * 0.45f;
	}

}
