package task1

import spock.lang.Specification

class LightBulbTaskSolutionTest extends Specification {

    LightBulbTaskSolution lightBulbSolution;

     /*
     Kommenteeri sisse setup meetodi rida vastavalt sellele, millise taseme solutionit täideti
      */
     def setup() {
//          lightBulbSolution = new LightBulbTaskSolutionI()
//          lightBulbSolution = new LightBulbTaskSolutionII()
//          lightBulbSolution = new LightBulbTaskSolutionIII()
//          lightBulbSolution = new LightBulbTaskSolutionSlightlyMoreClever();
     }

     def "Empty string means the lightbulb will change itself and no LAP member are required"() {
          expect:
          lightBulbSolution.countLightBulbChangers("") == 0;
     }

     def "If there is one person at LAP, they will have to change the bulb alone"(){
         expect:
         lightBulbSolution.countLightBulbChangers("kertu") == 1;
     }

    def "Depending on how many people are at LAP, that many people will change the bulb"(){
        expect:
        lightBulbSolution.countLightBulbChangers(people) == nrOfChangers;

        where:
        people << ["kertuMariTerje","kertuTõnisRasmusSigridLembitu", "martinMaria", "siimHannoArtiRasmus","kristaTerjeKaarel"]
        nrOfChangers << [3, 5, 2, 4, 3]
    }
}
