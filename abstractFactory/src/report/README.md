# 📊 Sistema di Processing dei Report

![Java](https://img.shields.io/badge/Language-Java-blue)
![License](https://img.shields.io/badge/License-MIT-green)

Questo progetto mostra un esempio di **Abstract Factory** applicato al processamento di report con diverse categorie e tipologie.

---

## 🔹 Descrizione del sistema

Il sistema deve **processare dei report** suddivisi in due categorie principali:

- **INPUT**: report relativi alle transazioni in ingresso.
- **OUTPUT**: report relativi alle transazioni in uscita.

Per ciascuna categoria possono esistere diversi **tipi di report**, ad esempio:

- **Invoice (INV)**: report relativi alle fatture.
- **Purchase (PUR)**: report relativi agli acquisti.

Ogni report, a seconda della sua **categoria** e del **tipo**, possiede una **specifica modalità di processamento**.

---

## 🔹 Formato dei report

I report arrivano sotto forma di una **lista di stringhe**, rappresentanti i nomi dei report letti da una cartella nel file system.

Il formato standard dei nomi dei file è:

CAT_TYPE_NAME.txt


Dove:
- `<CAT>` → categoria del report (`IN` per INPUT, `OUT` per OUTPUT)
- `<TYPE>` → tipo del report (`INV` per invoice, `PUR` per purchase, ecc.)
- `<NAME>` → nome identificativo del report

---

### 🔹 Esempi di file

| Nome file         | Categoria | Tipo     | Descrizione                           |
|------------------|-----------|----------|---------------------------------------|
| `IN_INV_001.txt` | INPUT     | Invoice  | Report di tipo “invoice” in ingresso  |
| `OUT_PUR_001.txt`| OUTPUT    | Purchase | Report di tipo “purchase” in uscita   |

---

## 🔹 Funzionamento

1. Il sistema legge la lista dei file presenti in una cartella.
2. Per ogni file, estrae la **categoria** e il **tipo** dal nome del report.
3. Utilizza una **factory appropriata** (INPUT o OUTPUT) per creare l’oggetto report corretto.
4. Il report viene processato secondo la sua **logica specifica**.

---

## 🔹 Esempio di utilizzo

```java
String[] reports = {
    "IN_INV_001.txt",
    "OUT_PUR_001.txt",
    "IN_INV_002.txt"
};

Archive archive = new Archive();

for (String file : reports) {
    String[] parts = file.split("_");
    archive.addReport(parts[0], parts[1], file);
}

archive.processAllReports();


Esempio preso dal sito https://www.davismol.net/