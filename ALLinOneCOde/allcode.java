import java.util.Array;

public class allcode {
    public static void main(String[] args) {
        a s1 = new a(20, "bhup");
        a s2 = new a(30,"Anurag");   
        //s1.a1();
        int a[]={10,20,30,40};
        System.out.println(a[0]);
        System.out.println(a.length);//to get length of an array.
        allcode.sort(a);
        }
}
class a {
    int rn;
    String name;
    a(int a, String b)//it is a argumented constrant 
    {
        this.rn = a;
        this.name = b;
        //System.out.println(this.rn + this.name);

    }
    public void a1() {
        System.out.println(this.rn + this.name);
    }
}
