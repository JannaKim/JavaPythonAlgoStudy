def solution(numbers, hand):
    # y좌표: (숫자-1)//3, x좌표: (숫자-1)%3
    answer = ''
    nowL = 9
    nowR = 11
    
    # numbers[n] 일반항  
    for i in range(len(numbers)):
        nexnum = numbers[i]-1
        if nexnum == -1:
            nexnum = 10
        disL = abs(nowL%3-nexnum%3)+abs(nowL//3-nexnum//3)
        disR = abs(nowR%3-nexnum%3)+abs(nowR//3-nexnum//3)
        if nexnum in [0, 3, 6]:
            answer+='L'
            nowL = nexnum

        elif nexnum in [2, 5, 8]:
            answer+='R'
            nowR = nexnum

        else:
            if disL<disR:
                answer+='L'
                nowL = nexnum
            elif disL>disR:
                answer+='R'
                nowR = nexnum
            else:
                if hand == "left":
                    answer+='L'
                    nowL = nexnum
                else: 
                    answer+='R'
                    nowR = nexnum
    
    return answer