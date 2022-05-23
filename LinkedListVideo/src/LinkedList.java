
public class LinkedList {
	private Knoten erster;
	
	public LinkedList() {
		erster = null;
	}
	
	public void add(Student student) {
		Knoten k = new Knoten(student);
		
		if (erster == null)
			erster = k;
		else {
			Knoten aktueller = erster;
			while (aktueller.nächster != null) {
				aktueller = aktueller.nächster;
			}
			
			aktueller.nächster = k;
		}
	}

	public Student get(int index) {
		Knoten aktueller = erster;
		for (int i = 0; i < index; i++) {
			aktueller = aktueller.nächster;
		}
		
		return aktueller.passagier;
	}

	public void remove(int index) {
		if (index == 0) {
			erster = erster.nächster;
		} else {
			Knoten aktueller = erster;
			for (int i = 0; i < index -1; i++) {
				aktueller = aktueller.nächster;
			}
			
			aktueller.nächster = aktueller.nächster.nächster;
		}
			
		
	}

	public void add(int index, Student student) {
		Knoten k = new Knoten(student);
		
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
		}
	}
	
	class Knoten {
		private Student passagier;
		private Knoten nächster;
		
		Knoten(Student s) {
			nächster = null;
			passagier = s;
		}
		
	}

}
