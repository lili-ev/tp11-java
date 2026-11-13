
import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {

    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("Pommes");
        shoppingList.add("Lait");
        shoppingList.add("Pain");

        System.out.println("Articles de la liste :");

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }

        // Suppression du lait
        shoppingList.remove("Lait");

        // Vérification de la présence des pommes
        boolean hasApples = shoppingList.contains("Pommes");

        System.out.println("Contient des pommes ? " + hasApples);

        // Affichage de la taille finale
        System.out.println("Taille finale de la liste : " + shoppingList.size());
    }
}
