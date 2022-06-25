@echo off

SET CLASSPATH=.;%~dp0antlr4-4.8-complete.jar
java -classpath %CLASSPATH% org.antlr.v4.gui.TestRig %*