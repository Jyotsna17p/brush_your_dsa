package designpatters.creational.factory;

public class WordFile implements CreateFile{
    @Override
    public void createFile() {
        System.out.println("Word File is created");
    }
}
