# Scrabble Dictionary
Version 0.0.0: September 16, 2016

by [Karen Freeman-Smith](https://github.com/karenfreemansmith)

## Description
Final Project for Week 2, Java at Epicodus. Build a dictionary using Java & Spark with JUnit tests and RESTful routing. (you can view original submission on "original-submission" branch)

### Specifications
Create a program that allows users to create a dictionary to keep track of various words and their multiple definitions.

| Behavior                               | Input                                      | Output                                     |
|----------------------------------------|--------------------------------------------|--------------------------------------------|
| Creates a word                         | "dog"                                      | "dog"                                      |
| Creates a definition                   | "an animal that barks"                     | "an animal that barks"                     |
| Stores multiple definitions for a word | "an animal that barks", "derogatory slang" | "an animal that barks", "derogatory slang" |
|                                        |                                            |                                            |
|                                        |                                            |                                            |
|                                        |                                            |                                            |

* Make two classes:
  * One for Word
  * One for Definition
* The homepage of the app should list all Words, and allow users to click a Word to view all its Definitions.
* A user should be able to add their own Word to the dictionary.
* When viewing a Word, users should also be able to add one or more unique Definitions.

### Further Exploration: scrabble
Game Play:
* Player order determined by drawing one tile, first letter in alphabet goes first (blank beats A)
* Each player draws 7 tiles to fill rack
* Turn options:
  * Pass (turn ends, scores 0)
  * Exchange tiles (any number of tiles may be returned, equal number drawn to replace them)
  * Play one or more tiles (score from all words formed added to total score)
  * Opposing players may challenge a word played, if not legitimate, word is removed and turn forfieted, otherwise challenging player loses next turn.

| Behavior | Input | Output |
|----------------------------|----------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Game Board with 15x15 grid | new board | rows=15, cols=15 |
| Squares (on board): |  |![sample board](/board.png)  |
| - premium | 0,1,2,3,4 | none, double letter score, triple letter score, double word score, triple word score |
| - location | 1,1 | row=1, column=1 (or A1) |
| - tile | placeTile | true |
| Tiles: | 100 total tiles | 2 blank tiles (scoring 0 points)1 point: E ×12, A ×9, I ×9, O ×8, N ×6, R ×6, T ×6, L ×4, S ×4, U ×42 points: D ×4, G ×33 points: B ×2, C ×2, M ×2, P ×24 points: F ×2, H ×2, V ×2, W ×2, Y ×25 points: K ×18 points: J ×1, X ×110 points: Q ×1, Z ×1 |
| - value | 1 | 1 |
| - mark | A | A |
| - used | drawTile | true |
| Player: |  |  |
| - tiles | getTiles, placeTile, drawTile | 7, -1, +1 |
| - words | turn | adds word to list |
| - score | start, end_turn | 0, +word score |
| Word: |  |  |
| - name | "word" | "word" |
| - definitions | "a unit of a language", "a turn in scrabble" | "a unit of a language", "a turn in scrabble" |
| - score | "word" | (4+1+1+2)=8 |

Objectives:
* An instance of one class appears in the method of another class (ie: Objects are successfully saved within other objects).
* Spark routes process GET and POST requests/responses successfully
* Spark routes follow RESTful conventions.
* All previous code review standards have been met (see below)
* If prompted, you are able to discuss the flow of your code and concepts behind it with an instructor using the correct terminology.
* Project is in a polished, portfolio-quality state.
* Application works as expected.
* Tests have complete coverage for all behaviors.
* All tests are formatted correctly and pass.
* Classes are encapsulated and getter methods are used to access properties.
* Logic is easy to understand.
* Build files are discluded from Git using a .gitignore file.
* Code and Git documentation follows best practices (descriptive variables names, proper indentation and spacing, separation between front and back-end logic, detailed commit messages in the correct tense, and a well-formatted README).

## Setup/Installation
* Clone directory
* Type 'gradle run' inside the directory
* Navigate to 'http://localhost:5467'

## Support & Contact
For questions, concerns, or suggestions please email karenfreemansmith@gmail.com

## Known Issues
* N/A

## Technologies Used
Java, JUnit, Spark, Gradle

## Legal
*Licensed under the GNU General Public License v3.0*

Copyright (c) 2016 Copyright _Karen Freeman-Smith_ All Rights Reserved.
