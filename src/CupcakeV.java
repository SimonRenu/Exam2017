public class CupcakeV implements Cupcake{
    private String description;
    private double cost;

    public CupcakeV(){
        description="pate, sucre, vanille, extrait de vanille";
        cost=3.5;
    }

    @Override
    public String toString() {
        return "Description : "+this.description+"\nCoût : "+this.cost;
    }

    @Override
    public void addDescription(String a) {
        this.description+=a;
    }

    @Override
    public void addCost(double a) {
        this.cost+=a;
    }
}
