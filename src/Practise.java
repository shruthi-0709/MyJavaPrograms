public class Practise {

    String name;
    int age;
    void getPersonData(){

         name = "Shruthi";
        age =22;

        System.out.println("My name is :" + name);
        System.out.println("My age is :" + age);
    }
    /*void talk(){
        System.out.println("My name is :" + name);
        System.out.println("My age is :" + age);

    }*/
    public static void main(String[] args) {
        Practise p = new Practise();
        p.getPersonData();
       // p.talk();

    }
}
