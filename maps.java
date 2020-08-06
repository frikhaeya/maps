package eya;

import java.util.*;

public class maps {

	public static void main(String[] args) {
		
		String[] MySong = 
			{ "nom" , "Shape of you",
	          "Artist" , "Ed Shreen",
	         "Year_Released" , "2017",
	           "Genre" , "POP" ,
	         "Duration" , "4.30",
	            "album" , "÷",
	            "award" , " Grammy Award de la meilleure prestation pop solo",
	           "disponibilite" , "Deezer"	
			};
		
		String[] attributes = new String[MySong.length/2];
				
		String[] features = new String[MySong.length/2];
				
		for (int i=0; i < MySong.length; i++) {
			if(i%2==0) {
				attributes[i/2]=MySong[i];
			}
			else {
				features[i/2]=MySong[i];
			}
		}
		
		Map<String,String> SongDesc = new HashMap<>();
		
		for (int i=0; i < attributes.length; i++) {
			SongDesc.put(attributes[i], features[i]);
		}
		
		for (int i=0; i < attributes.length; i++) {
			System.out.print(attributes[i]+": ");
			System.out.println(SongDesc.get(attributes[i]));
		}

	}

}
