age=int(input())
t = float(input())
if ( age > 13 and t==13.30):
  print("$5.00")
elif (age <= 13 and t ==13.30):
  print("$2.00")
elif( age > 13):
  print("$8.00")
else :
  print("$4.00")