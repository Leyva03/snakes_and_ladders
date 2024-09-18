public class Death extends Square {

    public Death(int x, Board y){
        super(x,y);
    }
    @Override
    public void enter(Player p)
    {
        System.out.println(p.toString() +" is dead" );
        p.setDead(true);
    }
}
