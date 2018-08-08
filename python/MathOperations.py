import math
class Math(object):
	def __init__(self,param):
		self.param=param


	def add(self,x,y):
		a = x+y
		print "addition of "+str(x)+", "+str(y)+" is "+ str(a)

	def sub(self,x,y):
		b = x-y
		print "subtraction of "+str(x)+", "+str(y)+" is "+ str(b)

	def mul(self,x,y):
		c = x*y
		print "multiplication of "+str(x)+", "+str(y)+" is "+ str(c)

	def div(self,x,y):
		d = x/y
		print "division of "+str(x)+", "+str(y)+" is " +str(d)

	def square(self,x):
		e=x*x
		print "square "+str(x)+" is "+ str(e)
		print "initialised param value is "+str(self.param)

	def printPI(self,radius):
		return math.pi*radius*radius



obj = Math(5)
obj.add(5,10)
obj.sub(10,5)
obj.mul(10,10)
obj.div(100,10)
obj.square(10)
radius = obj.printPI(10)
print "the value of the area is "+str(radius)

#obj.getAreaCircle(5)
