package aplicacao;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); 
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());		
	
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		list.removeIf(x -> x.charAt(0)== 'M');//remover por predicado- inicio da letra do nome

		for (String x : list) {
			System.out.println(x);
	}
		System.out.println("-------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));//encontrar a posi��o de um elemento
		System.out.println("Index of Paulo: " + list.indexOf("Paulo"));//encontrar elemento que n�o existe na lista 
		
		System.out.println("-------------------------------");
		List<String> resultado = list.stream().
				filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());
		for (String x : resultado) {
			System.out.println(x);
		//filtar a lista e deixar s�  nomes que come�a com A"

}
	}
}
