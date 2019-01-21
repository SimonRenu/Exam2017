import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
    public static void main(String[] args)
    {
        int choix, choixDeco;
        Scanner scan=new Scanner(System.in);            //créer objet scanner pr saisie clavier
        Cupcake cupcake;
        CupcakeCreator creator=new CupcakeCreator();

        do {
            System.out.print("1 : cupacake à la vanille\n2 : cupcake au chocolat\n3 : Quitter\n");
            try {
                choix = scan.nextInt();
                cupcake = creator.createCupcake(choix);
            } catch (InputMismatchException e) {
                System.out.print(e);
                return;
            }


            System.out.print("1 : ajouter une déco\n0 : arrêter\n");
            try {
                choix = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.print(e);
                return;
            }

            while (choix == 1) {
                System.out.print("1 : fruit\n2 : chocolat\n");
                try {
                    choixDeco = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.print(e);
                    return;
                }
                if (choixDeco == 1) {
                    cupcake = new Fruit(cupcake);
                } else if (choixDeco == 2) {
                    cupcake = new Chocolat(cupcake);
                } else {
                    System.out.print(choixDeco + " n'est pas un choix correct");
                    return;
                }

                System.out.print("1 : ajouter une autre déco\n0 : arrêter\n");
                try {
                    choix = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.print(e);
                    return;
                }
            }

            System.out.print(cupcake.toString()+"\n");
        }while(choix!=3);
    }
}
