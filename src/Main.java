import clavier.In;

public class Main {
    static void main(String[] args) {
        String askNum = "Veuillez entrer votre numéro de téléphone :";
        String nbTel;

        do {
            System.out.println(askNum);
            nbTel = In.readString();

            if (nbTel.length() != 10) {
                System.out.println("Le numéro de téléphone doit contenir 10 chiffres. Recommencez.\n");
            }
        } while (nbTel.length() != 10);

        String prefixe = nbTel.substring(0, 2);
        String subPrefixe = nbTel.substring(2, 4);
        String troisiemeChiffre = nbTel.substring(2, 3);

        switch (prefixe) {
            case "01":
                System.out.println("Région parisienne");
                switch (subPrefixe) {
                    case "34": System.out.println("Yvelines"); break;
                    case "40": System.out.println("Paris"); break;
                    case "41": System.out.println("Hauts-de-Seine"); break;
                    case "56": System.out.println("Val-de-Marne"); break;
                    case "69": System.out.println("Essonne"); break;
                }
                break;

            case "02":
                System.out.println("Région Nord-Ouest");
                switch (subPrefixe) {
                    case "22": System.out.println("Côtes-d'Armor"); break;
                    case "30": System.out.println("Finistère"); break;
                    case "32": System.out.println("Eure"); break;
                    case "36": System.out.println("Cher"); break;
                    case "40": System.out.println("Loire-Atlantique"); break;
                }
                break;

            case "03":
                System.out.println("Région Nord-Est");
                switch (subPrefixe) {
                    case "58": System.out.println("Côte-d'Or"); break;
                    case "63": System.out.println("Jura"); break;
                    case "32": System.out.println("Eure"); break;
                    case "62": System.out.println("Pas-de-Calais"); break;
                    case "69": System.out.println("Bas-Rhin"); break;
                }
                break;

            case "04":
                System.out.println("Région Sud-Est");
                switch (subPrefixe) {
                    case "57": System.out.println("Isère"); break;
                    case "66": System.out.println("Gard"); break;
                    case "50": System.out.println("Ain"); break;
                    case "70": System.out.println("Allier"); break;
                    case "75": System.out.println("Ardèche"); break;
                }
                break;

            case "05":
                System.out.println("Région Sud-Ouest");
                switch (subPrefixe) {
                    case "47": System.out.println("Dordogne"); break;
                    case "86": System.out.println("Vaucluse"); break;
                    case "95": System.out.println("Haute-Corse"); break;
                    case "94": System.out.println("Var"); break;
                    case "17": System.out.println("Charente"); break;
                }
                break;

            case "06":
                switch (subPrefixe) {
                    case "08": System.out.println("06 08 Orange"); break;
                    case "09": System.out.println("06 09 SFR"); break;
                    case "10": System.out.println("06 10 SFR"); break;
                    case "01": System.out.println("06 01 Neuf Cegetel"); break;
                    default:
                        System.out.println("Numéro 06 non documenté dans la base");
                        break;
                }
                break;

            case "07":
                System.out.println("Numéro de téléphone 07 classique");
                break;

            case "08":
                switch (subPrefixe) {
                    case "00":
                    case "02":
                    case "03":
                    case "04":
                    case "05":
                        System.out.println("08 numéro vert gratuit");
                        break;
                    case "06":
                    case "07":
                    case "08":
                    case "09":
                        System.out.println("08 numéro gratuit");
                        break;
                    default:
                        switch (troisiemeChiffre) {
                            case "1":
                                System.out.println("081X numéro payant (max 6 cts/min ou 15 cts/appel)");
                                break;
                            case "2":
                                System.out.println("082X numéro payant (max 20 cts/min ou 50 cts/appel)");
                                break;
                            case "9":
                                System.out.println("089X numéro payant (max 80 cts/min ou 3 €/appel)");
                                break;
                        }
                        break;
                }
                break;

            case "09":
                System.out.println("09 VoIP");
                break;

            default:
                System.out.println("Autre zone ou indicatif non géographique");
                break;
        }
    }
}