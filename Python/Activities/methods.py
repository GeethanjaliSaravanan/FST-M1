class Person:
    'This class represents a person'
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def myfunc(self):
        print("name=" + self.name)


P1=Person("shasu",2)
P1.myfunc()
del P1

