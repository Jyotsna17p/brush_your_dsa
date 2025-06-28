package designpatters.creational.factory;

public class ExcelFile implements CreateFile{
    @Override
    public void createFile() {
        System.out.println("Excel File is created");
    }
}
