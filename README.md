Napisz aplikacje, która łączy się z API pogodowym i co godzinę zapisuje informacje na temat aktualnej temperatury w bazie danych (wykorzystaj Hibernate).

Serwis pogodowy: https://www.weatherapi.com

Więcej o API:  [chce wincyj](https://app.swaggerhub.com/apis-docs/WeatherAPI.com/WeatherAPI/1.0.2-oas3-oas3.1-oas3.1/#/)

Założono konto, dla którego wygenerowany został Api-Key (trial, ważny do 26 maja 2023)

Klucz do API wprowadzono jako finalną zmienną statyczną w kodzie źródłowym

![image](https://github.com/monikaRegula/ksb2-rest-domowe/assets/33186866/fe32315a-32ff-4fcf-82e4-d3ab7dec6f05)

![image](https://github.com/monikaRegula/ksb2-rest-domowe/assets/33186866/2ae530f1-483f-4bf8-adb1-1648a240a987)

![image](https://github.com/monikaRegula/ksb2-rest-domowe/assets/33186866/617825b1-bc49-46d1-acca-9d58fc65fa31)

Do stworzenia modelu wykorzystano [to](https://www.jsonschema2pojo.org) :

![image](https://github.com/monikaRegula/ksb2-rest-domowe/assets/33186866/f0fdb299-a62f-436c-a9ec-1d7faf3e240c)


===================================================

Jak działa apka?

![img.png](img.png)

dla testów ustawiono inną wartość cron=*/15 * * * * *

![img_1.png](img_1.png)


