package task3;

/*
Selleks, et uued pixlid kiirelt päris lapikuks saaks peab iga piksel saama mentori. Juhtus aga nii, et
mentoreid on täpselt ühe võrra rohkem kui pixleid (go figure) ja üks mentor ei saagi pixlit (tear).
Igale mentorile ja pixlile on number kui need numbrid kattuvad siis on mentor ja pixel kokku määratud.
Üle jääv mentor ei taha tunnistada, et tema pixlit ei saagi. Leia ta number, leia ta üles ja tee talle selgeks,
et ta üksi jääbki.

Sisend:
int array pixlite ja mentorite numbrites, kõik numbrid peale ühe esinevad topelt
Nt: [1, 2, 2, 4, 1, 3, 4]

Väljund:
int - ainuke väärtus mis esineb vaid korra
Nt: 3

Vastavalt oma tasemele vali samast packagest kas solution I, II või III ja järgi edasisisi juhiseid
juba vastavas failis.

I - this easy. Kirjutan kõik ise.
 */

public interface MatchPixelsMentorsSolution {

    int findTheSolo(int[] numbers);
}
