A, P = input().split() #문자열로 받아서 슬라이싱하자

nums = []
P = int(P)

sum = 0
index = 0
while(True):
    for i in range(len(A)):
        sum += int(A[i]) ** P
    if sum not in nums:
        nums.append(sum)
        A = str(sum)
        sum = 0
    else:
        index = nums.index(sum)
        break
    
cnt = 0
for cnt in range(index):
    cnt += 1

print(cnt + 1)