/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto.View;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author bruno
 */
public class InterfaceSistema extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceSistema
     */
    public InterfaceSistema() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        pnlBackground = new javax.swing.JPanel();
        pnlBarraLateral = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora Sessão Meia Noite");

        pnlBackground.setBackground(new java.awt.Color(25, 25, 25));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraLateral.setBackground(new java.awt.Color(30, 30, 30));
        pnlBarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(25, 25, 25));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/cart-12-24.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Itens");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 70, 40));

        pnlBarraLateral.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 160, 40));

        jPanel4.setBackground(new java.awt.Color(25, 25, 25));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/home-7-24.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Home");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 50, 40));

        pnlBarraLateral.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 40));

        jPanel5.setBackground(new java.awt.Color(25, 25, 25));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/film-reel-24.png"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Filmes");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 70, 40));

        pnlBarraLateral.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 160, 40));

        jPanel6.setBackground(new java.awt.Color(25, 25, 25));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/user-24.png"))); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Clientes");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 70, 40));

        pnlBarraLateral.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 40));

        jPanel8.setBackground(new java.awt.Color(25, 25, 25));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/question-mark-4-32.png"))); // NOI18N
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        pnlBarraLateral.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 50, 40));

        jPanel9.setBackground(new java.awt.Color(25, 25, 25));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(153, 0, 0));
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/shopping-basket-2-24.png"))); // NOI18N
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel20.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Locação");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        pnlBarraLateral.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 160, 40));

        jPanel10.setBackground(new java.awt.Color(24, 24, 24));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Locadora");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Sessão Meia Noite");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 20));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/film-48.png"))); // NOI18N
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 70));

        pnlBarraLateral.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 130));

        jPanel16.setBackground(new java.awt.Color(20, 20, 20));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/gear-2-32.png"))); // NOI18N
        jPanel16.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        pnlBarraLateral.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 50, 40));

        pnlBackground.add(pnlBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 530));

        jDesktopPane1.setBackground(new java.awt.Color(15, 15, 15));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame2.setTitle("Página Principal");
        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(27, 25, 25));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Home");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/home-7-80.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(870, 440));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Open Sans Semibold", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("<html>\n<body>\nBem-vindo à <br> Locadora Sessão Meia Noite!!\n</body>\n</html>");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 318, -1));

        jLabel26.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 153, 0));
        jLabel26.setText("Especial de Halloween!!");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel27.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/imagens/137270.jpg-c_215_290_x-f_jpg-q_x-xxyxx.jpg"))); // NOI18N
        jLabel27.setText("Disponível para alugar!!");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 870, 540));

        jInternalFrame2.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 540));

        jDesktopPane1.add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 880, 570));

        jInternalFrame1.setTitle("Catálogo de Filmes");
        jInternalFrame1.setVisible(false);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(33, 32, 32));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Filmes");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/film-reel-80.png"))); // NOI18N
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        jInternalFrame1.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 540));

        jDesktopPane1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 880, 570));

        jInternalFrame3.setTitle("Clientes");
        jInternalFrame3.setMinimumSize(new java.awt.Dimension(880, 570));
        jInternalFrame3.setPreferredSize(new java.awt.Dimension(886, 574));
        jInternalFrame3.setVisible(false);
        jInternalFrame3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(33, 32, 32));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Clientes");
        jPanel15.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/user-80.png"))); // NOI18N
        jPanel15.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        jInternalFrame3.getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 570));

        jDesktopPane1.add(jInternalFrame3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 880, 570));

        jInternalFrame4.setTitle("Itens");
        jInternalFrame4.setVisible(false);
        jInternalFrame4.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(33, 32, 32));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Itens");
        jPanel18.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/cart-12-80.png"))); // NOI18N
        jPanel18.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        jInternalFrame4.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 540));

        jDesktopPane1.add(jInternalFrame4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 880, 570));

        jInternalFrame5.setTitle("Locações");
        jInternalFrame5.setVisible(false);
        jInternalFrame5.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(33, 32, 32));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Locações");
        jPanel20.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ícones/shopping-basket-2-80.png"))); // NOI18N
        jPanel20.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        jInternalFrame5.getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 540));

        jDesktopPane1.add(jInternalFrame5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 880, 570));

        pnlBackground.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 860, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        bar(jLabel4);
        jInternalFrame2.setVisible(true);
        jInternalFrame1.setVisible(false);
        jInternalFrame3.setVisible(false);
        jInternalFrame4.setVisible(false);
        jInternalFrame5.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(Color.decode("#454545"));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(Color.decode("#191919"));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        bar(jLabel7);
        jInternalFrame2.setVisible(false);
        jInternalFrame1.setVisible(true);
        jInternalFrame3.setVisible(false);
        jInternalFrame4.setVisible(false);
        jInternalFrame5.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(Color.decode("#454545"));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(Color.decode("#191919"));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        jPanel4.setBackground(Color.decode("#303030"));
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        jPanel5.setBackground(Color.decode("#303030"));
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        bar(jLabel10);
        jInternalFrame2.setVisible(false);
        jInternalFrame1.setVisible(false);
        jInternalFrame3.setVisible(true);
        jInternalFrame4.setVisible(false);
        jInternalFrame5.setVisible(false);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        jPanel6.setBackground(Color.decode("#454545"));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(Color.decode("#191919"));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        jPanel6.setBackground(Color.decode("#303030"));
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        bar(jLabel1);
        jInternalFrame2.setVisible(false);
        jInternalFrame1.setVisible(false);
        jInternalFrame3.setVisible(false);
        jInternalFrame4.setVisible(true);
        jInternalFrame5.setVisible(false);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(Color.decode("#454545"));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(Color.decode("#191919"));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        jPanel3.setBackground(Color.decode("#303030"));
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        bar(jLabel18);
        jInternalFrame2.setVisible(false);
        jInternalFrame1.setVisible(false);
        jInternalFrame3.setVisible(false);
        jInternalFrame4.setVisible(false);
        jInternalFrame5.setVisible(true);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setBackground(Color.decode("#454545"));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(Color.decode("#191919"));
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        jPanel9.setBackground(Color.decode("#303030"));
    }//GEN-LAST:event_jPanel9MousePressed

    public void bar(JLabel lab){
        jLabel1.setOpaque(false);
        jLabel4.setOpaque(false);
        jLabel7.setOpaque(false);
        jLabel10.setOpaque(false);
        jLabel18.setOpaque(false);
        lab.setOpaque(true);
        jPanel2.repaint();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(InterfaceSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfaceSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlBarraLateral;
    // End of variables declaration//GEN-END:variables
}
