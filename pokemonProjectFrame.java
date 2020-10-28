package pokemonproject;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class pokemonProjectFrame extends javax.swing.JFrame {

    public pokemonProjectFrame() {
        initComponents();
        pokemonSpecieList();
        myPokemonList();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        panelTitleBackground = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelPokemonSpecies = new javax.swing.JLabel();
        buttonAddSpecie = new javax.swing.JButton();
        labelPokemonList = new javax.swing.JLabel();
        buttonAddPokemon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePokemonList = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePokemonSpecies = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(204, 204, 204));

        panelTitleBackground.setBackground(new java.awt.Color(0, 102, 204));
        panelTitleBackground.setForeground(new java.awt.Color(0, 0, 0));

        labelTitle.setBackground(new java.awt.Color(0, 102, 204));
        labelTitle.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(204, 204, 204));
        labelTitle.setText("POKEMON");

        javax.swing.GroupLayout panelTitleBackgroundLayout = new javax.swing.GroupLayout(panelTitleBackground);
        panelTitleBackground.setLayout(panelTitleBackgroundLayout);
        panelTitleBackgroundLayout.setHorizontalGroup(
            panelTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleBackgroundLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitleBackgroundLayout.setVerticalGroup(
            panelTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelPokemonSpecies.setBackground(new java.awt.Color(204, 204, 204));
        labelPokemonSpecies.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelPokemonSpecies.setForeground(new java.awt.Color(0, 0, 0));
        labelPokemonSpecies.setText("List of Pokemon Species");

        buttonAddSpecie.setBackground(new java.awt.Color(153, 153, 153));
        buttonAddSpecie.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonAddSpecie.setForeground(new java.awt.Color(0, 0, 0));
        buttonAddSpecie.setText("Add New Specie");
        buttonAddSpecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddSpecieActionPerformed(evt);
            }
        });

        labelPokemonList.setBackground(new java.awt.Color(204, 204, 204));
        labelPokemonList.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelPokemonList.setForeground(new java.awt.Color(0, 0, 0));
        labelPokemonList.setText("List of Pokemon");

        buttonAddPokemon.setBackground(new java.awt.Color(153, 153, 153));
        buttonAddPokemon.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonAddPokemon.setForeground(new java.awt.Color(0, 0, 0));
        buttonAddPokemon.setText("Add Pokemon");
        buttonAddPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPokemonActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        tablePokemonList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablePokemonList.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tablePokemonList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Pokemon", "Specie", "Level", "Level-Up"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePokemonList.setEnabled(false);
        tablePokemonList.getTableHeader().setResizingAllowed(false);
        tablePokemonList.getTableHeader().setReorderingAllowed(false);
        tablePokemonList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePokemonListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePokemonList);

        jScrollPane3.setAutoscrolls(true);

        tablePokemonSpecies.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablePokemonSpecies.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tablePokemonSpecies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Pokemon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePokemonSpecies.setEnabled(false);
        tablePokemonSpecies.getTableHeader().setResizingAllowed(false);
        tablePokemonSpecies.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablePokemonSpecies);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Project By: jcanaber622@gmail.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitleBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(labelPokemonSpecies)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(buttonAddSpecie)
                        .addContainerGap())))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAddPokemon))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(labelPokemonList)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(panelTitleBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPokemonSpecies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAddSpecie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPokemonList)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAddPokemon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   private void pokemonSpecieList(){
        accessingDatabase a = new accessingDatabase();
        ArrayList<pokemonList> pokemonlist= a.getPokemonList();
        Object[] obj=new Object[2];
        DefaultTableModel model=(DefaultTableModel)tablePokemonSpecies.getModel();
        model.setRowCount(0);
        tablePokemonSpecies.getColumnModel().getColumn(0).setPreferredWidth(200);
        tablePokemonSpecies.getColumnModel().getColumn(1).setPreferredWidth(263);
        for(int i=0; i<pokemonlist.size(); i++){
            obj[0] = pokemonlist.get(i).getPokemonId();
            obj[1] = pokemonlist.get(i).getPokemon();
            model.addRow(obj); 
            tablePokemonSpecies.setRowHeight(30);
        }
    }
   
    private void myPokemonList(){
        accessingDatabase a = new accessingDatabase();
        ArrayList<myPokemons> mypokemons= a.getMyPokemons();
        
        tablePokemonList.setDefaultRenderer(Object.class, new ButtonRenderer());
        JButton button = new JButton("Level-Up");
        
        Object[] obj=new Object[5];
        DefaultTableModel model=(DefaultTableModel)tablePokemonList.getModel();
        
        model.setRowCount(0);
        tablePokemonList.getColumnModel().getColumn(0).setPreferredWidth(15);
        tablePokemonList.getColumnModel().getColumn(1).setPreferredWidth(50);
        tablePokemonList.getColumnModel().getColumn(2).setPreferredWidth(50);
        tablePokemonList.getColumnModel().getColumn(3).setPreferredWidth(15);
        tablePokemonList.getColumnModel().getColumn(4).setPreferredWidth(40);
        
        for(int i=0; i<mypokemons.size(); i++){
            obj[0] = mypokemons.get(i).getMyPokemonId();
            obj[1] = mypokemons.get(i).getMyPokemon();
            obj[2] = mypokemons.get(i).getSpecie();
            obj[3] = mypokemons.get(i).getLevel();
            obj[4] = button;
            model.addRow(obj);
            tablePokemonList.setRowHeight(30);
        }
         
    }
    public boolean isCellEditable(int row, int column){
        return false;
    }
   
    
    private void buttonAddPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPokemonActionPerformed
        // TODO add your handling code here:
        addingPokemon pokemon = new addingPokemon();
        pokemon.newPokemon();
        myPokemonList();
    }//GEN-LAST:event_buttonAddPokemonActionPerformed

    private void buttonAddSpecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddSpecieActionPerformed
        // TODO add your handling code here:
        addNewSpecie specie = new addNewSpecie();
        specie.newSpecie();
        pokemonSpecieList();
    }//GEN-LAST:event_buttonAddSpecieActionPerformed

    private void tablePokemonListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePokemonListMouseClicked
        // TODO add your handling code here:
        pokemonLevel pl = new pokemonLevel();
        int column = tablePokemonList.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablePokemonList.getRowHeight();
        if( row < tablePokemonList.getRowCount() && row>= 0 && column< tablePokemonList.getColumnCount() && column >= 0){
            Object value = tablePokemonList.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton button = (JButton)value;
                pl.myPokemonLevel(row);
                myPokemonList();
            }
        }
    }//GEN-LAST:event_tablePokemonListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new pokemonProjectFrame().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton buttonAddPokemon;
    private javax.swing.JButton buttonAddSpecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelPokemonList;
    private javax.swing.JLabel labelPokemonSpecies;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelTitleBackground;
    private javax.swing.JTable tablePokemonList;
    private javax.swing.JTable tablePokemonSpecies;
    // End of variables declaration//GEN-END:variables
}
