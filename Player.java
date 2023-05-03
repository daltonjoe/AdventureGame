import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectCharacter() {
        
        Character[] charlist = { new Samurai(), new Archer(), new Knight() };

        for (Character c : charlist) {
            System.out.println("ID: "+ c.getId() + " \t Karakter: " + c.getCharName() + " \t Hasar " + c.getDamage() + " \t Saglik " + c.getHealth()
                    + " \t Para " + c.getMoney());
        }
        System.out.println("Karakter seciniz");
        
        int selectedChar = scanner.nextInt();
        switch(selectedChar){
            case 1:
                chooseCharacter(new Samurai());
            case 2:
                chooseCharacter(new Archer());
            case 3:
                chooseCharacter(new Knight());
            default:
                 chooseCharacter(new Samurai());    
        }
        System.out.println("Secilen Karakter adi "+this.getCharName());
   
    }

    public void chooseCharacter(Character character){
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setCharName(character.getCharName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
