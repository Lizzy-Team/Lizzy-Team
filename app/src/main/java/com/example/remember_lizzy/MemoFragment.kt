package com.example.remember_lizzy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.switchmaterial.SwitchMaterial
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MemoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MemoFragment : Fragment() {

    private lateinit var shortFormEditText: EditText
    private lateinit var paragraphFormEditText: EditText
    private lateinit var lowPriorityButton: Button
    private lateinit var mediumPriorityButton: Button
    private lateinit var highPriorityButton: Button
    private lateinit var reminderSwitch: SwitchMaterial
    private lateinit var submitButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_memo, container, false)

        shortFormEditText = view.findViewById(R.id.shortFormEditText)
        paragraphFormEditText = view.findViewById(R.id.paragraphFormEditText)
        lowPriorityButton = view.findViewById(R.id.btn_low)
        mediumPriorityButton = view.findViewById(R.id.btn_med)
        highPriorityButton = view.findViewById(R.id.btn_hi)
        reminderSwitch = view.findViewById(R.id.reminderSwitch)
        submitButton = view.findViewById(R.id.btn_buat)

        view.findViewById<View>(R.id.closeButton).setOnClickListener {
            // Jika fragment diletakkan di dalam activity, gunakan requireActivity().finish()
            // Jika fragment diletakkan di dalam fragment (nested fragment), gunakan requireActivity().supportFragmentManager.popBackStack()
            requireActivity().finish()
        }

        lowPriorityButton.setOnClickListener { onPriorityButtonClick("Rendah") }
        mediumPriorityButton.setOnClickListener { onPriorityButtonClick("Menengah") }
        highPriorityButton.setOnClickListener { onPriorityButtonClick("Tinggi") }

        submitButton.setOnClickListener { onSubmitButtonClick() }

        return view
    }

    private fun onPriorityButtonClick(priority: String) {
        Toast.makeText(requireContext(), "Selected Priority: $priority", Toast.LENGTH_SHORT).show()
    }

    private fun onSubmitButtonClick() {
        val shortFormText = shortFormEditText.text.toString()
        val paragraphFormText = paragraphFormEditText.text.toString()
        val reminderEnabled = reminderSwitch.isChecked

        // Lakukan sesuatu dengan data yang telah diambil
        displayFormData(shortFormText, paragraphFormText, reminderEnabled)
    }

    private fun displayFormData(
        shortFormText: String,
        paragraphFormText: String,
        reminderEnabled: Boolean
    ) {
        // Implementasikan logika untuk menangani data formulir yang diambil
        val message =
            "Short Form: $shortFormText\nParagraph Form: $paragraphFormText\nReminder Enabled: $reminderEnabled"
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
    }
}
