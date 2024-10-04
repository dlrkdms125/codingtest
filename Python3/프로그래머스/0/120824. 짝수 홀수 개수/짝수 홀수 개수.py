def solution(num_list):
    k = 0
    t = 0
    answer = [k,t] 
    for i in num_list:
        if i%2 == 0:
            k +=1
        else:
            t +=1
        answer[0] = k 
        answer[1] = t
    return answer
