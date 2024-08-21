// package oom.tut_7;

import java.util.Scanner;

interface functions{
    void up();
    void down();
    void left();
    void right();
}

class Mariogame implements functions{
    int x, y;
    public void up(){
        y++;
    }
    public void down(){
        y--;
    }
    public void left(){
        x--;
    }
    public void right(){
        x++;
    }
    public void position(){
        System.out.format("Mario is at x : %d y : %d\n",x,y);
    }
}
class ChessGame implements functions{
    int x,y;
    public void up(){
        if(y>=8){
            System.out.println("Opps, you can't go there :(");
            return;
        }
        y++;
    }
    public void down(){
        if(y<=0){
            System.out.println("Opps, you can't go there :(");
            return;
        }
        y--;
    }
    public void left(){
        if(x<=0){
            System.out.println("Opps, you can't go there :(");
            return;
        }
        x--;
    }
    public void right(){
        if(x>=8){
            System.out.println("Opps, you can't go there :(");
            return;
        }
        x++;
    }
    public void position(){
        System.out.format("King at x : %d y : %d\n",x,y);
    }
}

public class tut7_que4 {
    public static void main(String[] args) {
        System.out.println("\n                Instructions\nPress 'u' to go UP, 'r' to go RIGHT, 'l' to go LEFT, 'd' to go DOWN");
        System.out.println("Press '0' EXIT");
        Scanner sc = new Scanner(System.in);

        // For MarioGame
        System.out.println("\nPlaying MarioGame...");
        Mariogame m= new Mariogame();
        m.position();
        char c;
        while(true){
            c=sc.next().charAt(0);
            if(c=='u'){
                m.up();
            }
            else if(c=='l'){
                m.left();
            }
            else if(c=='r'){
                m.right();
            }
            else if(c=='d'){
                m.down();
            }
            else if(c=='0'){
                break;
            }
            else{
                break;
            }
            m.position();
        }

        //For Chessgame
        System.out.println("\nPlaying ChessGame....");
        ChessGame cg = new ChessGame();
        cg.position();
        while(true){
            c=sc.next().charAt(0);
            if(c=='u'){
                cg.up();
            }
            else if(c=='l'){
                cg.left();
            }
            else if(c=='r'){
                cg.right();
            }
            else if(c=='d'){
                cg.down();
            }
            else if(c=='0'){
                break;
            }
            else{
                break;
            }
            cg.position();
        }

    }
}