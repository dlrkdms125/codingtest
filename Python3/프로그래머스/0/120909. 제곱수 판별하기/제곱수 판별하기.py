import math
def solution(n):
    k = int(math.sqrt(n)) 
    if (k ** 2) == n: return 1
    else: return 2