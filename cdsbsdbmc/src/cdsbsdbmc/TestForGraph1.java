/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdsbsdbmc;




import java.awt.Color;
import java.awt.GradientPaint;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JFrame;

import org.jfree.chart.*;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.category.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.BarRenderer;

import java.util.*;

public class TestForGraph1 extends JFrame{
    String EOL = "\r\n";
    ArrayList<String> anemia = new ArrayList<String>();
    public TestForGraph1(){    	
    	
        DefaultCategoryDataset data = new DefaultCategoryDataset();
       //
        JFreeChart graph = ChartFactory.createBarChart("GRADE","WEIGHT","RATING",data,PlotOrientation.VERTICAL,true,false,true);
       
        ChartPanel tt = new ChartPanel(graph);
        JFrame test = new JFrame("Dense ANALIZER");
        test.setSize(1600, 1500);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.add(tt);
        test.setVisible(true);
        test.setLocationRelativeTo(null);
        
    }
    public TestForGraph1(ArrayList<Double> grades,ArrayList<Double> weights){
      //starts..
      try{
        DefaultCategoryDataset data = new DefaultCategoryDataset();
      /*
      for(int i=0;i<grades.size();i++){
          data.addValue(grades.get(i), "G"+i, "");
                data.addValue(weights.get(i), "W"+i, "");
      }
      */
      for(int i=0;i<grades.size();i++){
          data.addValue(grades.get(i), "GRADE", "");
                data.addValue(weights.get(i), "WEIGHTAGE", "");
      }
      
      	 JFreeChart graph = ChartFactory.createBarChart("Dense PERCENTAGE","PERCENTAGE","RATING",data,PlotOrientation.VERTICAL,true,false,true);         
         ChartPanel tt = new ChartPanel(graph);
         JFrame test = new JFrame("Dence Cluster");
         test.setSize(600, 500);
         test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         test.add(tt);
         test.setVisible(true);
         test.setLocationRelativeTo(null);
      
      }catch(Exception e){
          System.out.println(e);
      }
      ///ends
    }
    public TestForGraph1(ArrayList<Double> grades,ArrayList<Double> weights,String ss){
      //starts..
      try{
        DefaultCategoryDataset data = new DefaultCategoryDataset();
      
      for(int i=0;i<grades.size();i++){
          data.addValue(grades.get(i), "G"+i, "");
                data.addValue(weights.get(i), "W"+i, "");
      }
      
     
      
      	 JFreeChart graph = ChartFactory.createBarChart("Dense PERCENTAGE","PERCENTAGE","RATING",data,PlotOrientation.VERTICAL,true,false,true);         
         ChartPanel tt = new ChartPanel(graph);
         JFrame test = new JFrame("Dense Cluster");
         test.setSize(600, 500);
         test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         test.add(tt);
         test.setVisible(true);
         test.setLocationRelativeTo(null);
      
      }catch(Exception e){
          System.out.println(e);
      }
      ///ends
    }
    {
        
    }
    public TestForGraph1(String gg) {
    	
    	try{
    		
    		FileInputStream fis = new FileInputStream("dens.txt");
            ObjectInputStream oin = new ObjectInputStream(fis);
            //fis1.available();
            Map<ArrayList<Integer>, ArrayList<Integer>> des = (Map<ArrayList<Integer>, ArrayList<Integer>>) oin.readObject();
            //System.out.println("dsfdf" + des);
            //System.out.println("dfdsfdsdsfdsfds" + des.keySet());
            
            ArrayList<Integer> al = new ArrayList<Integer>();
    		
    		for(Map.Entry<ArrayList<Integer>, ArrayList<Integer>> m: des.entrySet())
	{
		System.out.println(m.getValue());
		 al = m.getValue();
	}     
       
    		
    		
    	 DefaultCategoryDataset data = new DefaultCategoryDataset();
    	 for(int i=0;i<al.size();i++){
    		 
    		 String temp = al.get(i).toString();
    		 int value = Integer.parseInt(temp);
    		 
    		 if(value < 100){
    			 data.addValue(value,"GRADE"+i,""); 
    		 }
    		 else{
    			 data.addValue(value,"C"+i,""); 
    			 
    		 }    		 
    		 
    	 }
    	 JFreeChart graph = ChartFactory.createBarChart("Dense PERCENTAGE","PERCENTAGE","RATING",data,PlotOrientation.VERTICAL,true,false,true);         
         ChartPanel tt = new ChartPanel(graph);
         JFrame test = new JFrame("Dense Cluster");
         test.setSize(600, 500);
         test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         test.add(tt);
         test.setVisible(true);
         test.setLocationRelativeTo(null);
    	}catch(Exception e){
    		
    		System.out.println(e);
    	}
    	
    }
    public static void main(String []args){
        
        new TestForGraph("my graph");
        //new TestForGraph();
    }
    
}
