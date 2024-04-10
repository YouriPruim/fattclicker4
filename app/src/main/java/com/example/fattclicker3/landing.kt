package com.example.fattclicker3

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import java.math.RoundingMode
import java.text.DecimalFormat

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [landing.newInstance] factory method to
 * create an instance of this fragment.
 */
class landing : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var kilo = 0.0

fun setup (view: View) {
    view.findViewById<TextView>(R.id.kilo_getal).text = kilo.toString()
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_landing, container, false)
        val mediaPlayer = MediaPlayer.create(context, R.raw.europapa)
            mediaPlayer.start()



        setup(view)



        view.findViewById<ImageButton>(R.id.imageButton6).setOnClickListener {
            kilo = kilo + 0.1
            if(kilo = 100 && kilo >= 85) {
                // red
            } else if(kilo =100 && kilo )

            }
            ...
            val df = DecimalFormat("#.#")//set decimal format here
            df.roundingMode = RoundingMode.CEILING
            println(df.format(kilo))
            view.findViewById<TextView>(R.id.kilo_getal).text = df.format(kilo).toString()
        }

        //find the button and set its onclick
        view.findViewById<ImageButton>(R.id.imageButton8).setOnClickListener {
            //Use the navigation tree in the current view to navigate to the next page

            val bundle = bundleOf("kilo" to kilo)
            mediaPlayer.pause()
            Navigation.findNavController(view).navigate(R.id.action_landing_to_shop, bundle)

        }

        view.findViewById<ImageButton>(R.id.imageButton3).setOnClickListener {
            kilo = kilo + 5.0
            val df = DecimalFormat("#.#")//set decimal format here
            df.roundingMode = RoundingMode.CEILING
            println(df.format(kilo))
            view.findViewById<TextView>(R.id.kilo_getal).text = kilo.toString()

        }

        view.findViewById<ImageButton>(R.id.imageButton2).setOnClickListener {
            kilo = kilo + 10.0
            val df = DecimalFormat("#.#")//set decimal format here
            df.roundingMode = RoundingMode.CEILING
            println(df.format(kilo))
            view.findViewById<TextView>(R.id.kilo_getal).text = kilo.toString()
        }

        view.findViewById<ImageButton>(R.id.imageButton5).setOnClickListener {
            kilo = kilo + 25.0
            val df = DecimalFormat("#.#")//set decimal format here
            df.roundingMode = RoundingMode.CEILING
            println(df.format(kilo))
            view.findViewById<TextView>(R.id.kilo_getal).text = kilo.toString()
        }


        //find the button and set its onclick
        view.findViewById<ImageButton>(R.id.imageButton10).setOnClickListener {
            //Use the navigation tree in the current view to navigate to the next page

            val bundle = bundleOf("kilo" to kilo)
            mediaPlayer.pause()
            Navigation.findNavController(view).navigate(R.id.instellingen, bundle)


        }






        view.findViewById<TextView>(R.id.kilo_getal).text = kilo.toString()


        return view
    }

        val companion = Unit
        companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment landing.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            landing().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}