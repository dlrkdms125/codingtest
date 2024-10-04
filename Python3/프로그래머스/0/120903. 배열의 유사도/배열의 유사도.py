def solution(s1, s2):
    answer = 0
    for words in s2:
        for word in s1:
            if words == word:
                answer += 1
    return answer