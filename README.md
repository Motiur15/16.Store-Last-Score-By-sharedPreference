#  Score Saver App (SharedPreferences)

##  Project Overview

This is a simple Android application built using **Java** and **Android Studio**.  
The app allows users to increase or decrease a score and automatically saves the last score using **SharedPreferences**.

Even after closing and reopening the app, the previous score is restored.

---

##  Features

-  Increase score by 10  
-  Decrease score by 10  
-  Save score using SharedPreferences  
-  Load saved score on app restart  
- Simple and clean UI  

---

## Tech Stack

- Java  
- Android Studio  
- TextView  
- Button  
- SharedPreferences  

---

##  How It Works

1. The app displays a score on the screen.
2. User can:
   - Tap **Increase** button → score increases by 10  
   - Tap **Decrease** button → score decreases by 10  
3. Every time the score changes:
   - It is saved using **SharedPreferences**
4. When the app restarts:
   - The last saved score is loaded automatically

---

##  Project Structure

res/
├── layout/
│ └── activity_main.xml
├── values/
│ ├── strings.xml
│ └── colors.xml


---

##  Learning Outcomes

This project helped me understand:

- How to use **SharedPreferences**
- Saving and retrieving data locally
- Handling button click events
- Updating UI dynamically
- Data persistence in Android apps

---

##  Future Improvements

- Add reset score button  
- Add animation on score change  
- Use SharedPreferences with multiple data  
- Improve UI design  

---

##  Author

**Md. Motiur Rahman**  
Android Developer (Java)

---

 If you like this project, consider giving it a star!
