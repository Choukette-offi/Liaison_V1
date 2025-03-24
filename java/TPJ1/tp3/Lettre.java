import java.util.Arrays;
import java.util.List;

/**
* N -> ===_=
* ===_=_=_=== -> X
* espace entre deuc lettres ___ (3 _)
* espace entre deux mots _______ (7 _)
* traduire le code 
* ===___===_===_===_______===___===_===_===
* -> TO TO
* GA BU -> 
* ===_===_=___=_===_______===_=_=_=___=_=_===
*/


class Lettre {
    private char laLettre;
    static List<String> alphabetMorse = 
        Arrays.asList("=_===", "===_=_=_=", "===_=_===_=",
                      "===_=_=", "=", "=_=_===_=", "===_===_=",
                      "=_=_=_=", "=_=", "=_===_===_===", "===_=_===",
                      "=_===_=_=", "===_===", "===_=", "===_===_===",
                      "=_===_===_=", "===_===_=_===", "=_===_=", "=_=_=",
                      "===", "=_=_===", "=_=_=_===", "=_===_===", 
                      "===_=_=_===", "===_=_==_===", "===_===_=_=",
                      "_______");

    /** constructeurs  */
    public Lettre(char lettre) {
        this.laLettre = lettre;
    }

    public Lettre(String codeMorse) {
        int indice = alphabetMorse.indexOf(codeMorse);
        if (indice == 26) {
            this.laLettre = ' ';
        }
        else {
            this.laLettre = (char) (indice + 'A');
        }
    }

    /**
     * permet de retourner le code ascii d'une lettre
     * @return int code ascii d'une lettre
     */
    public int toNumero() {
        if (estBlanc()) return 26;
        return this.laLettre - 'A';
    }
    
    /**
     * permet de tester si une lettre est un blanc 
     * @return boolean
     */
    public boolean estBlanc() {
        return this.laLettre == ' ';
    } 

    /**
     * permet de transformer une lettre en son code morse
     * @return String la représentation du code morse
     * de la lettre
     */
    public String toMorse() { 
	    return alphabetMorse.get(toNumero()); 
    }

    /**
     * retourne une lettre entre 'A' et 'Z' ou un espace
     * si code morse on retourne la lettre
     * @return char la lettre qui correspond
     */
    public char toChar() {
        return this.laLettre;
    }

    @Override
    public String toString() {
        return "" + this.laLettre;
    }

    @Override
    public boolean equals(Object objet) {
        if (objet == null) {return false;}

        if(objet == this) {return true;}

        if (!(objet instanceof Lettre)) {return false;}

        Lettre tmp = (Lettre) objet;
        return tmp.laLettre == this.laLettre;
    }
}