/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdsbsdbmc;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.*;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.apache.poi.ss.usermodel.DataFormatter;
public class MainUI extends javax.swing.JFrame {
  static  ArrayList adharNo = new ArrayList();
   static ArrayList<String> patientname = new ArrayList<String>();
   static ArrayList<String> age = new ArrayList<String>();    
  static  ArrayList<String> gender = new ArrayList<String>();
  static  ArrayList<String> decease = new ArrayList<String>();
  static  ArrayList<String> operation = new ArrayList<String>();
  static  ArrayList<String> dept = new ArrayList<String>();
   static ArrayList<String> dod = new ArrayList<String>();
   static ArrayList<String> labreport = new ArrayList<String>();
   static ArrayList<String> bloodgroup = new ArrayList<String>();
   static ArrayList<String> phonenumber = new ArrayList<String>();
  static  ArrayList<String> drsname = new ArrayList<String>();
   static ArrayList<String> prescription = new ArrayList<String>();
   static ArrayList<String> address = new ArrayList<String>();
  static ArrayList<String> temp= new ArrayList<String>();
    List<String> dTemp= new ArrayList<String>();
   
    
  
      
      
    
    String attribute1 = new String();
    String attribute2 = new String();
    String attribute3 = new String();
    String attribute4 = new String();
    String attribute5 = new String();
    String attribute6 = new String();
    String attribute7 = new String();
    String attribute8 = new String();
    String attribute9 = new String();
    String attribute10 = new String();
    String attribute11 = new String();
    String attribute12 = new String();
    String attribute13 = new String();
    String attribute14 = new String();
    String processName="";
    ArrayList<String> totalAttributes = new ArrayList<String>();
    ArrayList<String> selectedSequence = new ArrayList<String>();
    
    ArrayList<Integer> mainClusterIndexes = new ArrayList<Integer>();
    ArrayList<Integer> denseClusterIndexes = new ArrayList<Integer>();
    long startTime = 0L;
    long endTime = 0L;
    long streamTime = 0L;
    
  String fileName = "";
    String EOL = "\r\n";
    public MainUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("<<SADDAM>>");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Clustering Data Streams based on shared density between micro clusters");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(26, 29, 748, 22);

        jButton1.setText("READ DATA SETS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 110, 120, 23);

        jButton5.setText("CreateHereforDensCluster");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 230, 190, 23);

        jButton6.setText("ClickHereToCreateCluster");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(20, 150, 187, 23);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(132, 11, 341, 0);

