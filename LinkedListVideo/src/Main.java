
public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Hans", "Meier", 12345);
		
		Student s2 = new Student("Sarah", "Moor", 11111);
		
		Student s3 = new Student("David", "Müller", 22222);
		
		LinkedList<Student> lili = new LinkedList<>();
		
		lili.add(s1);
		lili.add(s2);
		lili.add(s3);
		
		System.out.println( lili.get(1) ); // Fr. Moor
		
		lili.remove(1);
		
		System.out.println( lili.get(1) ); // Hr. Müller
		
		Student s4 = new Student("Hannah", "Heinrich", 33333);
		
		lili.add(1, s4);
		
		System.out.println();
		System.out.println( lili.get(0) ); // Meier
		System.out.println( lili.get(1) ); // Heinrich
		System.out.println( lili.get(2) ); // Müller
	}

}
