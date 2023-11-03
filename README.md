## Task Numeration
### 1th week
* [task1:](https://codeforces.com/problemset/problem/339/A)
* [task2:](https://codeforces.com/problemset/problem/160/A)
* [task3:](https://codeforces.com/problemset/problem/405/A)
* [task4:](https://codeforces.com/problemset/problem/141/A)
* [task5:](https://codeforces.com/problemset/problem/1399/A)
* [task6:](https://codeforces.com/problemset/problem/723/A)
### 2th week
* [task7:](https://codeforces.com/problemset/problem/1251/A)
* [task8:](https://codeforces.com/problemset/problem/381/A)
* [task9:](https://codeforces.com/problemset/problem/1225/B2)
* [task10:](https://codeforces.com/problemset/problem/251/A)
* [task11:](https://codeforces.com/problemset/problem/279/B)
* [task12:](https://codeforces.com/problemset/problem/580/B)
### 3th and 4th week
* [task13:](https://codeforces.com/problemset/problem/1288/A)
* [task14:](https://codeforces.com/problemset/problem/492/B)
* [task15:](https://codeforces.com/problemset/problem/1352/C)
* [task16:](https://codeforces.com/problemset/problem/1328/B)
* [task17:](https://codeforces.com/problemset/problem/1217/A)
* [task18:](https://codeforces.com/problemset/problem/1183/C)
### 5th week
* [task19:](https://codeforces.com/problemset/problem/478/B)
* [task20:](https://codeforces.com/problemset/problem/1294/C)
* [task21:](https://codeforces.com/problemset/problem/545/D)
* [task22:](https://codeforces.com/problemset/problem/508/B)
* [task23:](https://codeforces.com/problemset/problem/519/C)
* [task24:](https://codeforces.com/problemset/problem/1037/C)
### 6th and 7th week
* [task25:](https://codeforces.com/problemset/problem/368/B)
* [task26:](https://codeforces.com/problemset/problem/363/B)
* [task27:](https://codeforces.com/problemset/problem/651/A)
* [task28:](https://codeforces.com/problemset/problem/327/A)
* [task29:](https://codeforces.com/problemset/problem/1323/A)
* [task30:](https://codeforces.com/problemset/problem/753/A)
### 8th week
* [task31:](https://codeforces.com/problemset/problem/115/A)
* [task32:](https://codeforces.com/problemset/problem/500/A)
* [task33:](https://codeforces.com/problemset/problem/1255/B)
* [task34:](https://codeforces.com/problemset/problem/1433/D)
* [task35:](https://codeforces.com/problemset/problem/1490/D)
* [task36:](https://codeforces.com/problemset/problem/277/A)
### 11th and 12th week
* ...
* 
### Task1
Использовал сортировку подсчетом т к всего 3 вида монеток
### Task2
Использовал сортировку выбором
### Task3
Пузырьковая сортировка просто так для разнообразия
### Task4
Сортировка слиянием для разнообразия
### Task5
Быстрая сортировка для разнообразия
### Task6
Пузырьковая сортировка просто так
### Task13
Была попытка к использованию тернарного поиска т к задача на нахождение минимума а массиве составленного из
отсотированного поубыванию мааасива + отсортированного по возрастанию массива. Решение: проходимся обыкновенным 
бинпоискои с двух сторон к минимуму (условно к середине массива)
### Task14
Отсортировали массив координат и нашли наибольшее расстояние между соседними координатами в том числе и началом и 
концом улицы
### Task16
Использовать бинарный поиск для того чтобы найти позицию первой в строке буквы 'b' такую чтобы точно быть уверенным что
в искомой строке она находиться именно там. Для того чтобы определить диапазон номеров строчек для такой конфигурации 
воспользовался формулой нахождения суммы n-ых членов арифм прогрессии. Далее из максималного значения в этом диапазоне 
вычитаем номер искомой строки(k) тем самым определяем на сколько символов вторая 'b' смещена от первой. Зная индексы 
двух букв сформируем строку-ответ.
### Task17
Воспользовался бинарным поиском для нахождения наибольшего количесва очков которые можно вложить в интеллект так 
чтобы остальные значения показателей персонажа удовлетворяли условиям задачи. Это чило на 1 меньше искомого ответа.
Нужно учитывать что могут быть случаи когда при любом расскладе не удасться выполнить условия тогда это нужно обработать
и вернуть 0.