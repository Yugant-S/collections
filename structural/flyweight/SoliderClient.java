// Client
public class SoldierClient {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            Soldier soldier = SoldierFactory.getSoldier("A");

            int x = (int)(Math.random() * 100);
            int y = (int)(Math.random() * 100);

            soldier.moveSoldier(x, y);
        }
    }
}
