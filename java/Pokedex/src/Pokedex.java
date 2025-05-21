import java.util.*;
class Pokedex{
    private Map<Attaque, Set<String>> pokedex;

    Pokedex(){
        this.pokedex = new HashMap<>();
    }
    public void ajouterPokemon(Attaque ataq, String poke){
        Set<Attaque> clefs =  pokedex.keySet();
        if(clefs.contains(poke)){
            Set<String> atqset = pokedex.get(poke);
            atqset.add(poke);
        }
        else{
            Set<String> newataq = new HashSet<>();
            newataq.add(poke);
            pokedex.put(ataq, newataq);
        }
    }

    public boolean appartient(String nom){
        for(Set<String> valeur : this.pokedex.values()){
            if(valeur.contains(nom)){
                return true;
            }
        }
        return false;
    }
    public int nombreDe(Attaque ataq){
        return this.pokedex.get(ataq).size();
    }

    public Set<Attaque> toutesLesAttaques(String pokemon)throws PasUnTelPokemonException{
        Set<Attaque> type = new HashSet<>();
        for(Map.Entry<Attaque  ,Set<String>> couple : pokedex.entrySet()){
            if(couple.getValue().contains(pokemon)){
                type.add(couple.getKey());
            }
        }
        if(type.size() == 0){
            throw new PasUnTelPokemonException();
        }
        return type;
    }

    public Attaque attaquePreferee(){
        int maxi = 0;
        Attaque ataque = null;
        for(Map.Entry<Attaque  ,Set<String>> couple : pokedex.entrySet()){
            if(maxi < couple.getValue().size()){
                ataque = couple.getKey();
                maxi = couple.getValue().size();
            }
        }
        return ataque;
    }

    public Map<String, Set<Attaque>> convertDico(){
        Map<String, Set<Attaque>> convertdico = new HashMap<>();
        Set<String> pokemon = new HashSet<>();
        for(Set<String> poke: this.pokedex.values()){
            pokemon.addAll(poke);
            }
        for(String nom: pokemon){
            try{
                convertdico.put(nom, this.toutesLesAttaques(nom));
            }
            catch(PasUnTelPokemonException e){
                System.out.println("Le pokemon " + nom + "n'a pas d'attaque");
            }
                
            
        }
        return convertdico;
    }


}
