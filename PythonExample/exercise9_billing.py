size=input("Enter the size of pizza ypu want(S/M/L): ")
bill=0
if size=='S' or size=='s':
    bill +=100
    print("The small size pizza the price is 100")
elif size=='M'or size=='m':
    bill=+200
    print("The medium size pizza the price is 200 ")
else:
    bill +=300
    print("The large size pizza price is 300")
add_pepperoni=input("do you want to pepperoni?(y/n)")
if add_pepperoni=='Y'or add_pepperoni=='y':
    if size=='S'or size=='s':
        bill +=30
    else:
        bill +=50
extra_chese=input("Do you want extra cheese?(y/n)")
if extra_chese=='y'or extra_chese=='Y':
    bill +=20
print(f"your finaml bill is {bill}")
