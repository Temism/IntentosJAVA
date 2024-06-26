/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duoc.evaluacion3.Views;

import cl.duoc.evaluacion3.DTO.MovieDTO;
import cl.duoc.evaluacion3.Services.IMovie;
import cl.duoc.evaluacion3.ServicesImpls.MovieService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ModificarViews extends javax.swing.JInternalFrame {

    private static IMovie servicio;
    public ModificarViews() {
        initComponents();
        if (servicio == null) {
            servicio = new MovieService();
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

        jLabel2 = new javax.swing.JLabel();
        BLimpiar = new javax.swing.JButton();
        TxtModificarPeli = new javax.swing.JTextField();
        BBuscarPeli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SeleccionGenero = new javax.swing.JComboBox<>();
        TxtDuracion = new javax.swing.JTextField();
        TxtDirector = new javax.swing.JTextField();
        TxtAnio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BModificarPeli = new javax.swing.JButton();
        TxtTitulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modificar Pelicula");
        setMinimumSize(new java.awt.Dimension(320, 320));
        setName(""); // NOI18N

        jLabel2.setText("Nombre de la Pelicula");

        BLimpiar.setText("Limpiar");
        BLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpiarActionPerformed(evt);
            }
        });

        TxtModificarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModificarPeliActionPerformed(evt);
            }
        });

        BBuscarPeli.setText("Buscar Pelicula");
        BBuscarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarPeliActionPerformed(evt);
            }
        });

        jLabel1.setText("Duracion");

        jLabel3.setText("Director");

        jLabel4.setText("Año");

        jLabel5.setText("Genero");

        SeleccionGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione Genero -", "Drama", "Comedia", "Accion", "Romance ", "Suspenso", "Terror" }));
        SeleccionGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionGeneroActionPerformed(evt);
            }
        });

        TxtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDuracionActionPerformed(evt);
            }
        });

        TxtDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDirectorActionPerformed(evt);
            }
        });

        TxtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAnioActionPerformed(evt);
            }
        });

        jLabel6.setText("Titulo");

        BModificarPeli.setText("Modificar Pelicula");
        BModificarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarPeliActionPerformed(evt);
            }
        });

        TxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTituloActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        TxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtAnio)
                    .addComponent(TxtDirector)
                    .addComponent(SeleccionGenero, 0, 400, Short.MAX_VALUE)
                    .addComponent(TxtID)
                    .addComponent(TxtTitulo)
                    .addComponent(TxtDuracion))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BModificarPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BBuscarPeli))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtModificarPeli, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModificarPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BBuscarPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeleccionGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(BModificarPeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTituloActionPerformed
    static MovieDTO guardado = new MovieDTO();
    List<MovieDTO> listapelis = new ArrayList<>();
    private void BBuscarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarPeliActionPerformed
        // TODO add your handling code here:
       try {
            String titulo = TxtModificarPeli.getText();
            if (!titulo.isEmpty()) {
                List<MovieDTO> listapelis = servicio.BuscarTitulo(titulo);
                if (!listapelis.isEmpty()) {
                    MovieDTO m = listapelis.get(0);

                    guardado.setID(m.getID());
                    guardado.setAnio(m.getAnio());
                    guardado.setDirector(m.getDirector());
                    guardado.setDuracion(m.getDuracion());
                    guardado.setGenero(m.getGenero());
                    guardado.setTitulo(m.getTitulo());

                    TxtID.setText(String.valueOf(guardado.getID()));
                    TxtID.setEditable(false);
                    TxtAnio.setText(String.valueOf(guardado.getAnio()));
                    TxtDuracion.setText(String.valueOf(guardado.getDuracion()));
                    TxtDirector.setText(guardado.getDirector());
                    TxtTitulo.setText(guardado.getTitulo());
                    SeleccionGenero.setSelectedItem(guardado.getGenero());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ninguna película con el título proporcionado", "Búsqueda sin resultados", JOptionPane.PLAIN_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un título para buscar", "Campo Título vacío", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al buscar la película", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BBuscarPeliActionPerformed

    private void BModificarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarPeliActionPerformed
        // TODO add your handling code here:
        int id = -1;
        String titulo = "";
        int duracion = -1;
        String director = "";
        int anio = -1;
        String genero = null;
        try {
            if (!TxtID.getText().isEmpty()) {
                id = Integer.parseInt(TxtID.getText());
            }
            if (TxtAnio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el campo Año correctamente");
                return;
            }

            try {
                anio = Integer.parseInt(TxtAnio.getText());
                if (anio <= 0) {
                    JOptionPane.showMessageDialog(this, "El Año debe ser un valor mayor a 0");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido para el Año");
                return;
            }

            if (TxtDuracion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el campo Duración correctamente");
                return;
            }

            try {
                duracion = Integer.parseInt(TxtDuracion.getText());
                if (duracion <= 0) {
                    JOptionPane.showMessageDialog(this, "La Duración debe ser un valor mayor a 0");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido para la Duración");
                return;
            }
   
            if (!TxtDirector.getText().isEmpty()) {
                director = TxtDirector.getText();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese el campo Director correctamente");
                return;
            }

            if (!TxtTitulo.getText().isEmpty()) {
                titulo = TxtTitulo.getText();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese el campo Título correctamente");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese los campos numéricos correctamente");
            return; 
        }

        if (SeleccionGenero.getSelectedIndex() > 0) {
            genero = SeleccionGenero.getSelectedItem().toString();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un género");
            return;
        }

        MovieDTO peli  = new MovieDTO();
         peli.setID(id);
         peli.setAnio(anio);
         peli.setDirector(director);
         peli.setDuracion(duracion);
         peli.setTitulo(titulo);
         peli.setGenero(genero);
        servicio.Actualizar(peli);
        JOptionPane.showMessageDialog(this, "Pelicula modificada con exito");
    }//GEN-LAST:event_BModificarPeliActionPerformed

    private void TxtModificarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModificarPeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModificarPeliActionPerformed

    private void BLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpiarActionPerformed
        // TODO add your handling code here:
        TxtID.setText("");
        TxtAnio.setText("");
        TxtDirector.setText("");
        TxtDuracion.setText("");
        TxtTitulo.setText("");
        TxtModificarPeli.setText("");
        SeleccionGenero.setSelectedIndex(0);
    }//GEN-LAST:event_BLimpiarActionPerformed

    private void TxtDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDirectorActionPerformed

    private void TxtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDuracionActionPerformed

    private void SeleccionGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionGeneroActionPerformed

    private void TxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDActionPerformed

    private void TxtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAnioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscarPeli;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JButton BModificarPeli;
    private javax.swing.JComboBox<String> SeleccionGenero;
    private javax.swing.JTextField TxtAnio;
    private javax.swing.JTextField TxtDirector;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtModificarPeli;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
