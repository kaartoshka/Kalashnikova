n = int(input('Введите число долек n '))
m = int(input('Введите число долек m '))
k = int(input('Введите число k '))
def f(n,m,k):
    if k<n*m and ((k%n==0) or (k%m==0)):
        return 'Да'
    else:
        return 'Нет'
print(f(n,m,k))
