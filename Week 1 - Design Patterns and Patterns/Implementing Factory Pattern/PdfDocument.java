package implementing_the_Factory_Pattern;

public class PdfDocument implements Document{
	public void open() {
		System.out.println("open pdf document");
	}
}
