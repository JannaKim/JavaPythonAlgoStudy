def solution(answers):
    one=[1,2,3,4,5]
    two=[2,1,2,3,2,4,2,5]
    three=[3,3,1,1,2,2,4,4,5,5]
    a= 5
    b= 8
    c= 10
    n= len(answers)
    answer = [0]*3
    for i in range(n):
        if one[i%a]==answers[i]:
            answer[0]+=1
        if two[i%b]==answers[i]:
            answer[1]+=1
        if three[i%c]==answers[i]:
            answer[2]+=1
    
    ans=[]
    mx= max(answer)
    for i in range(3):
        if answer[i]==mx:
            ans.append(i+1)
    
    return ans