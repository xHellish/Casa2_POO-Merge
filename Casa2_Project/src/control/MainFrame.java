package control;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame {
    public JPanel panel;
    
    public MainFrame() {
        MainFrame frame = new MainFrame("Clase Control");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Clase Control");

        frame.Inicializacion();
    }

    private void MainFrame2() {
        MainFrame frame = new MainFrame("Clase Control");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Clase Control");

        frame.Inicializacion();
    }
    
    private MainFrame(String title) {
        super(title);
    }

    private void Inicializacion() {
        Panel(); // 
        Labels();
        Botones();
    }

    private void Panel() {
        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void Labels() {
        JLabel label = new JLabel("Bienvenido a Control");
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        label.setBounds(250, 20, 350, 30);
        panel.add(label);

        JLabel label1 = new JLabel("Click para ir a Acabar Ingredientes");
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        label1.setBounds(20, 100, 400, 30);
        panel.add(label1);

        
        JLabel label2 = new JLabel("Click para ir a Crecer Cesped");
        label2.setFont(new Font("Arial", Font.PLAIN, 20)); 
        label2.setBounds(20,160,400,30);
        panel.add(label2);
        
        
        JLabel label3 = new JLabel("Click para ir a Ensuciar Habitacion");
        label3.setFont(new Font("Arial", Font.PLAIN, 20)); 
        label3.setBounds(20,220,500,30);
        panel.add(label3);
        
        JLabel label4 = new JLabel("Click para ir a Enviar Plagas Insectos");
        label4.setFont(new Font("Arial", Font.PLAIN, 20)); 
        label4.setBounds(20,280,500,30);
        panel.add(label4);
        
        JLabel label5 = new JLabel("Click para ir a Situacion Patio");
        label5.setFont(new Font("Arial", Font.PLAIN, 20)); 
        label5.setBounds(20,340,500,30);
        panel.add(label5);
        
        JLabel label6 = new JLabel("Click para ir a Suspender Agua Luz");
        label6.setFont(new Font("Arial", Font.PLAIN, 20)); 
        label6.setBounds(20,400,500,30);
        panel.add(label6);
        
        JLabel label7 = new JLabel("Click para ir a Taquear Tuberias");
        label7.setFont(new Font("Arial", Font.PLAIN, 20)); 
        label7.setBounds(20,460,500,30);
        panel.add(label7);
    }

    private void Botones() {
        JButton boton1 = new JButton();
        boton1.setText("click");
        boton1.setBounds(500, 100, 100, 30);
        boton1.setEnabled(true);
        panel.add(boton1);
        AcabarIngredientes AI = new AcabarIngredientes();
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva ventana
                MainFrame nuevaVentana = new MainFrame();
                nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nuevaVentana.setSize(800, 600);
                nuevaVentana.setLocationRelativeTo(null);
                nuevaVentana.setVisible(true);
                nuevaVentana.setTitle("Clase Control");

                // Crear un panel para la nueva ventana
                JPanel panel = new JPanel();
                nuevaVentana.add(panel);
                panel.setLayout(null);
       
                //label de informacion 
                
                JLabel label = new JLabel("Informacion de clase Acabar Ingredientes: ");
                label.setFont(new Font("Arial", Font.PLAIN, 25));
                label.setBounds(20, 10, 600, 30);
                panel.add(label);
                
                JLabel label2 = new JLabel("Metodo isAcabarIngredientes(): ");
                label2.setFont(new Font("Arial", Font.PLAIN, 25));
                label2.setBounds(20, 150, 450, 30);
                panel.add(label2);
                
                JLabel label3 = new JLabel(AI.isAcabarIngredientes());
                label3.setFont(new Font("Arial", Font.PLAIN, 30));
                label3.setBounds(20, 300, 450, 30);
                panel.add(label3);

                // Agregar un botón "Volver" en el panel
                JButton volver1 = new JButton();
                volver1.setText("regresar");
                volver1.setBounds(650, 450, 100, 30); 
                panel.add(volver1);

                volver1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevaVentana.dispose();
                    }
                });
                nuevaVentana.setVisible(true);
            }

			private Container getContentPane() {
				return null;
			}
        });

        JButton boton2 = new JButton();
        boton2.setText("click");
        boton2.setBounds(500, 160, 100, 30);
        boton2.setEnabled(true);
        panel.add(boton2);
        CrecerCesped cc = new CrecerCesped();
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva ventana
                MainFrame nuevaVentana = new MainFrame();
                nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nuevaVentana.setSize(800, 600);
                nuevaVentana.setLocationRelativeTo(null);
                nuevaVentana.setVisible(true);
                nuevaVentana.setTitle("Clase Control");

                // Crear un panel para la nueva ventana
                JPanel panel = new JPanel();
                nuevaVentana.add(panel);
                panel.setLayout(null);
       
                //label de informacion 
                
                JLabel label = new JLabel("Informacion de clase Crecer cesped: ");
                label.setFont(new Font("Arial", Font.PLAIN, 25));
                label.setBounds(20, 10, 450, 30);
                panel.add(label);
                
                JLabel label2 = new JLabel("Metodo isCreciendo(): ");
                label2.setFont(new Font("Arial", Font.PLAIN, 25));
                label2.setBounds(20, 150, 450, 30);
                panel.add(label2);
                
                JLabel label3 = new JLabel(cc.isCrecer());
                label3.setFont(new Font("Arial", Font.PLAIN, 30));
                label3.setBounds(20, 300, 450, 30);
                panel.add(label3);

                // Agregar un botón "Volver" en el panel
                JButton volver1 = new JButton();
                volver1.setText("regresar");
                volver1.setBounds(650, 450, 100, 30); 
                panel.add(volver1);

                volver1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevaVentana.dispose();
                    }
                });
                nuevaVentana.setVisible(true);
            }

			private Container getContentPane() {
				return null;
			}
        });

        JButton boton3 = new JButton();
        boton3.setText("click");
        boton3.setBounds(500, 220, 100, 30);
        boton3.setEnabled(true);
        panel.add(boton3);
        EnsuciarHabitacion EH = new EnsuciarHabitacion();
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva ventana
                MainFrame nuevaVentana = new MainFrame();
                nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nuevaVentana.setSize(800, 600);
                nuevaVentana.setLocationRelativeTo(null);
                nuevaVentana.setVisible(true);
                nuevaVentana.setTitle("Clase Control");

                // Crear un panel para la nueva ventana
                JPanel panel = new JPanel();
                nuevaVentana.add(panel);
                panel.setLayout(null);
       
                //label de informacion 
                
                JLabel label = new JLabel("Informacion de clase Ensuciar Habitacion: ");
                label.setFont(new Font("Arial", Font.PLAIN, 25));
                label.setBounds(20, 10, 600, 30);
                panel.add(label);
                
                JLabel label2 = new JLabel("Metodo isEnsuciarHabitacion(): ");
                label2.setFont(new Font("Arial", Font.PLAIN, 25));
                label2.setBounds(20, 150, 450, 30);
                panel.add(label2);
                
                JLabel label3 = new JLabel(EH.isEnsuciarHabitacion());
                label3.setFont(new Font("Arial", Font.PLAIN, 30));
                label3.setBounds(20, 300, 450, 30);
                panel.add(label3);

                // Agregar un botón "Volver" en el panel
                JButton volver1 = new JButton();
                volver1.setText("regresar");
                volver1.setBounds(650, 450, 100, 30); 
                panel.add(volver1);

                volver1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevaVentana.dispose();
                    }
                });
                nuevaVentana.setVisible(true);
            }

			private Container getContentPane() {
				return null;
			}
        });

        JButton boton4 = new JButton();
        boton4.setText("click");
        boton4.setBounds(500, 280, 100, 30);
        boton4.setEnabled(true);
        panel.add(boton4);
        EnviarPlagasInsectos EPI = new EnviarPlagasInsectos();
        boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva ventana
                MainFrame nuevaVentana = new MainFrame();
                nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nuevaVentana.setSize(800, 600);
                nuevaVentana.setLocationRelativeTo(null);
                nuevaVentana.setVisible(true);
                nuevaVentana.setTitle("Clase Control");

                // Crear un panel para la nueva ventana
                JPanel panel = new JPanel();
                nuevaVentana.add(panel);
                panel.setLayout(null);
       
                //label de informacion 
                
                JLabel label = new JLabel("Informacion de clase Enviar Plagas Insectos: ");
                label.setFont(new Font("Arial", Font.PLAIN, 25));
                label.setBounds(20, 10, 600, 30);
                panel.add(label);
                
                JLabel label2 = new JLabel("Metodo isEnviarPlagasInsectos(): ");
                label2.setFont(new Font("Arial", Font.PLAIN, 25));
                label2.setBounds(20, 150, 450, 30);
                panel.add(label2);
                
                JLabel label3 = new JLabel(EPI.isEnviarPlagasInsectos());
                label3.setFont(new Font("Arial", Font.PLAIN, 30));
                label3.setBounds(20, 300, 450, 30);
                panel.add(label3);

                // Agregar un botón "Volver" en el panel
                JButton volver1 = new JButton();
                volver1.setText("regresar");
                volver1.setBounds(650, 450, 100, 30); 
                panel.add(volver1);

                volver1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevaVentana.dispose();
                    }
                });
                nuevaVentana.setVisible(true);
            }

			private Container getContentPane() {
				return null;
			}
        });

        JButton boton5 = new JButton();
        boton5.setText("click");
        boton5.setBounds(500, 340, 100, 30);
        boton5.setEnabled(true);
        panel.add(boton5);
        SituacionPatio SP = new SituacionPatio();
        boton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva ventana
                MainFrame nuevaVentana = new MainFrame();
                nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nuevaVentana.setSize(800, 600);
                nuevaVentana.setLocationRelativeTo(null);
                nuevaVentana.setVisible(true);
                nuevaVentana.setTitle("Clase Control");

                // Crear un panel para la nueva ventana
                JPanel panel = new JPanel();
                nuevaVentana.add(panel);
                panel.setLayout(null);
       
                //label de informacion 
                
                JLabel label = new JLabel("Informacion de clase Situacion Patio: ");
                label.setFont(new Font("Arial", Font.PLAIN, 25));
                label.setBounds(20, 10, 600, 30);
                panel.add(label);
                
                JLabel label2 = new JLabel("Metodo isSueloSaturarse(): ");
                label2.setFont(new Font("Arial", Font.PLAIN, 25));
                label2.setBounds(20, 150, 450, 30);
                panel.add(label2);
                
                JLabel label3 = new JLabel(SP.isSueloSaturarse());
                label3.setFont(new Font("Arial", Font.PLAIN, 30));
                label3.setBounds(20, 200, 450, 30);
                panel.add(label3);
                
                JLabel label4 = new JLabel("Metodo isPasarAguaVentana(): ");
                label4.setFont(new Font("Arial", Font.PLAIN, 25));
                label4.setBounds(20, 350, 450, 30);
                panel.add(label4);
                
                JLabel label5 = new JLabel(SP.isPasarAguaVentana());
                label5.setFont(new Font("Arial", Font.PLAIN, 30));
                label5.setBounds(20, 400, 450, 30);
                panel.add(label5);

                // Agregar un botón "Volver" en el panel
                JButton volver1 = new JButton();
                volver1.setText("regresar");
                volver1.setBounds(650, 450, 100, 30); 
                panel.add(volver1);

                volver1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevaVentana.dispose();
                    }
                });
                nuevaVentana.setVisible(true);
            }

			private Container getContentPane() {
				return null;
			}
        });

        JButton boton6 = new JButton();
        boton6.setText("click");
        boton6.setBounds(500, 400, 100, 30);
        boton6.setEnabled(true);
        panel.add(boton6);
        SuspenderAguaLuz SAL = new SuspenderAguaLuz();
        boton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva ventana
                MainFrame nuevaVentana = new MainFrame();
                nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nuevaVentana.setSize(800, 600);
                nuevaVentana.setLocationRelativeTo(null);
                nuevaVentana.setVisible(true);
                nuevaVentana.setTitle("Clase Control");

                // Crear un panel para la nueva ventana
                JPanel panel = new JPanel();
                nuevaVentana.add(panel);
                panel.setLayout(null);
       
                //label de informacion 
                
                JLabel label = new JLabel("Informacion de clase Suspender Agua Luz: ");
                label.setFont(new Font("Arial", Font.PLAIN, 25));
                label.setBounds(20, 10, 600, 30);
                panel.add(label);
                
                JLabel label2 = new JLabel("Metodo isSuspenderAgua(): ");
                label2.setFont(new Font("Arial", Font.PLAIN, 25));
                label2.setBounds(20, 150, 450, 30);
                panel.add(label2);
                
                JLabel label3 = new JLabel(SAL.isSuspenderAgua());
                label3.setFont(new Font("Arial", Font.PLAIN, 30));
                label3.setBounds(20, 200, 450, 30);
                panel.add(label3);
                
                JLabel label4 = new JLabel("Metodo isSuspenderLuz(): ");
                label4.setFont(new Font("Arial", Font.PLAIN, 25));
                label4.setBounds(20, 350, 450, 30);
                panel.add(label4);
                
                JLabel label5 = new JLabel(SAL.isSuspenderLuz());
                label5.setFont(new Font("Arial", Font.PLAIN, 30));
                label5.setBounds(20, 400, 450, 30);
                panel.add(label5);

                // Agregar un botón "Volver" en el panel
                JButton volver1 = new JButton();
                volver1.setText("regresar");
                volver1.setBounds(650, 450, 100, 30); 
                panel.add(volver1);

                volver1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevaVentana.dispose();
                    }
                });
                nuevaVentana.setVisible(true);
            }

			private Container getContentPane() {
				return null;
			}
        });


        JButton boton7 = new JButton();
        boton7.setText("click");
        boton7.setBounds(500, 460, 100, 30);
        boton7.setEnabled(true);
        panel.add(boton7);
        TaquearTuberias TT = new TaquearTuberias();
        boton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva ventana
                MainFrame nuevaVentana = new MainFrame();
                nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nuevaVentana.setSize(800, 600);
                nuevaVentana.setLocationRelativeTo(null);
                nuevaVentana.setVisible(true);
                nuevaVentana.setTitle("Clase Control");

                // Crear un panel para la nueva ventana
                JPanel panel = new JPanel();
                nuevaVentana.add(panel);
                panel.setLayout(null);
       
                //label de informacion 
                
                JLabel label = new JLabel("Informacion de clase Taquear Tuberia: ");
                label.setFont(new Font("Arial", Font.PLAIN, 25));
                label.setBounds(20, 10, 600, 30);
                panel.add(label);
                
                JLabel label2 = new JLabel("Metodo isTaquearTuberia(): ");
                label2.setFont(new Font("Arial", Font.PLAIN, 25));
                label2.setBounds(20, 150, 450, 30);
                panel.add(label2);
                
                JLabel label3 = new JLabel(TT.isTaquearTuberia());
                label3.setFont(new Font("Arial", Font.PLAIN, 30));
                label3.setBounds(20, 200, 450, 30);
                panel.add(label3);

                // Agregar un botón "Volver" en el panel
                JButton volver1 = new JButton();
                volver1.setText("regresar");
                volver1.setBounds(650, 450, 100, 30); 
                panel.add(volver1);

                volver1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nuevaVentana.dispose();
                    }
                });
                nuevaVentana.setVisible(true);
            }

			private Container getContentPane() {
				return null;
			}
        });
        
    }
}
