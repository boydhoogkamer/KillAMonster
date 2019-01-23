public class Monster {
    private int lives;
    private String name;
    public Monster(){

    }

    public void setLives(int lives){
        this.lives = lives;
        if(lives <=0){
            System.out.println("Goodjob you have defeated the monster!                                 _         _       _   _                 \n" +

                    "                                | |       | |     | | (_)                \n" +
                    "  ___ ___  _ __   __ _ _ __ __ _| |_ _   _| | __ _| |_ _  ___  _ __  ___ \n" +
                    " / __/ _ \\| '_ \\ / _` | '__/ _` | __| | | | |/ _` | __| |/ _ \\| '_ \\/ __|\n" +
                    "| (_| (_) | | | | (_| | | | (_| | |_| |_| | | (_| | |_| | (_) | | | \\__ \\\n" +
                    " \\___\\___/|_| |_|\\__, |_|  \\__,_|\\__|\\__,_|_|\\__,_|\\__|_|\\___/|_| |_|___/\n" +
                    "                  __/ |                                                  \n" +
                    "                 |___/                                                   ");
        }
    }
    public int getLives(){
        return lives;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}


