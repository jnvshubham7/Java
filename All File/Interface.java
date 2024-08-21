public class Interface {

    public void display(){

        System.out.println(" describe your appearance");
    }

    public static void main(String [] args) {
            Interface interface1 = new Interface();
            House house1 = new House();
            BusStop busStop1 = new BusStop();
            SuperMarket superMarket1 = new SuperMarket();

            interface1.display();
            house1.display();
            busStop1.display();
            superMarket1.display();

        }


}

class House extends Interface{

    @Override
    public void display() {
        System.out.println("I am house I have doors, windows, balconies, roof etc.");
    }
}
class BusStop extends Interface{
    @Override
    public void display() {
        System.out.println("I am a bus stop I have sign board, a sitting area, schedule chart etc.");
    }
}
class SuperMarket extends Interface{
    @Override
    public void display() {
        System.out.println("I am a super market I have parking space, food court, shopping items etc");
    }
}
