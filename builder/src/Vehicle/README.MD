In questo esempio, il modello Builder consente la costruzione passo dopo passo di diversi modelli di auto.

L'esempio mostra anche come Builder realizza prodotti di diverso tipo (manuale dell'auto) utilizzando gli stessi passaggi di costruzione.

Il Direttore controlla l'ordine di costruzione. Sa quali fasi di costruzione richiamare per produrre questo o quel modello di auto. Collabora con i costruttori solo tramite la loro interfaccia comune. Questo consente di passare diversi tipi di costruttori al Direttore.

Il risultato finale viene recuperato dall'oggetto builder perché il direttore non può conoscere il tipo di prodotto risultante. Solo l'oggetto Builder sa esattamente cosa costruisce.