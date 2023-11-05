N = int(input("Введите число N: "))
def f(N):
    num = 1
    s = 1
    while s <= N:
        print(s)
        num += 1
        s = num ** 2
print("Квадраты натуральных чисел, не превосходящие", N, ":")
print(f(N))
