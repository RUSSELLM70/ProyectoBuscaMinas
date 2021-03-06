/*Determinar:xxxxxxx
 FECHA:xxxxxxxxx
 AUTOR:Matthew Russell
 MODIFICADO POR:Matthew Russell
 */
package Formulario;


import java.util.Random;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


//para bandera recciones de clic del mouse
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.event.AncestorListener;



/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public static Celdas celda[][];

    public static int filas;
    public static int columnas;
    public static boolean gano;
    public static int minas;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
          cargar();

      
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelTablero = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        bontonPlay = new javax.swing.JButton();
        jLabel2Niveles = new javax.swing.JLabel();
        Minas = new javax.swing.JLabel();
        FONDO1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("DIFICIL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 640, -1, -1));

        jButton2.setText("FACIL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 640, 70, -1));

        jPanelTablero.setLayout(new java.awt.GridLayout(5, 5));
        jPanel1.add(jPanelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 760, 590));

        jSpinner1.setFont(new java.awt.Font("Sitka Banner", 3, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(5, 5, 8, 3));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 590, 50, 50));

        jSpinner2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(5, 5, 8, 3));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 590, 50, 50));

        jSpinner3.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(5, 5, 8, 3));
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 590, 50, 40));

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("INSTRUCCIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 210, 180, 70));

        bontonPlay.setBackground(new java.awt.Color(102, 255, 102));
        bontonPlay.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        bontonPlay.setForeground(new java.awt.Color(255, 255, 0));
        bontonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banana.gif"))); // NOI18N
        bontonPlay.setText("PLAY");
        bontonPlay.setMaximumSize(new java.awt.Dimension(421, 369));
        bontonPlay.setPreferredSize(new java.awt.Dimension(25, 69));
        bontonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonPlayActionPerformed(evt);
            }
        });
        jPanel1.add(bontonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 200, 250, 390));

        jLabel2Niveles.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jLabel2Niveles.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2Niveles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sise.png"))); // NOI18N
        jLabel2Niveles.setText("  ");
        jPanel1.add(jLabel2Niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, 270));

        Minas.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        Minas.setForeground(new java.awt.Color(204, 0, 0));
        Minas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minn.gif"))); // NOI18N
        jPanel1.add(Minas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 590, 190, 100));

        FONDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        FONDO1.setText("jLabel1");
        jPanel1.add(FONDO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1760, 730));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
//    
    private void bontonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonPlayActionPerformed
   JOptionPane.showMessageDialog(null," El juego consiste en despejar todas las casillas de una pantalla que no oculten una mina.\n" +

"Algunas casillas tienen un número, el cual indica la cantidad de minas que hay en las casillas circundantes.\n" +

"Si se descubre una casilla con una mina se pierde la partida.\n" +

"Se puede poner una marca en las casillas que el jugador piensa que hay minas para ayudar a descubrir las que están cerca.\n" +

"El juego también posee un sistema de récords para cada uno de los 4 niveles en el que se indica el menor tiempo en terminar el juego. Los niveles son (para las nuevas versiones):\n" +

"Nivel principiante: 8 × 8 casillas y 8 minas.\n" +
"Nivel intermedio: 5 × 5 casillas y 5 minas. ");//PONER INSTRUCCIONES**
  
//        cargar();
       

    }//GEN-LAST:event_bontonPlayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 // 8x8 nivel dificiL
  
        JOptionPane.showMessageDialog(null,"USTED SELECCIONO NIVEL DIFICIL");



        
        jPanelTablero.setLayout(new java.awt.GridLayout((int) jSpinner1.getValue(), (int) jSpinner2.getValue()));//HACE PARA  QUE CARGE EL JUEGO EN 5X5 Y 8X8 CAMBIANDO LOS SPINNERS ASI SE GENERA

        for (int i = 0; i < filas; i++) {////actualiza el nivel 8x8 ajusta el tablero y el panel
            for (int j = 0; j < columnas; j++) {
                jPanelTablero.remove(celda[i][j]);
              
 
      
            }
        }
     

 AudioClip sonido;//para agregar sonidos a las bombas
sonido= java.applet.Applet.newAudioClip(getClass().getResource("/Formulario/OlÃ© OlÃ©...La Sele es mi pasion!!! (Letra de cancion) Los Ajenos Costa Rica.wav"));//para la camcion de la sele en el boton play
      sonido.play();
        jPanelTablero.updateUI();
        cargar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
