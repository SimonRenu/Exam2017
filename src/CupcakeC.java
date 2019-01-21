public class CupcakeC implements Cupcake{
    private String description;
    private double cost;

    public CupcakeC(){
        description="pate au chocolat";
        cost=3;
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
