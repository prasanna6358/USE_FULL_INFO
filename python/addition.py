import math
class Math(object):
	def __init__(self,param):
		self.param=param


	def add(self,x,y):
		a = x+y
		print a

	def sub(self,x,y):
		b = x-y
		print b

	def mul(self,x,y):
		c = x*y
		print c

	def div(self,x,y):
		d = x/y
		print d

	def square(self,x):
		e=x*x
		print e
		print self.param

    # def getAreaCircle(self,radius):
    # 	area = math.pi*radius*radius
    # 	print area
    # 	print self.param



obj = Math(5)
obj.add(5,10)
obj.sub(10,5)
obj.mul(10,10)
obj.div(100,10)
obj.square(10)
#obj.getAreaCircle(5)
