# Java Overview and Examples <!-- omit in toc -->

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
  - [3.1. Method Overloading](#31-method-overloading)
  - [3.2. Method Signatures](#32-method-signatures)
- [4. Exceptions](#4-exceptions)
- [5. Coupling](#5-coupling)
- [6. Lombok](#6-lombok)
  - [6.1. What is Project Lombok?](#61-what-is-project-lombok)
  - [6.2. Project Lombok History](#62-project-lombok-history)
  - [6.3. How Lombok Works](#63-how-lombok-works)
  - [6.4. Project Lombok and IDEs](#64-project-lombok-and-ides)
  - [6.5. Project Lombok Features](#65-project-lombok-features)
- [7. Maven](#7-maven)
  - [7.1. Without Maven](#71-without-maven)
  - [7.2. Maven Solution](#72-maven-solution)
    - [7.2.1. How Maven Works](#721-how-maven-works)
  - [7.3. Handling JAR Dependencies](#73-handling-jar-dependencies)
  - [7.4. Building and Running](#74-building-and-running)
  - [7.5. Standard Directory Structure](#75-standard-directory-structure)
  - [7.6. Advantages of Maven](#76-advantages-of-maven)
  - [7.7. POM File - pom.xml](#77-pom-file---pomxml)
  - [7.8. Project Coordinates](#78-project-coordinates)
    - [7.8.1. Example of Project Coordinates](#781-example-of-project-coordinates)
    - [7.8.2. Adding Dependencies](#782-adding-dependencies)
  - [7.9. Dependency Coordinates](#79-dependency-coordinates)
- [8. Json manipulation](#8-json-manipulation)
- [9. Java and Maven install](#9-java-and-maven-install)
- [10. Maven](#10-maven)
  - [10.1. Commands](#101-commands)
  - [10.2. Erros](#102-erros)

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

## 3.1. Method Overloading

- Method overloading occurs when a class has multiple methods with the same name, but the methods are declared with different parameters.
- So, we can execute multiple methods with the same name, but call it with different arguments.
- Java can resolve which method it needs to execute based on the arguments being passed when the method is invoked.

## 3.2. Method Signatures

- A method signature consists of the name of the method, and the uniqueness of the declaration of its parameters.
- In other words, a signature is unique, not just by the method name, but in combination with the number of parameters, their types, and the order in which they are declared.
- **A method's return type is not part of the signature.**
- **A parameter name is also not part of the signature.**

# 4. Exceptions

- **Checked**
  - Checked exceptions are checked at compile time.
  - Examples: IOException, SQLException, FileNotFoundException.
- **Unchecked**
  - Unchecked exceptions are checked at run time.
  - Examples: NullPointerException, ArrayIndexOutOfBoundsException.

# 5. Coupling

- Coupling: How much work is involved in changing something?
  - **Coupling** is important everywhere:
    - An engine is tightly coupled to a Car.
    - A wheel is loosely coupled to a Car.
    - You can take a laptop anywhere you go.
    - A computer, on the other hand, is a little bit more difficult to move.
  - Coupling is even more important in building great software.
    - Only thing constant in technology is change:
      - Business requirements change.
      - Frameworks change.
      - Code changes.
    - We want Loose Coupling as much as possible.
    - We want to make functional changes with as less code changes as possible.

# 6. Lombok

## 6.1. What is Project Lombok?

- Java is often criticized for having too much ceremonial code.
- For example, `getters` and `setters`.
- **Project Lombok** provides annotations which help eliminate the writing of ceremonial code.
  - `@Getter` - generates getters.
  - `@Setter` - generates setters.
- Using Project Lombok will save you time and give you cleaner code.

## 6.2. Project Lombok History

- Started by Reinier Zwitserloot - @surial on Twitter and Roel Spilker before 2009.
- Why "Lombok"? Java is also an island in Indonesia. Lombok is the second island east of the Island Java.
- Lombok is also Indonesian for chilli.
- Hence tag line - "Spicing up your Java"

## 6.3. How Lombok Works

- Hooks in via the Annotation processor API.
  - The AST (raw source code) is passed to Lombok for code generation before java continues.
  - Thus, produces properly compiled Java code in conjunction with the Java compiler.
- NOTE: Code is generated and complied. **No run-time performance penalty**.
- If you write an implantation of a method Project Lombok would generate, your code is used.
  - Make it easy to override Lombok generated code.
  - Example: custom setters.

## 6.4. Project Lombok and IDEs

- Since compiled code is change, and source files are not, IDE's can get confused by this.
- More of an issue for IDEs several years old.
- Modern IDEs such as IntelliJ, Eclipse (and offshoots), Netbeans support Project Lombok.
- Plugin Installation may be necessary.

## 6.5. Project Lombok Features

- `val`
  - Declares final local variable.
- `var`
  - Declares mutable local variable.
- `@Getter`
  - Creates getter methods for all properties.
- `@Setter`
  - Creates setter for all non-final properties.
- `@ToString`
  - Generates String of classname, and each field separated by commas.
  - Optional parameter to include field names.
  - Optional parameter to include call to the super toString method.
- `@EqualsAndHashCode`
  - Generates implementations of `equals(Object other)` and `hashCode()`.
  - By default will use all **non-static**, **non-transient** properties.
  - Can optionally exclude specific properties.
- `@NoArgsConstructor`
  - Generates no args constructor.
  - Will cause compiler error if there are final fields.
  - Can optionally force, which will initialize final fields with 0 / false / null.
- `@RequiredArgsContructor`
  - Generates a constructor for all fields that are final or marked `@NonNull`.
  - Constructor will throw a NullPointerException if any @NonNull fields are null
- `@Data`
  - Generates typical boilerplate code for POJOs.
  - Combines - `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode`, `@RequiredArgsConstructor`.
  - No constructor is generated if constructors have been explicitly declared.
- `@Value`
  - The immutable variant of `@Data`.
  - All fields are made private and final by default.
- `@NonNull`
  - Set on parameter of method or constructor and a `NullPointerException` will be thrown if parameter is null.
- `@Builder`
  - Implements the **builder pattern** for object creation.
  ```java
      Book
        .builder()
        .id(id)
        .name("Bible")
        .author("God")
        .isbn("0061042579")
        .price(22.23f)
        .createdDate(LocalDateTime.now())
        .updateDate(LocalDateTime.now())
        .build();
  ```
- `@SneakyThrows`
  - Throw checked exceptions without declaring in calling method's throws clause.
- `@Syncronized`
  - A safer implementation of Java's synchronized.
- `@Log`
  - Creates a Java util logger.
  - Java util loggers are awful.
- `@Slf4j`
  - Creates a SLF4J logger.
  - Recommended - SLF4J is a generic logging facade.
  - Spring Boot's default logger is LogBack.

# 7. Maven

- **What is Maven?**
  - Maven is a Project Management tool.
- Most popular use of Maven is for build management and dependencies.
- **What Problems Does Maven Solve?**
  - When building your Java project, you may need additional JAR files.
    - For example: Spring, Hibernate, Commons Logging, JSON etc...
- One approach is to download the JAR files from each project web site.
- Manually add the JAR files to your build path / classpath.

## 7.1. Without Maven

![Without Maven](/Images/ProjectWithoutMaven.png)

## 7.2. Maven Solution

- Tell Maven the projects we are working with (dependencies)
  - Spring, Hibernate etc...
  - Maven will go out and download the JAR files for those projects for us.
  - And Maven will make those JAR files available during compile/run.
  - Think of Maven as your friendly helper / personal shopper.

### 7.2.1. How Maven Works

![How Maven Works](/Images/HowMavenWorks.png)

## 7.3. Handling JAR Dependencies

- When Maven retrieves a project dependency.
- It will also download supporting dependencies.
- For example: Spring depends on commons-logging...
- Maven will handle this for us automagically.

## 7.4. Building and Running

- When you build and run your app...
- Maven will handle class / build path for us.
- Based on config file, Maven will add JAR files accordingly.

## 7.5. Standard Directory Structure

- Normally when we join a new project.
- Each development team dreams up their own directory structure.
- Not ideal for new comers and not standardized.
- Maven solves this problem by providing a standard directory structure.
  ![Manve Standard Directory Structure](/Images/MavenStandardDirectoryStructure.png)
- For new developers joining a project.
- They can easily find code, properties files, unit tests, web files etc...
- Most major IDEs have built-in support for Maven.
- Eclipse, IntelliJ, NetBeans etc.
- IDEs can easily read/import Maven projects.
- Maven projects are portable.
- Developers can easily share projects between IDEs.
- [Simple Maven Project](/Examples/starter-maven-project/)

## 7.6. Advantages of Maven

- Dependency Management.
  - Maven will find JAR files for us.
  - No more missing JARs.
- Building and Running your Project.
  - No more build path / classpath issues.
- Standard directory structure.

## 7.7. POM File - pom.xml

- POM file = **P**roject **O**bject **M**odel file.
- Configuration file for your project.
  - Basically your "shopping list" for Maven.
- Located in the root of your Maven project `pom.xml`.
- POM File Structure:
  ![Simple POM File](/Images/SimplePOMFile.png)

## 7.8. Project Coordinates

- [Apache Maven - Naming Conventions](https://maven.apache.org/guides/mini/guide-naming-conventions.html)
- Project Coordinates uniquely identify a project:
  ```xml
    <groupId>com.myfirstapp</groupId>
    <artifactId>my-first-app</artifactId>
    <version>1.0-SNAPSHOT</version>
  ```
- Elements:
  | Name | Description |
  |-------------|-----------------------------------------------------------------------------------------------------------|
  | Group ID | Name of company, group, or organization, convention is to use reverse domain name: com.myfirstapp |
  | Artifact ID | Name for this project: my-first-app |
  | Description | A specific release version like: 1.0, 1.6, 2.0, if project is under active development then: 1.0-SNAPSHOT |

### 7.8.1. Example of Project Coordinates

```xml
  <groupId>com.myfirstapp</groupId>
  <artifactId>my-first-app</artifactId>
  <version>1.0.RELEASE</version>
```

```xml
  <groupId>org.springframework</groupId>
  <artifactId>spring-context</artifactId>
  <version>6.0.0</version>
```

```xml
  <groupId>org.hibernate.orm</groupId>
  <artifactId>hibernate-core</artifactId>
  <version>6.1.4.Final</version>
```

### 7.8.2. Adding Dependencies

```xml
  <project ...>
  ...
  <dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>6.0.0</version>
    </dependency>
    <dependency>
      <groupId>org.hibernate.orm</groupId>
      <artifactId>hibernate-core</artifactId>
      <version>6.1.4.Final</version>
    </dependency>
  ...
  </dependencies>
  </project>
```

## 7.9. Dependency Coordinates

- To add given dependency project, we need
  - **Group ID**, **Artifact ID**
  - **Version** is optional...
    - Best practice is to include the version (repeatable builds)
- May see this referred to as: **GAV** = **G**roup ID, **A**rtifact ID and **V**ersion.
- How to Find Dependency Coordinates
  - Option 1: Visit the project page (spring.io, hibernate.org etc)
  - Option 2: Visit https://central.sonatype.com (easiest approach)

# 8. Json manipulation

[Json manipulation](/Examples/JsonManipulation/README.md)

# 9. Java and Maven install

https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26

# 10. Maven

## 10.1. Commands

- **Run from command prompt!**
- Create new Maven project
  - `mvn archetype:generate -DgroupId=com.example -DartifactId=ClassName -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
- Test...
  - `mvn clean install -U`

## 10.2. Erros

- Problem:
  ```
    [WARNING] source value 8 is obsolete and will be removed in a future release
    [WARNING] target value 8 is obsolete and will be removed in a future release
  ```
- Solution 1
  - Project Structure > Project Settings > Project > set `SDK` and `Language Level` fields.
  - Project Structure > Project Settings > Modules > set Language Level field.
  - (Optional) Settings > Build, Execution, Deployment > Compiler > Java Compiler > `Set Per-module bytecode version` field.
- Solution 2
  - Edit `pom.xml`
  ```xml
    <properties>
        <maven.compiler.source>23</maven.compiler.source>
        <maven.compiler.target>23</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
  ```
- Solution 3
  - Edit `pom.xml`
  ```xml
    <properties>
      <java.version>23</java.version>
      <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
  ```
