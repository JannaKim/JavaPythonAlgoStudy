# 주로 최소비용신장트리를 구성할때 사용한다
# 최소비용신장트리 : 가장 적은 비용으로 모든 노드를 연결시킨다
# 간선수 = 노드수 - 1
# 간선을 비용이 낮은 순으로 그래프에 포함시킨다
# 싸이클이 형성되지 않아야 한다
# 모든 간선들을 비용의 오름차순으로 정렬
# 싸이클을 형성하면 포함시키지 않는다
# 싸이클 확인은 Union-Find 이용

from operator import itemgetter

def getParent(parent, x):
    if parent[x] == x: return x
    else: parent[x] = getParent(parent, parent[x])
    return parent[x]

def unionParent(parent, a, b):
    a = getParent(parent, a)
    b = getParent(parent, b)
    if(a > b): parent[a] = b
    else: parent[b] = a

class Edge:
    node =[0, 0]
    distance = 0
    def __init__(self, a, b, distance):
        self.node[0] = a
        self.node[1] = b
        self.distance = distance
    
