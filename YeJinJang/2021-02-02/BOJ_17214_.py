fx = input()
gx = ""
order = 0 #차수
coef = 0 #계수
const = 0 #상수
stop = 0
for i in range(len(fx)): #일차식인지 판별
    if fx[i] =='x':
        order = 1
        stop = i
        break
if order == 0: #상수로만 이루어진 식
    const = int(fx)
    if const == 0:
        gx = "W"
    elif const == 1:
        gx = "x+W"
    elif const == -1:
        gx = "-x+W"
    else:
        gx = "%dx+W" %const
elif order == 1:
    #계수 구하기
    if fx[:stop] == "-":
        coef = -1
    elif stop == 0: #계수 -1/1일 때인데 이건 문제 조건에서 ... 
        coef = 1
    else:
        coef = int(fx[:stop])
    #상수 구하기
    if fx[stop+1:] == "":
        gx = "%dxx+W" %(coef//2)
    else:
        const = int(fx[stop+1:])
        start = ""
        end = ""
        if abs(coef//2)==1 or abs(const) == 1:
            if abs(coef//2)==1:
                if coef//2<0:
                    start = "-xx"
                else:
                    start = "xx"
            elif abs(const) == 1:
                if const<0:
                    end = "-x"
                else:
                    end = "x"
            gx
        gx = "%dxx+%dx+W" %(coef//2, const)
print(gx)