package implementing_the_Factory_Pattern;

public class WordFactory extends DocumentFactory {
	public Document createDocument() {
		return new WordDocument();
	}
}
