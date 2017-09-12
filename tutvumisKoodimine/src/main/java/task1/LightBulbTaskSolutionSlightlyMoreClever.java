package task1;

public class LightBulbTaskSolutionSlightlyMoreClever implements LightBulbTaskSolution {

    public int countLightBulbChangers(String camelCaseString) {
        return camelCaseString.isEmpty() ? 0 : camelCaseString.split("[A-Z]").length;
    }
}
