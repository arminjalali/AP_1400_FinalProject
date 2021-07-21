package sample;

public class Player {
    private int elixir;
    private int xp;
    private int level;

    public Player(){
        elixir = 4;
        xp = 0;
        level = 1;
    }

    public void addElixir(){
        if (elixir < 10){
            elixir++;
        }
    }

    public void xpOfWin(){
        xp += 200;
        checkLevel();
    }
    public void xpOfLose(){
        xp += 70;
        checkLevel();
    }
    public void checkLevel(){
        if (xp > 2499){
            level = 5;
        }
        else if (xp > 1699){
            level = 4;
        }
        else if (xp > 899){
            level = 3;
        }
        else if (xp > 499){
            level = 2;
        }
    }
}
