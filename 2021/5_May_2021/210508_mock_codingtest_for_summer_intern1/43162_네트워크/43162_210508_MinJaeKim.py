def solution(n, computers):
    
    parent= list(range(n))
    def find(u):
        if parent[u]==u:
            return u
        else:
            return find(parent[u])
    
    def union(u, v):
        r1= find(u)
        r2= find(v)
        parent[r1]=r2
        
    for i in range(n):
        for j in range(i+1,n):
            if computers[i][j]:
                union(i,j)
    ans=set()
    for i in range(n):
        parent[i]=find(i)
        ans.add(parent[i])
    print(parent)
                
        
                
    answer = 0
    return len(ans)