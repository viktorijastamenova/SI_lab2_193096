public class SILab2 {


    public class SILab2{
        public List<Integer> function(List<Time> timesList) { //1
            List<Integer> result = new ArrayList<>(); //2
            for (int i = 0; i < timesList.size(); i++) { //3
                int hr = timesList.get(i).getHours(); //4
                int min = timesList.get(i).getMinutes(); //5
                int sec = timesList.get(i).getSeconds(); //6
                if (hr < 0 || hr > 24){ //7
                    if (hr < 0){ //8
                        throw new RuntimeException("The hours are smaller than the minimum"); //9
                    } //10
                    else { //11
                        throw new RuntimeException("The hours are grater than the maximum"); //12
                    } //13
                } //14
                else if (hr < 24) { //15
                    if (min < 0 || min > 59) //16
                        throw new RuntimeException("The minutes are not valid!");//17
                    else {//18
                        if (sec >= 0 && sec <= 59) //19
                            result.add(hr * 3600 + min * 60 + sec); //20
                        else //21
                            throw new RuntimeException("The seconds are not valid"); //22
                    } //23
                } //24
                else if (hr == 24 && min == 0 && sec == 0) { //25
                    result.add(hr * 3600 + min * 60 + sec); //26
                } //27
                else { //28
                    throw new RuntimeException("The time is greater than the maximum"); //29
                } //30
            } //31
            return result; //32
        } //33
    } //34


}
