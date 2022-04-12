package rebuildBullsandcows;

public class Validation {
    public Boolean validateNum(int num) {
        if(num <= 9 && num >=1){
            return true;
        }
        return false;
    }
}
