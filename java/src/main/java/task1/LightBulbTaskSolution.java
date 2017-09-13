package task1;

/*
Mitu lapikut on vaja, et vahetada lambipirni? Täpselt nii palju kui vastaval hetkel LAPis kohal on -
kõik aitavad nõu, jõu või lihtsalt hapniku tarbimisega.
Kertu kirjutas üles kõigi lapikute nimed, kes kontoris on, aga kuna ta alles töölt tulnud ja veel
programmeerimises sees siis kirjutas ta kõik nimed kokku camelCases. Leia, mitu lapikut siis ikkagi vaja on,
et vastavas olukorras see pirn siiski vahetatud saaks.

Sisend:
string camelCases nimedest
Nt: kertuTonisRasmusArtiMartin

Väljund:
integer - väljendab seda kui mitu inimest lambipirni vahetamisega tegelevad
Nt: 5

Vastavalt oma tasemele vali samast packagest kas solution I, II või III ja järgi edasisisi juhiseid
juba vastavas failis.

I - this easy. Kirjutan kõik ise.
II - hints required. Anna mulle mõni meetod, mida saan kasutada. Ei pruugi viia kõige optimaalsema lahenduseni.
III - olen värske, vajan abi. Pane õige asi õigesse kohta, suurem osa vajaminevast olemas. Ei pruugi viia kõige
optimaalsema lahenduseni.
 */


public interface LightBulbTaskSolution {

    int countLightBulbChangers(String camelCaseString);
}
