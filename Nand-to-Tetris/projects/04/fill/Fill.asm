// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Fill.asm

// Runs an infinite loop that listens to the keyboard input.
// When a key is pressed (any key), the program blackens the screen,
// i.e. writes "black" in every pixel;
// the screen should remain fully black as long as the key is pressed. 
// When no key is pressed, the program clears the screen, i.e. writes
// "white" in every pixel;
// the screen should remain fully clear as long as no key is pressed.

// Put your code here.
// addr = SCREEN
// rows = 256
// columns = 32
// i = 1

// LOOP1:
    // if i > rows goto END1
    // j = 1
    // LOOP2:
        // if j > 32 goto END2
        // RAM[addr] = -1
        // addr = addr + 1 //go to next column
        // j = j + 1
        // goto LOOP2
    // END2:
        // i = i + 1;
        // goto LOOP1
// END1
    // goto END1;
    
    
M = 0;

(START)
@KBD
D = M;

@CLEAR
D;JEQ

@SCREEN
D = A
@addr
M = D       // addr = 16384

@256
D = A
@rows
M = D       // rows = 256

@32
D = A
@columns
M = D       // columns = 32

@i
M = 1       // i = 1

(LOOP1)
    @i
    D = M
    @rows
    D = D - M
    @END1
    D;JGT       // if i > rows goto END1

    @j
    M = 1       // j = 1

    (LOOP2)
        @j
        D = M
        @columns
        D = D - M
        @END2
        D;JGT       // if j > columns goto END2

        @addr
        A = M
        M = -1      // RAM[addr] = -1


        @addr
        M = M + 1       // addr = addr + 1

        @j
        M = M + 1       // j = j + 1

        @LOOP2
        0;JMP
    
(END2)
    @i
    M = M + 1       // i = i + 1

    @LOOP1
    0;JMP

(END1)
    @START
    0;JMP

(CLEAR)
@SCREEN
D = A
@addr
M = D       // addr = 16384

@256
D = A
@rows
M = D       // rows = 256

@32
D = A
@columns
M = D       // columns = 32

@i
M = 1       // i = 1

(LOOP3)
    @i
    D = M
    @rows
    D = D - M
    @END3
    D;JGT       // if i > rows goto END1

    @j
    M = 1       // j = 1

    (LOOP4)
        @j
        D = M
        @columns
        D = D - M
        @END4
        D;JGT       // if j > columns goto END2

        @addr
        A = M
        M = 0      // RAM[addr] = 0


        @addr
        M = M + 1       // addr = addr + 1

        @j
        M = M + 1       // j = j + 1

        @LOOP4
        0;JMP
    
(END4)
    @i
    M = M + 1       // i = i + 1

    @LOOP3
    0;JMP

    (END3)
    @START
    0;JMP
