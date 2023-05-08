public class DayOfTheWeek {

    String[] dayOfWeek = {"Friday","Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
    //maintain a month array
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public String dayOfTheWeek(int day, int month, int year) {
        //This problem revolves around finding out the number number of days passed since ist jan 1971
        int totalDays = 0;
        //start iterating from 1971
        for(int i = 1971; i < year; i++){
            //if it is a leap year then add 366
            if(i % 4 == 0){
               totalDays = totalDays + 366;

                
            }
            
            else{
               totalDays = totalDays + 365;
            }
        }
        //start iterating the months from january
        for(int i = 1; i < month; i++){
            //if the month is bigger than feb and it is a leap year
            if(month > 2){
                if(year % 4 == 0){
                    if(i == 2){
                        //2100 is not a leap year
                        if(year == 2100){
                            totalDays = totalDays + months[i - 1];
                        }
                        
                        else{
                            totalDays = totalDays + months[i - 1] + 1;
                        }
                        
                    }
                    else{
                        totalDays = totalDays + months[i - 1];
                    }
                    
                }
                
                else{
                   totalDays = totalDays + months[i - 1]; 
                }
            }

            else{
                totalDays = totalDays + months[i - 1];
            }
            
        }

        totalDays = totalDays + day;
        //return the index from the dayOfWeek array
        return dayOfWeek[(totalDays - 1) % 7];
    }
    
}
