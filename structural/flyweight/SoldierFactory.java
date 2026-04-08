import java.util.HashMap;

// flyweight factory
public class SoldierFactory {

    private static HashMap<String, Soldier> soldierMap = new HashMap<>();

    public static Soldier getSoldier(String type) {

        Soldier soldier = soldierMap.get(type);

        if (soldier == null) {
            if (type.equalsIgnoreCase("A")) {
                soldier = new SoldierA();
            }

            soldierMap.put(type, soldier);
        }

        return soldier;
    }
}
