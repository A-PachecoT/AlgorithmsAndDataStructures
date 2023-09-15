
package gui;

import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uni.aed.sorting.Algorithm;
import uni.aed.sorting.Algorithms;
import uni.aed.sorting.SortingFactory;

/**
 *
 * @author AndreP
 */
public class SortJFrame extends javax.swing.JFrame {
    
    private DefaultListModel modelList1 = new DefaultListModel(); // Data receptor for the JList
    private DefaultListModel modelList2 = new DefaultListModel();
    
    // Setting up table
    private String[] columnHeaders = {"Algorithm", "n", "Comparissons", "Swaps", "Running time(ns)", "Algorithmic Algorithms"};    
    private DefaultTableModel historyModel = new DefaultTableModel(columnHeaders, 0);
    private final long FACTOR_CONVERSION_NS_TO_MS=100000;
    
    
    public SortJFrame() { // Constructor
        initComponents();
        // Setting models for each list
        initialList.setModel(modelList1);
        sortedList.setModel(modelList2);
        // Setting Layout
        panelDataInput.removeAll();
        panelDataInput.add(panelAutomatic);
        panelDataInput.repaint();
        panelDataInput.revalidate();
        
        // Setting table
        tableHistory.setModel(historyModel);
        historyModel.setColumnIdentifiers(columnHeaders);
        
        // Setting up 
        for (Algorithms algo : Algorithms.values()) {
            sortingComboBox.addItem(algo.getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnGroupDataInput = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        background = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sortedList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        initialList = new javax.swing.JList<>();
        bttnSort = new javax.swing.JToggleButton();
        bttnClear = new javax.swing.JToggleButton();
        bttnClose = new javax.swing.JToggleButton();
        sortingComboBox = new javax.swing.JComboBox<>();
        checkBoxAscending = new javax.swing.JCheckBox();
        bttnManualInput = new javax.swing.JRadioButton();
        lblDataInput = new javax.swing.JLabel();
        bttnAutomaticInput = new javax.swing.JRadioButton();
        panelDataInput = new javax.swing.JPanel();
        panelAutomatic = new javax.swing.JPanel();
        spinnerMinVal = new javax.swing.JSpinner();
        spinnerMaxVal = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        spinnerNumElements = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        checkBoxUnique = new javax.swing.JCheckBox();
        bttnGenerate = new javax.swing.JToggleButton();
        panelManual = new javax.swing.JPanel();
        txtValue = new javax.swing.JTextField();
        lblIntroduceDataPoints = new javax.swing.JLabel();
        panelTable = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableHistory = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bubble Sort Algorithm");

        lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl.setText("SORTING MACHINE");

        sortedList.setFocusable(false);
        jScrollPane1.setViewportView(sortedList);

        initialList.setFocusable(false);
        jScrollPane2.setViewportView(initialList);

        bttnSort.setText("Sort");
        bttnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSortActionPerformed(evt);
            }
        });

