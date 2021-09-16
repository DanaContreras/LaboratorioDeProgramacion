
package trabajopractico1;
import java.awt.Color;

/**
 *
 * @author Dana Contreras
 */
public class InterfazGrafica extends javax.swing.JFrame {

    private Controlador controlador;
    private int cantRestante = 3; // Variable para llevar la cuenta de cuantas cartas le faltan elegir al jugador.
    private int puntosJugador; // Mantiene el puntaje para realizar el control con cartelResultado.
    private int puntosMaquina;
    
    public InterfazGrafica() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY); //Fondo oscuro.
    }
    
    public void setControlador(Controlador c){
        // Se establece comunicación con el controlador.
        this.controlador = c;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cartelJuegoDe = new javax.swing.JLabel();
        botonCarta1 = new javax.swing.JButton();
        cartelCartas = new javax.swing.JLabel();
        botonCarta3 = new javax.swing.JButton();
        cartelJugador = new javax.swing.JLabel();
        cartelMaquina = new javax.swing.JLabel();
        imagenUsuario = new javax.swing.JLabel();
        imagenMaquina = new javax.swing.JLabel();
        cartelPuntosJugador = new javax.swing.JLabel();
        cartelPuntosMaquina = new javax.swing.JLabel();
        cartelResultado = new javax.swing.JLabel();
        botonCarta2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cartelJuegoDe.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 30)); // NOI18N
        cartelJuegoDe.setForeground(new java.awt.Color(204, 204, 204));
        cartelJuegoDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartelJuegoDe.setText("Juego de");

        botonCarta1.setBackground(new java.awt.Color(51, 51, 51));
        botonCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        botonCarta1.setToolTipText("");
        botonCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarta1ActionPerformed(evt);
            }
        });

        cartelCartas.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 48)); // NOI18N
        cartelCartas.setForeground(new java.awt.Color(255, 255, 255));
        cartelCartas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartelCartas.setText("CARTAS");

        botonCarta3.setBackground(new java.awt.Color(51, 51, 51));
        botonCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        botonCarta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarta3ActionPerformed(evt);
            }
        });

        cartelJugador.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        cartelJugador.setForeground(new java.awt.Color(0, 204, 153));
        cartelJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartelJugador.setText("jugador");

        cartelMaquina.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        cartelMaquina.setForeground(new java.awt.Color(0, 204, 153));
        cartelMaquina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartelMaquina.setText("máquina");

        imagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N

        imagenMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computer.png"))); // NOI18N

        cartelPuntosJugador.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        cartelPuntosJugador.setForeground(new java.awt.Color(255, 255, 255));
        cartelPuntosJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartelPuntosJugador.setText("Puntos");

        cartelPuntosMaquina.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        cartelPuntosMaquina.setForeground(new java.awt.Color(255, 255, 255));
        cartelPuntosMaquina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartelPuntosMaquina.setText("Puntos");

        cartelResultado.setBackground(new java.awt.Color(153, 153, 153));
        cartelResultado.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        cartelResultado.setForeground(new java.awt.Color(255, 255, 153));
        cartelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartelResultado.setText("Resultado");
        cartelResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonCarta2.setBackground(new java.awt.Color(51, 51, 51));
        botonCarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        botonCarta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarta2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagenUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartelJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartelPuntosJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagenMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartelMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartelPuntosMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(botonCarta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(botonCarta2)
                .addGap(77, 77, 77)
                .addComponent(botonCarta3)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartelJuegoDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartelCartas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartelJuegoDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartelCartas)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCarta3)
                            .addComponent(botonCarta2))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartelJugador)
                            .addComponent(cartelMaquina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMaquina, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartelPuntosJugador)
                            .addComponent(cartelPuntosMaquina)))
                    .addComponent(botonCarta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(cartelResultado)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarta1ActionPerformed
        // Metodo encargado de mandar la información de la eleccion de la carta 1 al modelo(juego).
        
        this.controlador.eleccionCarta(0);
        this.botonCarta1.setEnabled(false); // Se deshabilita el boton.
        
        mostrarCartelResultado();
    }//GEN-LAST:event_botonCarta1ActionPerformed

    private void botonCarta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarta2ActionPerformed
        // Metodo encargado de mandar la información de la eleccion de la carta 2 al modelo(juego).
        
        this.controlador.eleccionCarta(1);
        this.botonCarta2.setEnabled(false); // Se deshabilita el boton.
        
        mostrarCartelResultado();
    }//GEN-LAST:event_botonCarta2ActionPerformed

    private void botonCarta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarta3ActionPerformed
        // Metodo encargado de mandar la información de la eleccion de la carta 1 al modelo(juego).
        
        this.controlador.eleccionCarta(2);
        this.botonCarta3.setEnabled(false); // Se deshabilita el boton.
        
        mostrarCartelResultado();
    }//GEN-LAST:event_botonCarta3ActionPerformed

    private void mostrarCartelResultado(){
        // Metodo encargado de mantener control de las cartas que faltan elegir. En base a eso decide si cambia el mensaje del cartelResultado.
        
        this.cantRestante--;
        
        // Si ya no hay mas cartas, se debe mostrar el resultado final por pantalla.
        if (cantRestante == 0) {
            String textoRes = "¡Felicidades, ganaste!";

            if (puntosJugador < puntosMaquina) {
                textoRes = "Perdiste, vuelve a intentarlo :(";
            } else if (puntosJugador == puntosMaquina) {
                textoRes = "¡Empate!";
            }

            this.cartelResultado.setText(textoRes); //
        }
        
    }
    
    public void mostrarResultado(int puntosJugador, int puntosMaquina) {
        // Muestra los resultados por pantalla.
        
        this.puntosJugador = puntosJugador;
        this.puntosMaquina = puntosMaquina;
        
        this.cartelPuntosJugador.setText(String.valueOf(puntosJugador));
        this.cartelPuntosMaquina.setText(String.valueOf(puntosMaquina));
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCarta1;
    private javax.swing.JButton botonCarta2;
    private javax.swing.JButton botonCarta3;
    private javax.swing.JLabel cartelCartas;
    private javax.swing.JLabel cartelJuegoDe;
    private javax.swing.JLabel cartelJugador;
    private javax.swing.JLabel cartelMaquina;
    private javax.swing.JLabel cartelPuntosJugador;
    private javax.swing.JLabel cartelPuntosMaquina;
    private javax.swing.JLabel cartelResultado;
    private javax.swing.JLabel imagenMaquina;
    private javax.swing.JLabel imagenUsuario;
    // End of variables declaration//GEN-END:variables
}
