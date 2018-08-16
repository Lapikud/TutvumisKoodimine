## HTML alused ##
### Mida on vaja HTML koodi kirjutamiseks? ###

Esiteks on vaja tühja .html faili. Kõike lihtsam on seda teha, kui teha tühi .txt fail ja seda tekstiredaktoris muuta. Faililõpu saab .html’iks ümber nimetada ja seejärel brauseriga eelvaadet näha ning tekstiredaktoris muudatusi teha.

Soovituslikud programmid HTML koodi kirjutamiseks: Atom, PhpStorm, IntelliJ HTML plug-iniga, NotePad++, Brackets

Hea koht, kus veebi kirjutada ja samas kohe ka eelvaadet näha:
<https://jsfiddle.net/>

### Kuidas HTML faili kirjutada? ###

**HTML lehe jaoks alati kopeerida endale HTML raamistik:**
<https://www.w3schools.com/html/default.asp>

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


Kogu HTML vormindus koosneb *tag*idest (ehk elementidest). Peab olema algustag `<b>` ja lõputag `</b>`. Ainult **pilditag** `<img src=”pildiaadress/pilt.jpg”>` ja reavahetus `<br />` saavad eksisteerida üksikult. Lehe sisu paigutatakse `<body></body>` *tag*ide vahele.

Näide tagide kasutusest:

Kood:  

    <b>Hummingbirds</b> are the <i>sharks of the sky.</i>

Brauser näitab:  
<b>Hummingbirds</b> are the <i>sharks of the sky.</i>

**NB!** Tagid ei tohi kattuda / overlappida! Muidu läheb kood katki ja brauserid võivad proovida seda erinevalt lahendada!

```<b>Hummingbirds are the <i>sharks of the sky.</b></i>```

**Hummingbirds are the <i\> sharks of the sky.**</i\>
