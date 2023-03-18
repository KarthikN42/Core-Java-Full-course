
public class occurenceOfCharacter {

	public void usingIteration() {
		String word = "Kathikkettavan";
		char charToFind = 'a';
		int occurence = 0;
		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == charToFind) {
				occurence = occurence + 1;
			}
		}

		System.out.println(occurence);

	}

	public void withoutIterator() {
		String inuputWord = "KARTHIKKETTAVAN";
		char ToFind = 'a';

		String charToFind = Character.toString(ToFind).toUpperCase();
		
		int actualLength = inuputWord.length();
		System.out.println(actualLength);

		inuputWord = inuputWord.replace(charToFind, "");

		int afterReplacelength = inuputWord.length();
		System.out.println("After replace" + inuputWord);
		int finall = actualLength - afterReplacelength;
		System.out.println("occurence of A word " + finall);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		occurenceOfCharacter obj = new occurenceOfCharacter();
		// obj.usingIteration();
		obj.withoutIterator();
	}

}