        jButton3.setText("MainClusterGraph");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 190, 130, 23);

        jButton7.setText("DensClusterGraph");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(20, 270, 124, 23);

        jButton8.setText("percentage");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(20, 310, 120, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cdsbsdbmc/c1.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 60, 540, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
         
       //reading of the datasets code .....starts
       startTime = System.currentTimeMillis();
       JFileChooser chooser = new JFileChooser();
           chooser.setCurrentDirectory(new java.io.File("."));
           //chooser.addChoosableFileFilter(new ExtensionsFilter("only excel formats"), "png", "gif", "jpg", "jpeg", "bmp");
          FileFilter filter = new FileNameExtensionFilter("excel files only","xlsx");
           chooser.addChoosableFileFilter(filter);
           chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);           
           chooser.setAcceptAllFileFilterUsed(false);
           
           if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
               fileName = chooser.getSelectedFile().toString();
              System.out.println("gfygfhgfh   "+fileName);               
           }
           //r.exec("C:\\Program Files (x86)\\Microsoft Office\\Office14\\EXCEL D:\\SUHASINI\\FDECISIONTREE\\dtreef.xlsx");
           Runtime r = Runtime.getRuntime();
             Process p = Runtime.getRuntime().exec
          (new String [] { "cmd.exe", "/c", "assoc", ".xlsx"});
        BufferedReader input =
          new BufferedReader
            (new InputStreamReader(p.getInputStream()));
        String extensionType = input.readLine();
        input.close();
        // extract type
        if (extensionType == null) {
          System.out.println("no office installed ?");
          System.exit(1);
        }
        String fileType[] = extensionType.split("=");
        for(int i=0;i<fileType.length;i++)
        {
        System.out.println("fhgfhgf"+fileType[i]);
        }
        p = Runtime.getRuntime().exec
          (new String [] { "cmd.exe", "/c", "ftype", fileType[1]});
        input =
          new BufferedReader
            (new InputStreamReader(p.getInputStream()));
        String fileAssociation = input.readLine();
        // extract path
        String officePath = fileAssociation.split("=")[1];
        officePath = officePath.substring(0, officePath.lastIndexOf("/"));
           
         r.exec(officePath+fileName); 
           FileInputStream file  = new FileInputStream(new File(fileName));
           XSSFWorkbook workbook = new XSSFWorkbook(file);
           XSSFSheet sheet = workbook.getSheetAt(0);  
           Iterator<Row> rowIterator = sheet.iterator();
           while (rowIterator.hasNext()) 
			{
				Row row = rowIterator.next();
				//For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell = cellIterator.next();
                            
				while (cellIterator.hasNext()) 
				{					
                                                        
                            adharNo.add(row.getCell(0));
                            patientname.add(row.getCell(1).toString());
                            age.add(row.getCell(2).toString());
                            gender.add(row.getCell(3).toString());
                            decease.add(row.getCell(4).toString());
                            operation.add(row.getCell(5).toString());
                            dept.add(row.getCell(6).toString());
                            dod.add(row.getCell(7).toString());        
                            labreport.add(row.getCell(8).toString());
                            bloodgroup.add(row.getCell(9).toString());
                            phonenumber.add(row.getCell(10).toString());        
                            drsname.add(row.getCell(11).toString());        
                            prescription.add(row.getCell(12).toString());        
                            address.add(row.getCell(13).toString());
                                  //  System.out.println("aadhar  "+ new DataFormatter().formatCellValue(row.getCell(0)));
                            
                                    break;
				}
				//System.out.println("");
			}
                            file.close();
          
                  attribute1 = adharNo.get(0).toString();
                  attribute2 = patientname.get(0).toString();
                  attribute3 = age.get(0).toString();
                  attribute4 = gender.get(0).toString();
                  attribute5 = decease.get(0).toString();
                  attribute6 = operation.get(0).toString();
                  attribute7 = dept.get(0).toString();
                  attribute8 = dod.get(0).toString();
                  attribute9 = labreport.get(0).toString();
                  attribute10 = bloodgroup.get(0).toString();
                  attribute11 = phonenumber.get(0).toString();
                  attribute12 = drsname.get(0).toString();
                  attribute13 = prescription.get(0).toString();
                  attribute14 = address.get(0).toString();
                  
                  
                  totalAttributes.add(attribute1);
                  totalAttributes.add(attribute2);
                  totalAttributes.add(attribute3);
                  totalAttributes.add(attribute4);
                  totalAttributes.add(attribute5);
                  totalAttributes.add(attribute6);
                  totalAttributes.add(attribute7);
                  totalAttributes.add(attribute8);
                  totalAttributes.add(attribute9);
                  totalAttributes.add(attribute10);
                  totalAttributes.add(attribute11);
                  totalAttributes.add(attribute12);
                  totalAttributes.add(attribute13);
                  totalAttributes.add(attribute14);
                  
                
                adharNo.remove(0);
                patientname.remove(0);
                age.remove(0);    
                gender.remove(0);
                decease.remove(0);
                operation.remove(0);
                dept.remove(0);
                dod.remove(0);
                labreport.remove(0);
                bloodgroup.remove(0);
                phonenumber.remove(0);
                drsname.remove(0);
                prescription.remove(0);
                address.remove(0);
               
                
                JOptionPane.showMessageDialog(null, "loose data read with ("+adharNo.size()+") records");
       //reading of the datasets code .....ends..
       endTime = System.currentTimeMillis();
       
       jButton6.setEnabled(true);
           
       streamTime = endTime - startTime;
       JOptionPane.showMessageDialog(null, "total number of streams framed are:-> "+totalAttributes.size()+"\r\n with total processing time is -->"+streamTime+"(MS)");
       }catch(Exception e){
           
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
        jButton3.setEnabled(false);
        jButton6.setEnabled(false);
        jButton5.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        
        
        
        
        
      //  fc.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    
    static ArrayList<String> removeDuplicates(ArrayList<String> list) {

        // Store unique items in result.
        ArrayList<String> result = new ArrayList<>();

        // Record encountered Strings in HashSet.
        HashSet<String> set = new HashSet<>();

        // Loop over argument list.
        for (Object item : list) {

            // If String is not in set, add it to the list and the set.
            if (!set.contains(item)) {
                result.add(item.toString());
                set.add(item.toString());
            }
        }
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    //Create DensCluster
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
           
        
             DenseCluster ds = new DenseCluster();
             ds.setVisible(true);
             ds.setSize(490,330);
             
              jButton7.setEnabled(true);
        }
       
       
        catch(Exception e)
        {
            System.out.println("Exception" + e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    //Create MainCluster
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        MainClusters ms = new MainClusters();
        ms.setVisible(true);
        ms.setSize(400,350);
        jButton3.setEnabled(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    //Create MainCluster Graph
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      new TestForGraph("rr");
      jButton5.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //Create DenseCluster Graph
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        
        new TestForGraph1("rr");
        jButton8.setEnabled(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    //Create Percentage Graph
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       int value=0;
       int values1=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        try{
            FileInputStream fis = new FileInputStream("dens.txt");
            ObjectInputStream oin = new ObjectInputStream(fis);
            //fis1.available();
           
            Map<ArrayList<Integer>, ArrayList<Integer>> des = (Map<ArrayList<Integer>, ArrayList<Integer>>) oin.readObject();
            //System.out.println("dsfdf" + des);
            //System.out.println("dfdsfdsdsfdsfds" + des.keySet());
            
           
    		
    		for(Map.Entry<ArrayList<Integer>, ArrayList<Integer>> m: des.entrySet())
	{
		System.out.println(m.getValue());
		 al = m.getValue();
	}     
                
        }
        catch(Exception f)
        {
            System.out.println("fdf"+f);
        }
        
                try{
                
                FileInputStream fis1 = new FileInputStream("maincluster.txt");
            ObjectInputStream oin1 = new ObjectInputStream(fis1);
            //fis1.available();
            
            Map<ArrayList<Integer>, ArrayList<Integer>> des1 = (Map<ArrayList<Integer>, ArrayList<Integer>>) oin1.readObject();
            //System.out.println("dsfdf" + des);
            //System.out.println("dfdsfdsdsfdsfds" + des.keySet());
            
            ArrayList<Integer> al1 = new ArrayList<Integer>();
    		
    		for(Map.Entry<ArrayList<Integer>, ArrayList<Integer>> m1: des1.entrySet())
	{
		System.out.println(m1.getValue());
		 al1 = m1.getValue();
	} 
                
                for(int i1= 0;i1<al1.size();i1++)
                {
                   values1=al1.get(i1);
                }
                    System.out.println("dsfsdfdf"+al1.size());
                    System.out.println("dsfsdfdf"+al.size());
                int perc=(al1.size()/al.size());
                    System.out.println("Sdsd"+ perc);
                
                new TestForGraph2("rr", perc);
                
                
        }
        catch(Exception r)
        {
            System.out.println("dsfsdf"+ r);
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             MainUI mu =   new MainUI();
             mu.setVisible(true);
             mu.setSize(800,500);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
