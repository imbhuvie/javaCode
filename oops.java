 class Pen {
     String type;
     String color;
    public void write() {
        System.out.println("Writing Something");
    }
    public void printcolor()
    {
        System.out.println(this.color);
    }
}
class sum{
    int a,b;
    public void addition(){
        System.out.println("sum="+ (a+b));
    }
}
class student
{
    String name;
    int id;
}
     class oops{
        public static void main(String[] args) {
            Pen pen1=new Pen();
            Pen pen2=new Pen();
            pen1.type="Gell";     
            pen1.color="Blue";
            pen2.type="Ballpoint";     
            pen2.color="Red";
            // pen1.write();
            System.out.print("color of pen 1 is ");
            pen1.printcolor();
            System.out.print("\ncolor of pen 2 is ");
            pen2.printcolor();
            sum sum1=new sum();
            sum1.a=6;
            sum1.b=7;
            sum1.addition();
            student s1=new student();
            student s2=new student();
            s1.id=10;
            s2.id=12;
            s1.name="Bhupendra Verma";
            s2.name="Rajesh Verma";
            System.out.println(s1.id);
            System.out.println(s1.name);
            System.out.println(s2.id);
            System.out.println(s2.name);
            System.out.println("..............................................");
             Pen pen3=new Pen();
        pen3.type="ball";
        pen3.color="black";
        pen3.printcolor();
    }
    
}    
