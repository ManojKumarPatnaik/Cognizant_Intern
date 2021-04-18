package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb =new Scanner(System.in);
        Bazaar bz=new Bazaar();
         bz.setPolicyMap(new TreeMap<>());
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		int n=Integer.parseInt(kb.nextLine());
		for(int i=0;i<n;i++){
		    System.out.println("Enter the Policy ID");
		    int id=Integer.parseInt(kb.nextLine());
		    System.out.println("Enter the Policy Name");
		    String value=kb.nextLine();
		    bz.addPolicyDetails(id,value);
		}
		 TreeMap<Integer,String> sorted = new TreeMap<>(bz.getPolicyMap());
		 for(Map.Entry<Integer,String> en:sorted.entrySet()){
		     System.out.println(en.getKey()+" "+en.getValue());
		 }
		 System.out.println("Enter the policy type to be searched");
		 String ns=kb.nextLine();
		 List<Integer> ls=bz.searchBasedOnPolicyType(ns);
		 for(int l:ls){
		     System.out.println(l);
		 }

	}

}