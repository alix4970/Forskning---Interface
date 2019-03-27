import java.io.*;
public class DeserializeDemo {
    public static void main(String[] args) {
        Student e = null;
        //The try/catch block tries to catch a ClassNotFoundException, which is declared by the readObject() method.
        // For a JVM to be able to deserialize an object, it must be able to find the bytecode for the class.
        try{
            FileInputStream fileIn = new FileInputStream("/Users/alialsharefi/Desktop/Datamatiker/2.Semester/Kodning/Interface - Serializable/Student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //Notice that the return value of readObject() is cast to an Employee reference
            e = (Student) in.readObject();
            in.close();
            fileIn.close();

        }catch (IOException i){
            i.printStackTrace();
            return;

            //
        }catch (ClassNotFoundException c){
            System.out.println("Student was not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Student..");
        System.out.println("Name: " + e.name);
        System.out.println("Adress: " + e.adress);
        System.out.println("Course: " + e.course);
        System.out.println("ID: " + e.id);

    }
}
