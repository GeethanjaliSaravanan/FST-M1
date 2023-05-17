from datetime import datetime
x= datetime.now()
print(x)
print(x.year)
print(x.strftime("%A")) # weekday
y=datetime(2023,10,6)
print(y)
print(y.strftime("%B")) # October