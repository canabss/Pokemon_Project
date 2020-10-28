package pokemonproject;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class addNewSpecie extends pokemonProjectFrame {
    public accessingDatabase a = new accessingDatabase();
    public void newSpecie(){
        int counter=0;
        while(counter==0){
            
                JTextField pokemonIdField = new JTextField();
                JTextField pokemonField = new JTextField();
                JTextField noOfEvolutionField = new JTextField();

                Object[] fields = {"Pokemon", pokemonField, "No. of Evolution", noOfEvolutionField};

                int answer = JOptionPane.showConfirmDialog(this, fields, "ADD NEW SPECIE",
                        JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);

                    String pokemon, specie;
                    int level, noOfEvolution, pokemonId;

                    if(answer == JOptionPane.OK_OPTION){
                        try{
                            
                            pokemon = pokemonField.getText().toLowerCase();
                            noOfEvolution = Integer.parseInt(noOfEvolutionField.getText());
                            
                            if(isExist(pokemon)){
                                JOptionPane.showMessageDialog(this, "The Pokemon you've entered is\n\tAlready in the list...");
                                continue;
                            }
                            
                            pokemonId = a.insertInPokemonList(pokemon);

                            for(int i=0; i<noOfEvolution; i++){
                                int counter1=0;
                                        JTextField evolutionLevelField = new JTextField();
                                        JTextField evolutionField = new JTextField();
                                        Object[] field ={"Evolution", evolutionField, "Evolution Level", evolutionLevelField};
                                        while(counter1==0){
                                            try{
                                                int ans = JOptionPane.showConfirmDialog(this, field, "EVOLUTION NUMBER "+(i+1),
                                                    JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);

                                                if(ans == JOptionPane.OK_OPTION){
                                                        String evolution=evolutionField.getText().toLowerCase();
                                                        int evolutionLevel=Integer.parseInt(evolutionLevelField.getText());
                                                        a.insertInEvolutionList(evolution, evolutionLevel,pokemonId);
                                                }
                                                counter1++;
                                            }catch(NumberFormatException e){
                                                JOptionPane.showMessageDialog(this, "Invalid Input");
                                            }
                                        }
                            }
                            counter++;
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(this, "Invalid Input");
                        }
                    }
            JOptionPane.showMessageDialog(this, "Successfully Added to Pokemon Specie List...");
        }
    }
    
    public boolean isExist(String pokemon){
        ArrayList<pokemonList> pokemonlist = a.getPokemonList();
        boolean exist=false;
        for(pokemonList list: pokemonlist){
            if(list.getPokemon().equals(pokemon)){
                JOptionPane.showMessageDialog(this, "Pokemon Specie is Already Exist...");
                exist=true;
            }
        }
        return exist;
    }
    
}
