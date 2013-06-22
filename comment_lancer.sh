#!/bin/sh
rm *.class
javac -classpath .:./lib/* ./NewBoard.java &&
java -d32 -cp .:./lib/* NewBoard
