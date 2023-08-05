import java.util.Calendar;

public class FindDay {
  static String findDay(int Day, int Month, int Year){
    //Code Here
    //get the calendar instance
    Calendar cal = Calendar.getInstance();
    //set the date on the calendar instance
    //since month starts at 0 we need to subtract it
    cal.set(Year,Month-1,Day);
    //get the day of the week
    int value = cal.get(Calendar.DAY_OF_WEEK);
    //switch case to match the day of the week with the name of the day of the week
    String day="";
    switch(value){
      case 1:
        day="SUNDAY";
        break;
      case 2:
        day="MONDAY";
        break;
      case 3:
        day="TUESDAY";
      break;
      case 4:
        day="WEDNESDAY";
        break;
      case 5:
        day="THURSDAY";
        break;
      case 6:
        day="FRIDAY";
        break;
      case 7:
        day="SATURDAY";
      break;

    }
    return day;
  } 

  public static void main(String[] args) {
    System.out.println("Testing the first test case");
    int day1 = 17;
    int month1 = 03;
    int year1 = 2017;
    System.out.println("The day of the week is: " +findDay(day1, month1, year1));

    System.out.println("Testing the Second test case");
    int day2 = 29;
    int month2 = 11;
    int year2 = 2021;
    System.out.println("The day of the week is: " +findDay(day2, month2, year2));
  }

}

