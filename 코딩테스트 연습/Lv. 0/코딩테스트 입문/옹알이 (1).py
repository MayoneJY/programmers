def solution(babbling):
    answer = 0
    for txt in babbling:
        temp = 0
        temp += txt.count('aya') * 3
        temp += txt.count('ye') * 2
        temp += txt.count('woo') * 3
        temp += txt.count('ma') * 2
        if len(txt) == temp:
            print(txt, len(txt), temp)
            answer += 1
    return answer