package DeskLogics.Cards;

import java.util.ArrayList;
import java.util.List;

enum CardColours{
    BLUE, ORANGE, PURPLE, YELLOW
}

public class RealCard extends AbstractCard{
    List<Card> cardDeck = new ArrayList<>();

    RealCard(){
        cardDeck.add(this);
    }
}
