package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int c=scan.nextInt();
        
        int[] a = new int[c];
        
        for(int i=0; i < c;i++){
            a[i] =scan.nextInt(); 
        }
         int b=0;
        for(int i=0;i<c;i++){
            int sum=0;
            for(int k=i;k<c;k++){
                sum = a[k]+sum;
                if(sum<0){
                   b++; 
                }
            }
        }
        System.out.println(b);
	}    

}
