import tkinter as tk
import requests
import json

def get_repository_info():
    username = repo_name_entry.get()
    url = f'https://api.github.com/repos/{username}'
    response = requests.get(url)

    if response.status_code == 200:
        data = response.json()
        info = {
            'company': data.get('owner', {}).get('company'),
            'created_at': data.get('created_at'),
            'email': data.get('owner', {}).get('email'),
            'id': data.get('id'),
            'name': data.get('name'),
            'url': data.get('owner', {}).get('url')
        }
        with open('repoz_name.json', 'w') as file:
            json.dump(info, file, indent=4)
        result_label.config(text="Информация сохранена в файл 'repoz_name.json'.")
    else:
        result_label.config(text="Репозиторий не найден или произошла ошибка при запросе.")

window = tk.Tk()
window.title("Картофельный спас")
window.geometry('1000x500')
window.config(background='white')

repo_name_label = tk.Label(window, text="Введите имя репозитория:", background='red',foreground='white',font=('Arial',25))
repo_name_label.pack()


get_info_button = tk.Button(window, text="Получить JSON",background='black',foreground='white',font=('Arial',25), command=get_repository_info)
get_info_button.pack()

repo_name_entry = tk.Entry(window,background='green')
repo_name_entry.pack()


result_label = tk.Label(window, text="")
result_label.pack()

window.mainloop()

#NixOS/nixpkgs