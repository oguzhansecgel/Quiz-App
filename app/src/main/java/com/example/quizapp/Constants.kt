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
            2
        )
        questionList.add(que3)

        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "France","Japan","Brazil","Kuwai",
            3
        )
        questionList.add(que4)
        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_bolivia,
            "Bangladesh","Chile","Bolivia","Cameroon",
            3
        )
        questionList.add(que5)
        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Canada","Denmark","Czech Republic","Austria",
            2
        )
        questionList.add(que6)
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Indonesia", "Germany", "Fiji", "France",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Brazil", "Denmark", "Germany", "India",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Kuwait", "New Zealand", "India", "Australia",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "France", "Kuwait", "Germany", "Brazil",
            2
        )
        questionList.add(que10)

        val que11 = Question(
            11, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Spain", "Japan", "New Zealand", "China",
            3
        )
        questionList.add(que11)

        questionList.shuffle() // karıştırma fonksiyonu .
        return questionList
    }

}