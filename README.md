# ass3spd
# Assignment 3: Bridge Pattern — Option A (Drawing)

## Student Information
* **Name:** Alikhan Kadashov[cite: 3]
* **Group:** SE-2524 (Astana IT University)[cite: 1]
* **Course:** ShP-2216 Software Design Patterns (2026-2027)[cite: 1]
* **Topic:** Option A — Drawing (`Shape` / `Renderer`)[cite: 1]
* **Repository URL:** https://github.com/b2rb/bridge-pattern-a
* **Base Commit Hash:** `[вставь_сюда_хеш_своего_базового_коммита]`

---

## 1. Project Overview & Architecture
This application implements the **Bridge Design Pattern** to separate the abstraction hierarchy (`Shape`) from the implementation hierarchy (`Renderer`), allowing both to vary independently without a combinatorial explosion of subclasses[cite: 1, 2, 3].

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
* **T5 Runtime Check:** Executed and validated inside `src/Main.java` (verifies object reference equality `==`, preservation of ID and domain data, and changing outputs before/after the switch)[cite: 2].

---

## 2. Build and Execution Instructions

The project uses Java 17 (JDK 17) and relies strictly on standard JDK classes[cite: 1, 2, 3]. No external dependencies or IDE tools are required to compile and execute it[cite: 3].

### Step 1: Compile the Project
Open a terminal in the root folder of the project and run the following command to compile all sources listed in `sources.txt` into the `out/` directory[cite: 3]:
```bash
javac --release 17 -encoding UTF-8 -d out "@sources.txt"
