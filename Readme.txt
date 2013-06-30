Simple Java program to connect a Wii Balance Board and display
weight in a Swing window.

I only tested it on Mac Os X 10.6.8
java version "1.6.0_51" + the flag -d32

How to compile it ?

$ javac -classpath .:./lib/* ./NewBoard.java

How to run it ?

$ java -d32 -cp .:./lib/* NewBoard

Compile and run :
If you are lazy and have the same configuration as this project simply
type :
$ ./compile-run.sh

You need to have bluetooth activated and don't link the balance board
with the computer before, the program do it.

Licence :
GNU GPL
