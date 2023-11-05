s = input("Введите строку: ")
def f(s):
    count = s.count('а')
    new_s = s.replace('а', '')
    return new_s, count
new_s, new_count = f(s)
print("Новая строка без символов 'а':", new_s)
print("Количество удаленных символов 'а':", new_count)
