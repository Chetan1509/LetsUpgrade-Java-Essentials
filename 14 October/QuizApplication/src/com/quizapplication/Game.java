package com.quizapplication;

public class Game
{
    Question[] questions = new Question[5];
    Player player = new Player();

    public void initGame()
    {
        for (int i=0;i<5;i++)
        {
            questions[i]=new Question();
        }
        questions[0].question = "\nIn which decade was the American Institute of Electrical Engineers (AIEE) founded?";
        questions[0].option1 = "1850s";
        questions[0].option2 = "1880s";
        questions[0].option3 = "1930s";
        questions[0].option4 = "1950s";
        questions[0].correctAnswer = 2;

        questions[1].question = "\nWhat is part of a database that holds only one type of information?";
        questions[1].option1 = "Report";
        questions[1].option2 = "Field";
        questions[1].option3 = "Record";
        questions[1].option4 = "File";
        questions[1].correctAnswer = 2;

        questions[2].question = "\n'OS' computer abbreviation usually means ?";
        questions[2].option1 = "Order of Significance";
        questions[2].option2 = "Open Software";
        questions[2].option3 = "Operating System";
        questions[2].option4 = "Optical Sensor";
        questions[2].correctAnswer = 3;

        questions[3].question = "\n'.MOV' extension refers usually to what kind of file?";
        questions[3].option1 = "Image file";
        questions[3].option2 = "Animation/movie file";
        questions[3].option3 = "Audio file";
        questions[3].option4 = "MS Office document";
        questions[3].correctAnswer = 2;

        questions[4].question = "\nWho developed Yahoo?";
        questions[4].option1 = "Dennis Ritchie & Ken Thompson";
        questions[4].option2 = "David Filo & Jerry Yang";
        questions[4].option3 = "Vint Cerf & Robert Kahn";
        questions[4].option4 = "Steve Case & Jeff Bezos";
        questions[4].correctAnswer = 2;
    }

    public void play()
    {
        player.getDetails();
        for(int i=0;i<5;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Correct");
                player.score+=2;
            }
            else
            {
                System.out.println("Incorrect");
                player.score--;
            }
        }
        System.out.println("\n" + player.name + " your score is " + player.score + " out of 10.");
    }
}
