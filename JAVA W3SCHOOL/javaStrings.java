// import javax.sound.midi.Soundbank;

public class javaStrings {
    public static void main(String[] args) {
        //A String variable contains a collection of characters surrounded by double quotes:
        String name="Bhupendra Verma";
        System.out.println(name);
        //A String in Java is actually an object, which contain methods that can perform certain operations on strings
        System.out.println("length of string is :"+name.length());
        System.out.println("name in oppercase :"+name.toUpperCase());
        String text="HII FRIEND HOW ARE YOU";
        System.out.println("text in lowercase: "+text.toLowerCase());       
        System.out.println("Index of how: "+text.indexOf("how"));//it give -1 because how is not there.
        System.out.println("Index of HOW: "+text.indexOf("HOW"));
        String nam="bhupendra ",sirname="verma";
        System.out.println(nam+sirname);
        System.out.println(nam.concat(sirname));
        // '+' is used for both concat and addition such as
        int a=30,b=20;
        System.out.println("a+b="+(a+b));
        String a1="30",b1="20";
        System.out.println("a1+b1="+(a1+b1));
        System.out.println("my name is bhupendra \"form krimani\"");
        System.out.println("my name is bhupendra \'form krimani\'");
        System.out.println("my name is bhupendra \\form krimani\\");
        System.out.println("my \n name \r is bhupendra \t form \f kirmani \b and i wish to go my home ");
        // \r overwriting the text that was previously on that line.
        // \f introduce a new page in printed documents.
        
        //JAVA MATH FUNCTIONS

        System.out.println(Math.max(5,10));
        System.out.println(Math.min(100,25));
        System.out.println(Math.sqrt(5));
        System.out.println(Math.abs(-2.0325));
        Double o=Math.random();
        System.out.println(o);
        int l=(int)(o*(10 - 1 + 1) + 1);
        System.out.println("l="+l);
        System.out.println((int) (Math.random() * (500 - 10 + 1)) + 10);
        //[(int) (Math.random() * (max - min + 1)) + min] 
        //it is formula to create a randon number between a range.
        String n1="bhupendra";
        String n2="verma";
        System.out.println(n1.concat(n2));
        System.out.println(n1+n2); //both bottom are working same




    } 
}
