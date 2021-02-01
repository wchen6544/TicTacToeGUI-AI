
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.Serializable;

public class b extends IOException{
    JPanel panel;
    private int clicks = 0;
    private JLabel label = new JLabel("Choose your BackGround Color");
    private static JFrame frame = new JFrame();
    private static class DrawPanel extends JPanel {
        private String[] gameBoard = {"_", "_", "_",
                                      "_", "_", "_",
                                      "_", "_", "_",
                                    };
        private int counter = 0;
        private int someoneWon = 0;
        private String color = "";
        JButton button7 = new JButton("");
        JButton button8 = new JButton("");
        JButton button9 = new JButton("");
        JButton button10 = new JButton("");
        JButton button11 = new JButton("");
        JButton button12 = new JButton("");
        JButton button13 = new JButton("");
        JButton button14 = new JButton("");
        JButton button15 = new JButton("");
        private int paintcounter = 0;
        private String wonString = "";
        private int position;
        private boolean draw = false;
        private boolean var = false;
        public DrawPanel() {
            JLabel label = new JLabel(); 
            JPanel panel = new JPanel();
            label = new JLabel("Choose your BackGround Color");
            JButton button = new JButton("Green");
            button.setBounds(0, 40, 90, 30);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.getContentPane().setBackground(Color.decode("#27AE60"));
                    color = "Green";
                    counter = 0;
                    counter += 1;
                }
            });
            JButton button2 = new JButton("Blue");
            button2.setBounds(0, 80, 90, 30);
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.getContentPane().setBackground(Color.decode("#5DADE2"));
                    counter = 0;
                    color = "Blue";
                    counter += 2;
                }
            });
            JButton button3 = new JButton("Black");
            button3.setBounds(0, 120, 90, 30);
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.getContentPane().setBackground(Color.BLACK);
                    counter = 0;
                    color = "Black";
                    counter += 3;
                }
            });
            JButton button4 = new JButton("Red");
            button4.setBounds(0, 0, 90, 30);
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.getContentPane().setBackground(Color.decode("#CB4335"));
                    counter = 0;
                    counter += 4;
                    color = "Red";
                    draw = true;
                }
            });
            JButton button5 = new JButton("Start Game");
            button5.setBounds(690, 0, 90, 30);
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                if (counter == 3) {
                    frame.getContentPane().setBackground(Color.BLACK);
                }
                if (counter == 1) {
                    frame.getContentPane().setBackground(Color.decode("#27AE60"));
                }
                if (counter == 4) {
                    frame.getContentPane().setBackground(Color.decode("#CB4335"));
                }
                if (counter == 2) {
                    frame.getContentPane().setBackground(Color.decode("#5DADE2"));
                }
                draw = true;
                JButton button6 = new JButton("Generate Board");
                button6.setBounds(0, 0, 140, 30);
                button6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        draw = true;
                        Graphics g = frame.getGraphics();
                        paintComponent(g);
                        draw = false;
                        paintcounter = 19;
                        paintComponent(g);
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        String a = "00";
                            if (a.equals("00")) {
                                System.out.println(a);
                                frame.remove(button11);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0); 
                                try {
                                    String a2 = addition2.getDivisionAnswer();
                                } catch (IOException e1) {
                                    e1.printStackTrace();
                                }
                            }
                    }
                });
                button7.setBounds(300, 227, 142, 142);
                String p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button7.setBackground(Color.decode(p));
                button7.setBorderPainted(false);
                button7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button7);
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 3;
                        paintComponent(g);
                        paintcounter = 1;
                        paintComponent(g);
                        gameBoard[4] = "X";
                        position = 5;
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println(ifWon.checkIfWon());
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g); 
                            someoneWon = 1;  
                        }
                        q7 addition = new q7(position, 1); 
                        try {
                            String a = addition.getDivisionAnswer();
                            if (a.equals("00")) {
                                System.out.println(a);
                                frame.remove(button11);
                                paintcounter = 19;
                                paintComponent(g);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0); 
                                String a2 = addition2.getDivisionAnswer();

                            }
                            if (a.equals("01")) {
                                System.out.println(a);
                                frame.remove(button12);
                                paintcounter = 20;
                                paintComponent(g);
                                gameBoard[1] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(2, 0); 
                                String a2 = addition2.getDivisionAnswer();

                            }
                            if (a.equals("02")) {
                                frame.remove(button10);
                                paintcounter = 30;
                                paintComponent(g);
                                gameBoard[2] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(3, 0); 
                                String a2 = addition2.getDivisionAnswer();

                            }
                            if (a.equals("10")) {
                                frame.remove(button8);
                                paintcounter = 22;
                                paintComponent(g);
                                gameBoard[3] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(4, 0); 
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("11")) {
                                frame.remove(button7);
                                paintcounter = 23;
                                paintComponent(g);
                                gameBoard[4] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(5, 0); 
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("12")) {
                                frame.remove(button9);
                                paintcounter = 24;
                                paintComponent(g);
                                gameBoard[5] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(6, 0); 
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("20")) {
                                frame.remove(button14);
                                paintcounter = 25;
                                paintComponent(g);
                                gameBoard[6] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(7, 0); 
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("21")) {
                                frame.remove(button13);
                                paintcounter = 26;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(8, 0); 
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("22")) {
                                frame.remove(button15);
                                paintcounter = 27;
                                paintComponent(g);
                                gameBoard[8] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(9, 0); 
                                String a2 = addition2.getDivisionAnswer();
                            }
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        if (someoneWon == 0) {
                            ifWon = new test(gameBoard);
                            System.out.println(ifWon.checkIfWon());
                            if (ifWon.checkIfWon().contains("has Won")) {
                                System.out.println(ifWon.checkIfWon());
                                String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                                paintcounter = Integer.parseInt(paintcounter1);  
                                paintComponent(g);   
                            }
                        }
                    }
                });
                button8.setBounds(150, 227, 142, 142);
                p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button8.setBackground(Color.decode(p));
                button8.setBorderPainted(false);
                button8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button8);
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 2;
                        paintComponent(g);
                        paintcounter = 4;
                        paintComponent(g);
                        position = 4;
                        gameBoard[3] = "X";
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println(ifWon.checkIfWon());
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);   
                            someoneWon = 1;
                        }
                        q7 addition = new q7(position, 1); 
                        try {
                            String a = addition.getDivisionAnswer();

                            if (a.equals("00")) {
                                frame.remove(button11);
                                paintcounter = 19;
                                paintComponent(g);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0);
                                String a2 = addition2.getDivisionAnswer();
                                System.out.println(a2);
                            }
                            if (a.equals("01")) {
                                frame.remove(button12);
                                paintcounter = 20;
                                paintComponent(g);
                                gameBoard[1] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(2, 0);
                                String a2 = addition2.getDivisionAnswer();
                                System.out.println(a2);
                            }
                            if (a.equals("02")) {
                                frame.remove(button10);
                                paintcounter = 30;
                                paintComponent(g);
                                gameBoard[2] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(3, 0);
                                String a2 = addition2.getDivisionAnswer();
                                System.out.println(a2);
                            }
                            if (a.equals("10")) {
                                frame.remove(button8);
                                paintcounter = 22;
                                paintComponent(g);
                                gameBoard[3] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(4, 0);
                                String a2 = addition2.getDivisionAnswer();
                                System.out.println(a2);
                            }
                            if (a.equals("11")) {
                                frame.remove(button7);
                                paintcounter = 23;
                                paintComponent(g);
                                gameBoard[4] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(5, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("12")) {
                                frame.remove(button9);
                                paintcounter = 24;
                                paintComponent(g);
                                gameBoard[5] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(6, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("20")) {
                                frame.remove(button14);
                                paintcounter = 25;
                                paintComponent(g);
                                gameBoard[6] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(7, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("21")) {
                                frame.remove(button13);
                                paintcounter = 26;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(8, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("22")) {
                                frame.remove(button15);
                                paintcounter = 27;
                                paintComponent(g);
                                gameBoard[8] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(9, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        if (someoneWon == 0) {
                            ifWon = new test(gameBoard);
                            System.out.println(ifWon.checkIfWon());
                            if (ifWon.checkIfWon().contains("has Won")) {
                                System.out.println(ifWon.checkIfWon());
                                String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                                paintcounter = Integer.parseInt(paintcounter1);  
                                paintComponent(g);   
                            }
                        }

                    }
                });
                button9.setBounds(450, 227, 142, 142);
                p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button9.setBackground(Color.decode(p));
                button9.setBorderPainted(false);
                button9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button9);
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 5;
                        paintComponent(g);
                        paintcounter = 6;
                        paintComponent(g);
                        position = 6;
                        gameBoard[5] = "X";
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println(ifWon.checkIfWon());
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);  
                            someoneWon = 1; 
                        }
                        q7 addition = new q7(position, 1); 
                        try {
                            String a = addition.getDivisionAnswer();
                            if (a.equals("00")) {
                                System.out.println(a);
                                frame.remove(button11);
                                paintcounter = 19;
                                paintComponent(g);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("01")) {
                                frame.remove(button12);
                                paintcounter = 20;
                                paintComponent(g);
                                gameBoard[1] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(2, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("02")) {
                                frame.remove(button10);
                                paintcounter = 30;
                                paintComponent(g);
                                gameBoard[2] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(3, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("10")) {
                                frame.remove(button8);
                                paintcounter = 22;
                                paintComponent(g);
                                gameBoard[3] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(4, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("11")) {
                                frame.remove(button7);
                                paintcounter = 23;
                                paintComponent(g);
                                gameBoard[4] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(5, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("12")) {
                                frame.remove(button9);
                                paintcounter = 24;
                                paintComponent(g);
                                gameBoard[5] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(6, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("20")) {
                                frame.remove(button14);
                                paintcounter = 25;
                                paintComponent(g);
                                gameBoard[6] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(7, 0);
                                String a2 = addition2.getDivisionAnswer();
                                
                            }
                            if (a.equals("21")) {
                                frame.remove(button13);
                                paintcounter = 26;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(8, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("22")) {
                                frame.remove(button15);
                                paintcounter = 27;
                                paintComponent(g);
                                gameBoard[8] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(9, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        if (someoneWon == 0) {
                            ifWon = new test(gameBoard);
                            System.out.println(ifWon.checkIfWon());
                            if (ifWon.checkIfWon().contains("has Won")) {
                                System.out.println(ifWon.checkIfWon());
                                String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                                paintcounter = Integer.parseInt(paintcounter1);  
                                paintComponent(g);   
                            }
                        }

                    }
                });
                button10.setBounds(450, 77, 142, 142);
                p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button10.setBackground(Color.decode(p));
                button10.setBorderPainted(false);
                button10.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button10);
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 7;
                        paintComponent(g);
                        paintcounter = 8;
                        paintComponent(g);
                        position = 3;
                        gameBoard[2] = "X";
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println(ifWon.checkIfWon());
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);  
                            someoneWon = 1; 
                        }
                        q7 addition = new q7(position, 1); 
                        try {
                            String a = addition.getDivisionAnswer();
                            if (a.equals("00")) {
                                frame.remove(button11);
                                paintcounter = 19;
                                paintComponent(g);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("01")) {
                                frame.remove(button12);
                                paintcounter = 20;
                                paintComponent(g);
                                gameBoard[1] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(2, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("02")) {
                                frame.remove(button10);
                                paintcounter = 30;
                                paintComponent(g);
                                gameBoard[2] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(3, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("10")) {
                                frame.remove(button8);
                                paintcounter = 22;
                                paintComponent(g);
                                gameBoard[3] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(4, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("11")) {
                                frame.remove(button7);
                                paintcounter = 23;
                                paintComponent(g);
                                gameBoard[4] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(5, 0);
                                String a2 = addition2.getDivisionAnswer();
                                System.out.println(a2);
                            }
                            if (a.equals("12")) {
                                frame.remove(button9);
                                paintcounter = 24;
                                paintComponent(g);
                                gameBoard[5] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(6, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("20")) {
                                frame.remove(button14);
                                paintcounter = 25;
                                paintComponent(g);
                                gameBoard[6] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(7, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("21")) {
                                frame.remove(button13);
                                paintcounter = 26;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(8, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("22")) {
                                frame.remove(button15);
                                paintcounter = 27;
                                paintComponent(g);
                                gameBoard[8] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(9, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        if (someoneWon == 0) {
                            ifWon = new test(gameBoard);
                            System.out.println(ifWon.checkIfWon());
                            if (ifWon.checkIfWon().contains("has Won")) {
                                System.out.println(ifWon.checkIfWon());
                                String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                                paintcounter = Integer.parseInt(paintcounter1);  
                                paintComponent(g);   
                            }
                        }

                    }
                });
                button11.setBounds(150, 77, 142, 142);
                p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button11.setBackground(Color.decode(p));
                button11.setBorderPainted(false);
                button11.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button11);
                        gameBoard[0] = "X";
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 9;
                        paintComponent(g);
                        paintcounter = 10;
                        paintComponent(g);
                        position = 1;
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println(ifWon.checkIfWon());
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);   
                            someoneWon = 1;
                        }
                        q7 addition = new q7(position, 1); 
                        try {
                            String a = addition.getDivisionAnswer();
                            if (a.equals("00")) {
                                frame.remove(button11);
                                paintcounter = 19;
                                paintComponent(g);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("01")) {
                                frame.remove(button12);
                                paintcounter = 20;
                                paintComponent(g);
                                gameBoard[1] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(2, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("02")) {
                                frame.remove(button10);
                                paintcounter = 30;
                                paintComponent(g);
                                gameBoard[2] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(3, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("10")) {
                                frame.remove(button8);
                                paintcounter = 22;
                                paintComponent(g);
                                gameBoard[3] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(4, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("11")) {
                                frame.remove(button7);
                                paintcounter = 23;
                                paintComponent(g);
                                gameBoard[4] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(5, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("12")) {
                                frame.remove(button9);
                                paintcounter = 24;
                                paintComponent(g);
                                gameBoard[5] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(6, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("20")) {
                                frame.remove(button14);
                                paintcounter = 25;
                                paintComponent(g);
                                gameBoard[6] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(7, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("21")) {
                                frame.remove(button13);
                                paintcounter = 26;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(8, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("22")) {
                                frame.remove(button15);
                                paintcounter = 27;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(9, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }

                        if (someoneWon == 0) {
                            ifWon = new test(gameBoard);
                            System.out.println(ifWon.checkIfWon());
                            if (ifWon.checkIfWon().contains("has Won")) {
                                System.out.println(ifWon.checkIfWon());
                                String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                                paintcounter = Integer.parseInt(paintcounter1);  
                                paintComponent(g);   
                            }
                        }
                    }
                });
                button12.setBounds(300, 77, 142, 142);
                p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button12.setBackground(Color.decode(p));
                button12.setBorderPainted(false);
                button12.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button12);
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 11;
                        paintComponent(g);
                        paintcounter = 12;
                        paintComponent(g);
                        position = 2;
                        gameBoard[1] = "X";
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println(ifWon.checkIfWon());
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);   
                            someoneWon = 1;
                        }
                        q7 addition = new q7(position, 1); 
                        try {
                            String a = addition.getDivisionAnswer();
                            if (a.equals("00")) {
                                frame.remove(button11);
                                paintcounter = 19;
                                paintComponent(g);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("01")) {
                                frame.remove(button12);
                                paintcounter = 20;
                                paintComponent(g);
                                gameBoard[1] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(2, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("02")) {
                                frame.remove(button10);
                                paintcounter = 30;
                                paintComponent(g);
                                gameBoard[2] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(3, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("10")) {
                                frame.remove(button8);
                                paintcounter = 22;
                                paintComponent(g);
                                gameBoard[3] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(4, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("11")) {
                                frame.remove(button7);
                                paintcounter = 23;
                                paintComponent(g);
                                gameBoard[4] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(5, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("12")) {
                                frame.remove(button9);
                                paintcounter = 24;
                                paintComponent(g);
                                gameBoard[5] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(6, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("20")) {
                                frame.remove(button14);
                                paintcounter = 25;
                                paintComponent(g);
                                gameBoard[6] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(7, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("21")) {
                                frame.remove(button13);
                                paintcounter = 26;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(8, 0);
                                String a2 = addition2.getDivisionAnswer();
                                System.out.println(a2);
                            }
                            if (a.equals("22")) {
                                frame.remove(button15);
                                paintcounter = 27;
                                paintComponent(g);
                                gameBoard[8] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(9, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        if (someoneWon == 0) {
                            ifWon = new test(gameBoard);
                            System.out.println(ifWon.checkIfWon());
                            if (ifWon.checkIfWon().contains("has Won")) {
                                System.out.println(ifWon.checkIfWon());
                                String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                                paintcounter = Integer.parseInt(paintcounter1);  
                                paintComponent(g);   
                            }
                        }
                    }
                });
                button13.setBounds(300, 377, 142, 142);
                p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button13.setBackground(Color.decode(p));
                button13.setBorderPainted(false);
                button13.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button13);
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 13;
                        paintComponent(g);
                        paintcounter = 14;
                        paintComponent(g);
                        gameBoard[7] = "X";
                        position = 8;
                        test ifWon = new test(gameBoard);
                        
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println("11111111111111111111111111111111111");
                            System.out.println(ifWon.checkIfWon());
                            System.out.println("1111111111111111111111111111111111111");
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);
                            someoneWon = 1;   
                        }
                        try {
                            q7 addition1 = new q7(position, 1); 
                            String a = addition1.getDivisionAnswer();
                            System.out.println("cccccc");
                            System.out.println(a);
                            for (String game : gameBoard) {
                                System.out.println(game);
                            }
                            System.out.println("ccccccc");
                            if (a.equals("00")) {
                                frame.remove(button11);
                                paintcounter = 19;
                                paintComponent(g);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("01")) {
                                frame.remove(button12);
                                paintcounter = 20;
                                paintComponent(g);
                                gameBoard[1] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(2, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("02")) {
                                frame.remove(button13);
                                paintcounter = 21;
                                paintComponent(g);
                                gameBoard[2] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(3, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("10")) {
                                frame.remove(button8);
                                paintcounter = 22;
                                paintComponent(g);
                                gameBoard[3] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(4, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("11")) {
                                frame.remove(button7);
                                paintcounter = 23;
                                paintComponent(g);
                                gameBoard[4] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(5, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("12")) {
                                frame.remove(button9);
                                paintcounter = 24;
                                paintComponent(g);
                                gameBoard[5] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(6, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("20")) {
                                frame.remove(button14);
                                paintcounter = 25;
                                paintComponent(g);
                                gameBoard[6] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(7, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("21")) {
                                frame.remove(button13);
                                paintcounter = 26;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(8, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("22")) {
                                frame.remove(button15);
                                paintcounter = 27;
                                paintComponent(g);
                                gameBoard[8] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(9, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println("1111111111111111111111111111111111111");
                            System.out.println(ifWon.checkIfWon());
                            for (String game : gameBoard) {
                                System.out.println(game);
                            }
                            System.out.println("1111111111111111111111111111111111111");
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);   
                        }

                    }
                });
                button14.setBounds(150, 377, 142, 142);
                p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button14.setBackground(Color.decode(p));
                button14.setBorderPainted(false);
                button14.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button14);
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 15;
                        paintComponent(g);
                        paintcounter = 16;
                        paintComponent(g);
                        position = 7;
                        gameBoard[6] = "X";
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println(ifWon.checkIfWon());
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);   
                        }
                        q7 addition = new q7(position, 1); 
                        try {
                            String a = addition.getDivisionAnswer();
                            System.out.println("cccccccccccccc");
                            System.out.println(a);
                            System.out.println("ccccccccccc");
                            if (a.equals("00")) {
                                frame.remove(button11);
                                paintcounter = 19;
                                paintComponent(g);
                                gameBoard[0] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(1, 0);
                                String a2 = addition2.getDivisionAnswer();
                                
                            }
                            if (a.equals("01")) {
                                frame.remove(button12);
                                paintcounter = 20;
                                paintComponent(g);
                                gameBoard[1] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(2, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("02")) {
                                frame.remove(button10);
                                paintcounter = 30;
                                paintComponent(g);
                                gameBoard[2] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(3, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("10")) {
                                frame.remove(button8);
                                paintcounter = 22;
                                paintComponent(g);
                                gameBoard[3] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(4, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("11")) {
                                frame.remove(button7);
                                paintcounter = 23;
                                paintComponent(g);
                                gameBoard[4] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(5, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("12")) {
                                frame.remove(button9);
                                paintcounter = 24;
                                paintComponent(g);
                                gameBoard[5] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(6, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("20")) {
                                frame.remove(button14);
                                paintcounter = 25;
                                paintComponent(g);
                                gameBoard[6] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(7, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("21")) {
                                frame.remove(button13);
                                paintcounter = 26;
                                paintComponent(g);
                                gameBoard[7] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(8, 0);
                                String a2 = addition2.getDivisionAnswer();
                            }
                            if (a.equals("22")) {
                                frame.remove(button15);
                                paintcounter = 27;
                                paintComponent(g);
                                gameBoard[8] = "O";
                                for (String game : gameBoard) {
                                    System.out.println(game);
                                }
                                q7 addition2 = new q7(9, 0);
                                System.out.println("00000000000000000000");
                                String a2 = addition2.getDivisionAnswer();
                            }
                            
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        if (someoneWon == 0) {
                            ifWon = new test(gameBoard);
                            System.out.println(ifWon.checkIfWon());
                            if (ifWon.checkIfWon().contains("has Won")) {
                                System.out.println(ifWon.checkIfWon());
                                String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                                paintcounter = Integer.parseInt(paintcounter1);  
                                paintComponent(g);   
                            }
                        }
                    }
                });
                button15.setBounds(450, 377, 142, 142);
                p = color.equals("Green") ?  "#27AE60": 
                color.equals("Black") ? "#000000" : 
                color.equals("Blue") ? "#5DADE2" :
                color.equals("Red") ? "#CB4335": "#eeeeee";
                button15.setBackground(Color.decode(p));
                button15.setBorderPainted(false);
                button15.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(button15);
                        draw = false;
                        Graphics g = frame.getGraphics();
                        paintcounter = 17;
                        paintComponent(g);
                        paintcounter = 18;
                        paintComponent(g);
                        gameBoard[8] = "X";
                        position = 9;
                        test ifWon = new test(gameBoard);
                        System.out.println(ifWon.checkIfWon());
                        if (ifWon.checkIfWon().contains("has Won")) {
                            System.out.println(ifWon.checkIfWon());
                            String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                            paintcounter = Integer.parseInt(paintcounter1);  
                            paintComponent(g);   
                            someoneWon = 1;
                        }
                        q7 addition = new q7(position, 1); 
                            try {
                                String a = addition.getDivisionAnswer();
                                if (a.equals("00")) {
                                    System.out.println(a);
                                    frame.remove(button11);
                                    paintcounter = 19;
                                    paintComponent(g);
                                    gameBoard[0] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(1, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                if (a.equals("01")) {
                                    System.out.println(a);
                                    frame.remove(button12);
                                    paintcounter = 20;
                                    paintComponent(g);
                                    gameBoard[1] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(2, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                if (a.equals("02")) {
                                    System.out.println(a);
                                    frame.remove(button10);
                                    paintcounter = 30;
                                    paintComponent(g);
                                    gameBoard[2] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(3, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                if (a.equals("10")) {
                                    System.out.println(a);
                                    frame.remove(button8);
                                    paintcounter = 22;
                                    paintComponent(g);
                                    gameBoard[3] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(4, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                if (a.equals("11")) {
                                    System.out.println(a);
                                    frame.remove(button7);
                                    paintcounter = 23;
                                    paintComponent(g);
                                    gameBoard[4] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(5, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                if (a.equals("12")) {
                                    System.out.println(a);
                                    frame.remove(button9);
                                    paintcounter = 24;
                                    paintComponent(g);
                                    gameBoard[5] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(6, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                if (a.equals("20")) {
                                    System.out.println(a);
                                    frame.remove(button14);
                                    paintcounter = 25;
                                    paintComponent(g);
                                    gameBoard[6] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(7, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                if (a.equals("21")) {
                                    System.out.println(a);
                                    frame.remove(button13);
                                    paintcounter = 26;
                                    paintComponent(g);
                                    gameBoard[7] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(8, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                if (a.equals("22")) {
                                    System.out.println(a);
                                    frame.remove(button15);
                                    paintcounter = 27;
                                    paintComponent(g);
                                    gameBoard[8] = "O";
                                    for (String game : gameBoard) {
                                        System.out.println(game);
                                    }
                                    q7 addition2 = new q7(9, 0);
                                    String a2 = addition2.getDivisionAnswer();
                                    System.out.println(a2);
                                }
                                
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                            if (someoneWon == 0) {
                                ifWon = new test(gameBoard);
                                System.out.println(ifWon.checkIfWon());
                                if (ifWon.checkIfWon().contains("has Won")) {
                                    System.out.println(ifWon.checkIfWon());
                                    String paintcounter1 = (ifWon.checkIfWon().split(" ", 4)[3]);
                                    paintcounter = Integer.parseInt(paintcounter1);  
                                    paintComponent(g);   
                                }
                            }


                    }
                });
                frame.add(button6);
                frame.add(button7);
                frame.add(button8);
                frame.add(button9);
                frame.add(button10);
                frame.add(button11);
                frame.add(button12);
                frame.add(button13);
                frame.add(button14);
                frame.add(button15);
                }
            });
            frame.add(button);
            frame.add(button2);
            frame.add(button3);
            frame.add(button4);
            frame.add(button5);
            panel.add(label);
            // the panel with the button and text
            panel.setOpaque(false);
            panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
            panel.setLayout(new GridLayout(0, 1));
            // set up the frame and display it
            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("GUI");
            frame.pack();
            frame.setVisible(true);
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (draw) {
                g.setColor(Color.GREEN);
                for (int i = 0; i < 8; i++) {
                    g.drawLine(300 + i, 100, 300 + i, 550);
                    g.drawLine(450 + i, 100, 450 + i, 550);
                    g.drawLine(150,400 + i,600,400 + i);
                    g.drawLine(150, 250 + i, 600, 250 + i);
                }
            }
            else {
                if (paintcounter == 1) { //button7 num#5
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(308 + i, 258, 442 + i, 400);
                        g.drawLine(442 + i, 258, 308 + i, 400);
                    }
                }
                if (paintcounter == 2) { //button8 num#4
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    g.setColor(Color.decode(p));
                    g.drawRect(158, 258, 142, 142);
                    g.fillRect(158, 258, 142, 142);
                    System.out.println("8");

                }
                if (paintcounter == 3) { //button7
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    g.setColor(Color.decode(p));
                    g.drawRect(308, 258, 142, 142);
                    g.fillRect(308, 258, 142, 142);
                }
                if (paintcounter == 4) { //button8
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(158 + i, 258, 292 + i, 400);
                        g.drawLine(292 + i, 258, 158 + i, 400);
                    }
                }
                if (paintcounter == 5) { //button9
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    g.setColor(Color.decode(p));
                    g.drawRect(458, 258, 142, 142);
                    g.fillRect(458, 258, 142, 142);
                    System.out.println("9");

                }
                if (paintcounter == 6) { //button9 num#6
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(458 + i, 258, 592 + i, 400);
                        g.drawLine(592 + i, 258, 458 + i, 400);
                    }
                }
                if (paintcounter == 7) { //button10 num#3
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    g.setColor(Color.decode(p));
                    g.drawRect(458, 108, 142, 142);
                    g.fillRect(458, 108, 142, 142);
                    System.out.println("10");

                }
                if (paintcounter == 8) { //button10
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(592 + i, 108, 458 + i, 250);
                        g.drawLine(592 + i, 250, 458 + i, 108);
                    }
                }
                if (paintcounter == 9) { //button11 num#1
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    System.out.println(color);
                    g.setColor(Color.decode(p));
                    g.drawRect(158, 108, 142, 142);
                    g.fillRect(158, 108, 142, 142);
                    System.out.println("11");

                }
                if (paintcounter == 10) { //button11
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(158 + i, 108, 292 + i, 250);
                        g.drawLine(292 + i, 108, 158 + i, 250);
                    }
                }
                if (paintcounter == 11) {  //button12 num#2
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    g.setColor(Color.decode(p));
                    g.drawRect(308, 108, 142, 142);
                    g.fillRect(308, 108, 142, 142);
                }
                if (paintcounter == 12) { //button12
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(308 + i, 108, 442 + i, 250);
                        g.drawLine(442 + i, 108, 308 + i, 250);
                    }
                }
                if (paintcounter == 13) { //button13 num#8
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    g.setColor(Color.decode(p));
                    g.drawRect(308, 408, 142, 142);
                    g.fillRect(308, 408, 142, 142);

                }
                if (paintcounter == 14) { //button13
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(308 + i, 408, 442 + i, 550);
                        g.drawLine(442 + i, 408, 308 + i, 550);

                    }
                }
                if (paintcounter == 15) { //button14 num#7
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    g.setColor(Color.decode(p));
                    g.drawRect(158, 408, 142, 142);
                    g.fillRect(158, 408, 142, 142);
                    System.out.println("14");
                }
                if (paintcounter == 16) { //button14
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(158 + i, 408, 294 + i, 550);
                        g.drawLine(292 + i, 408, 158 + i, 550);

                    }
                }
                if (paintcounter == 17) { //button15  num#7
                    String p = color.equals("Green") ?  "#27AE60": 
                    color.equals("Black") ? "#000000" : 
                    color.equals("Blue") ? "#5DADE2" :
                    color.equals("Red") ? "#CB4335": "#eeeeee";
                    g.setColor(Color.decode(p));
                    g.drawRect(458, 408, 142, 142);
                    g.fillRect(458, 408, 142, 142);
                    System.out.println("711111");

                }
                if (paintcounter == 18) { //button15
                    String p = color.equals("Green") ?  "#712ECC": 
                    color.equals("Black") ? "#FFFFFF" : 
                    color.equals("Blue") ? "#27AE60" :
                    color.equals("Red") ? "#9FE2BF": "#000000";
                    g.setColor(Color.decode(p));

                    for (int i = 0; i < 8; i++) {
                        g.drawLine(458 + i, 408, 592 + i, 550);
                        g.drawLine(592 + i, 408, 458 + i, 550);

                    }
                }
                if (paintcounter == 19) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawOval(150 ,100 ,140 - i,140 - i);

                    }

                }
                if (paintcounter == 20) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawOval(307,100,140 - i,140 - i);
                    }


                }
                if (paintcounter == 30) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawOval(458,100,140 - i,140 - i);
                    }

                }
                if (paintcounter == 22) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                       g.drawOval(158,258,140 - i,140 - i);
                    }
                }
                if (paintcounter == 23) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawOval(308,258,140 - i,140 - i);
                    }
                }
                if (paintcounter == 24) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawOval(458,258,140 - i,140 - i);
                    }
                }
                if (paintcounter == 25) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawOval(160,408,140 - i,140 - i);
                    }
                }
                if (paintcounter == 26) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawOval(308,408,140 - i,140 - i);
                    }
                }
                if (paintcounter == 27) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawOval(458,408,140 - i,140 - i);
                    }
                }
                if (paintcounter == 100) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        //g.drawLine(153, 320 + i, 592, 320 + i);  // second row straight hor
                        //g.drawLine(153, 470 + i, 592, 470 + i);  third row straight hor
                        g.drawLine(153, 170 + i, 592, 170 + i);
                    }

                }
                if (paintcounter == 200) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(153, 320 + i, 592, 320 + i);  // second row straight hor

                    }

                }
                if (paintcounter == 300) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(153, 470 + i, 592, 470 + i);

                    }

                }
                if (paintcounter == 400) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(220 + i, 100, 220 + i, 552);
                    }
                }
                if (paintcounter == 500) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(373 + i, 100, 373 + i, 552);
                    }
                }
                if (paintcounter == 600) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(530 + i, 100, 530 + i, 552);
                    }
                }
                if (paintcounter == 700) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(153 + i, 100, 590 + i, 552);
                    }
                }
                if (paintcounter == 800) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < 8; i++) {
                        g.drawLine(599 + i, 100, 153 + i, 552);
                    }
                }
            }
        }  
    }
    // create one Frame
    public static void main(String[] args) throws IOException{
        new DrawPanel();
    }

}
