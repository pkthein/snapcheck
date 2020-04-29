import math
 
i0 = input()
i0 = i0.split()
i0 = "".join(i0)
# i0 = 'haveaniceday'
 
n = len(i0)**(0.5)
 
row = math.floor(n)
col = math.ceil(n)
 
ret = []

for i in range(len(i0)):
  if i < col:
    ret.append('')
  ret[i % col] += i0[i]
 
print(" ".join(ret))
