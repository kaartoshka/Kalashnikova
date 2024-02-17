N = int(input("Введите число N: "))
def f(N):
    sum = 0
    result = 1
    while result <= N:
        sum += 1
        result *= 2
    return sum - 1, result // 2
summ, result = f(N)
print('Наибольшая целая степень двойки, не превосходящая N в степени,',summ, ' = ', result)
