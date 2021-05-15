def draw(length, row, col):
    for i in range(0,length):
        if i==0 or i==length-1:
            for j in range(0,length):
                arr[row+i][col+j] = "*"
        else:
            arr[row+i][col] = "*"
            arr[row+i][col+length-1] = "*"

def square(n, row, col):
    draw(n*4-3, row, col)
    if n==1:
        return
    else:
        square(n-1, row+2, col+2)

N = int(input())
cnt = 4*N-3
arr = [[" " for col in range(cnt)] for row in range(cnt)]
square(N, 0, 0)
for i in arr:
    for j in i:
        print(j, end='')
    print()