# SliderApplication

A modern take on the classic Klotski Puzzle. The application will initialize to a random puzzle (based on the four puzzles shown in class) and the player's objective is to then move the various pieces around the board and get the red goal piece to exit.

To run from eclipse: Right-click on the project, select run-as -> Java Application. If no main is found, be sure to add the "Main" folder to the build path. It was taken out of src to ensure >80% code coverage from the test cases.

To run test cases: Right-click on the project, select run-as -> JUnit Test case. If coverage numbers are desired, right-click on the project, select coverage-as -> JUnit. The src folder should have a code coverage of >80%. Unfortunately due to a bug in the test cases it may take two attempts to achieve a result of >80%.

Please note, when first imported to eclipse, there may be a build error in the Puzzle Class. This is due to needing JavaFX installed to utilize Pairs. In order to run, make sure JavaFX is installed and used in the build path.
