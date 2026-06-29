package implementing_the_Factory_Pattern;

public class ExcelFactory extends DocumentFactory{
    public Document createDocument() {
        return new ExcelDocument();
    }

}
