/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

/**
 *
 * @author pooja
 */
public class boy {
    
    int budget;
    int minimum_a_r;
    int intell;
    int attractive;
    String boy_name;
    String boy_st;
    
    public boy(int budget,int minimum_a_r,int intell,int attractive,String boy_st,String boy_name)
    {
        this.budget = budget;
        this.minimum_a_r = minimum_a_r;
        this.intell = intell;
        this.attractive = attractive;
        this.boy_st= boy_st;
        this.boy_name = boy_name;
    }

/*public static void main(String args[]){
		boy amit =new boy(5,1,4,6,"single","amit");
		System.out.println(amit.budget+""+amit.minimum_a_r+amit.intell+amit.attractive+amit.boy_st+amit.boy_name);
	}*/

}
