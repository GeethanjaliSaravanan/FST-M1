example_dict={
    "brand":"ford",
    "model":"mustang",
    "year" :1964
}
print(example_dict)
x=example_dict["year"]
print(x)
x=example_dict.get("model")
print(x)
example_dict["year"]=2021
print(example_dict)
for x in example_dict:
    print(example_dict[x])

    for x in example_dict.values():
        print(x)

        for x , y in example_dict.items():
            print(x,y)
            example_dict["color"]="red"
            print(example_dict)
            example_dict.pop("model")
            example_dict.popitem()

            example_dict = dict(brand="Ford", model="Mustang", year=1964)
print(example_dict)
