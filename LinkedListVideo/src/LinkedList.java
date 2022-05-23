
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

	public void remove(int i) {
		
	}

	public void add(int i, Student s4) {
		
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
