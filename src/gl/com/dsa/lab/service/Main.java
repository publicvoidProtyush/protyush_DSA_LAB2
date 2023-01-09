package gl.com.dsa.lab.service;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		SortDsc sortdsc = new SortDsc();
		
		NotesCount notesCount = new NotesCount();
		
		System.out.println("Enter the size of currency denominatios");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size; i++) {
			  notes[i]  = sc.nextInt();
		}
	      System.out.println("Enter the amount you want to pay");
	      int amount =sc.nextInt();
	      sortdsc.sort(notes,0,notes.length-1);
	      notesCount.notesCountImplementatin(notes, amount);
	      
	      

	}

}
