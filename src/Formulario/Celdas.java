/*Determinar:xxxxxxx
 FECHA:xxxxxxxxx
 AUTOR:Matthew Russell
 MODIFICADO POR:Matthew Russell
 */
package Formulario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.applet.AudioClip;//para el audio de las minas
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//**********BANDERA*********
import javax.swing.*;

import java.awt.event.*;

/**
 *
 * @author User
 */
public class Celdas extends JButton {

    private int x;
    private int y;
    private int tipocel;
    private boolean visible;

    private Color color[];//aca vienen todos los colores 

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {

    }
    //**************BANDERA

//public  void RatonListener(){
//
//JButton myButton = new JButton("Button");
//
//
//
//myButton.addMouseListener(new MouseListener(){
//
//public void mouseClicked(MouseEvent me) {
//
//me.getX();
//
//me.getY();
//
//}
//
//public void mousePressed(MouseEvent me) {
//
//
//
//
//
//}
//
//public void mouseReleased(MouseEvent me) {}
//
//public void mouseEntered(MouseEvent me) {}
//
//public void mouseExited(MouseEvent me) {}
//
//    private void setBackground(Color color) {
//
//    }
//
//});
//
//
//
//myButton.addMouseMotionListener(new MouseMotionListener(){
//
//public void mouseDragged(MouseEvent mme) {}
//
//public void mouseMoved(MouseEvent mme) {}
//
//});
//
//}
    //aca debe de inicializarse la bandera
    public Celdas(int x, int y) {
        this.x = x;
        this.y = y;
        this.visible = false;//Colores  rojo 0, amarillo 1 , verde 2 ;
        this.color = new Color[]{Color.RED, Color.black, Color.GREEN, Color.black, Color.BLUE, Color.PINK, Color.cyan, Color.darkGray};
        this.setMinimumSize(new Dimension(33, 9));
        this.setBackground(new java.awt.Color(255, 0, 0));//su color de fondo sea azul
        this.setFont(new java.awt.Font("Tahoma", 1, 12));

        // **PARA BANDEARAS
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//              //CREAR METODO
                if ((e.getModifiers() & 4) != 0) {//el 4 es parabotn derecho

                }

            }
        });

        MouseListener mouseListener = new MouseListener() {
            private Color[] color;

            @Override
            public void mouseReleased(MouseEvent e) {
            
                
            }

            @Override
            public void mousePressed(MouseEvent e) {//aca se usa clic derecho
                    setBackground(Color.BLUE);
          
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              
            }

            @Override
            public void mouseClicked(MouseEvent e) {
   
                
//                
//                derclic();
//poner gif de bandera********
//                setIcon(null);
//                setBackground(Color.BLUE);
//                setIcon(null,/Imagenes/bamdera.gif);
//                   Icon bamdera = new ImageIcon(getClass().getResource("/Imagenes/bamdera.gif"));
//            
                System.out.println(e.getButton());

                // MouseEvent.BUTTON3 es el boton derecho
            }
        };
        this.addMouseListener(mouseListener);

        this.addActionListener(new java.awt.event.ActionListener() {//eventos al raton

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celdasActionPerfomed(evt);//el va arealizar del metodo de abajo
            }
        });
    }

    public void setTipocel(int tipocel) {
        this.tipocel = tipocel;
    }

    private void celdasActionPerfomed(java.awt.event.ActionEvent evt) {
//          System.out.println(tipocel);
        clic();
        int cont = 0;
        for (int i = 0; i < Principal.filas; i++) {//conteo de todas las celdas
            for (int j = 0; j < Principal.columnas; j++) {
                if (Principal.celda[i][j].getVisible()) {
                    cont++;//si es visible la va a contar
                }

            }

        }
        //evento del mouse 

        if (cont == (Principal.filas * Principal.columnas - Principal.minas)) {//para que suelte la ventana de gana YA CREADA

            Icon gameOver = new ImageIcon(getClass().getResource("/Imagenes/gano.gif"));
            JOptionPane.showMessageDialog(null, "GANO", " ", JOptionPane.INFORMATION_MESSAGE, gameOver);

        }

    }

//    public void derclic() {//metodo de clic derecho
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//    }
//        
    
    public void clic() {

        if (!visible && Principal.gano == false) {//genaera el cambio del tipo de celda si esta minado o campo libre
            this.visible = true;
            this.setBackground(new java.awt.Color(240, 240, 240));//cambia de color el fondo de las casillas
            switch (this.tipocel) {

                case 0://mina
                    for (int i = 0; i < Principal.filas; i++) {

                        for (int j = 0; j < Principal.columnas; j++) {
                            if (Principal.celda[i][j].getTipocel() == 0) {
                                //pegar  linea de codigo para sonido aqui

                                Principal.celda[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bo.gif")));//imagen 
                                AudioClip sonido;//para agregar sonidos a las bombas
                                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Formulario/M1 Garand Rifle-SoundBible.com-892903688.wav"));//para el sonido de las bombas
                                sonido.play();

                                Principal.celda[i][j].setBackground(new java.awt.Color(240, 240, 240));//el set background asigna un color ver tabla de colores en codigo

                            }

                        }

                    }

                    Principal.gano = true;//se utiliza la misma variable para gano y perdio

                    Icon gameOver = new ImageIcon(getClass().getResource("/Imagenes/gameOver.gif"));
                    JOptionPane.showMessageDialog(null, "", "PERDIO ", JOptionPane.INFORMATION_MESSAGE, gameOver);

                    break;
                case 1:
                    int cont = 0;//contador de cuantas minas hay cerca del numero seleccionado
                    this.setBackground(new java.awt.Color(240, 240, 240));
                    for (int i = -1; i < 1; i++) {
                        if (x + i >= 0 && x + i < Principal.filas) {
                            for (int j = -1; j <= 1; j++) {
//                                System.out.println(y + i + " " + y + i + " " + Principal.columnas);
                                if ((y + j >= 0 && (y + j) < Principal.columnas) && Principal.celda[x + i][y + j].getTipocel() == 0) {
                                    cont++;
                                }

                            }

                        }

                    }
                    this.setText("" + cont);
                    this.setForeground(this.color[cont]);
                    break;
                default://si entra aqui la celda esta vacia
                    for (int i = 0; i < 1; i++) {
                        if (x + 1 >= 0 && x + i < Principal.filas) {//verifica que no se salga en col y fil
                            for (int j = 0; j <= 1; j++) {
                                if ((y + j >= 0 && (y + 1) < Principal.columnas) && Principal.celda[x + i][y + j].getTipocel() != 0) {
                                    if (!Principal.celda[x + i][y + j].getVisible()) {//se pregunta si es visible o no siempre y cuando no sea la mina

                                    }
                                    Principal.celda[x + i][y + j].clic();//hace efecto de mostrar
                                }

                            }

                        }

                    }
            }

        }
//    

    }

    public int getTipocel() {
        return tipocel;
    }

}
