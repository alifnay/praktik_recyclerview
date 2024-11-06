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

        Subject physics = new Subject();
        physics.id = 1;
        physics.subjectName = "Physics";
        physics.chapters = new ArrayList<Chapter>();

        Chapter chapter1 = new Chapter();
        chapter1.id = 1;
        chapter1.chapterName = "Atomic power";
        chapter1.imageUrl = "drawable/path/atoms.png";

        Chapter chapter2 = new Chapter();
        chapter2.id = 2;
        chapter2.chapterName = "Theory of relativity";
        chapter2.imageUrl = "drawable/path/sigma.png";

        Chapter chapter3 = new Chapter();
        chapter3.id = 3;
        chapter3.chapterName = "Magnetic field";
        chapter3.imageUrl = "drawable/path/magnet.png";

        Chapter chapter4 = new Chapter();
        chapter4.id = 4;
        chapter4.chapterName = "Practical 1";
        chapter4.imageUrl = "drawable/path/caliper.png";

        Chapter chapter5 = new Chapter();
        chapter5.id = 5;
        chapter5.chapterName = "Practical 2";
        chapter5.imageUrl = "drawable/path/micrometer.png";

        physics.chapters.add(chapter1);
        physics.chapters.add(chapter2);
        physics.chapters.add(chapter3);
        physics.chapters.add(chapter4);
        physics.chapters.add(chapter5);

        Subject chem = new Subject();
        chem.id = 2;
        chem.subjectName = "Chemistry";
        chem.chapters = new ArrayList<Chapter>();

        Chapter chapter6 = new Chapter();
        chapter6.id = 6;
        chapter6.chapterName = "Chemical bonds";
        chapter6.imageUrl = "drawable/path/bonds.png";

        Chapter chapter7 = new Chapter();
        chapter7.id = 7;
        chapter7.chapterName = "Sodium";
        chapter7.imageUrl = "drawable/path/sodium.png";

        Chapter chapter8 = new Chapter();
        chapter8.id = 8;
        chapter8.chapterName = "Periodic table";
        chapter8.imageUrl = "drawable/path/periodic_table.png";

        Chapter chapter9 = new Chapter();
        chapter9.id = 9;
        chapter9.chapterName = "Acid and Base";
        chapter9.imageUrl = "drawable/path/chem.png";

        chem.chapters.add(chapter6);
        chem.chapters.add(chapter7);
        chem.chapters.add(chapter8);
        chem.chapters.add(chapter9);

        Subject bio = new Subject();
        bio.id = 3;
        bio.subjectName = "Biology";
        bio.chapters = new ArrayList<Chapter>();

        Chapter chapter10 = new Chapter();
        chapter10.id = 10;
        chapter10.chapterName = "Bacteria";
        chapter10.imageUrl = "drawable/path/bacteria.png";

        Chapter chapter11 = new Chapter();
        chapter11.id = 11;
        chapter11.chapterName = "DNA and RNA";
        chapter11.imageUrl = "drawable/path/dna.png";

        Chapter chapter12 = new Chapter();
        chapter12.id = 12;
        chapter12.chapterName = "Study of microscope";
        chapter12.imageUrl = "drawable/path/microscope.png";

        Chapter chapter13 = new Chapter();
        chapter13.id = 13;
        chapter13.chapterName = "Protein and fibers";
        chapter13.imageUrl = "drawable/path/protein.png";

        bio.chapters.add(chapter10);
        bio.chapters.add(chapter11);
        bio.chapters.add(chapter12);
        bio.chapters.add(chapter13);

        Subject maths = new Subject();
        maths.id = 4;
        maths.subjectName = "Maths";
        maths.chapters = new ArrayList<Chapter>();

        Chapter chapter14 = new Chapter();
        chapter14.id = 14;
        chapter14.chapterName = "Circle";
        chapter14.imageUrl = "drawable/path/circle.png";

        Chapter chapter15 = new Chapter();
        chapter15.id = 15;
        chapter15.chapterName = "Geometry";
        chapter15.imageUrl = "drawable/path/geometry.png";

        Chapter chapter16 = new Chapter();
        chapter16.id = 16;
        chapter16.chapterName = "Linear equations";
        chapter16.imageUrl = "drawable/path/linear.png";

        Chapter chapter17 = new Chapter();
        chapter17.id = 17;
        chapter17.chapterName = "Graph";
        chapter17.imageUrl = "drawable/path";

        Chapter chapter18 = new Chapter();
        chapter18.id = 18;
        chapter18.chapterName = "Trigonometry";
        chapter18.imageUrl = "drawable/path";

        maths.chapters.add(chapter14);
        maths.chapters.add(chapter18);
        maths.chapters.add(chapter15);
        maths.chapters.add(chapter16);
        maths.chapters.add(chapter17);


        Subject DevOps = new Subject();
        DevOps.id = 5;
        DevOps.subjectName = "DevOps";
        DevOps.chapters = new ArrayList<Chapter>();

        Chapter chapter19 = new Chapter();
        chapter19.id = 19;
        chapter19.chapterName = "Circle";
        chapter19.imageUrl = "drawable/path";

        Chapter chapter20 = new Chapter();
        chapter20.id = 20;
        chapter20.chapterName = "Geometry";
        chapter20.imageUrl = "drawable/path";

        Chapter chapter21 = new Chapter();
        chapter21.id = 21;
        chapter21.chapterName = "Linear equations";
        chapter21.imageUrl = "drawable/path";

        Chapter chapter22 = new Chapter();
        chapter22.id = 22;
        chapter22.chapterName = "Graph";
        chapter22.imageUrl = "drawable/path";

        Chapter chapter23 = new Chapter();
        chapter23.id = 23;
        chapter23.chapterName = "Trigonometry";
        chapter23.imageUrl = "drawable/path";

        DevOps.chapters.add(chapter19);
        DevOps.chapters.add(chapter20);
        DevOps.chapters.add(chapter21);
        DevOps.chapters.add(chapter22);
        DevOps.chapters.add(chapter23);

        subjects.add(physics);
        subjects.add(chem);
        subjects.add(bio);
        subjects.add(maths);
        subjects.add(DevOps);

        return subjects;
    }
}