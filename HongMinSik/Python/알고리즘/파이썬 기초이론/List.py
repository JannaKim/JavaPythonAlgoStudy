arr = [i for i in range(11)] # 선언과 동시에 크기 설정 (크기가 10인 리스트를 만들어 0~10까지의 값으로 초기화 하는 방법)


for i in arr:
    print(i)

# 2차원 리스트
N = 4

list = [i for i in range(N)]
for i in range(N):
    list[i] = map(int, input().split())

for i in list:
    for j in i:
        print(j, end = ' ')
    print()

