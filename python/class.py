import math
import factorial
class A(object):
    def foo(self):
        print 'Foo'

    def bar(self, an_argument):
        print 'Bar', an_argument

     

    # def Factorial(n): # return factorial
    #     result = 1
    #     for i in range (1,n):
    #     result = result * i
    #     print "factorial is ",result
    #     return result




a = A()
a.foo() #prints 'Foo'
a.bar('Arg!') #prints 'Bar Arg!'
#a.Factorial(5)
print('factorial of 6 is ')
factorial.fact(6)
