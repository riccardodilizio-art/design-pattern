package document;

import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, DocumentPrototype>  documents = new HashMap<>();

    public void registerPrototype(String name, DocumentPrototype documentPrototype){
        documents.put(name, documentPrototype);
    }

    public DocumentPrototype getPrototype(String name){
        DocumentPrototype documentPrototype = documents.get(name);
        if (documentPrototype == null){
            throw new NullPointerException("No such prototype: " + name);
        }
        return documentPrototype.clone();
    }
}
