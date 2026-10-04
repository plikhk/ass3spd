# ass3spd
# Assignment 3: Bridge Pattern — Option A (Drawing)

## Student Information
* **Name:** Alikhan Kadashov
* **Group:** SE-2524 (Astana IT University)
* **Course:** ShP-2216 Software Design Patterns (2026-2027)
* **Topic:** Option A — Drawing (`Shape` / `Renderer`)

---

## 1. Project Overview & Architecture
This application implements the **Bridge Design Pattern** to separate the abstraction hierarchy (`Shape`) from the implementation hierarchy (`Renderer`), allowing both to vary independently without a combinatorial explosion of subclassess

### Source Code Role Map
| Component Role | Class Name | File Path |
| :--- | :--- | :--- |
| **Abstraction Base** | `Shape` | `src/Shape.java` |
| **Refined Abstraction A1** | `Circle` | `src/Circle.java` |
| **Refined Abstraction A2** | `Square` | `src/Square.java` |
| **Implementor Interface** | `Renderer` | `src/Renderer.java` |
| **Implementation I1** | `VectorRenderer` | `src/VectorRenderer.java` |
| **Implementation I2** | `RasterRenderer` | `src/RasterRenderer.java` |
| **Implementation I3 (Extension)** | `AsciiRenderer` | `src/AsciiRenderer.java` |
| **Client / Demo** | `Main` | `src/Main.java` |

### Key Code Locations & Requirements Reference
* **Bridge Field:** Stored as `protected Renderer renderer;` inside `src/Shape.java`.
* **Execution Method:** Exposed via `public String execute()` in `src/Shape.java`.
* **Runtime Implementation Switch:** Implemented via `public void setImplementation(Renderer renderer)` in `src/Shape.java`.
* **T5 Runtime Check:** Executed and validated inside `src/Main.java` (verifies object reference equality `==`, preservation of ID and domain data, and changing outputs before/after the switch)

---

## 2. How to run

Go into the Main and run it man
