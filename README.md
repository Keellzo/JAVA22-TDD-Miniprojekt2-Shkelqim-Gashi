# Projektutvärdering - Prime Numbers

## Utvärdering
I början var jag orolig för uppgiften med Prime Numbers, då jag antog att den skulle vara extremt svår. Dock, när jag började läsa koden och förstå primtal bättre, insåg jag att det inte var så svårt som jag först trodde. Uppgiften visade sig vara enklare än förväntat, men det krävde ändå vissa ändringar i min kod jämfört med den ursprungliga versionen.

## Refactoring
Jag genomförde några viktiga ändringar i koden, vilket inkluderade:

### Ändring av `isPrime` Metoden
Jag ändrade isPrime metoden för en algoritm jag tyckte var enklare att förstå (och kanske bättre) vilket ledde till en annan sak som jag observerade då.

### Borttagning av Listan
Jag observerade en sak som jag tycker är onödigt (enligt mig). Eftersom vi har en bool metod som kollar primtal, så man behöver inte listan för antalet primtal eftersom vår "count" variabel inkrementeras för varje iteration i samband med att bool metoden kollar att det är ett primtal, samma gäller för summan av primtalen eftersom den adderar bara ifall det är ett primtal.
Listan fanns inte heller med alls i specifikationen, där av tänkte jag att listan är egentligen onödig efter min ändring och kan därför ta bort den.

### Användning av `String` istället för `void`
För att förenkla testning ändrade jag mina output-metoder till att använda `String` istället för `void`.

## Tester
Följande testfall bedömer jag som mest kritiska för programmets funktionalitet och korrekthet:

- **Korrekt Antal Primtal**: Testning för korrekt antal primtal inom angivna intervaller.
- **Rätt Summa av Primtal**: Verifiering av att summan av primtalen är korrekt för givna intervaller.
- **Tillåtna Intervaller**: Säkerställande av att programmet endast accepterar tillåtna intervaller.

Dessa tester är essentiella för att garantera programmets pålitlighet och korrekthet.
