package YTBot;

public class Orar {
    private final String[] luni = {"[8:00-9:30] Progr.funcț.(lab, imp)","[9:45 - 11:15] Intel.artif. (lab)",
            "[11:30-13:00] Progr.funcț. (lab)","[13:30-15:00] CNMO (lab)"};
    private final String[] marti = {"[8:00-9:00] Tehn.avan.progr(lab)","[9:45-11:15] Intel.artif. (lab)",
            "[11:30 - 13:00] ASDC (lab)","[13:30 - 15:00] Program.WEB (lab)"};
    private final String[] miercuri = {"[11:30-13:00] Inteligența artificială(curs)","[13:30-15:00] Tehnici avansate de programare (curs)"};
    private final String[] joi = {"[11:30-13:00] Algoritmi, Struct. de Date și Compl.","[13:30-15:00] Calcul numeric și metode de optimiz. (curs)",
            "[15:15-17:00] Calcul numeric și met. de optimiz. (curs, par)"};
    private final String[] vineri = {"[9:45-11:15] Program.WEB (curs)","[11:30-13:00] Progr.funcț. (curs)"};

    public String getOrar(String day) {
        StringBuilder stringBuilder = new StringBuilder();
        switch (day)
        {
            case "Luni":
                for (String ore : luni)
                {
                    stringBuilder.append("\n");
                    stringBuilder.append(ore).append("\n");
                }
                break;
            case "Marti":
                for (String ore : marti)
                {
                    stringBuilder.append("\n");
                    stringBuilder.append(ore).append("\n");
                }
                break;
            case "Miercuri":
                for (String ore : miercuri)
                {
                    stringBuilder.append("\n");
                    stringBuilder.append(ore).append("\n");
                }
                break;
            case "Joi":
                for (String ore : joi)
                {
                    stringBuilder.append("\n");
                    stringBuilder.append(ore).append("\n");
                }
                break;
            case "Vineri":
                for (String ore : vineri)
                {
                    stringBuilder.append("\n");
                    stringBuilder.append(ore).append("\n");
                }
                break;
            default:
                stringBuilder.append("ERROR!, Incercati din nou");
        }
        return stringBuilder.toString();
    }


}
