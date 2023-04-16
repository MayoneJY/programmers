class Solution {
    public boolean isDigit(char a){
        return false;
    }
    
    public boolean isDigit(int a){
        return true;
    }
    
    public int solution(String s) {
        String answer = "";
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                answer += s.charAt(i);
                continue;
            }
            for(int j = 0; j < 10; j++){
                int checkCharCount = 0;
                for(int k = 0; k < numbers[j].length(); k++){
                    if(i+k > s.length() - 1)
                        break;
                    if(s.charAt(i+k) == numbers[j].charAt(k))
                        checkCharCount++;
                    else
                        break;
                }
                if(checkCharCount == numbers[j].length()){
                    answer += j;
                    i += numbers[j].length()-1;
                    break;
                }
            }
        }
        //System.out.println(answer);
        return Integer.parseInt(answer);
    }
}