package pokemonproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class accessingDatabase {
    public String host = "jdbc:mysql://localhost:3306/MY_DATABASE";
    public Connection conn = null;
    public PreparedStatement ps = null;
    public ArrayList<pokemonList> getPokemonList(){
        ArrayList<pokemonList> pokemonlists=new ArrayList<>();
        pokemonList pokemonlist;
        try {
            conn = DriverManager.getConnection(host, "root", "");
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery("SELECT * FROM POKEMON_LIST");
            
            while(result.next()){
                pokemonlist = new pokemonList(result.getInt("POKEMON_ID"), 
                            result.getString("POKEMON"));
                
                pokemonlists.add(pokemonlist);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
        return pokemonlists;
    }
    
    public ArrayList<myPokemons> getMyPokemons(){
        ArrayList<myPokemons> mypokemons=new ArrayList<>();
        myPokemons mypokemon;
        try {
            conn = DriverManager.getConnection(host, "root", "");
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery("SELECT MY_POKEMON_NO, MY_POKEMON, SPECIE, LEVEL FROM MY_POKEMONS");
            
            while(result.next()){
                mypokemon = new myPokemons(result.getInt("MY_POKEMON_NO"), result.getString("MY_POKEMON"), 
                            result.getString("SPECIE"), result.getInt("LEVEL"));
                
                mypokemons.add(mypokemon);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
        return mypokemons;
    }
    
    public ArrayList<myPokemons> getMyPokemon(){
        ArrayList<myPokemons> mypokemons=new ArrayList<>();
        myPokemons mypokemon;
        try {
            conn = DriverManager.getConnection(host, "root", "");
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery("SELECT * FROM MY_POKEMONS");
            
            while(result.next()){
                mypokemon = new myPokemons(result.getInt("MY_POKEMON_NO"), result.getString("MY_POKEMON"), 
                            result.getString("SPECIE"), result.getInt("LEVEL"), result.getInt("POKEMON_ID"));
                mypokemons.add(mypokemon);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
        return mypokemons;
    }
    
    public ArrayList<pokemonEvolutions> getPokemonEvolutions(){
        ArrayList<pokemonEvolutions> pokemonevolutions=new ArrayList<>();
        pokemonEvolutions pokemonevolution;
        try {
            conn = DriverManager.getConnection(host, "root", "");
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery("SELECT EVOLUTION, EVOLUTION_LEVEL, POKEMON_ID FROM EVOLUTION_LIST");
            
            while(result.next()){
                pokemonevolution = new pokemonEvolutions(result.getString("EVOLUTION"), 
                            result.getInt("EVOLUTION_LEVEL"), result.getInt("POKEMON_ID"));
                
                pokemonevolutions.add(pokemonevolution);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
        return pokemonevolutions;
    }
    
    public int insertInPokemonList(String pokemon){
        ArrayList<pokemonList> list= getPokemonList();
        pokemonList pokemonAttribute= new pokemonList(0, "");
        pokemonAttribute.setPokemonId(list.size()+1);
        pokemonAttribute.setPokemon(pokemon);
        try {
            conn = DriverManager.getConnection(host, "root", "");
            ps = conn.prepareStatement("INSERT INTO POKEMON_LIST (POKEMON_ID, POKEMON) " + " VALUES (?, ?)");
            ps.setInt(1,pokemonAttribute.getPokemonId());
            ps.setString(2,pokemonAttribute.getPokemon());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
            return pokemonAttribute.getPokemonId();
    }
    
    public void insertInEvolutionList(String evolution, int evolutionLevel,int pokemonId){
        ArrayList<pokemonEvolutions> evolutionlist= getPokemonEvolutions();
        pokemonEvolutions evolutionAttribute= new pokemonEvolutions("", 0, 0);
        evolutionAttribute.setEvolution(evolution);
        evolutionAttribute.setEvolutionLevel(evolutionLevel);
        evolutionAttribute.setPokemonId(pokemonId);
        try {
            conn = DriverManager.getConnection(host, "root", "");
            ps = conn.prepareStatement("INSERT INTO EVOLUTION_LIST (EVOLUTION_ID, EVOLUTION, EVOLUTION_lEVEL, POKEMON_ID) " + " VALUES (?, ?, ?, ?)");
            ps.setInt(1,evolutionlist.size()+1);
            ps.setString(2,evolutionAttribute.getEvolution());
            ps.setInt(3,evolutionAttribute.getEvolutionLevel());
            ps.setInt(4,evolutionAttribute.getPokemonId());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
    }
    
    public void insertInMyPokemons(String pokemon, String specie, int pokemonId){
        ArrayList<myPokemons> mypokemons= getMyPokemons();
        myPokemons mypokemon= new myPokemons(0,"", "", 0);
        mypokemon.setMyPokemon(pokemon);
        mypokemon.setSpecie(specie);
        mypokemon.setLevel(1);
        try {
            conn = DriverManager.getConnection(host, "root", "");
            ps = conn.prepareStatement("INSERT INTO  MY_POKEMONS (MY_POKEMON_NO, MY_POKEMON, SPECIE, LEVEL, POKEMON_ID) " + " VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1,mypokemons.size()+1);
            ps.setString(2,mypokemon.getMyPokemon());
            ps.setString(3,mypokemon.getSpecie());
            ps.setInt(4,mypokemon.getLevel());
            ps.setInt(5, pokemonId);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
    }
    
    public void updateMyPokemons(int level, String pokemon, int mypokemonId){
        try {
            conn = DriverManager.getConnection(host, "root", "");
            ps=conn.prepareStatement("UPDATE MY_POKEMONS SET MY_POKEMON=?,LEVEL=? WHERE MY_POKEMON_NO=?");
            ps.setString(1,pokemon);
            ps.setInt(2,level);
            ps.setInt(3,mypokemonId);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
    }
    
    public void updateMyPokemons(int level,int mypokemonId){
        try {
            conn = DriverManager.getConnection(host, "root", "");
            ps=conn.prepareStatement("UPDATE MY_POKEMONS SET LEVEL=? WHERE MY_POKEMON_NO=?");
            ps.setInt(1,level);
            ps.setInt(2,mypokemonId);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            close(conn, null, null);
        }
    }
    
    private static void close(Connection conn, PreparedStatement ps, Statement stmnt) {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "SQL Exception Error");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "SQL Exception Error");
                }
            }
            if (stmnt != null) {
                try {
                    stmnt.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "SQL Exception Error");
                }
            }
    }

}
