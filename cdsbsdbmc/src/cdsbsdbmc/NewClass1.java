/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdsbsdbmc;

import java.util.ArrayList;
import java.util.List;


public class NewClass1 {
    
    
    public static void main(String[] args) {
        
        try{
      
           Object [] arr = new Integer[3];
arr[0] = new Integer(1);
arr[1] = new Integer(2);
arr[2] = 3;
Integer [] newa = (Integer []) arr;
for(int i:newa) {
  System.out.println(i+" "); 
}
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
    
}
