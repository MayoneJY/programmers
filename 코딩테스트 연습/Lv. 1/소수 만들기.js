function solution(nums) {
    var answer = 0;
    
    
    for(var i = 0; i < nums.length; i++){
        for(var j = i+1; j < nums.length; j++){
            for(var k = j+1; k < nums.length; k++){
                var num = nums[i] + nums[j] + nums[k];
                var checkNum = true;
                for(var l = 2 ; l * l <= num; l++) {
                    if(num%l == 0) {
                        checkNum = false;
                        break;
                    }
                }
                if(checkNum){
                    answer += 1;    
                }
            }
        }
    }
    console.log(answer);
    return answer;
}