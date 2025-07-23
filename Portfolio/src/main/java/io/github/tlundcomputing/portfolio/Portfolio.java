/**
 * Programming Project Portfolio
 * Copyright (C) 2025  TLundComputing
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

/**
 *
 * @author TLundComputing
 */
public class Portfolio extends JFrame{
    
    private final JLabel TITLE = new JLabel("This is my programming portfolio");
    
    public Portfolio(){
        super("TLundComputing Programming Portfolio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        add(TITLE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Portfolio gui = new Portfolio();
    }
}
