p1, p2, p3, x1, x2, x3= map(int, input().split())

flag= False
for i in range(1, 300*(p1*p2*p3)+1):
    if i%p1==x1 and i%p2==x2 and i%p3==x3:
        print(i)
        flag= True
        break
if not flag:
    print(-1)