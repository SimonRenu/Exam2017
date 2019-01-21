public class Chocolat extends Decorator {
    public Chocolat(Cupcake newCupcake) {
        super(newCupcake);
        this.addDescription(", chocolat");
        this.addCost(2.5);
    }
}
