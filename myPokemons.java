package pokemonproject;

public class myPokemons {
    protected int myPokemonId;
    protected String myPokemon;
    protected String specie;
    protected int level;
    protected int pokemonId;
    
    public myPokemons(int myPokemonId, String myPokemon, String specie, int level,int pokemonId){
        this.myPokemonId = myPokemonId;
        this.myPokemon = myPokemon;
        this.specie = specie;
        this.level = level;
        this.pokemonId = pokemonId;
    }
    public myPokemons(int myPokemonId, String myPokemon, String specie, int level){
        this.myPokemonId = myPokemonId;
        this.myPokemon = myPokemon;
        this.specie = specie;
        this.level = level;
    }
    
    public int getMyPokemonId(){
        return this.myPokemonId;
    }
    public void setMyPokemonId(int myPokemonId){
        this.myPokemonId = myPokemonId;
    }
    
    public String getMyPokemon(){
        return this.myPokemon;
    }
    public void setMyPokemon(String myPokemon){
        this.myPokemon = myPokemon;
    }
    
    public String getSpecie(){
        return this.specie;
    }
    public void setSpecie(String specie){
        this.specie = specie;
    }
    
    public int getLevel(){
        return this.level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    
    public int getPokemonId(){
        return this.pokemonId;
    }
    public void setPokemonId(int pokemonId){
        this.pokemonId = pokemonId;
    }
}
