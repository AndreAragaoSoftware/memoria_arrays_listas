package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program_Liste {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// add Marcos na posição 2
		list.add(2, "Marco");
		
		//tamanho da lista
		System.out.println(list.size());
		
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("-----------------");
		
		//remover um elemento da lista, q pode ser por posição ou 1 ou elemento "Alex"
		list.remove(1);
		
		//remover por um predicado
		//Ex: todo elemento x da lista que começe com "M"
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String obj : list) {
			System.out.println(obj);
		}
		System.out.println("-----------------");
		
		//achar posição na lista de um elemento se não encontrar retorna -1
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		
		System.out.println("-----------------");
		
		//filtro da lista, todos elementos que começão com 'A'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String obj : result) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------");
		
		// pega o primeiro elemento da lista q comece com 'A' 
		// se por acaso não tiver retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
		
		

		
		