package ro.ase.cts.documenteConfidentiale.proxy;

import ro.ase.cts.documenteConfidentiale.clase.Angajat;
import ro.ase.cts.documenteConfidentiale.clase.IDocument;

public class ProxyManager implements IDocument {
    private IDocument document;

    public ProxyManager(IDocument document) {
        this.document = document;
    }

    @Override
    public void citesteDocument(Angajat angajat) {
        if(angajat.iseManager())
        {
            document.citesteDocument(angajat);
        }
        else
        {
            System.out.println("Angajatul nu are acces la acest document confidential");
        }
    }
}
