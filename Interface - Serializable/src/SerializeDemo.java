import java.io.*;
public class SerializeDemo {
    public static void main(String[] args) {
        Student e = new Student();
        e.name = "Ali Al-Sharefi";
        e.adress = "Norrebrogade 127";
        e.course = "Datamatiker";
        e.id = 79436;

        try{
            FileOutputStream fileOut = new FileOutputStream("/Users/alialsharefi/Desktop/Datamatiker/2.Semester/Kodning/Interface - Serializable/Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /Users/alialsharefi/Desktop/Datamatiker/2.Semester/Kodning/Interface - Serializable");
        }catch (IOException i){
            i.printStackTrace();
        }


    }
}
