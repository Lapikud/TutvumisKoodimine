package task2

import spock.lang.Specification

class LoudestVoiceTaskSolutionTest extends Specification{

    LoudestVoiceTaskSolution loudestVoiceSolution

    /*
     Kommenteeri sisse setup meetodi rida vastavalt sellele, millise taseme solutionit täideti
     Seejärel parem click klassil ja Run.
      */
    def setup() {
//        loudestVoiceSolution = new LoudestVoiceTaskSolutionI()
//        loudestVoiceSolution = new LoudestVoiceTaskSolutionII()
//        loudestVoiceSolution = new LoudestVoiceTaskSolutionIII()
//        loudestVoiceSolution = new LoudestVoiceTaskSolutionSlightlyMoreClever()
    }

    def "A single voice is the loudest"() {
        expect:
        int[] voices = [1]
        loudestVoiceSolution.loudestVoiceComesFrom(voices) == "0"
    }

    def "One is loudest"() {
        expect:
        int[] voices = inputVoices
        loudestVoiceSolution.loudestVoiceComesFrom(voices) == resultString

        where:
        inputVoices << [[60, 70, 60, 100, 80, 120, 110, 60, 60],[100, 90, 80], [80, 90, 100]]
        resultString << ["5", "0",  "2"]
    }

    def "Multiple loudest"() {
        expect:
        int[] voices = inputVoices
        loudestVoiceSolution.loudestVoiceComesFrom(voices) == resultString

        where:
        inputVoices << [[120, 70, 60, 100, 80, 120, 110, 60, 60], [100, 80, 100], [70, 60, 70, 50, 70, 70, 60]]
        resultString << ["0 5", "0 2", "0 2 4 5"]
    }

    def "Everyone is freaking loud. Jesus"() {
        expect:
        int[] voices = [100, 100, 100, 100, 100, 100]
        loudestVoiceSolution.loudestVoiceComesFrom(voices) == "0 1 2 3 4 5"
    }
}
