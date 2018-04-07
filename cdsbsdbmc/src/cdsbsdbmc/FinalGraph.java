

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

public class FinalGraph extends JFrame{
    String EOL = "\r\n";
    ArrayList<String> anemia = new ArrayList<String>();
    public FinalGraph(){    	
    	
        DefaultCategoryDataset data = new DefaultCategoryDataset();
       //
        JFreeChart graph = ChartFactory.createBarChart("GRADE","WEIGHT","RATING",data,PlotOrientation.VERTICAL,true,false,true);
       
        ChartPanel tt = new ChartPanel(graph);
        JFrame test = new JFrame("Dense ANALIZER");
        test.setSize(600, 500);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.add(tt);
        test.setVisible(true);
        test.setLocationRelativeTo(null);
        
    }
    
    public FinalGraph(String gg) {
    	
    	try{
    		
    		FileInputStream fis = new FileInputStream("maincluster.txt");
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
    			 data.addValue(value,"anemia"+i,""); 
    		 }
    		 else{
    			 data.addValue(value,"no anemia"+i,""); 
    			 
    		 }    		 
    		 
    	 }
    	 JFreeChart graph = ChartFactory.createBarChart("GRADE","WEIGHT","RATING",data,PlotOrientation.VERTICAL,true,false,true);         
         ChartPanel tt = new ChartPanel(graph);
         JFrame test = new JFrame("Cluster ANALIZER");
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
