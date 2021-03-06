import sys
input=sys.stdin.readline
N, M = map(int, input().split()) #height, width
if N==1:
    cnt = 1
elif N==2:
    cnt = min(4, (M-1)//2+1)
elif M<7: #N은 3부터
    cnt = min(4, M)
else:
    cnt = (2+(M-5))+1
print(cnt)
# (+2, +1), (+1, +2), (-1, +2), (-2, +1)
# N=1, M=1: 1
# N=1, M=?: 1 위/아래로 움직일 수 없음
# N=2, M=1: 1
# N=2, M=2: 1
# N=2, M=3, 4: (+1, +2), (-1, +2) 2
# N=2, M=5, 6: 3
# N=2, M=7,: 4 # +-2 안 되므로 이동횟수 3까지, 방문칸수 최대 4
# N=3, M=2: (+2, +1), (-2, +1) 2
# N=3, M=3: 위아래로 움직이는 칸 수 같은 걸로해서 2번 이동 가능, 방문 칸수 3
# N=3, M=4~6: 4가지 불가능, 3번 이동, 칸 수 4
# N >=3, M>=7: 오른쪽으로 이동하는 칸이 1이어야 유리함. 
# 모두 한 번씩은 사용해서 이동해야하므로 오른쪽 2칸이동인 것 2회 + (M-처음있던칸-앞에서이동한4칸==>M-5)