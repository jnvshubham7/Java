
class ABCIceCream {

     public void icecream(){
         System.out.println("we have vanilla flavored ice-cream.");
     }
     
     public static void main(String[] args){
         XIceCream icecream1 = new XIceCream();
         YIceCream iceCream2 = new YIceCream();

         icecream1.icecream();
         iceCream2.icecream();
     }
}

class XIceCream extends ABCIceCream{
    @Override
    public void icecream() {
        super.icecream();
    }
}

class YIceCream extends ABCIceCream{
    @Override
    public void icecream() {
        System.out.println(" we have our speciality Vanilla chocolate ice-cream");
    }
}



