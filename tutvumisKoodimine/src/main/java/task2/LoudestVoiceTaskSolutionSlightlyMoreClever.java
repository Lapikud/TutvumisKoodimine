package task2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LoudestVoiceTaskSolutionSlightlyMoreClever implements LoudestVoiceTaskSolution {

    @Override
    public String loudestVoiceComesFrom(int[] voiceLevels) {
        int max = Arrays.stream(voiceLevels).max().getAsInt();
        return IntStream.range(0, voiceLevels.length)
                .map(i -> voiceLevels[i] == max ? i : -1)
                .filter(i -> i >= 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
