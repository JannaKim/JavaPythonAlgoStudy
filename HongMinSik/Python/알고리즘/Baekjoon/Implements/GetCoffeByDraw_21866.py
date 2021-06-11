def judge(score, nine):
    result = ''
    for i in range(9):
        if(score[i] < int(nine[i])): 
            result = 'hacker'
            return result
    
    total = 0 
    for i in range(9):
        total += int(nine[i])
    
    if(total < 100):
        result = 'none'
        return result

    result = 'draw'
    return result

score = [100, 100, 200, 200, 300, 300, 400, 400, 500]

nine = list(input().split())

print(judge(score, nine))