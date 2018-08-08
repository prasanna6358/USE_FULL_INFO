obj = open("prasanna.txt","w")
obj.write("Hi prasanna! how are you")
obj.close()

obj1 = open("prasanna.txt","r")
s = obj1.read()
obj1.close()
print s
