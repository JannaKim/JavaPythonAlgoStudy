par= []
def find(v):
    if par[v]==v:
        return v
    else:
        par[v]=find(par[v])
        return par[v]
def union(u,v):
    r1=find(u)
    r2=find(v)
    if r1<r2:
        par[r2]=r1
    else:
        par[r1]=r2
def solution(n, costs):
    global par
    par= list(range(n))
    ans = 0
    costs.sort(key= lambda x:x[2])

    for a, b, c in costs:
        par[a]=find(a)
        par[b]=find(b)
        if par[a]!=par[b]:
            ans+=c
            union(a,b)
    return ans