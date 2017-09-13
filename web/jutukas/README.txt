Üks meie tubli disainer on valmis ehitanud kick ass ilusa kasutajaliidese
vastavalt tellija (Mentorid) soovile. Kahjuks aga jäi ta koodimis osaga natuke
jänni. Siin tuled mängu sina tubli Pixel!

Ülesanne on kasutaja poolt sisestatud sõnum saata serverile ja kõik serverist
tulevad sõnumid kuvada kasutajaliideses.

Suhtlus serveriga käib WebSocketi kaudu aadressil mis antakse sinu rakenduse
objektile ette esimese argumendina

Saadetava ja vastuvõetava sõnumi vorming on järgnev:
<nickname>: <message>
Kus <nickname> asendatakse nickname kastis oleva nimega ja peale koolon (:) ja
tühik ( ) märki on siis saadetav sõnum <message> asemel. Saadetava sõnumi
saab välja lugeda message input kastist.

Peale sõnumi saatmist peaks message input kasti tühjendama.

Vastuvõetud sõnumid lähevad teksti kasti mille id on "log".

Kood läheb vastavalt raskusastmele järgmistesse failidesse:
app1.js - Lebo keis, pole vaja ise googlit avada.
app2.js - OMG, not enough jQuery! Mingi struktuur ja näited
app3.js - Mis on javascript? Veel rohkem valmis koodi
app4.js - Copy-Paste, Vajalik lugemisoskus.

Boonuspunktid error handlingu eest!
