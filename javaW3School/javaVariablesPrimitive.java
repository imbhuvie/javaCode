public class javaVariablesPrimitive {
    public static void main(String args[]) {
        // This is a single line comment
        System.out.print("Hello Java By W3 School  ");// does not insert space at end
        System.out.println("Hey I am learning java from w3 school");// Insert space at end
        System.out.print("and i learned to much from W3 School\n");
        System.out.println(10); // it is a decimal number
        System.out.println(0X250AF); // it is a hexadecimal number
        System.out.println(9 + 65 * 2);
        System.out.println(1001010100);
        System.out.println(0124);// it is a octal number
        // max 10 value can take in a println method more than that give us error
        /*Data types are divided into two groups:
        Primitive data types - includes byte, short, int, long, float,
        double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes 
        Primitive Data Types-----
        A primitive data type specifies the size and type of variable values, 
        and it has no additional methods. 
        Data Type	Size	Description
        byte	1 byte	Stores whole numbers from -128 to 127
        short	2 bytes	Stores whole numbers from -32,768 to 32,767
        int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	1 bit	Stores true or false values
        char	2 bytes	Stores a single character/letter or ASCII values*/
        
        // data types in java
        // data types -example of data type with variable initialization
        // byte -byte j=120;
        // short -short k=20;
        // int -int num1=20;
        // float -float num2=10.32;
        // long -long long1=2561;
        // double -double d1=104654635;
        // char -char gender='m';
        // String -String name="Bhupendra Verma";
        // boolean -boolean isAdult=true;

        // byte
        byte byte1 = 120;
        System.out.println("byte byte1=" + byte1);

        // short
        short short1 = 20;
        System.out.println("short short1=" + short1);

        // int
        int num1 = 20;
        System.out.println("num1=" + num1);
        int x, y, z;
        x = 7;
        y = 10;
        System.out.println("without third variable x+y=" + (x + y));
        x = 97;
        y = 20;
        z = x + y;
        System.out.println("with third variable x+y=" + z);
        int a, b, c, d, e, f;
        a = b = c = d = e = f = 101; // Assigning multiple variables values at a time
        System.out.println("a+b+c+d+e+f=" + (a + b + c + d + e + f));
        int $number = 300;// varibale name can start with $ and _ but not with number
        System.out.println("$number=" + $number);
        int _number = 100;
        System.out.println("_number=" + _number);

        // float
        float num2 = 10.32f;
        System.out.println("num2=" + num2);
        float n1, n2;
        n1 = n2 = 2.3f; // always write f after float number
        System.out.println("n1+n2=" + (n1 + n2));
        // long
        long long1 = 2561;
        System.out.println("long long1=" + long1);

        // double
        double dub = 235695;
        System.out.println("double dub=" + dub);

        // float and double also represent the scientific number with e
        float f1 = 35e11f;// it can be 35E11F also;
        System.out.println("f1=" + f1);
        double d1 = 35e11f;// it can be 35F11F also;
        System.out.println("d1=" + d1);

        // char
        char gender = 'n';
        System.out.println("gender=" + gender);
        char p = 'a';
        System.out.println("a=" + p);
        char j=65,l=48,o=97; //it print the char which ASCII value is this so
        System.out.println("j="+j);
        System.out.println("l="+l);
        System.out.println("o="+o);

        // String
        String name = "Bhupendra Verma";
        System.out.println("name=" + name);
        String fname = "bhupendra";
        String lname = "verma";
        System.out.println("My name is " + fname + " " + lname);

        // boolean
        boolean isAdult = true;
        System.out.println("isAdult=" + isAdult);
        if (isAdult)
            System.out.println("1.isadult is true then YES YOU ARE ADULT");
        else
            System.out.println("2.isadult is false then you are not adult");
        isAdult = false;
        if (isAdult)
            System.out.println("3.isadult is true then YES YOU ARE ADULT");
        else
            System.out.println("4.isadult is false then you are not adult");
    }
}
