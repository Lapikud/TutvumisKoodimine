# PostgreSQL sissejuhatav ülesanne

Ülesanne on kirjutatud sissejuhatusena PostgreSQLi, kuid seda võib kasutada ka muude SQL andmebaasidega.

### Ülesande punktid:

1.	Installeeri Postgresql https://www.postgresql.org/download/
2.	Järgi seda videot ning loo näitena andmebaas ja tabel (käsurealt: https://www.youtube.com/watch?v=fD7x8hd9yE4, pgAdmin liidesega: https://www.youtube.com/watch?v=i3UK7QiiH7c )
3.	Here’s where the fun begins
4.	Loo andmebaas nimega lapikud_andmebaas
5.	lapikud_andmebaasi lisa uus tabel nimega liikmed veergudega eesnimi, perekonnanimi ja liitumisaasta
6.	Nüüd sisesta tabelisse järgmised väärtused:
    
    Eesnimi	Perekonnanimi	Liitumisaasta
    
    Mari	  Maasikas	    2015
    
    Joonas	Juurikas	    2018
    
    Vilja	  Viljakas	    2005
    
    Paul	  Paulus	      2008
    
    Kaur	  Poolus	      2009


7.	Lisa kohustusliku väljana boolean aktiivne. Pane aktiivne veeru vaikeväärtuseks true – kui spetsiifiliselt ei öelda, kas liige on aktiivne, on ta aktiivne
8.	Lisa id väli, mis lisab igale uuele lapikute liikmele automaatselt uue numbrilise väärtuse
9.	Loo uus tabel nimega tarkvaratiim, kus on viited liikmetele liikmed tabelis. Tabelil on kaks veergu – liige, mis viitab id väljale liikmed tabelis ja projektis väli, mis näitab, kas liikmel on hetkel projekt käsil või mitte. Lisa sinna viited Marile, Joonasele ja Paulile ning näita, et nad kõik on projektis
10.	Kirjuta päring liikmed tabelile, mille alusel kuvatakse kõik lapikud, järjestatud kahanevalt liitumisaasta järgi
11.	Kirjuta päring liikmed tabelile, mille alusel kuvatakse kõik enne 2010 liitunud lapikud
12.	Kirjuta päring liikmed tabelile, mille alusel kuvatakse kõik P-tähega algavate perekonnanimedega lapikud





### Viited ja vihjed:

4.	https://www.postgresql.org/docs/9.0/static/sql-createdatabase.html
5.	https://www.postgresql.org/docs/9.0/static/sql-createtable.html
6.	https://www.postgresql.org/docs/9.0/static/dml-insert.html
7.	Kas uue kohustusliku rea lisamine kukkus läbi? Probleem seisneb tabelis eelnevalt sisestatud ridades – neil pole aktiivne väljal mitte mingit infot, kuid see on kohustuslik. Lahendus on panna välja loomisel vaikeväärtus (default value). https://www.postgresql.org/docs/9.0/static/sql-altertable.html
8.	http://www.postgresqltutorial.com/postgresql-serial/
9.	https://facility9.com/2010/08/postgresql-tutorial-referring-to-other-tables/
10.	https://www.postgresql.org/docs/9.0/static/sql-select.html
11.	– 12. https://www.postgresql.org/docs/9.0/static/functions-matching.html
