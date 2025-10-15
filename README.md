\# Incubyte TDD Assessment – String Calculator (Java)



This project implements the \*\*String Calculator Kata\*\* following \*\*Test-Driven Development (TDD)\*\* principles.  

It is based on the \[Incubyte TDD Assessment](https://blog.incubyte.co/blog/tdd-assessment/).



---



\## 🧠 Problem Statement



Create a simple String Calculator with the following requirements, implementing one step at a time using TDD:



1\. \*\*An empty string\*\* should return `0`.

2\. \*\*A single number\*\* should return that number.

3\. \*\*Two numbers, comma-delimited\*\*, should return their sum.

4\. \*\*Two numbers, newline-delimited\*\*, should return their sum.

5\. \*\*Three or more numbers\*\* should return their sum.

6\. \*\*Allow custom delimiters\*\* (e.g., `//;\\n1;2` should return `3`).

7\. \*\*Negative numbers\*\* should throw an exception with the message `"Negatives not allowed"` followed by the negative numbers.

8\. \*\*Numbers greater than 1000\*\* should be ignored.



---



\##⚙️ Project Structure

├── pom.xml

├── README.md

src/

└── com/

&nbsp;   └── inc/

&nbsp;       ├── Main.java

&nbsp;       ├── StringCalculator.java

&nbsp;       └── test/

&nbsp;           └── StringCalculatorTest.java

Languages used

\- \*\*Language:\*\* Java 21

\- \*\*Testing Framework:\*\* JUnit 5 Jupiter


\*\*<dependency>

&nbsp;           <groupId>org.junit.jupiter</groupId>

&nbsp;           <artifactId>junit-jupiter</artifactId>

&nbsp;           <version>5.10.2</version>

&nbsp;           <scope>test</scope>

&nbsp;       </dependency>
  added an external jar


\*\* Git Repo
git clone https://github.com/Bhaveshbhosal/StringCal.git


