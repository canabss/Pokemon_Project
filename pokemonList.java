package pokemonproject;

public class pokemonList {
    protected int pokemonId;
    protected String pokemon;
    
    public pokemonList(int pokemonId, String pokemon){
        this.pokemonId = pokemonId;
        this.pokemon = pokemon;
    }
    
    public int getPokemonId(){
        return this.pokemonId;
    }
    public void setPokemonId(int pokemonId){
        this.pokemonId = pokemonId;
    }
    public String getPokemon(){
        return this.pokemon;
    }
    public void setPokemon(String pokemon){
        this.pokemon = pokemon;
    }
    
}
