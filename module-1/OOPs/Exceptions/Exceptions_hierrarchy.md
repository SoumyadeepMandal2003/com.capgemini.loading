md
Copy code
# Java Exception Hierarchy

## Overview
In Java, all exceptions and errors are subclasses of `Throwable`.
The hierarchy is divided into **Error** and **Exception**.

```

## Exception Hierarchy Tree

Object
└── Throwable
├── Error
│ ├── VirtualMachineError
│ │ ├── OutOfMemoryError
│ │ └── StackOverflowError
│ ├── LinkageError
│ └── AssertionError
│
└── Exception
├── RuntimeException (Unchecked)
│ ├── NullPointerException
│ ├── ArithmeticException
│ ├── ArrayIndexOutOfBoundsException
│ ├── ClassCastException
│ └── IllegalArgumentException
│
└── Checked Exceptions
├── IOException
│ ├── FileNotFoundException
│ └── EOFException
├── SQLException
├── ClassNotFoundException
└── InterruptedException

```

## Classification

### 1. Error
- Serious problems that applications should **not try to handle**
- Mostly caused by JVM or environment issues

Examples:
- `OutOfMemoryError`
- `StackOverflowError`

---

### 2. Exception

#### a. Checked Exceptions
- Checked at **compile time**
- Must be **handled or declared** using `try-catch` or `throws`

Examples:
- `IOException`
- `SQLException`
- `ClassNotFoundException`

#### b. Unchecked Exceptions (RuntimeException)
- Checked at **runtime**
- Usually caused by **programming mistakes**

Examples:
- `NullPointerException`
- `ArithmeticException`
- `ArrayIndexOutOfBoundsException`

---

## Key Rules
- Catch **checked exceptions**
- Prevent **runtime exceptions** through good design
- Never attempt to recover from **errors**

---

## Diagram Usage (draw.io)
- Use inheritance arrows (`extends`)
- Separate **Error**, **Checked**, and **Unchecked** visually
- Avoid clutter—clarity > completeness