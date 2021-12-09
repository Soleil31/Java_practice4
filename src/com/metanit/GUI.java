package com.metanit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    public class GUI extends JFrame {
        JButton milan = new JButton("AC Milan");
        JButton madrid = new JButton("Real Madrid");
        JLabel result = new JLabel("Результат: 0 x 0");
        JLabel lastScorer = new JLabel("Последний забивший: N/A");
        Label winner = new Label("Победитель: DRAW");
        private int milanScore = 0;
        private int madridScore = 0;
        GUI() {
            super("Футбол");
            setLayout(new GridLayout(3, 2));
            setSize(400, 400);
            add(milan);
            add(madrid);
            add(result);
            add(lastScorer);
            add(winner);
            milan.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae)
                {
                    milanScore++;
                    String txt = "Результат: " + milanScore + " x " + madridScore;
                    result.setText(txt);
                    lastScorer.setText("Последний забивший: Milan");
                    if(milanScore > madridScore) {
                        winner.setText("Итог: Milan");
                    }
                    else if (milanScore < madridScore) {
                        winner.setText("Итог: Madrid");
                    }
                    else {
                        winner.setText("Итог: Ничья");
                    }
                }
            });
            madrid.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae)
                {
                    madridScore++;
                    String txt = "Результат: " + milanScore + " x " + madridScore;
                    result.setText(txt);
                    lastScorer.setText("Последний забивший: Madrid");
                    if(milanScore > madridScore) {
                        winner.setText("Итог: Milan");
                    }
                    else if (milanScore < madridScore) {
                        winner.setText("Итог: Madrid");
                    }
                    else {
                        winner.setText("Итог: Ничья");
                    }

                }
            });
            setVisible(true);
        }
        public static void main(String[] args) {
            new GUI();
        }
    }
