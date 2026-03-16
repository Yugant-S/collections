// Concrete Flyweight
public class SoldierA implements Soldier {

    private String soldierType;

    public SoldierA() {
        soldierType = "Infantry Soldier A";
        System.out.println("Creating SoldierA Object");
    }

    @Override
    public void moveSoldier(int currentLocX, int currentLocY) {
        System.out.println(soldierType + " moving to position: (" 
                + currentLocX + ", " + currentLocY + ")");
    }
}
