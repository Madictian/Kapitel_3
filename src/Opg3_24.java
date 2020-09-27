public class Opg3_24 {
    public static void main(String[] args) {
        int card = (int)(Math.random() * 52 + 1);

        if (card <= 13 && card > 1) {
            if (card <= 10 && card > 1)
                System.out.print(card + " of spades");
            else if (card == 1)
                System.out.print("Ace of spades");
            else if (card == 11)
                System.out.print("jack of spades");
            else if (card == 12)
                System.out.print("queen of spades");
            else
            System.out.print("king of spades");
        }
        if(card <= 26 && card > 14)
            if (card < 24 && card > 14)
                System.out.print(card - 13 + " of hearts");
            else if (card == 14)
                System.out.print("Ace of hearts");
            else if(card == 24)
                System.out.print("jack of hearts");
            else if(card == 25)
                System.out.print("queen of hearts");
            else
                System.out.print("king of hearts");

        if (card <= 39 && card >= 27) {
            if (card < 37 && card > 27)
                System.out.print(card + " of diamonds");
            else if (card == 27)
                System.out.print("Ace of diamonds");
            else if (card == 37)
                System.out.print("jack of diamonds");
            else if (card == 38)
                System.out.print("queen of diamonds");
            else
                System.out.print("king of diamonds");
        }
        if (card <= 52 && card >= 39) {
            if (card < 50 && card > 39)
                System.out.print(card + " of cloves");
            else if (card == 39)
                System.out.print("Ace of cloves");
            else if (card == 50)
                System.out.print("jack of cloves");
            else if (card == 51)
                System.out.print("queen of cloves");
            else
                System.out.print("king of cloves");
        }
        System.out.println("        " + card);
    }
}