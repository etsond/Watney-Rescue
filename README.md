# Watney Rescue
### FEATURES
WatneyRescue.java is a Java program that simulates a rescue mission for a stranded astronaut named Mark Watney. The program uses a grid system to represent the Martian surface and includes various obstacles such as boulders, craters, and sand traps. The goal of the program is to navigate a rover to the location of the stranded astronaut, pick him up, and bring him back to the base camp.

### Installation
To run this program, you will need to have Java installed on your computer. If you don't have Java installed, you can download and install it from the following link:

-  [Download Java](https://www.oracle.com/java/technologies/downloads/#java16)

Once you have Java installed, you can download or clone this repository using the following command:

```ruby
git clone https://github.com/etsond/rescue.git
```
## Usage

To use this program, open a terminal or command prompt and navigate to the directory where you downloaded or cloned this repository. Then navigate to the rescue directory and run the following command:
```ruby
javac WatneyRescue.java
```
This will compile the program and create a class file called WatneyRescue.class. To run the program, enter the following command:
```ruby
java WatneyRescue
```
The program will prompt you to enter the size of the grid and the location of the obstacles. Once you have entered this information, the program will simulate the rescue mission and output the path taken by the rover to reach the stranded astronaut.

## License
This program is licensed under the MIT License. You are free to use, modify, and distribute this program for any purpose.

Sample Run 1

Do you want 'd' distance mode, 'r' rover mode, or 'q' quit?
d
How many meters to Watney?
435
Contingencies given distance 435.0 from Lewis to Watney:
1) 15 | 15 | 431
2) 15 | 18 | 431
3) 15 | 21 | 430
4) 15 | 24 | 429
5) 15 | 27 | 429
6) 15 | 30 | 428
7) 20 | 15 | 430
8) 20 | 18 | 429
9) 20 | 21 | 428
10) 20 | 24 | 427
11) 20 | 27 | 427
12) 20 | 30 | 426
13) 25 | 15 | 429
14) 25 | 18 | 428
15) 25 | 21 | 427
16) 25 | 24 | 425
17) 25 | 27 | 424
18) 25 | 30 | 423
19) 30 | 15 | 428
20) 30 | 18 | 426
21) 30 | 21 | 425
22) 30 | 24 | 424
23) 30 | 27 | 422
24) 30 | 30 | 421
25) 35 | 15 | 427
26) 35 | 18 | 425
27) 35 | 21 | 423
28) 35 | 24 | 422
29) 35 | 27 | 420
30) 35 | 30 | 419
31) 40 | 15 | 426
32) 40 | 18 | 424
33) 40 | 21 | 422
34) 40 | 24 | 420
35) 40 | 27 | 418
36) 40 | 30 | 416
37) 45 | 15 | 425
38) 45 | 18 | 422
39) 45 | 21 | 420
40) 45 | 24 | 418
41) 45 | 27 | 416
42) 45 | 30 | 414
43) 50 | 15 | 424
44) 50 | 18 | 421
45) 50 | 21 | 419
46) 50 | 24 | 417
47) 50 | 27 | 415
48) 50 | 30 | 412
49) 55 | 15 | 423
50) 55 | 18 | 420
51) 55 | 21 | 418
52) 55 | 24 | 416
53) 55 | 27 | 413
54) 55 | 30 | 411
55) 60 | 15 | 422
56) 60 | 18 | 420
57) 60 | 21 | 417
58) 60 | 24 | 414
59) 60 | 27 | 412
60) 60 | 30 | 409
61) 65 | 15 | 421
62) 65 | 18 | 419
63) 65 | 21 | 416
64) 65 | 24 | 413
65) 65 | 27 | 411
66) 65 | 30 | 408
67) 70 | 15 | 421
68) 70 | 18 | 418
69) 70 | 21 | 415
70) 70 | 24 | 413
71) 70 | 27 | 410
72) 70 | 30 | 407
73) 75 | 15 | 421
74) 75 | 18 | 418
75) 75 | 21 | 415
76) 75 | 24 | 412
77) 75 | 27 | 409
78) 75 | 30 | 406

Which row?
71
Watney walking time to ship: 456 seconds
Lewis walking time to ship: 16 seconds

Do you want 'd' distance mode, 'r' rover mode, or 'q' quit?
r
What series of angles?
90,180,90,337.5,112.5,157.5,45,0,90,22.5,90,270,90,202.5,112.5,135,90,112.5,67.5,337.5
Mission control on earth sends the following message:

HOW ALIVE?

Do you want 'd' distance mode, 'r' rover mode, or 'q' quit?
q
Goodbye. May the hexadecimals be with you.
 
![image](https://user-images.githubusercontent.com/35821623/201495210-c12e8fb4-48d5-4c3b-9bad-68b1792350ab.png)
