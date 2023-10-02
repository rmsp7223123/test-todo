package com.example.test_todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test_todo.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {

    private lateinit var binding : ActivityChatBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater);
        setContentView(binding.root);
    };
}