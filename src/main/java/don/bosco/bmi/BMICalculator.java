package don.bosco.bmi;

import java.util.Scanner;

public class BMICalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the BMI Calculator");
        
        // Input weight
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        // Input height
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        // Calculate BMI
        double bmi = calculateBMI(weight, height);
        
        // Output BMI and description
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("BMI Category: " + getBMICategory(bmi));

         // Agradecimiento
         System.out.println("Thank you for using our BMI calculator!");
        
        scanner.close();
    }
    
    /**
     * Calculate BMI using the formula BMI = weight / (height * height)
     */
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    
    /**
     * Get the BMI category based on the BMI value
     */
    public static String getBMICategory(double bmi) {
        if (bmi <16) {
            return """
            Severe thinness
            Recommendations
            Consult a healthcare provider: Seek immediate medical advice to address potential underlying health issues.
            Balanced diet: Incorporate nutrient-dense foods to increase calorie intake in a healthy manner.
            Regular meals: Ensure frequent and balanced meals throughout the day.
            Nutritional supplements: Consider supplements if recommended by a healthcare professional.
            """;
        } else if (bmi >= 16 && bmi < 17) {
            return """
            Moderate thinness
            Recommendations
            Medical evaluation: Consult a healthcare provider to understand potential causes.
            Increase caloric intake: Focus on foods high in healthy fats, proteins, and carbohydrates. 
            Monitor progress: Regularly track your weight and health with your healthcare provider.
            Physical activity: Engage in strength training exercises to build muscle mass.
            """;
        } else if (bmi >= 17 && bmi < 18.5) {
            return """
            Slight thinness
            Recommendations 
            Balanced nutrition: Incorporate a variety of foods to ensure adequate nutrient intake.
            Healthy snacks: Include healthy snacks between meals to boost calorie intake. 
            Hydration: Maintain proper hydration to support overall health.
            Moderate exercise: Engage in regular, moderate physical activity to promote appetite and muscle gain.
            """;
        } else if (bmi >= 18.5 && bmi < 25) {
            return """
            Normal Weight
            Recommendations
            Maintain healthy habits: Continue a balanced diet and regular physical activity.
            Regular check-ups: Schedule periodic health evaluations to ensure ongoing well-being.
            Stay active: Incorporate a mix of cardiovascular and strength-training exercises.
            Healthy lifestyle: Avoid smoking and limit alcohol consumption to maintain optimal health.
            """;
        } else if (bmi >= 25 && bmi < 30) {
            return """
            Overweight
            Recommendations 
            Healthy eating: Adopt a balanced diet rich in fruits, vegetables, whole grains, and lean proteins.
            Regular exercise: Aim for at least 150 minutes of moderate aerobic activity per week.
            Weight management: Monitor your weight and consider a weight loss plan if advised by a healthcare provider.
            Behavioral changes: Focus on long-term lifestyle changes rather than quick fixes.
            """;
        } else if (bmi >= 30 && bmi < 35) {
            return """
            Mild Obesity
            Professional advice: Seek guidance from a healthcare provider or a nutritionist for a tailored weight loss plan.
            Diet modifications: Reduce intake of high-calorie, low-nutrient foods and increase consumption of nutrient-dense foods.
            Increased physical activity: Engage in more frequent and varied physical activities.
            Support groups: Consider joining support groups or programs for additional motivation and guidance.
            """;
        } else if (bmi >= 35 && bmi < 40) {
            return """
            Moderate Obesity
            Medical support: Work closely with healthcare providers to develop a comprehensive weight management plan.
            Structured diet plan: Follow a structured diet plan designed to promote weight loss.
            Consistent exercise: Increase physical activity levels, focusing on both cardiovascular and strength training exercises.
            Monitor health: Regularly monitor health parameters like blood pressure, glucose levels, and cholesterol.
            """;
        } if (bmi >=40) {
            return """
            Morbid Obesity
            Specialized care: Seek specialized medical care, potentially including bariatric surgery options.
            Comprehensive plan: Follow a comprehensive weight loss plan under medical supervision.
            Mental health support: Address any psychological aspects related to obesity with the help of a therapist or counselor.
            Lifestyle changes: Implement significant lifestyle changes, including diet, exercise, and behavior modifications, to improve overall health.
            """;
        }
     return null;   
    }
}
