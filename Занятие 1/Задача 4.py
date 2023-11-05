a = int(input('Введите количество секунд '))
sec =a%60
mins =a//60 % 60
hour =a//3600 % 24
day =hour//86400
print ('Дни:',day, 'Часы:',hour, 'Минуты:',mins, 'Секунды:',sec)
