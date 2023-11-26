def f(n):
    A = []
    for i in range(n):
        B = []
        for i in range(n):
            B.append(int(input()))
        A.append(B)
    for i in range(n):
        print('максимальный элемент в cтроке -', max(A[i]))
    for i in range(n):
        C = []
        for j in range(n):
            C.append(A[i][j])
        print('минимальный элемент в столбце -', min(C))
    for i in range(n):
        for j in range(n):
            print(A[i][j], end=' ')
        print()

a = int(input())
f(a)