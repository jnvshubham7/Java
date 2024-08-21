package IPA34;
import java.util.*;
public class PlayerDetails 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player3[] pl = new Player3[n];
        for (int i = 0; i < pl.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            pl[i] = new Player3(a,b,c,d,e);
        }
        String con = sc.nextLine();
        int r = sc.nextInt(); 
        Player3[] ans = findPlayerName(pl, con, r);
        if(ans!=null)
        {
           
        }
        else
        {
            System.out.println("No player found");
        }
    }    
    public static Player3[] findPlayerName(Player3[] p, String c, int r)
    {
        
        
    }
}
class Player3
{
    private int id;
    private String name;
    private String country;
    private int match;
    private int run;
    public Player3(int id, String name, String country, int match, int run) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.match = match;
        this.run = run;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getMatch() {
        return match;
    }
    public void setMatch(int match) {
        this.match = match;
    }
    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }
    
}