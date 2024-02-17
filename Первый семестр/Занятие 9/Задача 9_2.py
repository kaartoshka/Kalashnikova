def f(n):
    A = []
    C = []
    r = 0
    d1 = []
    d2 = []
    cent = []
    zam = []
    for i in range(n):
        B = []
        for i in range(n):
            B.append(float(input()))
        A.append(B)
    for i in range(n):
        for j in range(n):
            C.append(A[i][j])
    for i in range(len(C)):
        if C.count(C[i])!=1:
            print('ошибка')
            break
        else:
            for i in range(n):
                for j in range(n):
                    if i == j:
                        d1.append(A[i][j])
            i = 0
            for j in range(n-1,-1,-1):
                    d2.append(A[i][j])
                    if i == j:
                        cent.append(i)
                        cent.append(j)
                    i += 1
            break
    zam.append(B.index(max(max(d1),max(d2))))
    for i in range(n):
        if max(max(d1),max(d2)) in A[i]:
            zam.append(A.index(A[i]))
    r = A[cent[0]][cent[1]]
    A[cent[0]][cent[1]] = A[zam[0]][zam[1]]
    A[zam[0]][zam[1]] = r
    for i in range(n):
        for j in range(n):
             print(A[i][j], end=' ')
        print()
    print(d1,d2)

a = int(input())
f(a)