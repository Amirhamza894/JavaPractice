package ThrowingExceptions;

import java.io.File;
import java.io.IOException;

public class throwExceptions{
    public static void main(String[] args) throws Exception{
        createFileThrowException();
    }
    public static void createFile(){
        File file = new File("resources/resources.txt");
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println("the file directory is not found");
            e.printStackTrace();
        }
    }
    public static void createFileThrowException() throws Exception{
        File file = new File("resources/resources.txt");
        file.createNewFile();
    }
}
