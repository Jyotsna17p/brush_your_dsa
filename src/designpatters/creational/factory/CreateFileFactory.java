package designpatters.creational.factory;

public class CreateFileFactory {

    public CreateFile getFileType(String file){
        if(file.equals("word")){
            return new WordFile();
        } else if(file.equals("excel")) {
            return new ExcelFile();
        }
        return null;
    }

}
