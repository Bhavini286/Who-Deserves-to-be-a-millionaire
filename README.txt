Who Deserves to Be a Millionaire
=============================

Summary
-------
This is a small Java Swing implementation of a "Who Wants to Be a Millionaire" style quiz.
Main packages and responsibilities:
- WHM: GUI, UI helpers, timer, sound manager, random events and UI widgets.
- Questions: QuestionManager that reads Questions/Questions.csv and provides question data.
- Lifelines: lifeline implementations (50/50, add time, hint, switch).
- GameController: application entry point (main).

Step-by-Step instructions to run game
------------------------------------
1.Go to the GameController class
2.Press the run button. 
3.A Start screen should appear where there is a Start button. 
4.Click the Start button and play away!

Behaviour 
---------
- Game starts from the Start screen. Clicking START loads the first question and starts a 60s countdown.
- A tick sound loops during each question. The ticking stops when the user answers or time runs out.
- The user can exit at any point and choose not to continue with the game.
- Win and lose screens show appropriate messages; win screen displays the amount won.
- 50/50 lifeline removes two wrong options (see Lifelines\Fifty.java).
- Add time lifeline adds an extra 10 seconds to the time.
- The hint lifeline provides the player with a hint that is displayed in a new window.
- The switch lifeline provides the user with a different question to answer for that level.

User experience
---------------
- Visual Consistency: Use of the custom Grenze font and a consistent color scheme 
  (off-white, dark brown, and gold accents) creates a cohesive and branded look, mirroring the 
  atmosphere of the original show.
- Thematic Backgrounds: Using BackgroundPanel to load thematic images for the start, question, 
  win, and lost screens instantly immerses the user in the game's setting.
- Sound effects: sound effects throughout the game that will enhance the user's experience by giving the 
  user a feel of the real life TV show and adds a dramatic touch.
- Roadmap: The feature provides an eye-catching visual indicator of the different levels and target amount.
  The roadmap also updates with the user's advancement in the game, alllowing them to keep track of their progress.
- Time Management: The CountdownTimer provides clear, continuous feedback on the remaining time, 
  creating necessary tension while setting explicit time constraints for the player.
- Outcome Clarity: Separate Win and Lost screens, with the final amount clearly displayed on the win screen, 
  provide clear feedback on the game's conclusion and provides closure and emotional payoff to the game. 
- Lifelines: The inclusion of lifelines provides players with tools to manage risk and recover from 
  challenging questions, reducing frustration and extending gameplay.
- Random Events: The feature adds unexpected variation, keeping the experience fresh and engaging by 
  introducing elements of unpredictability.
- Control and Exit: The "Exit" button allows a player to secure their current winnings at any time, 
  giving them control over their risk exposure and preventing a total loss.

Advanced OOP Principles
-----------------------
- Keeping tasks separate: The code that builds the screens and buttons (GUI.java) is completely separate from the code that handles 
  the actions when you click those buttons (Listener.java).
- Composition: The main screen is not one giant block of code. Instead, it is built by putting together many smaller, independent objects.
- Custom Inheritance for UI: Classes like LifelineButton and BackgroundPanel extend standard Swing components (JButton and JPanel). 
  This uses inheritance to add custom functionality
- Polymorphism via Interfaces: The Listener.java class implements the ActionListener and MouseListener interfaces. This is a classic use 
  of polymorphism, where the game framework calls the defined methods (actionPerformed, mouseClicked), and the Listener object provides its 
  specific behavior for each event.
- Strong Encapsulation: Classes like CountdownTimer and FontLoader fully encapsulate their internal workings. 
- Strategy Pattern (Implied in Lifelines): Lifelines (AddTime, Fifty, Hint, LifelineSwitch) are instantiated as separate objects within GUI. 
  This suggests they likely implement a common Lifeline interface or superclass, allowing the main game logic to interact with all lifeline 
  types uniformly through a common method like use().

Features testing and how to access
----------------------------------
1.Basic Game Window
What to test:
- Whether the main window launches correctly.
- "Start" button visibility and functionality.
How to access:
- Run the program -> the title window appears -> click the Start button to open the first question.

2. Question and Answer Panel
What to test:
- Whether a question and four answer options are displayed.
- If clicking an answer triggers the correct or incorrect response logic.
How to access:
- After clicking "Start," the question panel appears with options A, B, C & D.

3. Question Progression by Level
What to test:
- Increasing question difficulty with each correct answer.
- Proper level tracking and non-repeating questions.
How to access:
- Continue answering questions correctly -> move through different difficulty levels.

4. Game Progression and Winning/Losing Conditions
What to test:
- Correct money updates after each round.
- Appropriate window opens when the player wins, loses, or exits.
How to access:
- Select correct answers to progress. Wrong answers or running out of time triggers the You Lose window.

5. Timer Functionality
What to test:
- Whether the 60-second countdown starts automatically for each question.
- Correct timer end behavior (loss message if time runs out).
How to access:
- Wait without answering -> confirm the timer runs out and triggers the lose screen.

6. Lifelines System
What to test:
- Each lifeline works as intended and can only be used once.
- Lifeline buttons disappear after use.
How to access:
- During any question, click on a lifeline icon:
- 50/50 - removes two incorrect answers.
- Hint - displays a clue.
- Switcch Question - loads a new question.
- Add 30 Seconds - resets the timer.

7. Random Event Cards System
What to test:
- Random events appear at unpredictable times.
- Effects (positive or negative) apply correctly for that question only.
How to access:
- Play through multiple rounds random pop-ups appear automatically with event descriptions.

8. Roadmap Button
What to test:
- Correct display of the money ladder and player progress.
- Timer continues running in the background when opened.
How to access:
- During a question, click the Roadmap button to open and click the close button to close it.

9. Exit Button
What to test:
- Correct termination of the game when exiting voluntarily.
- Display of the "You Win" message with earned money.
How to access:
- During gameplay, click the Exit button on the question panel.

10. End Game Popup
What to test:
- Appropriate window appears depending on outcome (Win or Lose).
- Correct styling and displayed prize amount.
How to access:
- Trigger by either finishing all levels, losing a question, or running out of time.

11. Graphics and UI Styling
What to test:
- Consistency of color schemes, font styles, and button design.
- Readability and aesthetic alignment with the game's theme.
How to access:
- Observe the interface throughout different game windows (Start, Question, Win/Lose).

12. Sound Effects
What to test:
- Sounds play at appropriate times (question start, win, lose).
- Audio does not lag or interfere with gameplay.
How to access:
- Start the game -> answer questions -> observe when sounds trigger for different actions.

13. Menu Panel
What to test:
- Accessibility of the panel during gameplay.
- Accurate display of lifeline status, money earned, and roadmap access.
How to access:
- While playing, navigvate the Menu Panel from the question window.

*More detail in the how to demos of the backlog


