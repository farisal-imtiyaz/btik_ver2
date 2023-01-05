package com.example.btik.login
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.btik.dashboard.Dashboard
import com.example.btik.databinding.ActivityLoginBinding
import com.example.btik.register.RegisterActivity
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    lateinit var auth : FirebaseAuth
    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.toRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding.loginBtn.setOnClickListener{

            val email = binding.loginEmail.text.toString()
            val password = binding.loginPassword.text.toString()

            //validasi empty email
            if (email.isEmpty()){
                binding.loginEmail.error = "Email Must fill"
                binding.loginPassword.requestFocus()
                return@setOnClickListener
            }

            //validasi email tidak sesuai
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.loginEmail.error = "Email Not Valid"
                binding.loginEmail.requestFocus()
                return@setOnClickListener
            }

            //validasi password
            if (password.isEmpty()){
                binding.loginPassword.error = "Password Must fill"
                binding.loginPassword.requestFocus()
                return@setOnClickListener
            }

            //validasi panjang password
            if (password.length <= 8){
                binding.loginPassword.error = "Password at least 8 Character"
                binding.loginPassword.requestFocus()
                return@setOnClickListener
            }

            checkAccountOnFirebase(email, password)
        }
    }

    private fun checkAccountOnFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if(it.isSuccessful){
                    Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show()
                    preferenceHelper.setIsLogin(true)
                    preferenceHelper.setEmail(it.result.user?.email ?: "")
                    startActivity(Intent(this, Dashboard :: class.java))
                    finishAffinity()

                }
                else{
                    Toast.makeText(this,"${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
        }
    }
}