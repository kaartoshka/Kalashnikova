n = int(input("Введите целое число (не меньше 2): "))
def f(n):
    delit = 2
    while n % delit != 0:
        delit += 1
    return delit
delit = f(n)
print('Наименьший натуральный делитель числа', n, 'отличный от 1, это', delit)
