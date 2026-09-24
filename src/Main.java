import clavier.In;

public class Main {
    public static void main(String[] args) {
        String askNum = "Veuillez entrer votre numéro de téléphone :";
        String nbTel;

        do {
            System.out.println(askNum);
            nbTel = In.readString();

            if (nbTel.length() != 10) {
                System.out.println("Le numéro de téléphone doit contenir 10 chiffres. Recommencez.\n");
            }
        } while (nbTel.length() != 10);

        String zoneGeo = nbTel.substring(0, 2);
        String zoneGeoDep = nbTel.substring(2, 4);

        switch (zoneGeo) {
            case "01":
                System.out.println("Région parisienne");
                switch (zoneGeoDep) {
                    case "34":
                        System.out.println("Yvelines");
                        break;
                    case "40":
                        System.out.println("Paris");
                        break;
                    case "41":
                        System.out.println("Hauts de seine");
                        break;
                    case "56":
                        System.out.println("Val de marne");
                        break;
                    case "69":
                        System.out.println("Essonne");
                        break;
                }
                break;

            case "02":
                System.out.println("Région Nord Ouest");
                switch (zoneGeoDep) {
                    case "22":
                        System.out.println("Côtes D'Armor");
                        break;
                    case "30":
                        System.out.println("Finistère");
                        break;
                    case "32":
                        System.out.println("Eure");
                        break;
                    case "36":
                        System.out.println("Cher");
                        break;
                    case "40":
                        System.out.println("Loire Atlantique");
                        break;
                }
                break;

            case "03":
                System.out.println("Région Nord Est");
                switch (zoneGeoDep) {
                    case "58":
                        System.out.println("Côte-d'Or");
                        break;
                    case "63":
                        System.out.println("Jura");
                        break;
                    case "32":
                        System.out.println("Eure");
                        break;
                    case "62":
                        System.out.println("Pas de calais");
                        break;
                    case "69":
                        System.out.println("Bas-rhin");
                        break;
                }
                break;

            case "04":
                System.out.println("Région Sud Est");
                switch (zoneGeoDep) {
                    case "57":
                        System.out.println("Isère");
                        break;
                    case "66":
                        System.out.println("Gard");
                        break;
                    case "50":
                        System.out.println("Ain");
                        break;
                    case "70":
                        System.out.println("Allier");
                        break;
                    case "75":
                        System.out.println("Ardèche");
                        break;
                }
                break;

            case "05":
                System.out.println("Région Sud Ouest");
                switch (zoneGeoDep) {
                    case "47":
                        System.out.println("Dordogne");
                        break;
                    case "86":
                        System.out.println("Vaucluse");
                        break;
                    case "95":
                        System.out.println("Haute corse");
                        break;
                    case "94":
                        System.out.println("Var");
                        break;
                    case "17":
                        System.out.println("Charente");
                        break;
                }
                break;

            default:
                System.out.println("Autre zone ou indicatif non géographique");
                break;
        }
    }
}