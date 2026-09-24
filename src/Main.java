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
        String zoneIndicType = nbTel.substring(0, 2);
        String zoneIndicOp = nbTel.substring(2, 4);
        String nbVertGratuit = nbTel.substring(2, 4);
        String nbGratuit = nbTel.substring(2, 4);
        String nbPayantOne = nbTel.substring(2, 3);
        String nbPayantTwo = nbTel.substring(2, 3);
        String nbPayantNine = nbTel.substring(2, 3);
        System.out.println(nbPayantOne);
        String nbIndicatif = nbTel.substring(0,2);

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

            case "06":
                switch (zoneIndicOp) {
                    case "08":
                        System.out.println("06 08 Orange");
                        break;
                    case "09":
                        System.out.println("06 09 SFR");
                        break;
                    case "10":
                        System.out.println("06 10 SFR");
                        break;
                    case "01":
                        System.out.println("06 11 Neuf Cegetel");
                        break;
                }
                System.out.println("Numéro de téléphon 06 non documenté dans la base");
                break;
            case "07":
                System.out.println("Numéro de téléphone 07 classique");
                break;

            case "08":
                switch (nbGratuit) {
                    case "00":
                        System.out.println("08 numéro vert gratuit");
                        break;
                    case "02":
                        System.out.println("08 numéro vert gratuit");
                        break;
                    case "03":
                        System.out.println("08 numéro vert gratuit");
                        break;
                    case "04":
                        System.out.println("08 numéro vert gratuit");
                        break;
                    case "05":
                        System.out.println("08 numéro vert gratuit");
                        break;
                    case "06":
                        System.out.println("08 numéro gratuit");
                        break;
                    case "07":
                        System.out.println("08 numéro gratuit");
                        break;
                    case "08":
                        System.out.println("08 numéro gratuit");
                        break;
                    case "09":
                        System.out.println("08 numéro gratuit");
                        break;
                }
                switch (nbPayantOne) {
                    case "1":
                        System.out.println("081X numéro payant ( vous paierez au maximum 6 centimes d’euros la\n" + "minute, ou 15 centimes d’euros l’appel. )");
                        break;
                }
                switch (nbPayantTwo) {
                    case "2":
                        System.out.println("082X numéro payant ( vous paierez au maximum 20 centimes d’euro par\\n\" + \"minute, ou 50 centimes d’euros par appel. )");
                        break;
                }
                switch (nbPayantNine) {
                    case "9":
                        System.out.println("089X numéro payant ( vous paierez au maximum 80 centimes d’euros\n" + "par minute ou 3 euros par appel. )");
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