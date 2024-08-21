class Student {
    int id;
    String name;


    void set(int id, String name)
    {

        this.id =id;
        this.name=name;

        
    }



    void get()
    {
        
    }

    public static void main(String args[])
    {
        Student s1 = new Student();

        s1.set(11, "shubham");



        // System.out.println(s1.id);
        // System.out.println(s1.name);
        
    }
}