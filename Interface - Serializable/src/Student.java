public class Student implements java.io.Serializable {

    //The class musten implement the java.io.Serializable;
    public String name;
    public String adress;
    public String course;
    public int id;

    public void mailCheck(){
        System.out.println("Mailing a check to " + name + "" + adress);
    }

}
