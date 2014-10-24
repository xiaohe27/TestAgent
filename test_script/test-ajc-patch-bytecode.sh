#The test case provided is BigClass.java, which contains a very large main method. 
#
#After inserting the advices, it will exceed the 64KB constraint for method size.
#
#If you are using standard AspectJ compiler, then running this script will end up with an error like: 
#/BigClass.java [error] problem generating method BigClass.main : Code size too big: 65613  
#
#After applying the patch and rebuild the AspectJ project, you will get updated AspectJ libraries. 
#Deploy these new AspectJ Libraries and execute this script again, you will find the monitored class 
#together with the monitoring libraries have been generated successfully in the 'mop' directory.
#

javac BigClass.java
ajc -1.6 -d mop -inpath . HasNextMonitorAspect.aj
