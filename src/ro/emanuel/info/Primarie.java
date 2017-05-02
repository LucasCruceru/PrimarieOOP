package ro.emanuel.info;

import java.util.HashMap;

public class Primarie {

	private HashMap<String, Contribuabil> contribuabili = new HashMap<String, Contribuabil>();

	public void adaugaContribuabil(Contribuabil c) {
		if (contribuabili.containsKey(c.getId())) {
			System.out.println("Contribuabil DUPLICAT");
		} else {
			contribuabili.put(c.getId(), c);
		}
	}

	public void afisareDatorii(String contribuabilId) {
		if (this.contribuabili.containsKey(contribuabilId)) {
			Contribuabil c = this.contribuabili.get(contribuabilId);
			HashMap<Impozabil, Double> datorii = c.getDatorii();
			System.out.println("Datoriile pt " + c.getNume());
			double total = 0;
			for (Impozabil impoz : datorii.keySet()) {
				total = total + datorii.get(impoz);
			}
			System.out.println(total);
		} else {
			System.out.println("Contribubil inexistent in sistem");
		}
	}

	/**
	 * Aceasta metoda intoarce restul de plata a contribuabilului dupa ce
	 * plateste
	 * 
	 * @param contribuabilId
	 * @param suma
	 * @return
	 */
	public double platesteDatorie(String contribuabilId, double suma) {
		if (contribuabili.containsKey(contribuabilId)) {
			Contribuabil c = contribuabili.get(contribuabilId);
			double totalDatorie = 0;
			for (Impozabil imp : c.getDatorii().keySet()) {
				if (c.getDatorii().get(imp) > 0) {
					double datorie = c.getDatorii().get(imp);
					if (suma >= datorie) {
						c.getDatorii().put(imp, 0d);
						suma = suma - datorie;
					} else {
						c.getDatorii().put(imp, datorie - suma);
						suma = 0;
					}
				}
				totalDatorie = totalDatorie + c.getDatorii().get(imp);
			}
			return totalDatorie;
		} else {
			System.out.println("Id Contribuabil invalid");
			return 0d;
		}
	}

}
