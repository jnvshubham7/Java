
import java.util.ArrayList;

public class array_list{

    public static void main(String arg[])
    {
        ArrayList<String> arr = new ArrayList<>();

        // System.out.print(arr);

        arr.add("shubnam");
        arr.add("ssss");

        System.err.println(arr);


        arr.remove("shubnam");

        System.err.println(arr.size());

        arr.clear();

        System.err.println(arr);

        


        
    }




}