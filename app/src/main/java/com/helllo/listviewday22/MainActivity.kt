package com.helllo.listviewday22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        //Yha maine "taskList" name ka Ek ArrayList bnaya joki "string" type ka h Or iss "taskList" me String De diya
        val taskList = arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("DO Workout")
        taskList.add("Complete the App Dev Project")
        taskList.add("Do POTD of GFG and LeetCode")
        taskList.add("Do DSA, C, C++, DBMS, OS, CN, OOPS, Aptitude and Verbal")
        taskList.add("Work On Resume")

        taskList.add("Attend Exam")
        taskList.add("DO Workout")
        taskList.add("Complete the App Dev Project")
        taskList.add("Do POTD of GFG and LeetCode")
        taskList.add("Do DSA, C, C++, DBMS, OS, CN, OOPS, Aptitude and Verbal")
        taskList.add("Work On Resume")

        taskList.add("Attend Exam")
        taskList.add("DO Workout")
        taskList.add("Complete the App Dev Project")
        taskList.add("Do POTD of GFG and LeetCode")
        taskList.add("Do DSA, C, C++, DBMS, OS, CN, OOPS, Aptitude and Verbal")
        taskList.add("Work On Resume")

        taskList.add("Attend Exam")
        taskList.add("DO Workout")
        taskList.add("Complete the App Dev Project")
        taskList.add("Do POTD of GFG and LeetCode")
        taskList.add("Do DSA, C, C++, DBMS, OS, CN, OOPS, Aptitude and Verbal")
        taskList.add("Work On Resume")

        //Yha mai inbuild way me "Adapter" Function/Method bnaya usme Default layout liya android se or btaya ki
        //"taskList" se sabhi String lelo Or "listView" me "get/set adapter" karke Sabhi "taslList" show kardo
        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adapterForMyListView



        //Yah  maine "listView" ko bola ki agar Tumhare "items" yani "item List/ String List" jab koi click kare
        //to usko tum yeh "toast" show karo
        listView.setOnItemClickListener { parent, view, position, id ->

            //Yha maine ek variable bnaya "text" phir usme, String se "text" liya or "concatenation"(+) perform kiya
            val text = "Clicked on Item : " + (view as TextView).text.toString()

            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }

    }
}