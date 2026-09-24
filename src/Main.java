import clavier.In;

public class Main {
    public static void main(String[] args) {
        String askNum = "Veuillez entrer votre numéro de téléphone :";
        String nbTel = new String("0475350977");

        do {
            System.out.println(askNum);
            nbTel = In.readString();

            if (nbTel.length() != 10) {
                System.out.println("Le numéro de téléphone doit contenir 10 chiffres. Recommencez.\n");
            }
        } while (nbTel.length() != 10);

        String zoneGeo = nbTel.substring(0, 2);

        switch (zoneGeo) {
            case "01":
                System.out.println("Région parisienne");
                break;
            case "02":
                System.out.println("Région Nord Ouest");
                break;
            case "03":
                System.out.println("Région Nord Est");
                break;
            case "04":
                System.out.println("Région Sud Est");
                break;
            case "05":
                System.out.println("Région Sud Ouest");
                break;
            default:
                System.out.println("Autre zone ou indicatif non géographique");
                break;
        }
    }
}
