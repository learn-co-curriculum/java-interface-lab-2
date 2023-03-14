# More On Interfaces Lab

## Learning Goals

- Practice creating interfaces and implementing classes more.

## Introduction

In this lab, we will practice using interfaces some more!

Fork and clone this repository. When you do, you will see a `Camera` interface,
a `DigitalCamera` class, a `PhoneCamera` class, a `PolaroidCamera` class, a
`Main` class to act as a driver, and a `MainTest` class for unit testing.

## Instructions

Consider the following UML diagram:

![uml-diagram](https://curriculum-content.s3.amazonaws.com/java-mod-3/interface-lab/uml-camera-interface.PNG)

In this lesson, you will create a `Camera` interface with the following
implementing classes:

- DigitalCamera
- PolaroidCamera
- PhoneCamera

Per the UML diagram, the `Camera` class will have one abstract method and one
default method. (Reminder: abstract methods are italicized in UML diagrams and
static methods are underlined).

Consider the following starter code to help you:

```java
public interface Camera {

    int numberOfPhotographs();

    default String takePhotograph() {
        return "Taking a picture!";
    }
}
```

```java
public class DigitalCamera implements Camera {
    // Write your code here!
}
```

```java
public class PolaroidCamera implements Camera {
    // Write your code here!
}
```

```java
public class PhoneCamera implements Camera {
    // Write your code here
}
```

Complete each of the tasks below. It is important that each task be completed
in order (i.e., complete Task One, then Task Two, then Task Three).

### Task One

Finish implementing the subclasses of the `Camera` interface. Follow the given
instructions and tips:

- A `DigitalCamera` takes 2000 photographs.
- When taking a photograph with a `DigitalCamera`, it should return a `String`
  with the message "Taking a picture on my digital camera!"
- A `PolaroidCamera` takes 10 photographs.
- When taking a photograph with a `PolaroidCamera`, it should return a `String`
  with the message "Taking a picture on my polaroid camera!"
- A `PhoneCamera` takes 12600 photographs.

## Task Two

Now that you have implemented the subclasses, let's test them out! Consider the
`Main` driver class:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // Instantiate a list of Camera objects
    List<Camera> myCameras = new ArrayList<>();

    myCameras.add(new PhoneCamera());
    myCameras.add(new DigitalCamera());
    myCameras.add(new DigitalCamera());
    myCameras.add(new PolaroidCamera());

    int average = calculateAverage(myCameras);
    System.out.printf("The average number of photographs I can take is %d%n", average);

    takePhotographs(myCameras);


  }

  public static int calculateAverage(List<Camera> cameras) {
    // Task Two - Iterate through the list and find the average number of photographs
    return 0;
  }

  public static void takePhotographs(List<Camera> cameras) {
    // Task Three - Iterate through a list of Camera objects and "take a photograph" with each camera
  }
}
```

We have created a list of `Camera` objects and stored them in a `List` called
`myCameras` already. In this task, iterate through the list and find the average
number of photographs we can take given the cameras we have in the
`calculateAverage` method. Follow the given instructions and tips:

- Remember, the average is the sum divided by the number of items in the list.
- You may use the IntelliJ debugger and Java Visualizer if needed.
- Remove the `@Disabled` annotation from the `calculateAverageTest()` method in
  the unit test and run the test.

Consider the expected output of the program after completing this task:

```text
The average number of photographs I can take is 4152
```

### Task Three

Let's test the default method implementation!

In the `Main` driver class, iterate through a list of `Camera` objects and "take
a photograph" with each camera in the given list within the `takePhotographs`
method. Follow the given instructions and tips:

- Print out each time a `Camera` object "takes a photograph".
- You may use the IntelliJ debugger and Java Visualizer if needed.
- Remove the `@Disabled` annotation from the `takePhotographsTest()` method in
  the unit test and run the test.

Consider the expected output of the program after completing this task:

```text
Taking a picture!
Taking a picture on my digital camera!
Taking a picture on my digital camera!
Taking a picture on my polaroid camera!
```

## Expected Output

Consider the expected output of the `Main` driver class after completing all the
above tasks:

```text
The average number of photographs I can take is 4152
Taking a picture!
Taking a picture on my digital camera!
Taking a picture on my digital camera!
Taking a picture on my polaroid camera!
```