        bttnClear.setText("Clear");
        bttnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnClearActionPerformed(evt);
            }
        });

        bttnClose.setText("Close");
        bttnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCloseActionPerformed(evt);
            }
        });

        sortingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortingComboBoxActionPerformed(evt);
            }
        });

        checkBoxAscending.setSelected(true);
        checkBoxAscending.setText("Ascending");
        checkBoxAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAscendingActionPerformed(evt);
            }
        });

        bttnGroupDataInput.add(bttnManualInput);
        bttnManualInput.setText("Manual");
        bttnManualInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManualInputActionPerformed(evt);
            }
        });

        lblDataInput.setText("Data input:");

        bttnGroupDataInput.add(bttnAutomaticInput);
        bttnAutomaticInput.setSelected(true);
        bttnAutomaticInput.setText("Automatic");
        bttnAutomaticInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAutomaticInputActionPerformed(evt);
            }
        });

        panelDataInput.setLayout(new java.awt.CardLayout());

        spinnerMaxVal.setValue(10);

        jLabel1.setText("Min. value");

        lblMax.setText("Max. value");

        spinnerNumElements.setValue(8);

        jLabel2.setText("N° elements");

        checkBoxUnique.setText("Unique values");

        bttnGenerate.setText("Generate");
        bttnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutomaticLayout = new javax.swing.GroupLayout(panelAutomatic);
        panelAutomatic.setLayout(panelAutomaticLayout);
        panelAutomaticLayout.setHorizontalGroup(
            panelAutomaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutomaticLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAutomaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutomaticLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerNumElements, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(checkBoxUnique, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnGenerate)
                .addGap(26, 26, 26)
                .addGroup(panelAutomaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMax, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAutomaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spinnerMaxVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMinVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelAutomaticLayout.setVerticalGroup(
            panelAutomaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAutomaticLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAutomaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMax)
                    .addComponent(jLabel2)
                    .addComponent(spinnerNumElements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMaxVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAutomaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerMinVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(checkBoxUnique)
                    .addComponent(bttnGenerate))
                .addGap(8, 8, 8))
        );

        panelDataInput.add(panelAutomatic, "card20");

        txtValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueActionPerformed(evt);
            }
        });
        txtValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValueKeyTyped(evt);
            }
        });

        lblIntroduceDataPoints.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblIntroduceDataPoints.setText("Introduce data points:");

        javax.swing.GroupLayout panelManualLayout = new javax.swing.GroupLayout(panelManual);
        panelManual.setLayout(panelManualLayout);
        panelManualLayout.setHorizontalGroup(
            panelManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
            .addGroup(panelManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelManualLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblIntroduceDataPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManualLayout.createSequentialGroup()
                    .addContainerGap(167, Short.MAX_VALUE)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(118, 118, 118)))
        );
        panelManualLayout.setVerticalGroup(
            panelManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(panelManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelManualLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(panelManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIntroduceDataPoints))
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        panelDataInput.add(panelManual, "card19");

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        tableHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableHistory.setFocusable(false);
        jScrollPane5.setViewportView(tableHistory);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(bttnClear)
                                .addGap(261, 261, 261)
                                .addComponent(bttnClose))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDataInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataInput, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bttnManualInput, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bttnSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(checkBoxAscending, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bttnAutomaticInput, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnManualInput)
                    .addComponent(lblDataInput)
                    .addComponent(bttnAutomaticInput))
                .addGap(18, 18, 18)
                .addComponent(panelDataInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(bttnSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxAscending))
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnClear)
                    .addComponent(bttnClose))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValueKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if(!numero)
        evt.consume();
    }//GEN-LAST:event_txtValueKeyTyped

    private void txtValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueActionPerformed
        modelList1.addElement(txtValue.getText());
        txtValue.setText("");
    }//GEN-LAST:event_txtValueActionPerformed

    private void bttnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGenerateActionPerformed
        bttnGenerate.setSelected(false);
        modelList1.removeAllElements();
        modelList2.removeAllElements();

        Random random = new Random();
        int min = (int) spinnerMinVal.getValue();
        int max = (int) spinnerMaxVal.getValue();
        int randomVal;
        int n = (int) spinnerNumElements.getValue();
        int[] arr = new int[n];
        Boolean uniqueValue = (Boolean) checkBoxUnique.isSelected();

        if (min > max){
            JOptionPane.showMessageDialog(null, "Range of values not valid.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(!uniqueValue)
        for (int i = 0; i < n; i++){
            randomVal = random.nextInt(max - min) + min;
            arr[i] = randomVal;
        }
        else{
            if (max - min + 1 <= n){
                JOptionPane.showMessageDialog(null, "Range is not wide enough", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            boolean isFound;
            for (int i = 0; i < n; i++){
                // Search if the value was used
                do{
                    isFound = false;
                    randomVal = random.nextInt(max - min) + min;
                    for (int j = 0; j < i; j++){
                        if (randomVal == arr[j])
                        isFound = true;
                    }
                }while(isFound);

                arr[i] = randomVal;
            }
        }
        for (int i = 0; i < n; i++)
        modelList1.addElement(Integer.toString(arr[i]));
    }//GEN-LAST:event_bttnGenerateActionPerformed

    private void bttnAutomaticInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAutomaticInputActionPerformed
        panelDataInput.removeAll();
        panelDataInput.add(panelAutomatic);
        panelDataInput.repaint();
        panelDataInput.revalidate();
    }//GEN-LAST:event_bttnAutomaticInputActionPerformed

    private void bttnManualInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManualInputActionPerformed
        panelDataInput.removeAll();
        panelDataInput.add(panelManual);
        panelDataInput.repaint();
        panelDataInput.revalidate();
    }//GEN-LAST:event_bttnManualInputActionPerformed

    private void checkBoxAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAscendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAscendingActionPerformed

    private void sortingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortingComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortingComboBoxActionPerformed

    private void bttnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCloseActionPerformed
        // Deselect the toggle button
        bttnClose.setSelected(false);
        this.dispose();
    }//GEN-LAST:event_bttnCloseActionPerformed

    private void bttnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnClearActionPerformed
        bttnClear.setSelected(false);
        modelList1.removeAllElements();
        modelList2.removeAllElements();
    }//GEN-LAST:event_bttnClearActionPerformed

    private void bttnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSortActionPerformed
        bttnSort.setSelected(false);

        // 1. Extract data from the GUI
        Integer N = initialList.getModel().getSize();
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(initialList.getModel().getElementAt(i).toString());
        }
        String selectedAlgorithmName = (String) sortingComboBox.getSelectedItem();

        // 2. Convert that name to its corresponding enum constant
        Algorithms selectedAlgorithmEnum = Algorithms.valueOf(selectedAlgorithmName.toUpperCase());

        // 3. Use the SortingFactory to get the instance of the sorting algorithm
        Algorithm sortingAlgorithm = SortingFactory.getAlgorithm(selectedAlgorithmEnum);

        // 4. Sorting and adding the resulting array to the results list
        sortingAlgorithm.sort(arr);

        modelList2.removeAllElements();
        Boolean isAscending = checkBoxAscending.isSelected();
        for (int i : (isAscending ? arr : reverseArray(arr))) {
            modelList2.addElement(String.valueOf(i));
        }

        // 5. Add metrics to the history table
        historyModel.addRow(new Object[] {
            selectedAlgorithmEnum.getName(),
            N,
            sortingAlgorithm.getNumComparissons(),
            sortingAlgorithm.getNumSwaps(),
            sortingAlgorithm.getExecutionTime(),
            selectedAlgorithmEnum.getComplexity()
        });
    }//GEN-LAST:event_bttnSortActionPerformed
    private Integer[] reverseArray(Integer[] arr) {
        Integer[] reversed = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JRadioButton bttnAutomaticInput;
    private javax.swing.JToggleButton bttnClear;
    private javax.swing.JToggleButton bttnClose;
    private javax.swing.JToggleButton bttnGenerate;
    private javax.swing.ButtonGroup bttnGroupDataInput;
    private javax.swing.JRadioButton bttnManualInput;
    private javax.swing.JToggleButton bttnSort;
    private javax.swing.JCheckBox checkBoxAscending;
    private javax.swing.JCheckBox checkBoxUnique;
    private javax.swing.JList<String> initialList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblDataInput;
    private javax.swing.JLabel lblIntroduceDataPoints;
    private javax.swing.JLabel lblMax;
    private javax.swing.JPanel panelAutomatic;
    private javax.swing.JPanel panelDataInput;
    private javax.swing.JPanel panelManual;
    private javax.swing.JPanel panelTable;
    private javax.swing.JList<String> sortedList;
    private javax.swing.JComboBox<String> sortingComboBox;
    private javax.swing.JSpinner spinnerMaxVal;
    private javax.swing.JSpinner spinnerMinVal;
    private javax.swing.JSpinner spinnerNumElements;
    private javax.swing.JTable tableHistory;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
