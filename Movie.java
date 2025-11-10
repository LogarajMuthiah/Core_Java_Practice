package CollectionsFramework;

import java.util.*;
public class Movie implements Comparable<Movie>{
	
	String movieName;
	float movieRating;

	Movie(String movieName){
		this.movieName=movieName;
	}
	
	Movie(String tempnNewMoviename, float newRating){
		this.movieName=tempnNewMoviename;
		this.movieRating=newRating;
		
	}
	
	@Override
	public int compareTo(Movie other) {
		// Note: Name check is only for duplicate detection. 
		// TreeSet will primarily order movies by rating.
		int compareName=this.movieName.compareTo(other.movieName);
		
		if(compareName !=0) {
			
			return Float.compare(this.movieRating, other.movieRating);
			
		}else {
			return compareName;
		}
		
	}
	
	@Override
	public String toString() {
		return this.movieName+"  --  Rating:"+this.movieRating;
	}
	
	
 static class MovieManager{
	 
	 Scanner sc;
	 TreeSet<Movie> moviesList;
	 
	 
	 MovieManager(){
		 sc=new Scanner(System.in);
		 moviesList=new TreeSet<>();
	 }
	 
	 
	 
	 
	 void showOptions() {
		 System.out.println("\n==============================");
		    System.out.println("   🎞️  Movie Manager System");
		    System.out.println("==============================");
		    System.out.println("1. Add a new movie");
		    System.out.println("2. Display all movies");
		    System.out.println("3. Remove a movie");
		    System.out.println("4. Search for a movie");
		    System.out.println("5. Show top-rated movie");
		    System.out.println("6. Exit");
		    System.out.println("==============================");
		    System.out.print("Enter your choice: ");
	 }
	 
	 int getChoiceFromUser() {
		 return sc.nextInt();
	 }
	 
	 String getMovieNameFromUser() {
		 sc.nextLine();
		 return sc.nextLine().trim().toUpperCase();
	 }
	 
	 float getRatingFromUser() {
		 return sc.nextFloat();
	 }
	 
	 void showMoviesList() {
		 int i=0;
		 if(!moviesList.isEmpty()) {
		 for(Movie List:moviesList) {
			 System.out.println(i+1+". "+List);
			 i++;
		 }
		 }else {
			System.out.println("No movies in the list");
		 }
	 }

	 
	 
	 void run() {
		 
		 while(true) {
		 showOptions();
		 int choice=getChoiceFromUser();
		 
		 switch(choice) {
		 
		 case 1:{
			 System.out.print("Enter the movie name: "); 
			 
			 String newMovieName=getMovieNameFromUser();
			 
			 System.out.print("Enter the movie rating (0.0 - 10.0): ");
			 
			 float newRating=getRatingFromUser();
			 
			 if(newRating >=0.0 && newRating <= 10.00) {
				 
				 
				Movie tempnNewMoviename=new Movie(newMovieName);
				
			   if(!moviesList.contains(tempnNewMoviename)) {
				   
				   Movie tempNewMovieNameRating=new Movie(newMovieName,newRating);
				   
				   moviesList.add(tempNewMovieNameRating);
				   
				   System.out.println("Movie added in the list");
				   
			   }else {
				   
				   System.out.println("Movie name already exist in the list");
			   }
				 
			 }else {
				 System.out.println("Enter a valid rating - from 0.00 to 10.00");
			 }	break; }
		 
		 case 2:{
			 System.out.println(" List of all movies:");
			 System.out.println("------------------------------");
			 
			 showMoviesList();
			 break;
		 }
		 case 3:{
			 System.out.print("Enter the movie name to remove: ");
			 
			 String removeMovieName=getMovieNameFromUser();
			 
			 Movie removeMovieNameobj=new Movie(removeMovieName);
			 
			 if(moviesList.contains(removeMovieNameobj)) {
				 moviesList.remove(removeMovieNameobj);
				 System.out.println("Movie removed from this list");
			 }else {
				 System.out.println("Movie is not in the list");
				 
			 }break; }
		 case 4:{
			 System.out.print("Search any movie: ");
			 
			 String searchMovieName=getMovieNameFromUser();
			 Movie searchMovieNameobj=new Movie(searchMovieName);
			 
			 if(moviesList.contains(searchMovieNameobj)) {
				 System.out.println("Searched for: "+moviesList.ceiling(searchMovieNameobj));
				 
			 }else {
				 System.out.println("Movie is not in the list");
			 }break; }
		 case 5: {
			    if (moviesList.isEmpty()) {
			        System.out.println("No movies in the list!");
			    } else {
			        Movie topRated = null;
			        for (Movie m : moviesList) {
			            if (topRated == null || m.movieRating > topRated.movieRating) {
			                topRated = m;
			            }
			        }
			        System.out.println("Top rated movie in your list: " + topRated);
			        System.out.println("------------------------------");
			    }
			    break;
			}
		 case 6:{
			 System.out.println("Thanks! exited");
		 }
		 default: {
			 System.out.println("Enter a valid input from - 0.0 - 10.0");
		 }
			 
		
			 
			 
		
		 
		 }
		 
		 }
	 }
	 
	 
	 
	 

		public static void main(String args[]) {
			
			MovieManager object=new MovieManager();
			object.run();
			
		}
	}
	
	
}
