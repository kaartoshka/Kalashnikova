nomera = []
def f(a):
    summa = sum(a)
    sred = summa / len(a)
    return sred
for i in range(10):
    num = int(input(f"Введите целое число {i+1}: "))
    nomera.append(num)
sred = f(nomera)
maximum = 0
sr_count = 0
max_num = max(nomera)
for num in nomera:
    if num < max_num:
        maximum += 1
    if num > sred:
        sr_count += 1
print("Среднее арифметическое:", sred)
print("Количество чисел меньше максимального:", maximum)
print("Количество чисел больше среднего арифметического:", sr_count)
