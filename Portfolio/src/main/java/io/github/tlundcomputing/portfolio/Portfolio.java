/**
 *   Programming Project Portfolio
 *   Copyright (C) 2025  TLundComputing
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.tlundcomputing.portfolio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author TLundComputing
 */
public class Portfolio extends JFrame implements ActionListener{
    
    ClassLoader ldr = this.getClass().getClassLoader();
    
    private final JLabel TITLE = new JLabel("Programming Portfolio");
    private final JButton RUN = new JButton("Run Project");
    private final JComboBox<String> PICKER = new JComboBox<>(new String[] {"Select Project...", "Fruit Machine", "Mastermind", "Advent of Code"});
    private final JPanel HEADER = new JPanel();
    private final JPanel CONTENT = new JPanel();
    private final JPanel FOOTER = new JPanel();
    private final ImageIcon FACE = new ImageIcon(ldr.getResource("./io/github/tlundcomputing/portfolio/Icon.png"));
    private final JLabel LOGO = new JLabel(FACE);
    
    public Portfolio(){
        // Declaring Static Properties
        super("TLundComputing Programming Portfolio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        // Add a listner to the run button
        RUN.addActionListener(this);
        
        // Changing properities
        TITLE.setFont(new Font("Arial", Font.PLAIN, 34));
        HEADER.add(TITLE);
        CONTENT.add(LOGO);
        CONTENT.add(PICKER);
        CONTENT.add(RUN);
        FOOTER.add(new JLabel("These projects are taken from the OCR Coding challenges"));
        
        // Adding Content to main JFrame and setting visibility
        add(HEADER, BorderLayout.NORTH);
        add(CONTENT, BorderLayout.CENTER);
        add(FOOTER, BorderLayout.SOUTH);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Portfolio gui = new Portfolio();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == RUN){
            if(PICKER.getSelectedItem().toString().equalsIgnoreCase("Select Project...")){
                JOptionPane.showMessageDialog(this, "Select a project", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                String msg = "You are going to run the following project: " + PICKER.getSelectedItem();
                JOptionPane.showMessageDialog(this, msg, "Running Project", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
