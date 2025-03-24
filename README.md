
Лабораторная №1, ПнаЯВУ, гр. 334701, Вар. №5.
"Погода: сервис должен принимать координаты (или название населённого пункта) и возвращать данные по текущей погоде актуальные данные о погоде можно запрашивать из любого открытого источника (https://starkovden.github.io/using-api-scenario.html)"
Для проверки использую Postman. 
Для отправки запроса выбираю метод GET. 
Для получения погоды по названию города прописываем: 
URL:http://localhost:8080/weather?city=city_name  в переменной city_name пишу город и получаю данные о текущей погоде. 
Например :http://localhost:8080/weather?city=London

Для получения текущей погоды по долготе и широте прописываем 
URL: http://localhost:8080/weather/coordinates?lat=data1&lon=data2  в переменной data1 пишу долготу а в переменной data2 широту после чего получаю текущую погоду. 
Например http://localhost:8080/weather/coordinates?lat=51.5074&lon=-0.1278 
