import java.util.ArrayList;
class Merchant extends Char{
    private ArrayList<String> listItem;

    public Merchant(int level, int hp, ArrayList<String> listItem ){
        super(level, hp);
        this.listItem = listItem;
    }

    public ArrayList<String> getListItem() {
        return listItem;
    }

    void entityInfo(){
        System.out.println("# MERCHANT DENGAN Level : " + getlevel());
    }

}