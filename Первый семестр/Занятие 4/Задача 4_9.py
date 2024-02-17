def f(N):
    if N>0:
        fin = [0, 1]
        for i in range(2, N):
            fin.append(fin[i - 1] + fin[i - 2])
        return sum(fin)
    else:
        return 0
N = int(input("Введите количество чисел Фибоначчи: "))
result = f(N)
print("Сумма чисел Фибоначчи:", result)
