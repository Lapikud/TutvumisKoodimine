package task2;

/*
Lapikud on kõik sõbrad, aga vahel tuleb ette, et läheb vaidluseks operatsioonisüsteemi valiku
või parima programmeerimiskeele teemadel. Sellisel juhul lahendatakse asjad vanamoeliselt - võetakse rivvi
ja hakatakse oma arvamust valjuhäälselt avaldama. Võidavad loomulikult need, kelle hääl kõige kõvem.
Leia kus koha peal rivis seisavad kõige valjuhäälsemad lapikud.

Sisend:
int array kus i-ndal kohal on helitugevus mida toodab rivis i-ndal kohal seisev lapik
Nt1: [60, 70, 60, 100, 80, 120, 110, 60, 60]
Nt2: [120, 70, 60, 100, 80, 120, 110, 60, 60]

Väljund:
string - stringiks teisendatult positsioon kus seisab vali lapik (lugema hakkame nullist nagu ikka),
kui kaks lapikut toodavad sama kõige kõvemat helitugevust siis tagasta mõlemad, eraldatuna tühikuga
Nt1: "5"
Nt1: "0 5"

Vastavalt oma tasemele vali samast packagest kas solution I, II või III ja järgi edasisisi juhiseid
juba vastavas failis.

I - this easy. Kirjutan kõik ise.
II - hints required. Anna mulle mõni meetod, mida saan kasutada. Ei pruugi viia kõige optimaalsema lahenduseni.
III - olen värske, vajan abi. Pane õige asi õigesse kohta, suurem osa vajaminevast olemas. Ei pruugi viia kõige
optimaalsema lahenduseni.
 */

public interface LoudestVoiceTaskSolution {

    String loudestVoiceComesFrom(int[] voiceLevels);

}
