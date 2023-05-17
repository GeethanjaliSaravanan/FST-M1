frui_shop={
    "apple":15,
    "papaya":20,
    "mango":40,
    "oranges":10
}
key_to_ckeck=input("what you are looking for").lower()
x=frui_shop.get("apple")
frui_shop["oranges"]=14
for y in frui_shop:
    print(y)
    print(frui_shop[y])

    for y in frui_shop.values():
        print(y)

        for y,x in frui_shop.items():
            print(y,x)


print(x)
if(key_to_ckeck in frui_shop):
    print("yes its thr")
else:
    print("no")