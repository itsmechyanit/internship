public class DayOfTheYear {
    public int dayOfYear(String date) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31};
        //split the date based on -
        String[] parse = date.split("-");
        //First entry in the parsed array is Year
        int year = Integer.parseInt(parse[0]);
        //Second entry in the parsed array is Month
        int month = Integer.parseInt(parse[1]);
        //Third entry in the parsed array is day
        int day = Integer.parseInt(parse[2]);
        //calculate the total number of days in a given year
        int total = 0;
        for(int i = 0; i < month - 1 ;i++){
            total = total + days[i];
        }
        
        //if the year is a leap year and the given month is greater than feb
        if(year % 4 == 0 && year % 100 != 0){
            if(month > 2){
                return total + day + 1;
            }
            
            //There won't be any impact even if it is a leap year
            else{
                return total + day;
            }
            
        }
        
        if(year % 400 == 0){
            
             if(month > 2){
                return total + day + 1;
            }
            
            else{
                return total + day;
            }
        }
        
        return total + day;
    }
}
