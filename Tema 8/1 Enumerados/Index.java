package Enumerados;

public class Index {

	public static void main(String[] args) {
		String input = "       aprendiendo enums       ";
		
		// Usando BasicStringOperation
		for (BasicStringOperation operation : BasicStringOperation.values()) {
			System.out.println(operation.getDescription() + ": \"" + operation.apply(input) + "\"");
		}
		System.out.println();
		// Usando ExtendedStringOperation
		for (ExtendedStringOperation operation : ExtendedStringOperation.values()) {
			System.out.println(operation.getDescription() + ": \"" + operation.apply(input) + "\"");
		}
	}

}
