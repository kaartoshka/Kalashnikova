A = int(input("Введите целое число A: "))
B = int(input("Введите целое число B: "))
def f(A, B):
    if A<B:
        for n in range(A, B+1):
            print(n)
    elif A > B:
        for n in range(A, B-1, -1):
            print(n)
    else:
        print(A)
f(A, B)
