# Prototype-Design-Pattern

## Overview

The **Prototype Pattern** is a creational design pattern that creates new objects by **cloning existing instances** (prototypes) instead of instantiating new ones from scratch. This reduces the cost of object creation, especially when initialization is expensive.

---

## How It Works

1. `AnimalRegistry` stores prototype instances of `Sheep`, `Cow`, and `Horse`.
2. When a new animal is needed, the registry calls `clone()` on the matching prototype.
3. The clone is returned as an `Animal` — no `new` keyword required in client code.

---

## Key Relationships

- `Animal` extends `Cloneable` — enables Java's native clone mechanism.
- `Sheep`, `Cow`, and `Horse` all implement `Animal`.
- `AnimalRegistry` depends on `Animal` and holds references to each concrete prototype.
- `TestAnimal` uses `AnimalRegistry` as the sole entry point for object creation.

---

## When to Use

- Object creation is costly (e.g., DB calls, complex setup).
- You need many similar objects with minor variations.
- You want to avoid subclassing just to configure objects differently.




## UML Class Diagram
![UML Class Diagram](https://github.com/angelynbondoc/Prototype-Design-Pattern/blob/main/UML%20Class%20Diagram_Protype%20Design%20Pattern.png)
