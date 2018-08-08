class Fibonacci(object):
	def __init__(self,param1,param2):
		self.param1=param1
		self.param2=param2
	

	def getFibonacci(self,x,y,number):
		print str(x)+" "+str(y)
		while (number>0):
			c=x+y
			x=y
			y=c
			print(self.param1)
			print(self.param2)
			if(c%2==0):
				print "even number "+str(c)
			else:
				print "odd number is "+str(c)
			number-=1


fibo=Fibonacci(10,20)
fibo.getFibonacci(1,1,10)
