public class javaArray {
    public static void main(String[] args) {
        int a[] = {2,5,8,34,95};
        System.out.println("Length of array : "+a.length);
        // for(int i=0;i<a.length;i++)
        // System.out.println(a[i]);
        String[] name={"bhuvie","bhupendra","mohit"};
        // System.out.println(name[0]);
        // System.out.println(name[1]);
        // System.out.println(name.length);
        
        //for each loop working 
        for(String i:name)
        {
            System.out.println(i);
        }
    }
}
