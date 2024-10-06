def solution(n):
    string = str(n)
    add = 0
    for i in range(len(string)):
        add += int(string[i])
    return add