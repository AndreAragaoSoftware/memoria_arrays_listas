package application;

public class Program_02 {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("------------------");
		
		// Mesma coisa do de cima, so cond diferente. 1°tipo=String, 2°apelido=obj, 3°coleção
		for(String obj : vect) {
			System.out.println(obj);
		}
		
		
	}

}
