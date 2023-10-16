if (userInput != number[i]) {
                System.out.println("Wrong ");
                score++;
                break;
            } else {
                System.out.println("Correct Answer ");
            }

            if (i == numberLength - 1) {
                System.out.println("Congratulations! You guessed the entire sequence correctly.");
                score++;
            }