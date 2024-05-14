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

- If you try and put a value larger than the maximum value into an int, you'll create something called an **Overflow** situation.
- And similarly, if you try to put a value smaller than the minimum value into an int, you cause an **Underflow** to occur.
- These situations are also known as **integer wraparounds**.
- The maximum value, when it **overflows**, wraps around to the minimum value, and just continues processing without an error.
- The minimum value, when it **underflows**, wraps around to the maximum value, and continues processing.
- This is not usually behavior you really want, and as a developer, you need to be aware that this can happen, and choose the appropriate data type.
- An integer wraparound event, either an **overflow** or **underflow**, can occur in Java when you are using expressions that are not a simple literal value.
- The Java compiler doesn't attempt to evaluate the expression to determine its value, so it DOES NOT give you an error.

## 2.9. Floating-point Numbers