//5x5 nivel facil

         JOptionPane.showMessageDialog(null,"USTED SELECCIONO NIVEL FACIL");

               gano = false;
   
     

         
   jPanelTablero.setLayout(new java.awt.GridLayout((int) jSpinner1.getValue(),(int) jSpinner2.getValue()));//HACE PARA  QUE CARGE EL JUEGO EN 5X5 Y 8X8 CAMBIANDO LOS SPINNERS ASI SE GENERA

   for (int i = 0; i < filas; i++) {////actualiza el nivel 8x8 ajusta el tablero y el panel
            for (int j = 0; j < columnas; j++) {
                jPanelTablero.remove(celda[i][j]);

            }
        }

        jPanelTablero.updateUI();
        cargar();
         


    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
   
                
            }
        });
    }

  public void cargar() {
            gano = false;
   
        filas = (int) jSpinner1.getValue();
        columnas = (int) jSpinner2.getValue();
        minas = (int) jSpinner3.getValue();
 this.celda = new Celdas[filas][columnas];
  int nMinas[][]= numerosAzar(minas+1);//agrega las minas aleatoriamente en filas
     

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.celda[i][j] = new Celdas(i, j);//el 0=mina, 1=numero y 2 = espacio vacio
                this.celda[i][j].setTipocel(numeroAleatorio());
                jPanelTablero.add(this.celda[i][j]);
            }
        }
      for (int i = 0; i < minas; i++) {
            this.celda[nMinas[0][i]] [nMinas[1][i]].setTipocel(0);


        }

  
      

        
       
      
      
//            gano = false;
//   
//        filas = (int) jSpinner2.getValue();
//        columnas = (int) jSpinner2.getValue();
//        minas = (int) jSpinner3.getValue();
// this.celda = new Celdas[filas][columnas];
//  int nMinas[][]= numerosAzar(minas+1);//agrega las minas aleatoriamente en filas
//     
//
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas; j++) {
//                this.celda[i][j] = new Celdas(i, j);//el 0=mina, 1=numero y 2 = espacio vacio
//                this.celda[i][j].setTipocel(numeroAleatorio());
//                jPanelTablero.add(this.celda[i][j]);
//            }
//        }
//      for (int i = 0; i < minas; i++) {
//            this.celda[nMinas[0][i]] [nMinas[1][i]].setTipocel(0);
//
//
//        }
//
//
//      
//
//        
//
//      
//      
      
      
      
      
      
      
 
        
        
//        filas=(int) jSpinner1.getValue(); /*(int) jSpinner1.getValue();*/
//        columnas=(int) jSpinner2.getValue();
//                /*(int) jSpinner2.getValue();*/
//        minas=(int) jSpinner3.getValue();
//                /*(int) jSpinner3.getValue();*/
        
     
        
      
        
  }
      
      
//          JOptionPane.showMessageDialog(null, "Filas = " + filas + " y columnas = " + columnas + "  minas = " + minas);
      
      
      
      
      
      
      
    

    public int numeroAleatorio() {//crea un numero aleatorio el tipo de celda 1 o 2
        Random rd = new Random();
        int numero = (int) (rd.nextDouble() * 2);

        return numero + 1;

    }

   public int[][] numerosAzar(int cantidad) {
        Random rd = new Random();//crea los numeros al azr
        int b[][] = new int[2][cantidad];//guarda los # aleatorios
        int cont = 0;//variable que asigna las posiciones de los numeros generados
        boolean v;//variable que verifica si que # ya esta generado
        //variable para que se genere el 0 (MINA)
        //ESTE WHILE AYUDA PARA QUE LOS # GENERADOS NO SE REPITAN

        while (cont < cantidad) {

            int numero1 = (int) (rd.nextDouble() * filas);
            int numero2 = (int) (rd.nextDouble() * columnas);
            v = false;//indica si el # ya esta ingresado o no
            for (int i = 0; i < cont; i++) {
                if (numero1 == b[0][i]&&numero2==b[1][i])//hace la verificacion para ver si el # esta o no
                {
                    v = true;
                }

            }

            if (!v) {
                b[0][cont]=numero1;
               
                b[1][cont]=numero2;
                        cont++;
            }
           

        }
        return b;
    }

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO1;
    private javax.swing.JLabel Minas;
    private javax.swing.JButton bontonPlay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2Niveles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTablero;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    // End of variables declaration//GEN-END:variables
}
