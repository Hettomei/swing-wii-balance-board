#!/bin/sh
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR
rm *.class
javac -classpath .:./lib/* ./NewBoard.java
