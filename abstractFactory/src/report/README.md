Sistema di Processing dei Report

Questo progetto mostra un esempio di Abstract Factory applicato al processamento di report con diverse categorie e tipologie.

Descrizione del sistema

Supponiamo di avere un sistema che deve processare dei report suddivisi in due categorie principali:

INPUT: report relativi alle transazioni in ingresso.

OUTPUT: report relativi alle transazioni in uscita.

Per ciascuna categoria possono esistere diversi tipi di report, ad esempio:

Invoice (INV): report relativi alle fatture.

Purchase (PUR): report relativi agli acquisti.

Ogni report, a seconda della sua categoria e del tipo, possiede una specifica modalità di processamento.

Formato dei report

I report arrivano sotto forma di una lista di stringhe, che rappresentano i nomi dei report stessi, letti da una cartella del file system.

I nomi dei report seguono il seguente formato standard:

<CAT>_<TYPE>_<NAME>.txt


Dove:

<CAT> → categoria del report (IN per INPUT, OUT per OUTPUT)

<TYPE> → tipo del report (INV per invoice, PUR per purchase, ecc.)

<NAME> → nome identificativo del report.

Esempi
Nome file	Categoria	Tipo	Descrizione
IN_INV_001.txt	INPUT	Invoice	Report di tipo “invoice” in ingresso
OUT_PUR_001.txt	OUTPUT	Purchase	Report di tipo “purchase” in uscita
Funzionamento

Il sistema legge la lista dei file presenti in una cartella.

Per ogni file, estrae la categoria e il tipo dal nome del report.

Utilizza una factory appropriata (INPUT o OUTPUT) per creare l’oggetto report corretto.

Il report viene processato secondo la sua logica specifica.

Riferimenti

Esempio preso e ispirato dal sito: Davis Mol