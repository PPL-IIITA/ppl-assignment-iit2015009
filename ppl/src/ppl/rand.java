/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;


import java.io.*;
import java.util.*;


/**
 *
 * @author pooja
 */
public class rand {
 
    public static void main (String args[]) throws IOException
    {
                        
                        String[] boys = new String[20];
                        String[] girls = new String[10];
                            
                         int[] b_bud = new int[20] ;
                         int[] b_mini = new int[20];
                         int[] b_int = new int[20];
                         int[] b_att = new int [20];
                         
                                                     
                         int[] g_bud = new int[10] ;
                         //int[] g_mini = new int[20];
                         int[] g_int = new int[10];
                         int[] g_att = new int [10];
                        
			PrintWriter writer = new PrintWriter("g_a.csv", "UTF-8");
			for(int i=0; i<10; i++){
                                
                                girls[i] = "girl"+i;
                                g_bud[i] = (int)(Math.random()*100) +1;
                                
                                g_int[i] = (int)(Math.random()*60) + 50;
                                
                                g_att[i] = (int)(Math.random()*10) + 1;
                                
                              writer.println(g_bud[i]+","+g_int[i]+","+g_att[i]+","+"single"+","+girls[i] );
                            
                        }
			writer.close();
			
			writer = new PrintWriter("b_a.csv", "UTF-8");
                                for(int i=0; i<20; i++){
                                
                                boys[i] = "boy"+i;
                                b_bud[i] = (int)(Math.random()*100) +1;
                                b_mini[i] = (int)(Math.random()*10) +1;
                                b_int[i] = 50+(int)(Math.random()*60);
                                
                                b_att[i] = (int)(Math.random()*10) +1;
                                
                              writer.println(b_bud[i]+","+b_mini[i]+","+b_int[i]+","+b_att[i]+","+"single"+","+boys[i] );
                            
                        }
                        writer.close();

        
        
    
}}
