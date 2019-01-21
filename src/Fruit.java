public class Fruit extends Decorator {
    public Fruit(Cupcake newCupcake) {
        super(newCupcake);
        this.addDescription(", fruit");
        this.addCost(2);
    }
}
