def solution(money):
    answer = []
    n = 0
    k = 0
    n = money//5500
    k = money - n*5500
    answer = [n,k]
    return answer