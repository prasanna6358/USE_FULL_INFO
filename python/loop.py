class Loop(object):
	def __init__(self):
		print "initialised"

	def printLoop(self):
		for n in range(1,6):
			for j in range(1,n+1):
				print j,
			print 





loop = Loop()
loop.printLoop()		