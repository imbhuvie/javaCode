public class javaVariablesNon_Primitive {
    public static void main(String[] args) {
        /*Non-primitive data types are called reference types because they refer to objects.
        The main difference between primitive and non-primitive data types are:
        Primitive types are predefined (already defined) in Java.Non-primitive types are created by the programmer and is not defined by 
        Java (except for String).
        Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        A primitive type has always a value, while non-primitive types can be null.
        A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
        The size of a primitive type depends on the data type, while non-primitive types have all the same size.
        Examples of non-primitive types are 
        Strings
        Arrays
        Classes
        Interface, etc. */
        /*Java Type Casting
        Type casting is when you assign a value of one primitive data type to another type.
        In Java, there are two types of casting:
        Widening Casting (automatically) - 
        converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
        Narrowing Casting (manually) - 
        converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte */
        //Widening(automatically) type casting
        byte a=10;
        short b=152;
        int c=2000;
        float d=35.25f;
        double e=5668.45484f;
        System.out.println(" a="+a+" b="+b+" c="+c+" d="+d+" e="+e);
        e=d;d=c;c=b;b=a;
        System.out.println(" a="+a+" b="+b+" c="+c+" d="+d+" e="+e);
        char ch='n';
        System.out.println("ch= "+ch);
        String ch1="bhupendra";
        ch1=Character.toString(ch);
        System.out.println("after ch1=ch then ch= "+ch1);
        //Narrowing Casting (manually) type casting
        a=10;
        b=20;
        c=63;
        d=25.36f;
        e=.036458645f;
        a=(byte)b;
        System.out.println("a="+a);
        b=(short)c;
        System.out.println("b="+b);
        c=(int)d;
        System.out.println("c="+c);
        d=(float)e;
        System.out.println("d="+d);
        /*Java divides the operators into the following groups:
        Arithmetic operators
        Assignment operators
        Comparison operators
        Logical operators
        Bitwise operators */
        // Arithmetic operators
        //+,-,*,/,%,++,--
        c=20;
        a=25;
        b=23;
        c=a+b;
        System.out.println("a+b="+c);
        a=(byte)(b+c);//it not done without explicit typecasting
        System.out.println("b+c="+a);
        // Assignment operators
        //==,+=,-=
        int x,y,z;
        x=10;y=20;z=30;
        System.out.println("x,y,z="+" "+x+" "+y+" "+z);
        x+=y;
        System.out.println("x="+x);
        x-=z;
        System.out.println("x="+x);
        x=40;
        System.out.println("x="+x);
        x*=y;
        System.out.println("x="+x);
        x/=y;
        System.out.println("x="+x);
        x=55;
        System.out.println("x="+x);
        x%=y;
        System.out.println("x="+x);
        
        // Comparison operators
        System.out.println("Comparision operators");
        x=40;y=50;
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x!=y);
        System.out.println(x==y);
        System.out.println(x<=y);
        System.out.println(x>=y);
    
        // Logical operators
        System.out.println("Logical operators");
        System.out.println(x<y && x<=y);
        System.out.println(x<y || x==y);
        System.out.println(x<y && x>=y);
        System.out.println(x<y || x<=y);
        

        // Bitwise operators
        x=10;
        x&=7; //It simply do x&7 perform AND operation on binary of both  
        System.out.println("x="+x);
        x|=7; //It simply do x|7 perform OR operation on binary of both  
        System.out.println("x="+x);
        x^=3; //It simply do x^7 perform XOR operation on binary of both  
        System.out.println("x="+x);
        x=26;
        x>>=2; //It simply do x^7 perform XOR operation on binary of both  
        System.out.println("x="+x);
        x<<=3; //It simply do x^7 perform XOR operation on binary of both  
        System.out.println("x="+x);
        
        x=4;
        x=~x;
        System.out.println(x);//first get 1's compliment then get its 2's compliment and negate it.
        
    }
}
