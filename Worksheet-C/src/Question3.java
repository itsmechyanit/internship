import java.util.Scanner;

class OrganizationRating{
  //This program will take the organization name and rating from the user
  //ratings will be out of 5
  private String name;
  private double rating;
  //constructor
  OrganizationRating(String name, double rating){
    this.name = name;
    this.rating = rating;
  }
  //method to get the name of the organization
  public String getName(){
    return this.name;
  }
  //method to get the Rating of an organization
  public double getRating(){
    return this.rating;
  }
  //This method is used for setting the name of the organization
  //We are also doing some data validation in this case
  //The name cannot be less than 5 characters
  public void setName(String name){
    if(name.length() < 5){
      System.out.println("Name cannot be less than 5 characters");
      return;
    }
    this.name = name;
  }
    //This method is used for setting the rating of the organization
  //We are also doing some data validation in this case
  //The rating provided by the user has to be between 0 and 5 (Both inclusive)
    public void setRating(double rating){
    if(rating >= 5 || rating < 0){
      System.out.println("Rating value has to be between 0 and 5");
      return;
    }
    this.rating = rating;
  }

}

public class Question3{
  public static void main(String[] args) {
    System.out.println("Please enter an organization name");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Please enter rating for an organization");
    double rating = sc.nextDouble();
    OrganizationRating or = new OrganizationRating(name, rating);
    System.out.println("The name of the organization is: " + or.getName());
    System.out.println("The rating of the organization is: " + or.getRating());
    sc.close();

  }
}