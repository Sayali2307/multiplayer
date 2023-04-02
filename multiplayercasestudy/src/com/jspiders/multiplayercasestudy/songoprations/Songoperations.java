package com.jspiders.multiplayercasestudy.songoprations;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.multiplayercasestudy.entity1.Song;

public class Songoperations {

	 ArrayList<Song>playList=new ArrayList<Song>();
	    Scanner scanner=new Scanner(System.in);
	    
	     Song song=new Song();
	     static int var=0;
	         public void addSong()
	     {
	        	
	    	 int a =scanner.nextInt();
	    	 for(int i=1;i<=a;i++)
	    	 {
	    		 playList.add(new Song());
	    		 System.out.println("Enter the id of the song");
	    		 int id=scanner.nextInt();
	    		 playList.get(var).setId(id);
	    		 System.out.println("enter the name of the song");
	    		 String songName=scanner.next();
	    		 playList.get(var).setSongName(songName);
	    		 System.out.println("Enter the singer of the song");
	    		 String singer=scanner.next();
	    		 playList.get(var).setSinger(singer);
	    		 System.out.println("enter the length of song:");
	    		 double length=scanner.nextDouble();
	    		  playList.get(var).setDuration(length);
	    		 System.out.println("Enter te lyricist of te song");
	    		 String Name=scanner.next();
	    		 playList.get(var).setLyricist(Name);  
	    		 var++;
	    		 System.out.println(playList.size()+"Song added successfully");
	    	 }
	     }
	         public void viewAllSong()
	         {
	        	 if (playList.isEmpty()==true) {
					 System.out.println("There is no song added in the playList"+"Add songs then you will get songList");
					 addSong();
				}
	        	 else {
	        		 for(Song song1:playList) {
	        			 System.out.println(song1.getSongName());
	        		 }
	        	 }
	         }
	         
	         public void removeSong()
	         {
	        	if (playList.isEmpty()) {
					
	        		System.out.println("Add song then remove");
	        		addSong();
				} 
	        	System.out.println("Select song to remove");
	        	viewAllSong();
	        	int removeId = scanner.nextInt();
	        	System.out.println(playList.get(removeId-1).getSongName()+"removed successfully");
	        	playList.remove(removeId-1);
	         }
	         public void playSong()
	         {
	        	 if (playList.isEmpty()) {
					
	        		 System.out.println("Add song then play");
	        		 addSong();
				}
	        	 System.out.println("playing all songs");
	        	 for(Song song:playList)
	        	 {
	        		 System.out.println(song.getSongName());
	        	 }
	         }
	         public void playRandomSong() {
	        	 if (playList.isEmpty()) {
	        		 System.out.println("first add songs then play....");
					addSong();
				}
	        	 System.out.println("playing random songs");
	        	 double number=Math.random();
	        	 int random=(int)(number*10)+1;
	        	 if (random>=playList.size()) {
	        		 random=1;
					
				}
	        	 System.out.println("playing song"+playList.get(random).getSongName());
	      
	         }
	         public void playSpecificSong() {
	        	 if (playList.isEmpty()) {
					System.out.println("Add songs then play...");
					addSong();
				}
	        	 System.out.println("select song to play...");
	        	 viewAllSong();
	        	 int play=scanner.nextInt();
	        	 System.out.println("play song..."+playList.get(play-1).getSongName());
	         }
	         public void editPlaylist()
	         {
	        	 if (playList.isEmpty()) {
	        		 System.out.println("Add songs then edit a song...");
	        		 addSong();
					
				}
	        	 System.out.println("select song to edit");
	        	 viewAllSong();
	        	 int edit=scanner.nextInt();
	        	 playList.remove(edit-1);
	        	 System.out.println("Enter the new id for song....");
	        	 song.setId(scanner.nextInt());
	        	 System.out.println("enter the new name for song...");
	        	 song.setSongName(scanner.next());
	        	 System.out.println("enter the new movie name for song..");
	        	 song.setMoviealbum(scanner.next());
	        	 System.out.println("enter the new length for song");
	        	 song.setDuration(scanner.nextDouble());
	        	 System.out.println("enter the new lyrist name for song..");
	        	 song.setLyricist(scanner.next());
	        	 playList.add(edit-1,song);
	        	 System.out.println(playList.get(edit-1).getSongName()+"song updated details added successfully");
	         }}
