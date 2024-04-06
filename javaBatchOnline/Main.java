abstract class Main {
    //If any class has abstract method it should must that class be abstract.
    public abstract void test();
    //abstract method implimentation done by child class
}
class ab extends Main{
        public void test(){
            System.out.println("hello java");
        }
}
class abb
{
    public static void main(String[] args) {
        ab a=new ab();
        a.test();
    }
}