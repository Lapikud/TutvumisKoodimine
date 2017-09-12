package task1;

public class LightBulbTaskSolutionIII implements LightBulbTaskSolution {

    public int countLightBulbChangers(String camelCaseString) {
        // Täienda kõigepealt meetodit countUpperCaseChars
        // Nüüd saad lugeda kokku kõik suured tähed! Yay!
        int uppers = countUpperCaseChars(null); // Hmm null ilmselt ei ole siin õige. Mida peaks ette andma?
        // Midagi oleks nagu puudu. Mida peaks meetod tagastama?
        return 0;
        // Kui oled lahendusega ühel pool siis liigu LightBulbTaskSolutionTest juurde ja tee mis käseb.
    }

    private int countUpperCaseChars(char[] chars) {
        int count = 0;
        for (char c : chars) {
            // Mida peaks iga chariga tegema, milliseid peaks lugema?
        }
        return count;
    }

    private boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }

    private char[] convertToCharArray(String s) {
        return s.toCharArray();
    }

}
