package task2;

import java.util.ArrayList;
import java.util.List;

public class LoudestVoiceTaskSolutionIII implements LoudestVoiceTaskSolution {

    @Override
    public String loudestVoiceComesFrom(int[] voiceLevels) {
        // Your solution goes here
        // Täienda kõigepealt meetodit findLoudest, meil vaja teada mis lapikud suudavad.
        int loudest = findLoudest(voiceLevels);
        // Kui valjem käes siis tahaks vist kõik valjud leida?
        // Ja siis kokku ka panna ja tagastada? Vist vahepeal vaja tüüpi ka muuta?
        return null;
        // Kui oled lahendusega ühel pool siis liigu LoudestVoiceTaskSolutionTest juurde ja tee mis käseb.
    }

    private int findLoudest(int[] voiceLevels) {
        int max = 0;
        for (int voice : voiceLevels) {
            // Kuidas kontrollida kas see on kõige valjem mida siiamaani kuulnud oleme
            // Kui on siis mida peaksime tegema?
        }
        return max;
    }

    private List<Integer> getIndexes(int[] array, int element) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                // Ooh, see ju matchib. Mis teen?
            }
        }
        return result;
    }

    private List<String> makeStrings(List<Integer> integers) {
        List<String> stringList = new ArrayList<String>(integers.size());
        for (int integer : integers) {
            stringList.add(String.valueOf(integer));
        }
        return stringList;
    }

    private String joinToString(List<String> strings) {
        return String.join(" ", strings);
    }
}
