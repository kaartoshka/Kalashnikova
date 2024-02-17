file1 = open("Kalasnikova_y-233_vvod")
file2 = open("Kalashnikova_u-233_vivid",'w')

def f(n):
    A = []
    j = 1
    for i in range(n):
        B = []
        for i in range(n):
            B.append(int(a[j]))
            j += 1
        A.append(B)
    for i in range(n):
        print('максимальный элемент в cтроке -', max(A[i]))
    for i in range(n):
        C = []
        for j in range(n):
            C.append(A[i][j])
        print('минимальный элемент в столбце -', min(C))
    for row in A:
        s = ' '.join(map(str, row))
        file2.write(s + '\n')
    file1.close()
    file2.close()

a = file1.read().split()
f(int(a[0]))
