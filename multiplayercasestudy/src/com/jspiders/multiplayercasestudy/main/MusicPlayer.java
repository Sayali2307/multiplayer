package com.jspiders.multiplayercasestudy.main;

import java.util.Scanner;

import com.jspiders.multiplayercasestudy.songoprations.Songoperations;

public class MusicPlayer {

	private static boolean loop=true;
	private static  int Choice;
	 public static Scanner scanner=new Scanner(System.in);
	  static Songoperations songOperation=new Songoperations();
	  
	  public static void main(String[] args) {
		 while(loop) {
		  musicplayer();
		 }
	  }
	  public  static void  musicplayer() {
		     
				System.out.println("*********Menu*********");
				System.out.println("1.Add/Remove song\n 2.Play Song\n 3.Edit song\n 4.Exit");
				int choice=scanner.nextInt();
		      			switch (choice) {
				case 1:
					   System.out.println("1.Add a song\n 2.Remove a song\n 3.Go back");
					   int choice1=scanner.nextInt();			   
					   
					switch (choice1) {
					case 1:
						
						System.out.println("how many song you want to be added:");
						songOperation.addSong();
						    					break;
						
					 case 2:
						 songOperation.removeSong();
						  break;
						  
					 case 3:    
						 return;			
					}
					break;
				case 2:
					System.out.println("1.Play a song\n 2.shuffle\n 3.choose a song\n 4.Go back");
					int choice2=scanner.nextInt();	
					switch (choice2) {
					case 1:
						songOperation.playSong();
						break;
					case 2:
						songOperation.playRandomSong();
						break;
					case 3:
						songOperation.playSpecificSong();
						break;
					case 4:
						return;
						

					}
					break;
				case 3:
					System.out.println("1.Display all song\n 2.Go back");
					int choice3=scanner.nextInt();	
					switch (choice3) {
					case 1:
						 songOperation.editPlaylist();
						break;
						
					case 2:
						return;

					
					
					}
					break;
				case 4:
					System.out.println("Thank you...!!");
					loop=false;
					break;
					

				default:
					System.out.println("invalid choice try again");
					break;
				}
				
			}
	public static int getChoice() {
		return Choice;
	}
	public static void setChoice(int choice) {
		Choice = choice;
	}}
