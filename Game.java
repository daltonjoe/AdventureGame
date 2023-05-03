import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz");
        System.out.println("Lütfen bir isim giriniz");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        System.out.println("Sayin "+player.getName()+" Oyuna hosgeldiniz");
        System.out.println("Karakter Seciniz");
        player.selectCharacter();
    }
}