package task3;

import java.util.Arrays;

public class MatchPixelsMentorsSolutionSlightlyMoreClever implements MatchPixelsMentorsSolution {

    @Override
    public int findTheSolo(int[] numbers) {
        int res = 0;
        for(int it : numbers) {
            res^=it;
        }
        return res;
    }
}
