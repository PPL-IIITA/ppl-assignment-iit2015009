/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;
import java.util.*;
import java.io.*;
/**
 *
 * @author pooja
 */
public class logic {
    public static void main(String args[]) throws IOException{
		boy b_a[] = new boy[20];
		girl g_a[] = new girl[10];

		BufferedReader br = new BufferedReader(new FileReader("b_a.csv"));
		String line;
		int i=0,j=0;
		while ((line = br.readLine()) !=null){
			String[] a = line.split(",");
			b_a[i] = new boy(Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2]),
			Integer.parseInt(a[3]),"single",a[5]);
			
			i++;
		}
		br.close();  
		br = new BufferedReader(new FileReader("g_a.csv"));
                i=0;
                while ((line = br.readLine()) !=null){
                        String[] a = line.split(",");
                        g_a[i] = new girl(Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2]),a[3],a[4]);
                        i++;
                }
                br.close();

		PrintWriter writer = new PrintWriter("logger.csv","UTF-8");
		
		
		for(i=0; i<10; i++){
			for(j=0; j<20; j++){
				
				if(b_a[j].boy_st == "single" && g_a[i].budget <= b_a[j].budget && 
				g_a[i].attractive >= b_a[j].minimum_a_r ){
					b_a[j].boy_st = "commited";
					
					writer.println(g_a[i].girl_name+" is commited with "+b_a[j].boy_name);
					break;
				}
			}
		}
		writer.close();
}
}
