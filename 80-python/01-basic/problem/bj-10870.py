import sys
input = sys.stdin.readline

n = int(input())

def fibo(n):
	if n < 2:
		return n
	
	else:
		return fibo(n - 1) + fibo(n - 2)
	
print(fibo(n)) 