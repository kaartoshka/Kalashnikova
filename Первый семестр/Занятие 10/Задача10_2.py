file1 = open("Kalasnikova_y-233_vvod")
file2 = open("Kalashnikova_u-233_vivod2",'w')

def f(n):
    A = []
    C = []
    r = 0
    d1 = []
    d2 = []
    cent = []
    zam = []
    j = 1
    for i in range(n):
        B = []
        for i in range(n):
            B.append(a[j])
            j += 1
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
    for row in A:
        s = ' '.join(map(str, row))
        file2.write(s + '\n')
    file2.write(str(d1))
    file2.write(str(d2))
    file1.close()
    file2.close()

a = file1.read().split()
f(int(a[0]))