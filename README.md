#JSP-H2O
How do you connect a front end to a prediction engine? 
Here the engine is H2O prediction algorithm available as a POJO.
And the frontend is a JSP based application - Yes, JSP.

##This is bare bones. There is not interesting graphics. It just tells you how you can connect a front end to a prediction back end. What you do from there is up to your imagination. 

##What you need for this. 

1. Apache Tomcat
2. Java

##File Structure
1. In the webapps folder create your apps directory. 
2. And index.jsp that redirects. 
3. The WEB-INF folder with classes, jsp and lib folders. 
4. The index.jsp redirects to the actual jsp that would be placed in the WEB-INF/jsp 


##How to Compile. 
1. Funny thing, JSP needs a class to be declared with a package to find it. So do define it with a package name. 
2. You will also need to download h2o-genmodel.jar. You can do that very easily with your H2O session running. 
	curl http://localhost:54321/3/h2o-genmodel.jar > h2o-genmodel.jar

3. Add the package name in the pojo and the interface handler code - MyClass
4. Now compile with:
	$javac -cp h2o-genmodel.jar -X	-J-Xmx2g model_pojo.java MyClass.java

5. Now place all the class files in a folder within the classes folder. The name of this folder in classes must match the package name, even by case. 

If all is good, thinks should work great!


