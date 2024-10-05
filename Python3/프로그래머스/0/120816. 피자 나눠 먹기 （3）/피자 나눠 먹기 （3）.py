def solution(slice, n):
    pizza = 0
    answer = 0
    if n%slice == 0:
        pizza = n//slice
    else:
        pizza = n//slice +1
    return pizza