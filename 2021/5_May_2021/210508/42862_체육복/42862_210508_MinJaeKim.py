def solution(n, lost, reserve):
    stock= [True]+[True]*n
    for el in lost:
        stock[el]=False
    dic={}
    for el in reserve:
        if not stock[el]:
            stock[el]=True
            dic[el]=True
    for el in reserve:
        if el in dic:
            continue
        if el-1>=1 and not stock[el-1]:
            stock[el-1]=True
            continue
        if el+1<=n and not stock[el+1] :
            stock[el+1]=True
            
    answer = 0
            
    for el in stock:
        if el:
            answer+=1
            
    
    return answer-1