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

Licence:

This program is free software: you can redistribute it and/or modify it
under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or (at your
option) any later version.

This program is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
Public License for more details.

You should have received a copy of the GNU General Public License along
with this program. If not, see http://www.gnu.org/licenses/.
