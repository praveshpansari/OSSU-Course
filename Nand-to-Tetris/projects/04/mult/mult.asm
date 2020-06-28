// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Mult.asm

// Multiplies R0 and R1 and stores the result in R2.
// (R0, R1, R2 refer to RAM[0], RAM[1], and RAM[2], respectively.)

// Put your code here.
// for(i=0,i<R1;i++) {
    // Add R0 to R2 
// }

// i = 1;
// product = 0;
// multiplier = RAM[1]
// multiplicand = RAM[0]
// LOOP:
    // if i > multiplier goto END
    // product = product + multiplicand
    // i = i + 1
    // goto LOOP
// END:
    // RAM[2] = product

@i
M = 1;      // i = 1

@R2
M = 0;

@product
M = 0;      // product = 0

@R1
D = M
@multiplier
M = D       // multiplier = RAM[1]

@R0
D = M
@multiplicand
M = D       // multiplicand = RAM[0]

(LOOP)
    @i
    D = M
    @multiplier
    D = D - M
    @END
    D;JGT      // if i > multiplier goto END

    @multiplicand
    D = M
    @product
    M = D + M       // product = product + 1

    @i
    M = M + 1       // i = i + 1

    @LOOP
    0;JMP

(END)
    @product
    D = M
    @R2
    M = D           // RAM[2] = product
