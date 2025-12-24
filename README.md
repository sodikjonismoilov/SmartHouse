# Smart Home Simulator (Java)

## Overview

This project is a simple console-based **Smart Home Simulator** written in Java. 
It allows a user to control home devices (like a light and a fan) using a menu-driven interface. 

>The goal of this project is learning **OOP** principles and **Java** programming language.

---
## Features 

-Toggle device on/off
-Display device status
-Menu-driven interface
-Clean separation between logic and behavior

---
---

## Device Class (`Device.java`)

`Represents a smart home device`.

### Fields

| Field  | Type      | Description          |
|--------|-----------|----------------------|
| `name` | `String`  | Device name          |
| `on`   | `boolean` | Current power state  |

> All fields are `private` to protect internal state.

### Methods

| Method     | Description                      |
|------------|----------------------------------|
| `toggle()` | Switches device ON/OFF           |
| `isOn()`   | Returns current state            |
| `getName()`| Returns device name              |
| `status()` | Returns readable status string   |

### Key OOP Concept

**Encapsulation:**  
The device manages its own state. External code cannot modify it directly.

---

## SmartHome Class (`SmartHome.java`)

Acts as the driver program.

### Responsibilities

- Create device objects
- Display menu
- Handle user input
- Call device methods using `switch`

### Menu Options### Key Concept

Control flow (`switch`) decides what action happens, but **logic lives inside objects**.

---

## What Was Learned

### 1. Objects
- Each `Device` object maintains its own state
- State persists across method calls

### 2. Classes
- Classes model real-world concepts
- `Device` = behavior + data
- `SmartHome` = application flow

### 3. Private Modifier
- `private` fields prevent accidental misuse
- State can only change through methods

### 4. Methods
- Methods define allowed actions
- External code requests behavior, it does not manipulate state

### 5. Constructors
- Ensure objects start in a valid state
- Devices always start OFF

### 6. Switch Statements
- Used for menu-based decision making
- Keeps logic organized and readable

### 7. Separation of Concerns
- Device logic is isolated from user interaction
- Code is easier to maintain and extend

---

## Why This Project Matters

This project demonstrates real OOP fundamentals used in:

- Backend systems
- Desktop applications
- Mobile apps
- Large frameworks (Spring, Android, etc.)

> It focuses on **clarity and correctness**, not complexity.

---

## Possible Extensions

- [ ] Store devices in an array or list
- [ ] Add more device types
- [ ] Use inheritance (`Light extends Device`)
- [ ] Add persistence (save/load states)
- [ ] Add polymorphism

---

## Conclusion

This project reinforces core Java and OOP concepts through a small, complete, and understandable application.

It prioritizes **design thinking**, **clean structure**, and **object responsibility** over unnecessary complexity.