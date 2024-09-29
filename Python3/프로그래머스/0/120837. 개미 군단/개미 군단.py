def solution(hp):
    answer = 0
    n = 0
    k = 0
    t = 0
    n = hp//5
    k = (hp-n*5)//3
    t = hp-n*5-k*3
    answer = n+k+t
    return answer