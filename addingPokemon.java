package pokemonproject;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class addingPokemon extends pokemonProjectFrame {
    public accessingDatabase a = new accessingDatabase();
    
    public void newPokemon(){
        int count=0;
        String pokemon, specie;
        int pokemonId=0;
        while(count==0){
            JTextField pokemonField = new JTextField();
            JTextField specieField = new JTextField();

            Object[] fields = { "Enter Pokemon", pokemonField, "Enter Specie", specieField };

            int ans = JOptionPane.showConfirmDialog(this, fields, "ADD POKEMON", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            
            if(ans == JOptionPane.OK_OPTION){
                pokemon = pokemonField.getText().toLowerCase();
                specie = specieField.getText().toLowerCase();
                
                if(!isInList(pokemon)){
                    JOptionPane.showMessageDialog(this, "The Pokemon you've entered \n\tis not in the list...");
                    continue;
                }
                else{
                    pokemonId = getPokemonId(pokemonId, pokemon);
                    a.insertInMyPokemons(pokemon, specie, pokemonId);
                    JOptionPane.showMessageDialog(this, "Successfully Added to your Pokemons List...");
                }
            }
            count++;
        }
    }
    
    public int getPokemonId(int pokemonId, String pokemon){
        ArrayList<pokemonList> pokemonlist = a.getPokemonList();
        for(pokemonList list: pokemonlist){
            if(list.getPokemon().equals(pokemon)){
                pokemonId = list.getPokemonId();
            }
        }
        return pokemonId;
    }
    
    public boolean isInList(String pokemon){
        ArrayList<pokemonList> pokemonlist = a.getPokemonList();
        boolean inList=false;
        for(pokemonList list: pokemonlist){
            if(list.getPokemon().equals(pokemon)){
                inList=true;
            }
        }
        return inList;
    }
}
