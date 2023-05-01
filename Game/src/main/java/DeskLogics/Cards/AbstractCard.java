package DeskLogics.Cards;

public class AbstractCard implements Card{

    private String name;
    private int price;
    private int rent;

   public   AbstractCard(){

    }

    public AbstractCard(String name, int price, int rent){
        this.name = name;
        this.price = price;
        this.rent = rent;
    }

    public void changeCard(Card card){

    }

    public Card takeCard() {
        return null;
    }

    public Card throwCard() {
        return null;
    }

    @Override
    public void delete() {

    }
}
