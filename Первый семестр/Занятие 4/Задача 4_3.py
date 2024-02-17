A = int(input("Введите целое число A: "))
B = int(input("Введите целое число B (B < A): "))
def f(A, B):
    if A > B:
        for n in range(A, B-1, -1):
            if n % 2 != 0:
                print(n)
    else:
        print("A должно быть больше B.")
f(A, B)
