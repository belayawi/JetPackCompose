package com.bright.listofmessages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bright.listofmessages.ui.theme.ListOfMessagesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListOfMessagesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Conversation(
                        listOf(
                            Program(
                                "Bachelor of Applied Arts & Sciences",
                                "The Bachelor of Applied Arts & Sciences program offers a flexible curriculum designed to prepare students for diverse career paths. Students can choose to study online or on-campus, gaining a strong foundation in both the arts and sciences. The program emphasizes practical skills and knowledge, preparing graduates to adapt to various professional environments. It integrates interdisciplinary studies, promoting a holistic approach to education. Students will engage in hands-on projects, enhancing their learning experience and career readiness."
                            ),
                            Program(
                                "Bachelor’s Specializations: Ayurveda Wellness & Integrative Health",
                                "The specialization in Ayurveda Wellness & Integrative Health provides students with comprehensive knowledge of traditional Ayurvedic practices. Available both online and on-campus, this program combines modern health sciences with ancient wisdom. Students learn about holistic health approaches, dietary principles, and lifestyle practices that promote well-being. The curriculum includes practical training and case studies, preparing graduates for careers in wellness coaching, integrative health, and holistic medicine."
                            ),
                            Program(
                                "Bachelor’s Specializations: Art Therapy – pre-professional",
                                "The pre-professional specialization in Art Therapy is an online program that prepares students for advanced studies in art therapy. The curriculum covers foundational principles of psychology, therapeutic techniques, and the use of art as a healing tool. Students will explore various art mediums and their therapeutic applications, developing skills to support individuals' emotional and mental health. This program is ideal for those interested in pursuing a career in counseling, mental health services, or creative therapies."
                            ),
                            Program(
                                "Bachelor’s Specializations: Yoga & Ayurveda Wellness",
                                "The Yoga & Ayurveda Wellness specialization, available online, integrates the ancient practices of yoga and Ayurveda. Students will learn about the principles of yoga, asanas, pranayama, meditation, and Ayurvedic lifestyle practices. The program emphasizes the connection between mind, body, and spirit, promoting holistic health and well-being. Graduates will be equipped to guide others in achieving balance and health through these traditional practices."
                            ),
                            Program(
                                "Bachelor’s Specializations: Life & Wellness Coaching",
                                "The Life & Wellness Coaching specialization is an online program designed to train students in the principles and practices of coaching. The curriculum covers motivational techniques, goal setting, and strategies for personal development and wellness. Students will learn how to support clients in achieving their health and life goals, fostering positive change and self-improvement. This program is ideal for those looking to become certified wellness coaches or life coaches."
                            ),
                            Program(
                                "Bachelor’s Specializations: Consciousness & Human Potential",
                                "The Consciousness & Human Potential specialization explores the depths of human consciousness and its development. Offered both online and on-campus, the program combines scientific research with experiential learning. Students will study consciousness theories, meditation practices, and techniques for personal growth. The curriculum aims to unlock human potential, fostering self-awareness, creativity, and leadership skills. Graduates will be prepared for careers in personal development, education, and leadership."
                            ),
                            Program(
                                "Bachelor’s Specializations: Positive Psychology & Consciousness",
                                "This online specialization in Positive Psychology & Consciousness focuses on the study of well-being and human flourishing. Students will learn about positive psychology interventions, mindfulness practices, and strategies for enhancing life satisfaction. The program integrates the latest research in psychology with practical applications for personal and professional development. Graduates will be equipped to apply positive psychology principles in various fields, including education, counseling, and organizational development."
                            ),
                            Program(
                                "Bachelor’s Specializations: Cinematic Arts & New Media",
                                "The Cinematic Arts & New Media specialization, available both online and on-campus, offers a comprehensive education in film and digital media production. Students will learn about storytelling, cinematography, editing, and new media technologies. The program includes hands-on projects, allowing students to create their own films and media content. Graduates will be prepared for careers in the film industry, digital media production, and multimedia storytelling."
                            ),
                            Program(
                                "Bachelor’s Specializations: Creative Writing",
                                "The Creative Writing specialization, offered both online and on-campus, nurtures students' writing talents and creative expression. The curriculum covers various genres of writing, including fiction, poetry, and non-fiction. Students will engage in writing workshops, receive feedback from peers and instructors, and develop their unique voice. The program prepares graduates for careers as authors, editors, and content creators."
                            ),
                            Program(
                                "Bachelor’s Specializations: Regenerative Organic Agriculture",
                                "The Regenerative Organic Agriculture specialization focuses on sustainable farming practices that restore and enhance soil health. Offered both online and on-campus, the program teaches principles of organic farming, permaculture, and regenerative agriculture. Students will learn how to implement farming techniques that promote biodiversity, improve soil fertility, and reduce environmental impact. Graduates will be prepared to lead the way in sustainable agriculture and food production."
                            ),
                            Program(
                                "Bachelor’s Specializations: Sustainable & Regenerative Living",
                                "This specialization in Sustainable & Regenerative Living, available both online and on-campus, educates students on creating sustainable communities and lifestyles. The curriculum covers topics such as renewable energy, sustainable building practices, and ecological design. Students will engage in projects that promote environmental stewardship and sustainable living. Graduates will be equipped to implement sustainable practices in various fields, including urban planning, environmental consulting, and community development."
                            ),
                            Program(
                                "Business Administration",
                                "The Business Administration program provides students with a solid foundation in business principles and practices. Available both online and on-campus, the curriculum covers topics such as management, finance, marketing, and entrepreneurship. Students will develop critical thinking and problem-solving skills, preparing them for leadership roles in various business environments. The program emphasizes ethical decision-making and sustainable business practices."
                            ),
                            Program(
                                "BA in Art, Consciousness & Creative Practice",
                                "The BA in Art, Consciousness & Creative Practice is an on-campus program that integrates artistic expression with the study of consciousness. Students will explore various art forms, including painting, sculpture, and digital media, while also engaging in mindfulness and meditation practices. The program encourages creative exploration and personal growth, preparing graduates for careers in the arts and creative industries."
                            ),
                            Program(
                                "BFA in Art, Consciousness & Creative Practice",
                                "Similar to the BA program, the BFA in Art, Consciousness & Creative Practice offers a more intensive focus on artistic skills and techniques. Students will receive rigorous training in their chosen medium, participate in studio art courses, and engage in consciousness studies. The program prepares graduates for professional careers as artists, designers, and creative professionals."
                            ),
                            Program(
                                "Bachelor’s with Specialization in Art Therapy – pre-professional",
                                "This online specialization prepares students for advanced studies in art therapy. The curriculum includes foundational psychology courses, therapeutic techniques, and the use of art in healing. Students will develop skills to support individuals' emotional and mental health through creative expression."
                            ),
                            Program(
                                "MA in Studio Art",
                                "The MA in Studio Art is an on-campus graduate program that offers advanced training in visual arts. Students will engage in intensive studio practice, develop their artistic skills, and produce a body of work for exhibition. The program includes critical theory, art history, and professional development courses. Graduates will be prepared for careers as professional artists, art educators, and gallery directors."
                            ),
                            Program(
                                "Low-Residency MFA in Visual Art",
                                "This online MFA program provides a flexible format for working professionals. The low-residency model includes online coursework and periodic in-person residencies for intensive studio practice. Students will develop their artistic skills, receive feedback from faculty and peers, and produce a thesis exhibition. The program prepares graduates for advanced careers in the visual arts."
                            ),
                            Program(
                                "BA in Ayurveda Wellness & Integrative Health",
                                "The BA in Ayurveda Wellness & Integrative Health offers a comprehensive education in traditional Ayurvedic practices and modern health sciences. Available online or on-campus, the program covers holistic health approaches, dietary principles, and lifestyle practices. Graduates will be prepared for careers in wellness coaching and integrative health."
                            ),
                            Program(
                                "Bachelor’s with Specialization in Ayurveda Wellness & Integrative Health",
                                "This specialization provides focused training in Ayurvedic health practices. Students will learn about herbal medicine, Ayurvedic nutrition, and holistic health strategies. The program prepares graduates for roles in wellness and integrative health fields."
                            ),
                            Program(
                                "Bachelor’s with Specialization in Yoga & Ayurveda Wellness",
                                "Integrating yoga and Ayurveda, this online program teaches principles of yoga, meditation, and Ayurvedic lifestyle practices. Students will learn how to promote holistic health and well-being, preparing for careers in wellness coaching."
                            ),
                            Program(
                                "Bachelor’s with Specialization in Life & Wellness Coaching",
                                "This online program trains students in coaching principles and techniques. The curriculum includes motivational strategies, goal setting, and wellness practices. Graduates will be equipped to support clients in achieving their health and life goals."
                            ),
                            Program(
                                "MS in Maharishi AyurVeda & Integrative Medicine",
                                "The MS program offers advanced training in Maharishi AyurVeda and integrative medicine. Students will learn about Ayurvedic diagnostic techniques, herbal medicine, and integrative health strategies. The program prepares graduates for leadership roles in the field of integrative medicine."
                            ),
                            Program(
                                "Fellowship MS in Integrative Medicine and Ayurveda for Medical Professionals",
                                "This specialized MS program is designed for medical professionals seeking advanced knowledge in integrative medicine and Ayurveda. The curriculum covers diagnostic techniques, therapeutic practices, and holistic health approaches. Graduates will be equipped to integrate these practices into their medical careers."
                            ),
                            Program(
                                "MS in Aromatherapy & Ayurveda",
                                "The MS in Aromatherapy & Ayurveda combines the study of essential oils with Ayurvedic principles. Students will learn about the therapeutic uses of essential oils, blending techniques, and Ayurvedic health practices. The program prepares graduates for careers in wellness and integrative health."
                            ),
                            Program(
                                "PhD in Physiology & Health",
                                "The PhD program in Physiology & Health focuses on advanced research and knowledge in the fields of physiology and health. Students will engage in in-depth studies of human physiology, holistic health practices, and innovative research methodologies. The program prepares graduates for academic and research careers, contributing to the advancement of health sciences."
                            )
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun Conversation(messages: List<Program>) {
    LazyColumn {
        items(messages) {message -> MessageCard(message)}
    }
}

@Composable
fun MessageCard(message: Program) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.graduate),
            contentDescription = "Program",
            modifier = Modifier
                .clip(CircleShape)
                .size(70.dp)
                .border(width = 2.dp, shape = CircleShape, color = Color.Gray)
        )
        Spacer(modifier = Modifier.width(6.dp))

        var isExpanded by remember {
            mutableStateOf(false)
        }
        Column(
            modifier = Modifier.clickable { isExpanded = !isExpanded }
        ) {
            Text(
                text = message.name,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = message.description,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = if(isExpanded) Int.MAX_VALUE else 1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConversationPreview() {
    ListOfMessagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Conversation(
                listOf(
                    Program("author1", "The conversation is getting more interesting. It's time to play with animations! You will add the ability to expand a message to show a longer one, animating both the content size and the background color."),
                    Program("author2", "Composable functions can store local state in memory by using remember, and track changes to the value passed to mutableStateOf. Composables (and their children) using this state will get redrawn automatically when the value is updated. "),
                    Program("author3", "Android Compose revolutionizes the way developers create user interfaces for Android applications. With its declarative syntax, developers can describe UI components in a more intuitive and concise manner, focusing on what should be displayed rather than how it should be rendered. "),
                    Program("author4", "By encapsulating mutable state within composable functions, Compose ensures that UI components automatically update when the underlying state changes, eliminating the need for manual synchronization and reducing the risk of bugs. ")
                )
            )
        }
    }
}

data class Program(
    val name: String,
    val description: String
)