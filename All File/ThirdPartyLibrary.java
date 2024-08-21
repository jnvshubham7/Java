public class ThirdPartyLibrary {

    public void play(){
        System.out.println("PLAY FROM THIRD PARTY LIBRARY");
    }
    public void select(){
        System.out.println("SELECT SONG FROM THIRD PARTY LIBRARY");
    }
    public void playlist(){
        System.out.println("SELECT PLAYLIST FROM THIRD PARTY LIBRARY");
    }

    public static void main(String[] args){
        Panasonic music1 = new Panasonic();
        Sony music2 = new Sony();

        music1.play();
        music1.playlist();
        music1.select();

        music2.play();
        music2.playlist();
        music2.select();

    }
}

class Panasonic extends ThirdPartyLibrary{

}

class Sony extends ThirdPartyLibrary{

    @Override
    public void play() {
        System.out.println("SONY'S IMPLEMENTATION OF THIRD PARTY LIBRARY ");
    }
}

