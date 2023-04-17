import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String> uid = new HashMap<String,String>();
        String[][] messages = new String[record.length][3];
        String[] answer;
        for(int i = 0; i < record.length; i++){
            messages[i] = record[i].split(" ");
            if(messages[i][0].equals("Enter")){
                if(!uid.containsKey(messages[i][1]))
                    uid.put(messages[i][1], messages[i][2]);
                else
                    uid.replace(messages[i][1], messages[i][2]);
            }
            else if(messages[i][0].equals("Change")){
                if(uid.containsKey(messages[i][1]))
                    uid.replace(messages[i][1], messages[i][2]);
            }
        }
    
        List<String> arr = new ArrayList<>();
        for(int i = 0; i < messages.length; i++){
            if(messages[i][0].equals("Enter"))
                arr.add(uid.get(messages[i][1]) + "님이 들어왔습니다.");
            else if(messages[i][0].equals("Leave"))
                arr.add(uid.get(messages[i][1]) + "님이 나갔습니다.");
        }
        answer = arr.toArray(new String[0]);
        return answer;
    }
}