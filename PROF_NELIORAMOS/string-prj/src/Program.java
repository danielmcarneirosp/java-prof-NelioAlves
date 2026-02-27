
public class Program {

	public static void main(String[] args) {
		
		String original ="Teste de Sistemas de Informação    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('e', 'a');
		String s07 = original.replace("de", "da");
		int i = original.indexOf("te");
		int z = original.lastIndexOf("ma");
		String[] vect = original.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		String word4 = vect[3];
		String word5 = vect[4];
			
		
		System.out.println("Orignal: "+original + "-");
		System.out.println("toLowcase: " +s01 + "-");
		System.out.println("toUppercase: " +s02 + "-");
		System.out.println("trim: -" +s03 + "-");
		System.out.println("substring(2): " + s04 + "-");
		System.out.println("substring(2,9): " + s05 + "-");
		System.out.println("replace('e', 'a'): " + s06 );
		System.out.println("replace('de', 'da)': " + s07 );
		System.out.println("indexOf('te'): " + i );
		System.out.println("lastIndexOf('ma'): " + z );
		System.out.println("split vect[0]: " + word1 );
		System.out.println("split vect[1]: " + word2 );
		System.out.println("split vect[2]: " + word3 );
		System.out.println("split vect[3]: " + word4 );
		System.out.println("split vect[4]: " + word5 );
		

	}

}
