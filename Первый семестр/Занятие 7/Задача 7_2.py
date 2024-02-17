a = []
def f(a):
    summa = sum(num for num in a if num > 5)
    return summa
for i in range(10):
    num = int(input(f"Введите число {i+1}: "))
    a.append(num)
result_sum = f(a)
print("Сумма чисел больше 5:", result_sum)
