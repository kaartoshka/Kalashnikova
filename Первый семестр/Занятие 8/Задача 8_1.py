num1 = int(input("Введите первое число: "))
num2 = int(input("Введите второе число: "))
def f(a, b):
    if b == 0:
        return a
    return f(b, a % b)

def g(a, b):
    return (a * b) // f(a, b)
f_res = f(num1, num2)
g_res = g(num1, num2)
print("Наибольший общий делитель (НОД):", f_res)
print("Наименьшее общее кратное (НОК):", g_res)
