#print("Hello World...")
'''a=31
print(type(a))
b=str(a)
print(b)
print(type(b))'''


'''a=int(input("Enter a number: "))
print(type(a))
print(a)'''

'''a="vikings"
type(a)
sl=a[0:4]
#print(sl)
sl=a[-5:0:1]
print(sl)'''

'''print(len("Hello World..."))

a="hello World..."
print(a.endswith("p"))

print(a.count("o"))

print(a.capitalize())

print(a.find("W"))

print(a.replace("World","Sir"))

print(a.split(" "))

print(a.upper())

print(a.lower())'''


'''l=[12,33,44,55,66,23,1]

print(l[1])
print(l[1:9:2])
l.sort()
print(sorted(l))

a=[1,4,5,76,7]
a.sort()
print(a)'''

'''l = [12, 33, 44, 55, 66, 23, 1]
l2 = [12, 5, 55, 67, 78, 9]

# Remove common elements from l
result_l = [x for x in l if x not in l2]
print("Elements in l not in l2:", result_l)

# Remove common elements from l2
result_l2 = [x for x in l2 if x not in l]
print("Elements in l2 not in l:", result_l2)'''

'''l = [12, 33, 44, 55, 66, 23, 1]
l2 = [12, 5, 55, 67, 78, 9]

# Remove common elements from l
result_l = [x for x in l if x not in l2]
print("Elements in l not in l2:", result_l)

# Remove common elements from l2
result_l2 = [x for x in l2 if x not in l]
print("Elements in l2 not in l:", result_l2)
'''
n=4
for i in range(1, n+1):
    print((i+n-i+1)*i,end=" ")

