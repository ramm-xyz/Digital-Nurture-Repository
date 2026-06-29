package implementing_the_Factory_Pattern;

public class ExcelDocument implements Document{
    public void open() {
        System.out.println("open excel document");
    }
}
