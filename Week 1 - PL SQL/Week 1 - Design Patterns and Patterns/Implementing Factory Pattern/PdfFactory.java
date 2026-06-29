package implementing_the_Factory_Pattern;

public class PdfFactory extends DocumentFactory{
	public Document createDocument() {
		return new PdfDocument();
	}
}
