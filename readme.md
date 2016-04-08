Best Practices on how to use cucumber. Cucumber is a collaboration tool, not a testing tool!

## Cucumber Process = BDD | Specification by Example

*"Your cucumber features should drive your implementation, not reflect it."*

## Specification Workshops (Three Amigos)
* The people in charge of defining the requirements (business analysts) sit down with programmers and testers and discuss a feature to be implemented. 

* The three amigos come up with examples of how the software should behave, and write them down as Cucumber Scenarios.

## Outside-In Development (Programmers)
* Programmers run those Cucumber Scenarios with Cucumber, which tells them what needs to be implemented - what’s missing. They code a little bit, run Cucumber again and continue until the feature works as described.

* The technique is called Outside-In because programmers typically start with the functionality that is closest to the user (eg UI) and gradually work towards the guts of the system (business logic, persistence, messaging and so on) as they discover more of what needs to be implemented.

* This discovery is guided by failing tests, just like with TDD. The main difference is that Cucumber operates on a higher abstraction level, closer to the domain and farther away from classes and methods.

## Tagging:
Tagging has uses beyond separating scenarios into groups based on how fast they are:
* When they should be run: on @checkin, @hourly, @daily
* What external dependencies they have: @local, @database, @network
* Level: @functional, @system, @smoke
* Etc.

## Taken from:

[The worlds most misunderstood collaboration tool](https://cucumber.io/blog/2014/03/03/the-worlds-most-misunderstood-collaboration-tool)

[15 Expert Tips](https://blog.engineyard.com/2009/15-expert-tips-for-using-cucumber)
