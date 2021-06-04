A, P = input().split()

nums = [int(A)]
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

print(nums)
print(cnt)
# solved it