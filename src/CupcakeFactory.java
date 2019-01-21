import java.util.InputMismatchException;

public abstract class CupcakeFactory {               //on fait direct une concrete factory, de base on a une abstract facto avec des concrete facto qui en hérite. ces concrete facto ont pr role de retourner des produits de type différents. Or ici on travaille que avec des produits cupcake -> interface produit cupcake qui implémente les produit cupchoc et cupvan (cf site refactoring factory method)

    public abstract Cupcake createCupcake(int a);

    /*Cupcake createCupcake(int a);{           // nom fonction = createCupcake
        /*if (a == 1) {
            return new CupcakeV();
        } else if (a == 2) {
            return new CupcakeC();
        } else {
            throw new InputMismatchException();
        }
    }*/
}
