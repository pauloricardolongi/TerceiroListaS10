package aplicacao;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); 
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");//posição 2 da lista inseri o Marco
		
		for (String c : list) {
			System.out.println(c);
		}
	}

}
