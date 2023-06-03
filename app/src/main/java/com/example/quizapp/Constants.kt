package com.example.quizapp

object Constants {

    fun getQuestions():ArrayList<Question>
    {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Austrialia",
            "Armenia","Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina","Turkey","Germany","Belgium",
            4
        )
        questionList.add(que2)

        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "ABD","Australia","Germany","Syria",
            4
        )
        questionList.add(que3)
        return questionList
    }

}