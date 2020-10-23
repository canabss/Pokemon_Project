
package pokemonproject;

public class pokemonEvolutions {
    protected String evolution;
    protected int evolutionLevel;
    protected int pokemonId;
    
    public pokemonEvolutions(String evolution, int evolutionLevel, int pokemonId){
        this.evolution = evolution;
        this.evolutionLevel = evolutionLevel;
        this.pokemonId = pokemonId;
    }
    
    public String getEvolution(){
        return this.evolution;
    }
    public void setEvolution(String evolution){
        this.evolution = evolution;
    }
    public int getEvolutionLevel(){
        return this.evolutionLevel;
    }
    public void setEvolutionLevel(int evolutionLevel){
        this.evolutionLevel = evolutionLevel;
    }
    public int getPokemonId(){
        return this.pokemonId;
    }
    public void setPokemonId(int pokemonId){
        this.pokemonId = pokemonId;
    }
    
}
