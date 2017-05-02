package ro.emanuel.info;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// pers fizica: auto + ap
		// pers juridica: casa+teren+2xauto
		Contribuabil pf = new PersoanaFizica("Mircea", "acasa", "123456789", new HashMap<Impozabil, Double>(),
				"1111111", 'M');

		Auto aPF = new Auto(1900, "VW", "Pasat", pf);
		Apartament ap = new Apartament(100, "acasa", pf, 3, 1);

		pf.getDatorii().put(aPF, new Double(aPF.getValoareImpozabila()));
		pf.getDatorii().put(ap, new Double(ap.getValoareImpozabila()));

		Primarie primarie = new Primarie();
		primarie.adaugaContribuabil(pf);

		primarie.afisareDatorii("1111111");
	}

}
