public class Operation {
    

    
        int data=50;
        void change(Opreation op){
            op.data=op.data+100;
        }
    
        public static void main(String[] args) {
            Opreation op1=new Opreation();
            Opreation op2=new Opreation();
            op2.data=20;
            op1.change(op2);
            System.out.println(op1.data);
            System.out.println(op2.data);
            op2.change(op1);
            System.out.println(op1.data);
            System.out.println(op2.data);
        }
    
}
