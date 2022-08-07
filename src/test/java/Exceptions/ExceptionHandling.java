package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        createFile();
        multipleExceptions();
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

    public static void multipleExceptions(){
        File file = new File("resources/sample.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while(scanner.hasNext()){
                double num = scanner.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
/**         Another way to do this
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
 **/
    }

}
