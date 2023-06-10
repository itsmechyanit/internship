public class DateAndTime {
    static String findDay(int day, int month, int year){
        //This question boils down to finding out the total number of days passed starting 1 jan 2000
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
        int totalDays = 0;
        //count the number of days from the year field from 1st january 2000
        for(int i = 2000; i < year; i++){
            if(isLeapYear(i)){
                totalDays = totalDays + 366; 
            }
            else{
                totalDays = totalDays + 365; 
            }
            
        }
        //count the number of days from the month field starting 1st january
        for(int i = 1; i < month; i++){
            //if the month is bigger than feb and it is a leap year
            if(i == 2 && isLeapYear(year)){
                totalDays = totalDays + months[i - 1] + 1;
            }

            else{
                totalDays = totalDays + months[i - 1];
            }
            
            
        }
        //add the total number of days from the date field
        totalDays = totalDays + day;
        return dayOfWeek[(totalDays - 1) % 7];
    }
    //helper function to check if the given year is a leapyear or not
    static boolean isLeapYear(int year){
        boolean leap = false;
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {
      
              // if year is divided by 400
              // then it is a leap year
              if (year % 400 == 0)
                leap = true;
              else
                leap = false;
            }
            
            // if the year is not century
            else
              leap = true;
        }
          
        else
            leap = false;
        return leap;
    }

    public static void main(String[] args) {
        System.out.println("Testing out the first test case");
        int date1 = 17;
        int month1 = 03;
        int year1 = 2017;
        System.out.println("The day is " + findDay(date1, month1, year1));
        System.out.println("Testing out the second test case");
        int date2 = 29;
        int month2 = 11;
        int year2 = 2021;
        System.out.println("The day is " + findDay(date2, month2, year2));
    }
}
