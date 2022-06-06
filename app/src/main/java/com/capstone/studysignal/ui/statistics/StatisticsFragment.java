package com.capstone.studysignal.ui.statistics;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.capstone.studysignal.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class StatisticsFragment extends Fragment {
    View v;
    LineChart lineChart1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.fragment_statistics, container, false);

        lineChart1 = (LineChart) v.findViewById(R.id.lineChart1);

        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1,1));
        entries.add(new Entry(2,2));
        entries.add(new Entry(3,3));
        entries.add(new Entry(4,4));
        entries.add(new Entry(5,5));


        LineDataSet dataSet = new LineDataSet(entries, "Label");
        dataSet.setLineWidth(4); //라인 두께
        dataSet.setCircleRadius(6); // 점 크기
        dataSet.setCircleColor(Color.parseColor("#FFA1B4DC")); // 점 색깔
        dataSet.setDrawCircleHole(true); // 원의 겉 부분 칠할거?
        dataSet.setColor(Color.parseColor("#FFA1B4DC")); // 라인 색깔

        LineData lineData = new LineData(dataSet);
        lineChart1.setData(lineData);
        lineChart1.invalidate();

        return v;
    }
}