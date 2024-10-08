package base.mod2;

import java.util.Random;

public class Player {
    
    public enum VARIANTS {
        ROCK, PAPER, SCISSORS
    }

    private String name;
    private VARIANTS choice;

    public Player() {
        this.name = "Bot";
        this.choice = getRandomChoice();
    }

    public Player(VARIANTS choice, String name) {
        this.name = name;
        this.choice = choice;
    }

    private VARIANTS getRandomChoice() {
        Random random = new Random();
        return VARIANTS.values()[random.nextInt(VARIANTS.values().length)];
    }

    public String whoWins(Player player1, Player player2) {
        if (player1.choice == player2.choice) {
            return "Ничья";
        } else if ((player1.choice == VARIANTS.ROCK && player2.choice == VARIANTS.SCISSORS) ||
                (player1.choice == VARIANTS.PAPER && player2.choice == VARIANTS.ROCK) ||
                (player1.choice == VARIANTS.SCISSORS && player2.choice == VARIANTS.PAPER)) {
            return "Победил игрок с именем: " + player1.name;
        } else {
            return "Победил игрок с именем: " + player2.name;
        }
    }
    
    public static void main(String[] args) {
        Player bot = new Player();
        Player alex = new Player(VARIANTS.SCISSORS, "Alex");

        System.out.println(bot.whoWins(bot, alex));
    }
}
