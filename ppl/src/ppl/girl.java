package ppl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
public class girl {

    int budget;
    int intell;
    int attractive;
    String girl_name;
    String girl_st;  
    
    
    public girl(int budget,int intell,int attractive,String girl_st,String girl_name)
    {
        this.budget = budget;
        this.intell = intell;
        this.attractive = attractive;
        this.girl_st= girl_st;
        this.girl_name = girl_name;
    }


public static void main(String args[]){
		girl amit =new girl(5,1,6,"single","amit");
		System.out.println(amit.budget+"  "+amit.intell+amit.attractive+amit.girl_st+"  "+amit.girl_name);
	}

}
