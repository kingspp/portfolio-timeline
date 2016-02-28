package com.prathyush.portfolio;

import com.prathyush.portfolio.pojo.TimeLinePOJO;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Prathyush SP on 2/27/2016.
 */
public class TimeLine {

    public static List<TimeLinePOJO> getTimeline(){
        List<TimeLinePOJO> timeLine = new LinkedList<>();

        //July

        //Aug
        timeLine.add(getTimeLinePojo("August 8", "Sentiment Analysis" , "The Algorithm is based on Bayes Probabilistic model. Sentiment words are detected by using pos-comments and neg-comments text files. The probability of each word is based on the appearance of"
                +"the word in a sentence which results in the sentence being either positive or negative. The pos/neg files are constructed based on IMDB's Sentimental reviews and twitter sentiments."));

        //Sep
        timeLine.add(getTimeLinePojo("September 5","Math ML Course", "The course which ran 6 months with weekend exams, enabled us to have a better understanding of Mathematical concepts in Machine Learning Techniques."));
        timeLine.add(getTimeLinePojo("September 25", "Neural Networks", "Neural networks are models of biological neural structures. The starting point for most neural networks is a model neuron. This neuron consists of multiple inputs and a single output. Each input is modified by a weight, which multiplies with the input value. The neuron will combine these weighted inputs and, with reference to a threshold value and activation function, use these to determine its output."));

        //OCT
        timeLine.add(getTimeLinePojo("October 9", "Restricted Boltzmann Machine (RBM)", "In layman's terms, it is a generative stochastic neural network that can learn a probability distribution over its set of inputs. It is composed of three layers, Visible Layer, Hidden Layer and Bias Layer"));
        timeLine.add(getTimeLinePojo("October 15", "Image Utilities", "This is my contribution to RZT Utilities, a set of Image processing methods such as encoding and decoding, Grayscala to Monochrome conversions and others. The utils will be used for image data extraction in the near future. "));
        timeLine.add(getTimeLinePojo("October 18", "Natural Language Processing(NLP)", "Natural language processing (NLP) is a field of computer science, artificial intelligence, and computational linguistics concerned with the interactions between computers and human (natural) languages. As such, NLP is related to the area of human–computer interaction. I worked on parsing Natural language commands to Machine level commands"));
        timeLine.add(getTimeLinePojo("October 25", "Sense Algorithm (Summary)", "The essence of the sentence lies in the context. Usually the context is described by the adjectives or adverbs. The usage and frequency of these words predict the importance of the sentence. Hence TF-IDF algorithm is used to calculate the frequency of these words, later Probability Theory is applied to find the probability of the sentence being important."));
        timeLine.add(getTimeLinePojo("October 29", "ML Game", "I was assigned to understand and implement Q-Learning Technique. What better way to do it than building a game which incorporates Q- Learning! So a Tic Tac Toe game was built, it had the ability to learn from human moves and decide between draw and win"));

        //November
        timeLine.add(getTimeLinePojo("November 2", "Parser Utilities", "My contribution to RZT Utilities. Parser utilities can be used to extract and store data from various filetype such as CSV,TSV,XLS,XLSX file formats. We will use this utilities in data-preparation stage of BigBrain. "));
        timeLine.add(getTimeLinePojo("November 10", "Numenta Reserch", "Numenta is a Machine Intelligence Technology used to solve complex problems, and the core is modeled upon the Human Brain's Interaction, Think, Apply functionalities."));
        timeLine.add(getTimeLinePojo("November 22","NER Tagging", "Named Entities , one of the most important features in email - Information Extraction, a tough one too. I wrote wrappers on top of Stanford NER which increased the accuracy around 25%"));

        //DEC
        timeLine.add(getTimeLinePojo("December 2","IManagement", "Our contribution towards solving problems in Razorthink Company. IManagement is a smart webapp aimed to manage Razorthink's inventory. Myself and Shreesha are proud to say that we utilized 4 complete Saturdays (Nightouts) and built the application. Shreesha worked on backend and myself on frontend. The application uses latest technologies like sprint-boot, hibernate, angular and materialize framework. "));
        timeLine.add(getTimeLinePojo("December 22", "Word2Vec", "The hottest topic in ML and AI. Word2vec is a group of related models that are used to produce so-called word embeddings. These models are shallow, two-layer neural networks, that are trained to reconstruct linguistic contexts of words: the network is shown a word, and must guess which words occurred in adjacent positions in an input text."));
        timeLine.add(getTimeLinePojo("December 30", "Neo4J", "An opensource graph based database. The idea was to capture the various relations between a person and entities such as another person, organization and location. The algorithms will be used for Information Extraction form electronic mails."));

        //JAN
        timeLine.add(getTimeLinePojo("January 2", "Feature Discovery and Pattern Clustering", "An amazing research and development in the field of AI led by Nandu and Shams. We wrote algorithms based on ML top tools such as Word2Vec, Cosine Similarity, Eucledian distance , NER, POS Prediction and others. "));
        timeLine.add(getTimeLinePojo("January 19","BigBrain", "The future!. Currently I am working in BigBrain team. We incorporate todays top notch tech to build a product for Big Data Analysis."));

        //FEB
        timeLine.add(getTimeLinePojo("February 6", "Proud Moment - Mysore Recruitment Drive", "6 Months - All it took to move from interviewee to interviewer. My college, my lecturers were proud when they saw their student visit the college for recruitment drive. What a change in just 6 months. I am thankful to RZT "));
        timeLine.add(getTimeLinePojo("February 28", "Here I am", "Thank you RZT for an exciting Journey. I can feel the future to be even more compelling and zestful :)"));


        return timeLine;
    }

    public static TimeLinePOJO getTimeLinePojo (String date, String title, String description){
        TimeLinePOJO timeLinePOJO = new TimeLinePOJO();
        timeLinePOJO.setDate(date);
        timeLinePOJO.setTitle(title);
        timeLinePOJO.setDescription(description);
        return  timeLinePOJO;
    }
}