package com.example.recycleview;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recycleview.adapters.SubjectAdapter;
import com.example.recycleview.models.Chapter;
import com.example.recycleview.models.Subject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSubject;
    private SubjectAdapter subjectAdapter;
    private ArrayList<Subject> subjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        subjects = prepareData();

        subjectAdapter = new SubjectAdapter(subjects, MainActivity.this);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        rvSubject.setLayoutManager(manager);
        rvSubject.setAdapter(subjectAdapter);

    }

    private void initComponents() {
        rvSubject = findViewById(R.id.rvSubject);

    }

    private ArrayList<Subject> prepareData() {
        ArrayList<Subject> subjects = new ArrayList<Subject>();

        Subject website = new Subject();
        website.id = 1;
        website.subjectName = "Website Development";
        website.chapters = new ArrayList<Chapter>();

        Chapter chapter1 = new Chapter();
        chapter1.id = 1;
        chapter1.chapterName = "Introduction to HTML";
        chapter1.imageUrl = "https://e7.pngegg.com/pngimages/780/934/png-clipart-html-logo-html5-logo-icons-logos-emojis-tech-companies-thumbnail.png";

        Chapter chapter2 = new Chapter();
        chapter2.id = 2;
        chapter2.chapterName = "CSS Basics";
        chapter2.imageUrl = "drawable/path/css.png";

        Chapter chapter3 = new Chapter();
        chapter3.id = 3;
        chapter3.chapterName = "JavaScript Fundamentals";
        chapter3.imageUrl = "drawable/path/javascript.png";

        Chapter chapter4 = new Chapter();
        chapter4.id = 4;
        chapter4.chapterName = "Responsive Design";
        chapter4.imageUrl = "drawable/path/responsive.png";

        Chapter chapter5 = new Chapter();
        chapter5.id = 5;
        chapter5.chapterName = "Introduction to Web Hosting";
        chapter5.imageUrl = "drawable/path/hosting.png";

        website.chapters.add(chapter1);
        website.chapters.add(chapter2);
        website.chapters.add(chapter3);
        website.chapters.add(chapter4);
        website.chapters.add(chapter5);

        Subject mobile = new Subject();
        mobile.id = 2;
        mobile.subjectName = "Mobile Development";
        mobile.chapters = new ArrayList<Chapter>();

        Chapter chapter6 = new Chapter();
        chapter6.id = 6;
        chapter6.chapterName = "Introduction to Mobile Development";
        chapter6.imageUrl = "drawable/path/intro.png";

        Chapter chapter7 = new Chapter();
        chapter7.id = 7;
        chapter7.chapterName = "Building User Interfaces";
        chapter7.imageUrl = "drawable/path/ui.png";

        Chapter chapter8 = new Chapter();
        chapter8.id = 8;
        chapter8.chapterName = "Handling User Input";
        chapter8.imageUrl = "drawable/path/input.png";

        Chapter chapter9 = new Chapter();
        chapter9.id = 9;
        chapter9.chapterName = "Data Storage and Persistence";
        chapter9.imageUrl = "drawable/path/database.png";

        mobile.chapters.add(chapter6);
        mobile.chapters.add(chapter7);
        mobile.chapters.add(chapter8);
        mobile.chapters.add(chapter9);

        Subject data = new Subject();
        data.id = 3;
        data.subjectName = "Data Analysis";
        data.chapters = new ArrayList<Chapter>();

        Chapter chapter10 = new Chapter();
        chapter10.id = 10;
        chapter10.chapterName = "Introduction to Data Analysis";
        chapter10.imageUrl = "drawable/path/intro_data_analysis.png";

        Chapter chapter11 = new Chapter();
        chapter11.id = 11;
        chapter11.chapterName = "Data Collection Techniques";
        chapter11.imageUrl = "drawable/path/data_collection.png";

        Chapter chapter12 = new Chapter();
        chapter12.id = 12;
        chapter12.chapterName = "Data Cleaning and Preprocessing";
        chapter12.imageUrl = "drawable/path/data_cleaning.png";

        Chapter chapter13 = new Chapter();
        chapter13.id = 13;
        chapter13.chapterName = "Exploratory Data Analysis (EDA)";
        chapter13.imageUrl = "drawable/path/eda.png";

        data.chapters.add(chapter10);
        data.chapters.add(chapter11);
        data.chapters.add(chapter12);
        data.chapters.add(chapter13);

        Subject ml = new Subject();
        ml.id = 4;
        ml.subjectName = "Machine Learning";
        ml.chapters = new ArrayList<Chapter>();

        Chapter chapter14 = new Chapter();
        chapter14.id = 14;
        chapter14.chapterName = "Introduction to Machine Learning";
        chapter14.imageUrl = "drawable/path/intro_ml.png";

        Chapter chapter15 = new Chapter();
        chapter15.id = 15;
        chapter15.chapterName = "Supervised Learning";
        chapter15.imageUrl = "drawable/path/supervised.png";

        Chapter chapter16 = new Chapter();
        chapter16.id = 16;
        chapter16.chapterName = "Unsupervised Learning";
        chapter16.imageUrl = "drawable/path/unsupervised.png";

        Chapter chapter17 = new Chapter();
        chapter17.id = 17;
        chapter17.chapterName = "Feature Engineering";
        chapter17.imageUrl = "drawable/path/feature_engineering.png";

        Chapter chapter18 = new Chapter();
        chapter18.id = 18;
        chapter18.chapterName = "Model Evaluation and Metrics";
        chapter18.imageUrl = "drawable/path/model_evaluation.png";

        ml.chapters.add(chapter14);
        ml.chapters.add(chapter18);
        ml.chapters.add(chapter15);
        ml.chapters.add(chapter16);
        ml.chapters.add(chapter17);

        Subject devops = new Subject();
        devops.id = 5;
        devops.subjectName = "DevOps";
        devops.chapters = new ArrayList<Chapter>();

        Chapter chapter19 = new Chapter();
        chapter19.id = 19;
        chapter19.chapterName = "Introduction to DevOps";
        chapter19.imageUrl = "drawable/path/intro_devops.png";

        Chapter chapter20 = new Chapter();
        chapter20.id = 20;
        chapter20.chapterName = "Continuous Integration (CI)";
        chapter20.imageUrl = "drawable/path/ci.png";

        Chapter chapter21 = new Chapter();
        chapter21.id = 21;
        chapter21.chapterName = "Continuous Deployment (CD)";
        chapter21.imageUrl = "drawable/path/cd.png";

        Chapter chapter22 = new Chapter();
        chapter22.id = 22;
        chapter22.chapterName = "Infrastructure as Code (IaC)";
        chapter22.imageUrl = "drawable/path/iac.png";

        Chapter chapter23 = new Chapter();
        chapter23.id = 23;
        chapter23.chapterName = "Monitoring and Logging";
        chapter23.imageUrl = "drawable/path/monitoring.png";

        devops.chapters.add(chapter19);
        devops.chapters.add(chapter20);
        devops.chapters.add(chapter21);
        devops.chapters.add(chapter22);
        devops.chapters.add(chapter23);

        subjects.add(website);
        subjects.add(mobile);
        subjects.add(data);
        subjects.add(ml);
        subjects.add(devops);

        return subjects;
    }
}