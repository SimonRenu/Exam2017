public abstract class Decorator implements Cupcake{
    private Cupcake tempCupcake;                //on utilise ça à travers toute l'interface!

    public Decorator(Cupcake newCupcake){
        this.tempCupcake=newCupcake;       //constru un cupcake tempo qui sera égal au cupcake du client (en paramètre)
    }

    @Override
    public String toString() {
        return this.tempCupcake.toString();
    }

    @Override
    public void addDescription(String a) {
        this.tempCupcake.addDescription(a);
    }

    @Override
    public void addCost(double a) {
        this.tempCupcake.addCost(a);
    }
}
