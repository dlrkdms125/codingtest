def recursive(n):
    if n < 2:
        answer = 1
    else: 
        answer = recursive(n-1)*n
    return answer    
       
print(recursive(int(input())))


    