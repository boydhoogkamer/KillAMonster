import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Monster Squirtle = new Monster();
        Squirtle.setName("Squirtle");
        Squirtle.setLives(10);


        Monster Charmander = new Monster();
        Charmander.setName("Charmander");
        Charmander.setLives(10);


        Monster Bulbasaur = new Monster();
        Bulbasaur.setName("Bulbasaur");
        Bulbasaur.setLives(10);


        Monster Mew = new Monster();
        Mew.setName("Mew");
        Mew.setLives(10);


        Monster Mewtwo = new Monster();
        Mewtwo.setName("Mewtwo");
        Mewtwo.setLives(10);




        for (int i = 0; i < 50; i++) {

            System.out.println("Attack a monster");

            String Attack;
            Attack = s.nextLine();

            if (Attack.equals("Attack Squirtle")) {
                Squirtle.setLives(Squirtle.getLives() -1);
                System.out.println(Squirtle.getLives());
                if (Squirtle.getLives() <= 0){
                    System.out.println("Squirtle is dead");
                }
            } else if (Attack.equals("Attack Charmander")) {
                Charmander.setLives(Charmander.getLives() -1);
                System.out.println(Charmander.getLives());
                if (Charmander.getLives() <= 0){
                    System.out.println("Charmander is dead");
                }
            } else if (Attack.equals("Attack Bulbasaur")) {
                Bulbasaur.setLives(Bulbasaur.getLives() -1);
                System.out.println(Bulbasaur.getLives());
                if (Bulbasaur.getLives() <= 0){
                    System.out.println("Bulbasaur is dead");
                }
            } else if (Attack.equals("Attack Mew")) {
                Mew.setLives(Mew.getLives() -1);
                System.out.println(Mew.getLives());
                if (Mew.getLives() <= 0){
                    System.out.println("Mew is dead");
                }
            } else if (Attack.equals("Attack Mewtwo")) {
                Mewtwo.setLives(Mewtwo.getLives() -1);
                System.out.println(Mewtwo.getLives());
                if (Mewtwo.getLives() <= 0){
                    System.out.println("Mewtwo is dead");
                }
            }
        }

    }
}

