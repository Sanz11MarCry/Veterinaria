/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * usuarios.java
 *
 * Created on 11-sep-2013, 20:12:01
 */
package veterinaria;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author Usuario
 */
public class usuarios extends javax.swing.JInternalFrame {
DefaultTableModel modelo;
    /** Creates new form usuarios */
    public usuarios() {
        
        this.setLocation(null);
        initComponents();
        
        mostrarusuarios();
        Generarnumeracion();
       
        
    }
    void Generarnumeracion()
    {
     String SQL="select max(ID_usuario) from usuario";
       // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        
          int c=0;
          int b=0;
        try {
           Statement st = cn.createStatement();
           ResultSet rs=st.executeQuery(SQL);
            while(rs.next())
            {              
                 c=rs.getInt(1);
            }
            
           
            if(c==0){
                txtid.setText("1");
            }
            else
            {
                
                txtid.setText(""+(c+1));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
   void mostrarusuarios(){
   String [] titulos= {"id","USUARIO","TIPO USUARIO"};
   modelo=new  DefaultTableModel(null,titulos);   
   String datos []= new String[5];
   String sql="SELECT * FROM  usuario"; 
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                datos[0]=rs.getString("ID_usuario");
                datos[1]=rs.getString("nick");
                datos[2]= rs.getString("tipo_usuario");
                modelo.addRow(datos);
            }
            tbusuario.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  
   }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblNick = new javax.swing.JLabel();
        lblPasword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnick = new javax.swing.JTextField();
        cbotipo = new javax.swing.JComboBox();
        txtpass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuario = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();
        txtcontra = new javax.swing.JPasswordField();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Usuario"));

        lblId.setText("Id:");

        lblNick.setText("Nick:");

        lblPasword.setText("Password:");

        jLabel4.setText("Tipo Usuario:");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtnick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnickActionPerformed(evt);
            }
        });

        cbotipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Administrador", "Invitado", " " }));
        cbotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(lblNick)
                    .addComponent(lblPasword)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpass)
                    .addComponent(txtid)
                    .addComponent(txtnick)
                    .addComponent(cbotipo, 0, 117, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNick)
                    .addComponent(txtnick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasword)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbusuario);

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnregistrar)
                        .addGap(26, 26, 26)
                        .addComponent(btnSalir)
                        .addGap(73, 73, 73)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnaceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar)
                    .addComponent(btneliminar)
                    .addComponent(btnaceptar)
                    .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
String ins="INSERT INTO usuario (nick, contraseña,tipo_usuario) VALUES(?,?,?)";
        try {
            PreparedStatement pstO = cn.prepareStatement(ins);
            pstO.setString(1, txtnick.getText());
            pstO.setString(2,new String(txtpass.getPassword()));
            pstO.setString(3, cbotipo.getSelectedItem().toString());
            int n= pstO.executeUpdate();
            if(n>0)
            {
                JOptionPane.showMessageDialog(this, "Se guardaron los datos");
                mostrarusuarios();
                txtnick.setText(null);
                txtpass.setText(null);
                cbotipo.setSelectedIndex(0);
                Generarnumeracion();
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "Error");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_btnregistrarActionPerformed

private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
// TODO add your handling code here:
    int fila= tbusuario.getSelectedRow();
    if(fila<0)
    {
        JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
    }
    else
    {
         idfila= tbusuario.getValueAt(fila, 0).toString();
         JOptionPane.showMessageDialog(this, "debe Ingresar la Contraseña para Eliminar algun Usuario");
         txtcontra.requestFocus();
    }
}//GEN-LAST:event_btneliminarActionPerformed

private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
// TODO add your handling code here:
    String compara="";
    String contra="";
    contra= new String(txtcontra.getPassword());
    
    String cap="";
    System.out.print(cap);
    String sql="SELECT * FROM usuario WHERE nick='"+cap+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
            compara=rs.getString("contraseña");
            }
          System.out.println(compara);
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
          if(compara.equals(contra))
            {
                
                String eli="DELETE FROM usuario WHERE ID_usuario = '"+idfila+"'";
                PreparedStatement pst;
            try {
                pst = cn.prepareStatement(eli);
                  int m=pst.executeUpdate();
                if(m>0){
                    JOptionPane.showMessageDialog(this, "elimino regisro");
                     mostrarusuarios();
                     txtcontra.setText(null);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar");
                    mostrarusuarios();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
              
            }
    
}//GEN-LAST:event_btnaceptarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnickActionPerformed

    private void cbotipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox cbotipo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblPasword;
    private javax.swing.JTable tbusuario;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnick;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    String idfila="";
}
