package task3

import spock.lang.Specification

class MatchPixelsMentorsSolutionTest extends Specification {

    MatchPixelsMentorsSolution matchPixelsMentors

    /*
 Kommenteeri sisse setup meetodi rida vastavalt sellele, millise taseme solutionit täideti
 Seejärel parem click klassil ja Run.
  */
    def setup() {
//        matchPixelsMentors = new MatchPixelsMentorsSolutionI()
//        matchPixelsMentors = new MatchPixelsMentorsSolutionSlightlyMoreClever()
    }

    def "No pixels means lonely mentor"() {
        expect:
        int[] array = [1]
        matchPixelsMentors.findTheSolo(array) == 1
    }

    def "The lonely mentor is lonely"() {
        expect:
        int[] array = givenArray
        matchPixelsMentors.findTheSolo(array) == lonely

        where:
        givenArray << [[1, 2, 2, 4, 1, 3, 4], [1, 2, 2], [8, 5, 100, 101, 100, 3, 8, 5, 3]]
        lonely << [3, 1, 101]
    }
}
