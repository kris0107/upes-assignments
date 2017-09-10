
# Enter the number of test cases
t = input() 

while t > 0:
    t -= 1

# Enter the size of the list L
    n = input()
    
# Enter the numbers which are space seperated
    d=raw_input()
    d=d.split(" ")
    
# For storing the integers     
    a=raw_input()
    a=a.split(" ")
     
# Enter the list L    
    for i in range(n):
    	d[i]=long(d[i])
    
# Enter the three integers
    b=long(a[1])
    c=long(a[2])
    a=long(a[0])
    
# Enter the String     
    s=raw_input()
    

    cur=0
    l=0
    r=n-1
    rev=0
    add=0
    mult=1
    
# Implementing the Ancient Algorithm

    for i in range(n):
    	if s[i]=='R':
    		if rev:
    			rev=0
    			r=cur
    			cur=l
    		else:
    			rev=1
    			l=cur
    			cur=r
    	elif s[i]=='A':
    		add=((a%c)+(add%c))%c
    	elif s[i]=='M':
    		mult=((mult%c)*(b%c))%c
    		add=((add%c)*(b%c))%c
    	print ((d[cur]*mult)%c+add)%c,
    	if rev:
    		cur-=1
    		r-=1
    	else:
    		cur+=1
    		l+=1
    print
    