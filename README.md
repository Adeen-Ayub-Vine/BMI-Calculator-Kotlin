# BMI Calculator App

### Overview
This is a simple **BMI Calculator** Android application built using **Kotlin** in Android Studio. The app allows users to calculate their Body Mass Index (BMI) by entering their **weight** in kilograms (kg) and **height** in centimeters (cm).

### Features
- **User Input**: Users enter their weight in kg and height in cm.
- **BMI Calculation**: The app calculates the BMI based on the formula:

  \[
  \text{BMI} = \frac{\text{Weight (kg)}}{(\text{Height (m)})^2}
  \]

  Since the height is entered in centimeters, the formula in the app converts the height to meters by dividing by 100.
  
- **BMI Categories**: Once the BMI is calculated, the user’s BMI is displayed along with the corresponding category:
  - Underweight (BMI < 18.5)
  - Healthy (BMI 18.5 - 24.9)
  - Overweight (BMI 25 - 29.9)
  - Obese (BMI 30 - 34.9)
  - Highly Obese (BMI 35 - 39.9)
  - Extremely Obese (BMI > 40)

### How It Works
1. The user inputs their weight in kilograms and height in centimeters.
2. On pressing the **Calculate BMI** button, the app calculates their BMI.
3. The result is displayed along with the appropriate BMI category.

### Screenshots
![BMI Calculator Screenshot](bmi%20image.jpeg)

### Installation and Setup
1. Clone the repository:

   ```bash
   git clone https://github.com/Adeen-Ayub-Vine/BMI-Calculator-Kotlin.git
