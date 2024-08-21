import java.util.Arrays;

public class SortExample {


    public static void main(String[] args) {

        Employee a[] = new Employee[5];

        a[0] = new Employee("shubham", "bhokta");
        a[1] = new Employee("rahul", "mehra");
        a[2] = new Employee("vipul", "tiwari");
        a[3] = new Employee("jaya", "singh");
        a[4] = new Employee("shubham", "bhokta");


        Arrays.sort(a);

        for (Employee employee : a) {
            System.out.println(employee);
        }

        


    

    }
    
}
