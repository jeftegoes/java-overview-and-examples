# Java overview and examples <!-- omit in toc -->

## Contents <!-- omit in toc -->

- [1. JShell](#1-jshell)
- [2. Variables](#2-variables)
  - [2.1. Keywords](#21-keywords)
  - [2.2. Data type](#22-data-type)
  - [2.3. Declaration Statement](#23-declaration-statement)
  - [2.4. Expressions](#24-expressions)
  - [2.5. Operators](#25-operators)
  - [2.6. Java's Primitive Types](#26-javas-primitive-types)
    - [2.6.1. Integer](#261-integer)
  - [2.7. Wrapper Classes](#27-wrapper-classes)
  - [2.8. Overflow and Underflow](#28-overflow-and-underflow)
  - [2.9. Floating-point Numbers](#29-floating-point-numbers)
    - [2.9.1. Single and Double Precision](#291-single-and-double-precision)
    - [2.9.2. Java's Scientific Notation](#292-javas-scientific-notation)
  - [2.10. Char \& String](#210-char--string)
    - [2.10.1. char Data Type](#2101-char-data-type)
    - [2.10.2. Unicode](#2102-unicode)
  - [2.11. Boolean](#211-boolean)
- [3. Statements](#3-statements)

# 1. JShell

- JShell became a standard component of the Java Developers Kit in Java 9.
- It is what is known as a **Read-Eval-Print-Loop** interactive program (or **REPL** for short) which means it does pretty much just that:
  - It **reads** the command or code segment we type in.
  - It **evaluates** and executes the code, and often allows short cuts to be used.
  - It **prints** out the results of the evaluation or execution, without making the developer write code to output the results.
  - Lastly, it **loops** right back for more input (more code segments or commands).
- JShell runs in a terminal (or on the command line for Windows) and is useful for quickly trying out new ideas.
- JShell does not replace the need for an IDE.
- It's just a handy tool to quickly get started with Java.

# 2. Variables

## 2.1. Keywords

- A keyword is any one of a number of reserved words, that have a predefined meaning in the Java language.
- In Java syntax, all code is **case-sensitive**, and this includes **keywords**.
  - `int` in lowercase, is not the same as `Int` with the first letter capitalized, or `INT`, all in uppercase, etc.
  - Keywords need to be in lowercase.
- So what are variables?
- Well, **variables are a way to store information in our computer**.
- Variables that we define in a program, can be **accessed by a name we give them**, and the computer does the hard work, of figuring out where they get stored, in the computer's **random access memory**, or RAM.

## 2.2. Data type

- There are lots of different types of data, that we can define for our variables.
- Collectively, these are known as data types.

## 2.3. Declaration Statement

- A declaration statement is used to define a variable by indicating the data type, and the name, then optionally to set the variable to a specific value.

## 2.4. Expressions

- So what is an expression?
  - An expression is a coding **construct, that evaluates to a single value**.
- **Expression is the code segment that is on the right side of the equals sign in an assignment or declaration statement.**

## 2.5. Operators

- Java operators, or just operators, perform an operation (hence the term) on a variable or value.
- Addition, Subtraction, Division, and Multiplication are four common ones that I feel sure you're familiar with, but there are lots more operators.

[Examples](Variables/Operators.java)

## 2.6. Java's Primitive Types

- In Java, primitive types are the most basic data types.
- The eight primitive data types in Java are shown in the table below, listed by the type of data stored for each:

| Whole number                               | Real number (floating point or decimal) |
| ------------------------------------------ | --------------------------------------- |
| `byte`<br/> `short`<br/> `int`<br/> `long` | `float`<br/> `double`<br/>              |

| Single character | Boolean value |
| ---------------- | ------------- |
| `char`           | `boolean`     |

- Consider these types as the building blocks of data manipulation.
- Remember that primitive data types are simply placeholders in memory for a value.

[Examples](Variables/PrimitiveTypes.java)

### 2.6.1. Integer

- An integer is a whole number, meaning it doesn't contain a fractional element, or a decimal.
- There's a specified range of values allowed for the `int`, which is true for most data types.
- What this means is, that the allowable range of values is **NOT** infinite.
- There's a defined minimum, and maximum value, for each numeric data type, meaning you can't assign a number bigger or smaller (outside of that range).
- The plus sign, **+**, when used in `System.out.print` will print different data types together as a single line of text.
- In the example:
  ```java
      System.out.println("Integer Minimum Value = " + myMinIntValue);
  ```
- We want to print a label, before a numeric integer value.
- Whatever follows the plus sign in `System.out.print` here, is converted to a `String` by Java, and concatenated to the `String` before it.

## 2.7. Wrapper Classes

- Java uses the concept of a **wrapper class**, for all of its eight primitive data types.
- A wrapper class provides simple operations, as well as some basic information about the primitive data type, which cannot be stored on the primitive itself.
- We saw that `MIN_VALUE`, and `MAX_VALUE`, are elements of this basic information, for the int data type.
- The primitive types, and their respective wrapper classes, are shown in the table below.
  | Primitive | Wrapper Class |
  | --------- | ------------- |
  | byte | Byte |
  | short | Short |
  | char | Character |
  | int | Integer |
  | long | Long |
  | float | Float |
  | double | Double |
  | boolean | Boolean |
- Example:
  ```java
      int myMinIntValue = Integer.MIN_VALUE;
      int myMaxIntValue = Integer.MAX_VALUE;
  ```

## 2.8. Overflow and Underflow

- If we try and put a value larger than the maximum value into an int, we'll create something called an **Overflow** situation.
- And similarly, if we try to put a value smaller than the minimum value into an int, we cause an **Underflow** to occur.
- These situations are also known as **integer wraparounds**.
- The maximum value, when it **overflows**, wraps around to the minimum value, and just continues processing without an error.
- The minimum value, when it **underflows**, wraps around to the maximum value, and continues processing.
- This is not usually behavior we really want, and as a developer, we need to be aware that this can happen, and choose the appropriate data type.
- An integer wraparound event, either an **overflow** or **underflow**, can occur in Java when we are using expressions that are not a simple literal value.
- The Java compiler doesn't attempt to evaluate the expression to determine its value, so it DOES NOT give you an error.

## 2.9. Floating-point Numbers

- Unlike whole numbers, floating-point numbers have fractional parts that we express with a decimal point.
- In this table, we can see some examples of both whole numbers and floating point numbers, in comparison.

  | Whole number examples | Floating Point examples |
  | --------------------- | ----------------------- |
  | 3                     | 3.14159                 |
  | 100000                | 10.0                    |
  | -2147483649L          | -0.666666666666666667   |

- Floating-point numbers are also known as real numbers.
- We use a floating-point number when we need more precision in calculations.
- There are two primitive types in Java for expressing floating-point numbers, the `float` and the `double`.
- **The double is Java's default type for any decimal or real number.**

### 2.9.1. Single and Double Precision

- Precision refers to the format and amount of space occupied by the relevant type.
- This table shows the width of each of the floating point types and their ranges.
- The ranges are shown in Java's scientific notation, which we show below in bold font.

  | Data type | Width (in bits) | Min Value   | Max Value                  |
  | --------- | --------------- | ----------- | -------------------------- |
  | `float`   | 32              | 1.4**E-45** | 3.4028235**E38**           |
  | `double`  | 64              | 49**E-324** | 1.7976931348623157**E308** |

- We can see the e-notation followed by either a positive or negative number.

### 2.9.2. Java's Scientific Notation

- Scientific notation can be translated into more familiar terms, by replacing the 'E' in the number, with the phrase 'times 10 to the power of'.
  - 1.4**E-45** is the same as **1.4 \* 10^-45** and 3.4**E38** is the same as **3.4 x 10^38**

## 2.10. Char & String

- This table is a quick summary of the differences between the char and the String.

  | char                               | String                            |
  | ---------------------------------- | --------------------------------- |
  | Holds one, and only one, character | Can hold multiple characters      |
  | Literal enclosed in Single Quotes  | Literal enclosed in Double Quotes |

### 2.10.1. char Data Type

- A `char` occupies two bytes of memory, or 16 bits, and thus has a width of 16.
- The reason it's not just a single byte, is that a char is stored as a 2 byte number, similar to the short.
- This number gets mapped to a single character by Java.
  - So, when you print a char, you will see the mapped character, and not the representative number.
  - And you can use single quotes and a character literal to assign a value to a `char`, which is much simpler than looking up the representative number.

### 2.10.2. Unicode

- Unicode is an international encoding standard for use with different languages and scripts by which each letter, digit, or symbol is assigned a unique numeric value that applies across different platforms and programs.
- In the English alphabet, we've got the letters A through Z, meaning only 26 characters are needed in total to represent the entire English alphabet.
- But other languages need more characters, and often a lot more.
- There are three ways to assign a value to a char: Each of these methods, represents storing the letter, capital D, in memory.

  | Assignment Type     | Example Code              |
  | ------------------- | ------------------------- |
  | a literal character | `char myChar = 'D';`      |
  | a Unicode value     | `char myChar = '\u0044';` |
  | an integer value    | `char myChar = 68;`       |

## 2.11. Boolean

- A `boolean` value allows for two opposite choices, **true** or **false**, yes or no, one or zero.
- In Java terms, we've got a `boolean` primitive type, and it can be set to two values only, either **true** or **false**.
- The wrapper for `boolean` is `Boolean` with a capital B.

# 3. Statements

