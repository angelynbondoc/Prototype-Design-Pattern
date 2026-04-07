# Prototype-Design-Pattern

## Overview

The **Prototype Pattern** is a creational design pattern that creates new objects by **cloning existing instances** (prototypes) instead of instantiating new ones from scratch. This reduces the cost of object creation, especially when initialization is expensive.

---

## Structure

### `Animal` *(interface)*
The prototype interface. Extends `Cloneable`.

| Member | Type | Description |
|---|---|---|
| `clone()` | `Animal` | Returns a copy of the object |
| `makeSound()` | `void` | Outputs the animal's sound |
| `getType()` | `String` | Returns the animal type name |

---

### Concrete Prototypes

#### `Sheep`
| Field | Type |
|---|---|
| `legs` | Integer |
| `sound` | String |
| `food` | String |
| `name` | String |

#### `Cow`
| Field | Type |
|---|---|
| `legs` | Integer |
| `sound` | String |
| `food` | String |

#### `Horse`
| Field | Type |
|---|---|
| `legs` | Integer |
| `sound` | String |
| `food` | String |
| `color` | String |

---

### `AnimalRegistry`
Holds pre-configured prototype instances and creates clones on request.

**Fields:**
- `sheepPrototype: Sheep`
- `cowPrototype: Cow`
- `horsePrototype: Horse`

**Methods:**

| Method | Return | Description |
|---|---|---|
| `createSheep(String name)` | `Animal` | Clones the sheep prototype |
| `createCow()` | `Animal` | Clones the cow prototype |
| `createHorse()` | `Animal` | Clones the horse prototype |

---

### `TestAnimal`
Entry point. Calls `AnimalRegistry` to produce animal clones.

| Method | Description |
|---|---|
| `main()` | Demonstrates prototype cloning via the registry |

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
