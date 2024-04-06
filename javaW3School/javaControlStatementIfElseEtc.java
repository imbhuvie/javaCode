public class javaControlStatementIfElseEtc {
    public static void main(String[] args) {
        int n=8;
        System.out.println("table of "+n+" :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(i*n));
        }
        if(n%2==0)
        {
            System.out.println(n+" is even Number.");
        }
        else
        {
            System.out.println(n+" is odd number.");
        }

        int mark=10;
        if(mark>70)
        System.out.println("Well Passed.");
        else if(mark<71&&mark>33)
        System.out.println("just passed, just to hell.");
        else
        System.out.println("You are fail, no need to be here leave my home.");
        //Ternary Operator Syntex
        //variable = (condition) ? expressionTrue :  expressionFalse;
        int year=2020;
        String msg;
        msg=(year%400==0||year%4==0&&year%100!=0)?"is Leap year":"is not Leap year";
        System.out.println(year+" "+msg);
        int fact =1;
        n=5;
        for(int i=n;i>1;i--)
{
    fact=fact*i;
}
        System.out.println("fact : "+fact);

        System.out.println("Hello Java");
    
    
    
    
    }

}
