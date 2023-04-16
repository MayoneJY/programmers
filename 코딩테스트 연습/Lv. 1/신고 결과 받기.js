function solution(id_list, report, k){
    var answer = [];
    var reporter = [];
    var sendMail = [];
    var id;
    for(var i = 0; i < id_list.length; i++){
        reporter[i] = [id_list[i]];
        answer[i] = 0;
    }
    for(var i = 0; i < report.length; i++){
        id = report[i].split(' ');
        for(var j = 0; j < reporter.length; j++){
            if(reporter[j][0] == id[1]){
                var checkId = false;
                for(var p = 1; p < reporter[j].length; p++){
                    if(reporter[j][p] == id[0]) checkId = true;
                }
                if(!checkId){
                    reporter[j][reporter[j].length] = id[0];
                }
            }
        }
    }


    for(var i = 0; i < reporter.length; i++){
        if(reporter[i].length - 1 >= k){
            for(var j = 1; j < reporter[i].length; j++){
                sendMail[sendMail.length] = reporter[i][j];
            }
        }
    }
    for(var i = 0; i < sendMail.length; i++){
        for(var j = 0; j < reporter.length; j++){
            if(reporter[j][0] == sendMail[i]){
                answer[j] += 1;
            }
        }
    }
    return answer;
}
