dartResult = input()

def solution(dartResult):
    a = list(dartResult)
    answer = []
    b = []
    for i in range(len(a)):
        if a[i] == '1' and a[i+1] == '0':
            b.append('10')
            continue
        elif a[i] == '0' and a[i-1] == '1':
            continue
        else:
            b.append(a[i])
    return b


print(solution(dartResult))