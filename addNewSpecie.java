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
                            String[] evolution = new String[noOfEvolution];
                            int[] evolutionLevel= new int[noOfEvolution];

                            for(int i=0; i<noOfEvolution; i++){
                                int counter1=0;
                                while(counter1==0){
                                    try{
                                        JTextField evolutionLevelField = new JTextField();
                                        JTextField evolutionField = new JTextField();

                                        Object[] field ={"Evolution", evolutionField, "Evolution Level", evolutionLevelField};

                                        int ans = JOptionPane.showConfirmDialog(this, field, "EVOLUTION NUMBER "+(i+1),
                                            JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);

                                        if(ans == JOptionPane.OK_OPTION){
                                            for(int j=0; j<noOfEvolution; j++){
                                                evolutionLevel[j]=Integer.parseInt(evolutionLevelField.getText());
                                                evolution[j]=evolutionField.getText().toLowerCase();
                                            }

                                        }
                                        counter1++;
                                    }catch(NumberFormatException e){
                                        JOptionPane.showMessageDialog(this, "Invalid Input");
                                        counter1=0;
                                    }
                                }

                            }
                            for(int i=0; i<noOfEvolution; i++){
                                a.insertInEvolutionList(evolution[i], evolutionLevel[i],pokemonId);
                            }
                            JOptionPane.showMessageDialog(this, "Successfully Added to Pokemon Specie List...");
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(this, "Invalid Input");
                        }
                    }
                    counter++;
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
