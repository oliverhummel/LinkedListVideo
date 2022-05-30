
public class LinkedList<T> {
	private Knoten erster;
	private Knoten letzter;
	
	public LinkedList() {
		erster = null;
		letzter = null;
	}
	
	public void add(T t) {
		Knoten k = new Knoten(t);
		
		if (erster == null)
			erster = letzter = k;
		else {
			Knoten aktueller = erster;
			while (aktueller.nächster != null) {
				aktueller = aktueller.nächster;
			}
			
			aktueller.nächster = k;
			letzter = k;
		}
	}

	public T get(int index) {
		Knoten aktueller = erster;
		for (int i = 0; i < index; i++) {
			aktueller = aktueller.nächster;
		}
		
		return aktueller.passagier;
	}

	public void remove(int index) {
		if (index == 0) {
			erster = erster.nächster;
			
			if (letzter == erster)
				letzter = null;
		} else {
			Knoten aktueller = erster;
			for (int i = 0; i < index -1; i++) {
				aktueller = aktueller.nächster;
			}
			
			aktueller.nächster = aktueller.nächster.nächster;
			
			if (aktueller.nächster == letzter)
				letzter = aktueller;
		}
			
	}

	public void add(int index, T t) {
		Knoten k = new Knoten(t);
		
		if (index == 0) {
			k.nächster = erster;
			erster = k;
		} else {
			Knoten aktueller = erster;
			for (int i = 0; i < index -1; i++) {
				aktueller = aktueller.nächster;
			}
			
			k.nächster = aktueller.nächster;
			aktueller.nächster = k;
			
			if (aktueller == letzter)
				letzter = k;
		}
	}
	
	class Knoten {
		private T passagier;
		private Knoten nächster;
		
		Knoten(T t) {
			nächster = null;
			passagier = t;
		}
		
	}

}
