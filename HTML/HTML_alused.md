## HTML alused ##
### Mida on vaja HTML koodi kirjutamiseks? ###

Esiteks on vaja tühja .html faili. Kõige lihtsam on seda teha, kui teha tühi .txt fail ja seda tekstiredaktoris muuta. Faililõpu saab .html’iks ümber nimetada ja seejärel brauseriga eelvaadet näha ning tekstiredaktoris muudatusi teha.

>index.**txt** -> index.**html**

### Tööriistad ###

Soovituslikud programmid HTML koodi kirjutamiseks (piisab ühest): <br/>
[Atom](https://atom.io/), [Visual Studio Code](https://code.visualstudio.com/), [Sublime Text](https://www.sublimetext.com/), [Brackets](http://brackets.io/), [NotePad++](https://notepad-plus-plus.org/), [PhpStorm](https://www.jetbrains.com/phpstorm/)

[JSFiddle](https://jsfiddle.net) - Hea koht, kus veebi kirjutada ja samas kohe ka eelvaadet näha


[W3C Validator](https://validator.w3.org/) - Vigade otsija, mis annab tagasisidet selle kohta, kas kood vastab brauserite standarditele

### Kuidas alustada HTML faili kirjutamisega? ###
Kõige lihtsam on võtta endale valmis alus ([W3Schools valmis alus](https://www.w3schools.com/html/default.asp)):

    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Page Title</title>
    </head>
    <body>
    
    <h1>This is a Heading</h1>
    <p>This is a paragraph.</p>
    
    </body>
    </html>


Kogu HTML vormindus koosneb *tag*idest (ehk elementidest). <br />
Enamik elementidel peab olema algustag `<b>` ja lõputag `</b>`. <br />
Vähesed nagu näiteks **pilditag** `<img src=”pildiaadress/pilt.jpg”>` ja **reavahetus** `<br />` saavad eksisteerida üksikult, aga nendest lähemalt hiljem. <br />
Praegu pähe ei pea õppima, aga siin kiire ülevaade aluses kasutatud elementidest:

    <!DOCTYPE html>
    <html>
    <!-- See on kommentaar. Brauser teab, et selliselt markeeritud osa ei ole mõeldud visuaalselt näitamiseks -->
    <!-- DOCTYPE element annab brauserile märku, mis keeles su fail on -->
    <!-- html element sisaldab kogu su html koodi -->
    
    <!--
    head sisaldab informatsiooni su faili kohta: nt pealkiri ja 
    milliseid skripte, stiile, metaandmeid peaks brauser su koodi jaoks kasutama
    -->
    <head>
    <!-- kui kasutad oma failis nt täpitähti, laseb järgnev rida neid brauseris õigesti kuvada -->
    <meta charset="UTF-8">
    <!-- <title> on pealkiri, mida näed üleval brauseriakna real -->
    <title>Page Title</title>
    <!-- <head> lõpeb -->
    </head>
    
    <!-- brauseris kuvatav osa -->
    <body>
    
    <!-- h1 kuni h6 on kahaneva suurusega pealkirjad -->
    <h1>This is a Heading</h1>
    <p>This is a paragraph.</p>
    
    </body>
    </html>


Kasutajale kuvatav sisu paigutatakse `<body></body>` *tag*ide vahele.

Näide tagide kasutusest:

Kood:  

    <b>Hummingbirds</b> are the <i>sharks of the sky.</i>

Brauser näitab:  
><b>Hummingbirds</b> are the <i>sharks of the sky.</i>

**NB!** Tagid ei tohi kattuda / overlappida! Seda tehes kood ei vasta enam standarditele ja brauserid võivad proovida seda erinevalt lahendada!

```<b>Hummingbirds are the <i>sharks of the sky.</b></i>```

**Hummingbirds are the <i\> sharks of the sky.**</i\>
