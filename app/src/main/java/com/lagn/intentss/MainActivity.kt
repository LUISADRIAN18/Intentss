package com.lagn.intentss

import android.content.Intent
import android.content.IntentSender
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.net.URI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {

        //Toast.makeText(this,"Hiciste click", Toast.LENGTH_SHORT).show()

        //var uri = Uri.parse("http://www.tic.unam.mx")
        //
        //startActivity(Intent(Intent.ACTION_VIEW, uri))

        /*var uri = Uri.parse("tel:5556581111")

        startActivity(Intent(Intent.ACTION_DIAL, uri))*/

        /*var uri = Uri.parse("geo:0,0?q=FI+UNAM")
        startActivity(Intent(Intent.ACTION_VIEW, uri))*/

        //SMS

        /*val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("smsto:5556581111")
            putExtra("sms_body", "Hola me gustari mas infprmacion")
        }

        if (intent.resolveActivity(packageManager)!= null){


            startActivity(intent)
        }*/

        val mays = arrayOf("luis_adrian-garve@hotmail.es", "luisadriangn@gmail.com")
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            type = "*/*"
            data = Uri.parse("mailto:") // only email apps should handle this
            putExtra(Intent.EXTRA_EMAIL, mays)
            putExtra(Intent.EXTRA_SUBJECT,"Feedback")
            putExtra(Intent.EXTRA_TEXT,"Feedback")



        }

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
        else
        {
            Toast.makeText(this,"Hiciste no app dispocclick", Toast.LENGTH_SHORT).show()


        }





    }
}