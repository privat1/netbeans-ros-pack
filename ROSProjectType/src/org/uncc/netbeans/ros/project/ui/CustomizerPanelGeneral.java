/* 
 * Copyright (C) 2015 Andrew Willis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.uncc.netbeans.ros.project.ui;

import java.util.Properties;
import org.uncc.netbeans.ros.project.ROSProject;

/**
 *
 * @author arwillis
 */
public class CustomizerPanelGeneral extends javax.swing.JPanel {
    Properties properties;
    /**
     * Creates new form CustomizerPanelGeneral2
     */
    public CustomizerPanelGeneral(String projectPath, Properties properties) {
        this.properties = properties;
        initComponents();
        rosProjectPath.setText(projectPath);
        rosRootInstallPath.setText(properties.getProperty(ROSProject.ROS_ROOTFOLDER_PROPERTYNAME));
        rosWorkspaceFolder.setText(properties.getProperty(ROSProject.ROS_WORKSPACEFOLDER_PROPERTYNAME));
        rosSrcFolder.setText(properties.getProperty(ROSProject.ROS_SOURCEFOLDER_PROPERTYNAME));
        rosBuildFolder.setText(properties.getProperty(ROSProject.ROS_BUILDFOLDER_PROPERTYNAME));
        rosInstallFolder.setText(properties.getProperty(ROSProject.ROS_INSTALLFOLDER_PROPERTYNAME));
        rosDevelFolder.setText(properties.getProperty(ROSProject.ROS_DEVELFOLDER_PROPERTYNAME));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rosProjectPath = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        rosRootInstallPath = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        rosWorkspaceFolder = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        rosDevelFolder = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        rosBuildFolder = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        rosInstallFolder = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        rosSrcFolder = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(CustomizerPanelGeneral.class, "CustomizerPanelGeneral.jLabel5.text")); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CustomizerPanelGeneral.class, "CustomizerPanelGeneral.jLabel1.text")); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CustomizerPanelGeneral.class, "CustomizerPanelGeneral.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(CustomizerPanelGeneral.class, "CustomizerPanelGeneral.jLabel3.text")); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(CustomizerPanelGeneral.class, "CustomizerPanelGeneral.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rosProjectPath, org.openide.util.NbBundle.getMessage(CustomizerPanelGeneral.class, "CustomizerPanelGeneral.rosProjectPath.text")); // NOI18N
        rosProjectPath.setPreferredSize(new java.awt.Dimension(204, 17));

        rosRootInstallPath.setColumns(20);
        rosRootInstallPath.setRows(1);
        rosRootInstallPath.setAutoscrolls(false);
        rosRootInstallPath.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rosRootInstallPathPropertyChange(evt);
            }
        });
        jScrollPane8.setViewportView(rosRootInstallPath);

        rosWorkspaceFolder.setColumns(20);
        rosWorkspaceFolder.setRows(1);
        rosWorkspaceFolder.setAutoscrolls(false);
        rosWorkspaceFolder.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rosWorkspaceFolderPropertyChange(evt);
            }
        });
        jScrollPane9.setViewportView(rosWorkspaceFolder);

        rosDevelFolder.setColumns(20);
        rosDevelFolder.setRows(1);
        rosDevelFolder.setAutoscrolls(false);
        rosDevelFolder.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rosDevelFolderPropertyChange(evt);
            }
        });
        jScrollPane10.setViewportView(rosDevelFolder);

        rosBuildFolder.setColumns(20);
        rosBuildFolder.setRows(1);
        rosBuildFolder.setAutoscrolls(false);
        rosBuildFolder.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rosBuildFolderPropertyChange(evt);
            }
        });
        jScrollPane11.setViewportView(rosBuildFolder);

        rosInstallFolder.setColumns(20);
        rosInstallFolder.setRows(1);
        rosInstallFolder.setAutoscrolls(false);
        rosInstallFolder.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rosInstallFolderPropertyChange(evt);
            }
        });
        jScrollPane12.setViewportView(rosInstallFolder);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(CustomizerPanelGeneral.class, "CustomizerPanelGeneral.jLabel6.text")); // NOI18N

        rosSrcFolder.setColumns(20);
        rosSrcFolder.setRows(1);
        rosSrcFolder.setAutoscrolls(false);
        rosSrcFolder.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rosSrcFolderPropertyChange(evt);
            }
        });
        jScrollPane13.setViewportView(rosSrcFolder);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(CustomizerPanelGeneral.class, "CustomizerPanelGeneral.jLabel7.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rosProjectPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rosProjectPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rosRootInstallPathPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rosRootInstallPathPropertyChange
        // TODO add your handling code here:
        properties.setProperty(ROSProject.ROS_ROOTFOLDER_PROPERTYNAME,
                rosRootInstallPath.getText());
    }//GEN-LAST:event_rosRootInstallPathPropertyChange

    private void rosWorkspaceFolderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rosWorkspaceFolderPropertyChange
        // TODO add your handling code here:
        properties.setProperty(ROSProject.ROS_WORKSPACEFOLDER_PROPERTYNAME,
                rosWorkspaceFolder.getText());
    }//GEN-LAST:event_rosWorkspaceFolderPropertyChange

    private void rosBuildFolderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rosBuildFolderPropertyChange
        // TODO add your handling code here:
        properties.setProperty(ROSProject.ROS_BUILDFOLDER_PROPERTYNAME,
                rosBuildFolder.getText());
    }//GEN-LAST:event_rosBuildFolderPropertyChange

    private void rosDevelFolderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rosDevelFolderPropertyChange
        // TODO add your handling code here:
        properties.setProperty(ROSProject.ROS_DEVELFOLDER_PROPERTYNAME,
                rosDevelFolder.getText());
    }//GEN-LAST:event_rosDevelFolderPropertyChange

    private void rosInstallFolderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rosInstallFolderPropertyChange
        // TODO add your handling code here:
        properties.setProperty(ROSProject.ROS_INSTALLFOLDER_PROPERTYNAME,
                rosInstallFolder.getText());
    }//GEN-LAST:event_rosInstallFolderPropertyChange

    private void rosSrcFolderPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rosSrcFolderPropertyChange
        // TODO add your handling code here:
        properties.setProperty(ROSProject.ROS_SOURCEFOLDER_PROPERTYNAME,
                rosSrcFolder.getText());
    }//GEN-LAST:event_rosSrcFolderPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea rosBuildFolder;
    private javax.swing.JTextArea rosDevelFolder;
    private javax.swing.JTextArea rosInstallFolder;
    private javax.swing.JLabel rosProjectPath;
    private javax.swing.JTextArea rosRootInstallPath;
    private javax.swing.JTextArea rosSrcFolder;
    private javax.swing.JTextArea rosWorkspaceFolder;
    // End of variables declaration//GEN-END:variables
}
