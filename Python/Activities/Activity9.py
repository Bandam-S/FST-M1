numfirst=[10,25,41,60,80]
numsecond=[30,50,70,90,55]
print("Firstlist", numfirst)
print("secondlist", numsecond)
thirdList=[]

for num in numfirst:
    if(num %2!=0):
        thirdList.append(num)

        for num in numsecond:
            if(num %2!=0):
                thirdList.append(num)
                print("result List is:")
                print(thirdList)


