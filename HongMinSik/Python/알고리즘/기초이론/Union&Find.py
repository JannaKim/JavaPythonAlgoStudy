def getParent(parent, x): # getParent함수는 노드의 부모를 찾는 함수이다. 노드의 부모는 자기 자신일수도, 아닐수도 있다. 
    if(parent[x] == x): # 노드의 부모가 자기 자신이면 자기 자신을 리턴하고,
        return x
    parent[x] = getParent(parent, parent[x]) # 노드의 부모가 자기 자신이 아님. 현재 노드의 부모가 최상위 부모가 아닐수도 있음. 

def unionParent(parent, a, b):
    a = getParent(parent, a)
    b = getParent(parent, b)
    if(a < b): parent[b] = a
    else: parent[a] = b

def findParent(parent, a, b):
    a = getParent(parent, a)
    b = getParent(parent, b)
    if(a == b): return 1
    else: return 0


parent = [i for i in range(11)]
unionParent(parent, 1, 2)
unionParent(parent, 2, 3)
unionParent(parent, 3, 4)
unionParent(parent, 5, 6)
unionParent(parent, 6, 7)
unionParent(parent, 7, 8)
print("1과 5는 연결 되어있나여? " + findParent(parent, 1, 5))
unionParent(parent, 1, 5)
print("1과 5는 연결 되어있나여? " + findParent(parent, 1, 5))